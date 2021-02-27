package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.SearchFlightModel;

public class SearchSteps {
	private SearchFlightModel searchFlightModel = new SearchFlightModel();

	@Given("^����������� ������ ������ �� ������� �� �����$")
	public void openSearchScreen() throws Throwable {
		searchFlightModel.navigateToSearchScreen();
	}

	@When("^������� ���������� �� \"([^\"]*)\"$")
	public void addDepartureFrom(String departure) throws Throwable {
		searchFlightModel.setDepartureFrom(departure);
	}

	@When("^������� ���������� � \"([^\"]*)\"$")
	public void addDestinationTo(String destination) throws Throwable {
		searchFlightModel.setDestinationTo(destination);
	}

	@When("^������� ���� �� ���������� \"([^\"]*)\"$")
	public void addDepartureDate(String departureDate) throws Throwable {

		searchFlightModel.setDepartureDate(departureDate);
	}

	@When("^������� ������ �� �������$")
	public void clickSearchButton() throws Throwable {
		searchFlightModel.clickSearchButton();
	}

	@Then("^����� ����������� \"([^\"]*)\"$")
	public void checkSearchMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, searchFlightModel.getSearchMessage());

	}
}
