package com.containerstore.whereis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.containerstore.whereis.dao.ConferenceRoomRepository;
import com.containerstore.whereis.viewmodel.ConferenceRoom;

/**
 * @author Mats Boman: A startup class to populate the "database" storage. It
 *         will only exeute once at startup.
 *
 */
@Component
public class Startup implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private ConferenceRoomRepository conferenceRooms;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		conferenceRooms
				.save(new ConferenceRoom("fill their baskets", "in the vendor conference area (off of reception)"));
		conferenceRooms.save(
				new ConferenceRoom("service selection price", "in the vendor conference area (off of reception)"));
		conferenceRooms
				.save(new ConferenceRoom("man in the desert", "in the vendor conference area (off of reception)"));
		conferenceRooms
				.save(new ConferenceRoom("air of excitement", "in the vendor conference area (off of reception)"));
		conferenceRooms.save(new ConferenceRoom("data central", "in the Information Systems area"));
		conferenceRooms.save(
				new ConferenceRoom("perfect product presentation", "at the north end of the Information Systems area"));
		conferenceRooms.save(new ConferenceRoom("main and main", "at the north end of the Information Systems area"));
		conferenceRooms.save(new ConferenceRoom("1 great = 3 good", "off the atrium, behind reception"));
		conferenceRooms.save(new ConferenceRoom("intuition does not come to an unprepared mind",
				"off the atrium, behind reception"));
		conferenceRooms.save(new ConferenceRoom("gumby", "where gumby has always been located...c'mon!"));
		conferenceRooms.save(new ConferenceRoom("contain yourself", "upstairs, south end, adjacent to CSD"));
		conferenceRooms.save(new ConferenceRoom("we love our employees",
				"upstairs, south end, adjacent to CSD (seating area in front of Contain Yourself)"));
		conferenceRooms.save(new ConferenceRoom("all eyes on elfa", "upstairs, southwest corner"));
		conferenceRooms.save(
				new ConferenceRoom("service = selling", "upstairs, southwest corner, adjacent to loss prevention"));
		conferenceRooms.save(
				new ConferenceRoom("fun and functional", "upstairs, southwest corner, adjacent to loss prevention"));
		conferenceRooms.save(new ConferenceRoom("communication is leadership",
				"upstairs, northwest corner, adjacent to the executive suite"));
		conferenceRooms.save(
				new ConferenceRoom("we sell the hard stuff", "up the stairs, turn right (adjacent to merchandising)"));
		conferenceRooms.save(new ConferenceRoom("blue sky", "up the stairs, turn right (adjacent to merchandising)"));
	}
}