package uni.pl.fmi;

import java.util.HashSet;
import java.util.Set;

public class Manager {

	private Set<User> users;
	private User user;
	private Set<Flight> flight = new HashSet<Flight>();
	private Set<Reservation> reservation = new HashSet<Reservation>();
	private GUI gui;

	public Manager() {
	}

	public void addFlight(Flight flight) {
		this.flight.add(flight);
	}

	public Set<Flight> searchFlight(Set<Flight> flight) {

		return flight;
	}

	public void deleteFlight(Flight flight) {
		this.flight.remove(flight);
	}

	public void addReservation(Reservation reservation) {
		this.reservation.add(reservation);
	}

	public void addPassenger(Passenger passenger) {
		this.users.add(user);
	}

	public void deletePassenger(Passenger passenger) {
		this.users.remove(user);
	}

	public void updateFlight(Set<Flight> flight) {
		this.flight = flight;
	}

	public void cancelReservation(Reservation reservation) {
		this.reservation.remove(reservation);
	}

	public Reservation updateReservation(Reservation reservation) {
		return reservation;
	}

}