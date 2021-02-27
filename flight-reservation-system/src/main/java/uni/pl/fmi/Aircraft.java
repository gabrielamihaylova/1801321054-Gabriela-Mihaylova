package uni.pl.fmi;

import java.util.*;

public class Aircraft {
	private String type_plane;
	private int seats;

	 public Set<Flight> aircraft;

	public Aircraft() {
		
	}

	public void setTypePlane(String type_plane) {
		this.type_plane = type_plane;
	}

	
	public String getTypePlane() {
		return type_plane;
	}

	
	public void setSeats(int seats) {
        this.seats = seats;
	}


	public int getSeats() {
		
		return seats;
	}

}