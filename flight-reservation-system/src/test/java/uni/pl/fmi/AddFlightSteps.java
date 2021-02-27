package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.AddFlightPageModel;

public class AddFlightSteps {

	AddFlightPageModel addFlightPageModel = new AddFlightPageModel();

	@Given("^Потребителя с административни права отваря екрана за създаване на нов полет$")
	public void openAddFlightScreen() throws Throwable {
		addFlightPageModel.navigateToAddScreen();

	}

	@Given("^Потребителя без административни права отваря екрана за създаване на нов полет$")
	public void openAddScreen() throws Throwable {
		addFlightPageModel.navigateToAddScreen();
	}

	@When("^Въвежда потребителско име \"([^\"]*)\"$")
	public void addUsername(String username) throws Throwable {
		addFlightPageModel.setUsername(username);
	}

	@When("^Въвъжда парола \"([^\"]*)\"$")
	public void addPassword(String password) throws Throwable {
		addFlightPageModel.setPassword(password);
	}

	@When("^Въвежда дестинация на заминаване \"([^\"]*)\"$")
	public void addDepartureFrom(String departure) throws Throwable {
		addFlightPageModel.setDepartureFrom(departure);

	}

	@When("^Въвежда дестинация на пристигане \"([^\"]*)\"$")
	public void addDestinationTo(String destination) throws Throwable {
		addFlightPageModel.setDestinationTo(destination);

	}

	@When("^Въвежда времетраене \"([^\"]*)\"$")
	public void addDuration(int duration) throws Throwable {
		addFlightPageModel.setDuration(duration);

	}

	@When("^Въвежда дата и час \"([^\"]*)\"$")
	public void addDateandHour(String date) throws Throwable {
		addFlightPageModel.setDate(date);
	}


	@When("^Въвежда цена на полета \"([^\"]*)\"$")
	public void addPrice(double price) throws Throwable {
		addFlightPageModel.setPrice(price);

	}

	@When("^Въвежда тип на самолет \"([^\"]*)\"$")
	public void addPlane_type(String plane_type) throws Throwable {
		addFlightPageModel.setTypePlane(plane_type);

	}

	@When("^Въвежда места в самолета \"([^\"]*)\"$")
	public void addSeats(int seats) throws Throwable {
		addFlightPageModel.addSeats(seats);

	}

	@When("^Натиска бутона за създаване на нов полет$")
	public void clickSaveButton() throws Throwable {
		addFlightPageModel.clickSaveButton();

	}

	@Then("^Вижда съобщение за \"([^\"]*)\"$")
	public void checkSaveMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, addFlightPageModel.getSaveMessage());

	}


}
