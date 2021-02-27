package uni.pl.fmi.services;

import java.util.ArrayList;
//1import java.util.Date;
import java.util.List;

import uni.pl.fmi.Administrator;
import uni.pl.fmi.Aircraft;
import uni.pl.fmi.Flight;

public class AddFlightService {
	public static String add(String username, String password, String departureFrom, String destinationTo, int duration,
			String date, double price, int seats, String type_plane) {
		List<Flight> flights = getFlights();
		List<Administrator> admins = getAdmins();

		if (username == null && password == null && departureFrom == null && destinationTo == null && duration == 0
				&& date == null && price == 0 && seats == 0 && type_plane == null) {
			return "Моля въведете данни за полета";
		}
		if (admins.stream().anyMatch(admin -> !(admin.getUsername().equals(username)))) {
			return "Само потребител с административни права може да добавя нови полети";

		}

		if (type_plane==null|| "".equals(type_plane)) {
			return "Моля въведете тип на самолета";
		}

		if (destinationTo == null || "".equals(destinationTo)) {
			return "Моля въведете дестинация на пристигане";
		}

		if (!(date.matches("([0-9]{4})-([0-1][0-9])-([0-3][0-9])\\s([0-1][0-9]|[2][0-3]):([0-5][0-9]):([0-5][0-9])$"))) {
			return "Моля въведете коректен формат на дата и час";
		}

		final Flight newFlight = new Flight(duration, destinationTo, departureFrom, date, price, getAircrafts().get(0),
				getAdmins().get(0));

		flights.add(newFlight);

		return flights.contains(newFlight) ? "Успешно добавен полет" : "Моля въведете коректни данни за полет";

	}

	private static List<Flight> getFlights() {

		final List<Flight> result = new ArrayList<Flight>();
		return result;
	}

	private static List<Aircraft> getAircrafts() {
		Aircraft aircraft = new Aircraft();
		aircraft.setSeats(180);
		aircraft.setTypePlane("Боинг737");
		final List<Aircraft> result = new ArrayList<Aircraft>();
		result.add(aircraft);
		return result;
	}

	private static List<Administrator> getAdmins() {
		Administrator administrator = new Administrator("admin", "admin123", "mariap@gmail.com", "maria", "petkova");
		final List<Administrator> result = new ArrayList<Administrator>();
		result.add(administrator);
		return result;
	}
}
