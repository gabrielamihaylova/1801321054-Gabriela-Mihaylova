package uni.pl.fmi.models;


import uni.pl.fmi.services.AddFlightService;

public class AddFlightPageModel {

	private String departureFrom;
	private String destinationTo;
	private int duration;
	private String date;
	private double price;
	private int seats;
	private String type_plane;
	private String message;
	private String username;
	private String password;

	public void navigateToAddScreen() {
		System.out.println("Навигирано е до страницата за добавяне на нов полет в системата");

	}

	public void setDepartureFrom(String departure) {
		this.departureFrom = departure;
	}

	public void setDestinationTo(String destination) {
		this.destinationTo = destination;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setDate(String date2) {
		// SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		// Date date1 = format.parse(date);
		this.date = date2;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTypePlane(String plane_type1) {
		this.type_plane = plane_type1;
	}

	public void addSeats(int seats2) {
		this.seats = seats2;

	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void clickSaveButton() {
		message = AddFlightService.add(username, password, departureFrom, destinationTo, duration, date, price, seats,
				type_plane);
	}

	public String getSaveMessage() {
		return message;
	}

}
