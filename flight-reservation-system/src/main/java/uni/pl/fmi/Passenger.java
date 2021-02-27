package uni.pl.fmi;

import java.util.*;

public class Passenger extends User {


	private int passportNum;
	private Set<Reservation> reservations;

	public Passenger(String username, String password, String email, String firstName,
			         String lastName, int passportNum) {
		super(username, password, email, firstName, lastName);
		this.passportNum = passportNum;
		reservations = new HashSet<Reservation>();
	}

	public void setPassportNum(int passportNum) {
		this.passportNum = passportNum;
	}

	public int getPassportNum() {
		return this.passportNum;
	}


	public void setReservation(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Set<Reservation> getReservation() {
		return reservations;
	}

}