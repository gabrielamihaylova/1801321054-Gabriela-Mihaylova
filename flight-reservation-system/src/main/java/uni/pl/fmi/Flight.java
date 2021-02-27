package uni.pl.fmi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Flight {
	private int duration;
	private String departureDate;
	private String departureFrom;
	private String destinationTo;
	private double price;
	private Aircraft aircraft;
	private Administrator admin;

	public Flight() {
	}

	public Flight(Aircraft aircraft, Administrator administrator) {
		this.aircraft = aircraft;
		this.admin = administrator;

	}

	public Flight(int duration, String departureDate, String departureFrom, String destinationTo, double price,
			Aircraft aircraft, Administrator admin) {
		super();
		this.duration = duration;
		this.departureDate = departureDate;
		this.departureFrom = departureFrom;
		this.destinationTo = destinationTo;
		this.price = price;
		this.aircraft = aircraft;
		this.admin = admin;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDepartureFrom(String departureFrom) {
		this.departureFrom = departureFrom;
	}

	public String getDepartureFrom() {

		return departureFrom;
	}

	public void setDestinationTo(String destinationTo) {
		this.destinationTo = destinationTo;
	}

	public String getDestinationTo() {
		return destinationTo;
	}

	public void setPrice(double price) {
		this.price = price;

	}

	public double getPrice() {

		return price;
	}

	public Aircraft getAircraft() {
		return aircraft;
	}

	public void setAircrafts(Aircraft aircrafts) {
		this.aircraft = aircrafts;
	}

	public void setAdministrator(Administrator administrator) {
		this.admin = administrator;
	}

	public Administrator getAdministrator() {
		return admin;
	}



	public void setDepartureDate(String departureDate) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		try {
			Date date1 = format.parse(departureDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.departureDate = departureDate;
	}

	public String getDepartureDate() {
		return departureDate;
	}

}