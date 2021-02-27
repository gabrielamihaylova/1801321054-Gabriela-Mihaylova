package uni.pl.fmi;

import java.util.*;

public class Administrator extends User {
	private Set<Flight> flights ;

	public Administrator(String username, String password, String email, String firstName, String lastName) {
		super(username, password, email, firstName, lastName);

		this.flights = new HashSet<Flight>();
	}

	public void setFlight(Set<Flight> flight) {
        this.flights = flight;
	}

	public Set<Flight> getFlight() {

		return flights;
	}

}