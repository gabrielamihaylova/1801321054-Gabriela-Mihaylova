package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pl.fmi.Flight;

public class SearchFlightService {
	public static String search(String departure, String destinationTo, String departureDate) {
		List<Flight> flights = getFlights();

		if (departure == null || departure.isEmpty()) {
			return "���� �������� ���������� �� ����������!";
		}
		if (flights.stream().anyMatch(flight -> !(destinationTo.equals(flight.getDestinationTo())))) {
			return "���� �������� �������� ���������� �� ����������!";
		}
		if (!(departureDate.matches("([0-9]{4})-([0-1][0-9])-([0-3][0-9])"))) {
			return "���� �������� �������� ������ �� ����!";
		}
		final boolean isFlightExist = flights.stream().anyMatch(flight -> departure.equals(flight.getDepartureFrom())
				&& destinationTo.equals(flight.getDestinationTo()) && departureDate.equals(flight.getDepartureDate()));
		return isFlightExist ? "����������� �� ������ ������� ��:" : "���� ������� ��������� �� ������ �������";
	}

	public static List<Flight> getFlights() {

		final List<Flight> result = new ArrayList<Flight>();
		Flight flight = new Flight();
		flight.setDepartureFrom("���");
		flight.setDestinationTo("������");
		flight.setDepartureDate("2021-07-01");
		result.add(flight);
		return result;
	}
}
