package com.containerstore.whereis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.containerstore.whereis.dao.ConferenceRoomRepository;

@Controller
public class ConferenceRoomsController {

	@Autowired
	ConferenceRoomRepository conferenceRooms;

	/**
	 * Stores all the conference rooms information in the model attribute
	 * 
	 * @param model
	 * @return template name
	 */
	@GetMapping("/conference_rooms")
	public String getConferenceRooms(Model model) {
		model.addAttribute("conferenceRooms", conferenceRooms.getRooms());
		return "conference_rooms";
	}
}
