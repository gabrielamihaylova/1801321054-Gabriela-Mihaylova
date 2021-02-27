package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.AddFlightPageModel;

public class AddFlightSteps {

	AddFlightPageModel addFlightPageModel = new AddFlightPageModel();

	@Given("^����������� � ��������������� ����� ������ ������ �� ��������� �� ��� �����$")
	public void openAddFlightScreen() throws Throwable {
		addFlightPageModel.navigateToAddScreen();

	}

	@Given("^����������� ��� ��������������� ����� ������ ������ �� ��������� �� ��� �����$")
	public void openAddScreen() throws Throwable {
		addFlightPageModel.navigateToAddScreen();
	}

	@When("^������� ������������� ��� \"([^\"]*)\"$")
	public void addUsername(String username) throws Throwable {
		addFlightPageModel.setUsername(username);
	}

	@When("^������� ������ \"([^\"]*)\"$")
	public void addPassword(String password) throws Throwable {
		addFlightPageModel.setPassword(password);
	}

	@When("^������� ���������� �� ���������� \"([^\"]*)\"$")
	public void addDepartureFrom(String departure) throws Throwable {
		addFlightPageModel.setDepartureFrom(departure);

	}

	@When("^������� ���������� �� ���������� \"([^\"]*)\"$")
	public void addDestinationTo(String destination) throws Throwable {
		addFlightPageModel.setDestinationTo(destination);

	}

	@When("^������� ����������� \"([^\"]*)\"$")
	public void addDuration(int duration) throws Throwable {
		addFlightPageModel.setDuration(duration);

	}

	@When("^������� ���� � ��� \"([^\"]*)\"$")
	public void addDateandHour(String date) throws Throwable {
		addFlightPageModel.setDate(date);
	}


	@When("^������� ���� �� ������ \"([^\"]*)\"$")
	public void addPrice(double price) throws Throwable {
		addFlightPageModel.setPrice(price);

	}

	@When("^������� ��� �� ������� \"([^\"]*)\"$")
	public void addPlane_type(String plane_type) throws Throwable {
		addFlightPageModel.setTypePlane(plane_type);

	}

	@When("^������� ����� � �������� \"([^\"]*)\"$")
	public void addSeats(int seats) throws Throwable {
		addFlightPageModel.addSeats(seats);

	}

	@When("^������� ������ �� ��������� �� ��� �����$")
	public void clickSaveButton() throws Throwable {
		addFlightPageModel.clickSaveButton();

	}

	@Then("^����� ��������� �� \"([^\"]*)\"$")
	public void checkSaveMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, addFlightPageModel.getSaveMessage());

	}


}
