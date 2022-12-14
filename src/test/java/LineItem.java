package com.containers.offer.domain;

public class LineItem {

    private static final String INTEGER_PATTERN = "[0-9]+";

    private int quantity;
    private Money priceBeforeDiscounts;
    private Sku sku;
    private final List<Discount> lineDiscounts = new ArrayList<>();

    LineItem(){}


    . . .


    public Money getCurrentPrice() {
        return priceBeforeDiscounts != null
                ? priceBeforeDiscounts
                : sku.getPrice();
    }

    // what does this method do?
    public Money methodName1() {
        return lineDiscounts
                .stream()
                .map(Discount::getAmountOff)
                .reduce(getCurrentPrice(), Money::add);
    }

    // what does this method do?
    private List<Integer> methodName2(String commaSeparatedList) {
        return Splitter
                .on(',')
                .omitEmptyStrings()
                .trimResults()
                .splitToList(commaSeparatedList)
                .stream()
                .filter(s -> s.matches(INTEGER_PATTERN))
                .map(Integer::valueOf)
                .collect(toList());
    }
}