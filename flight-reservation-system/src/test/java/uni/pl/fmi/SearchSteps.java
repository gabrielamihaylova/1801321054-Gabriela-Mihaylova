package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.SearchFlightModel;

public class SearchSteps {
	private SearchFlightModel searchFlightModel = new SearchFlightModel();

	@Given("^Потребителя отваря екрана за търсене на полет$")
	public void openSearchScreen() throws Throwable {
		searchFlightModel.navigateToSearchScreen();
	}

	@When("^Въвежда заминаване от \"([^\"]*)\"$")
	public void addDepartureFrom(String departure) throws Throwable {
		searchFlightModel.setDepartureFrom(departure);
	}

	@When("^Въвежда пристигане в \"([^\"]*)\"$")
	public void addDestinationTo(String destination) throws Throwable {
		searchFlightModel.setDestinationTo(destination);
	}

	@When("^Въвежда дата на заминаване \"([^\"]*)\"$")
	public void addDepartureDate(String departureDate) throws Throwable {

		searchFlightModel.setDepartureDate(departureDate);
	}

	@When("^Натиска бутона за търсене$")
	public void clickSearchButton() throws Throwable {
		searchFlightModel.clickSearchButton();
	}

	@Then("^Вижда съобщението \"([^\"]*)\"$")
	public void checkSearchMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, searchFlightModel.getSearchMessage());

	}
}
