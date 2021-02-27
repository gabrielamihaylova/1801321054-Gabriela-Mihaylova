package uni.pl.fmi.models;

import java.text.SimpleDateFormat;

import java.util.Locale;

import uni.pl.fmi.services.SearchFlightService;

public class SearchFlightModel {
	private String departure;
	private String destinationTo;
	private String departureDate;
	private String message;

	public void navigateToSearchScreen() {
		System.out.println("Навигирано е до страницата за търсене на полет");

	}

	public void setDepartureFrom(String departure) {
		this.departure = departure;

	}

	public void setDestinationTo(String destination) {

		this.destinationTo = destination;
	}

	public void setDepartureDate(String departureDate) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

		this.departureDate = departureDate;

	}

	public void clickSearchButton() {
		message = SearchFlightService.search(departure, destinationTo, departureDate);

	}

	public String getSearchMessage() {
		return message;
	}
}
