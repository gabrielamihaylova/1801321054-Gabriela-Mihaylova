package uni.pl.fmi;

public class Reservation {
	private String num;
	private Passenger passenger;
	private Flight flight;

	public Reservation(String num, Passenger passenger, Flight flight) {
		this.num = num;
		this.passenger = passenger;
		this.flight = flight;

	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getNum() {
		return num;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Flight getFlight() {
		return flight;
	}

}