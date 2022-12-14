package com.containers.whereis.controller;

@Controller
public class WhereIsController {

    @PostMapping("/")
    public String submitForm(
            Model model,
            @ModelAttribute WhereIsViewModel viewModel) {

        viewModel.setResult(replyFor(viewModel.getQuery()));
        model.addAttribute("queryModel", viewModel);
        return "whereis";
    }

    private String replyFor(String query) {
        String location;
        switch (query.trim().toLowerCase()) {
            case "service selection price":
            case "air of excitement":
                location = "in the vendor conference area (off of reception)";
                break;
            case "data central":
                location = "in the Information Systems area";
                break;
            case "1 great = 3 good":
            case "train for success":
                location = "off the atrium, behind reception";
                break;
            case "contain yourself":
                location = "upstairs, south end, adjacent to CSD";
                break;
            case "preston center":
                location = "upstairs, southwest corner";
                break;
            default:
                location = "somewhere, but I don't know where";
                break;
        }

        return String.format("%s is located %s", query, location);
    }
}