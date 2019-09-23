package com.containerstore.whereis.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.containerstore.whereis.common.StringManipulator;
import com.containerstore.whereis.viewmodel.ConferenceRoom;

/**
 * @author Mats Boman: We mimic a Jpa repository didn't want to implement the
 *         full db backend thing.
 */
@Component
public class ConferenceRoomRepository {
	private List<ConferenceRoom> conferenceRooms = new ArrayList<>();

	/**
	 * Save conference room to the repository
	 * 
	 * @param conferenceRoom
	 */
	public void save(ConferenceRoom conferenceRoom) {
		conferenceRooms.add(conferenceRoom);
	}

	/**
	 * @param conferenceRoomName
	 * @return formatted string with location information
	 */
	public String locationOf(String conferenceRoomName) {
		String location = null;
		Optional<ConferenceRoom> foundRoom = conferenceRooms.stream()
				.filter(room -> room.getName().equals(conferenceRoomName)).findFirst();
		if (foundRoom.isPresent()) {
			location = foundRoom.get().getLocation();
		} else {
			location = "somewhere, but I don't know where";
		}
		return String.format("%s is located %s", conferenceRoomName, location);
	}

	/**
	 * @return a Map of all the rooms
	 */
	public Map<String, String> getRooms() {
		Map<String, String> rooms = new HashMap<>();
		for (ConferenceRoom room : conferenceRooms) {
			rooms.put(room.getName(), room.getLocation());
		}
		return rooms;
	}

	/**
	 * @return list of room names
	 */
	public String getRoomNames() {
		StringBuilder sb = new StringBuilder();

		int i = 0;
		for (ConferenceRoom room : conferenceRooms) {
			String roomWithCapitalizedWords = StringManipulator.capitalizeWords(room.getName());
			if (i++ == conferenceRooms.size() - 1) {
				sb.append(roomWithCapitalizedWords);
			} else {
				sb.append(roomWithCapitalizedWords + "\n");
			}
		}
		return sb.toString();
	}
}
