package steps;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.actions.AddToCartActions;
import pages.actions.SignInAccountActions;
import utils.SeleniumDriver;


public class AddToCartSteps {
	
	
	AddToCartActions addToCartActions = new AddToCartActions();
	SignInAccountActions signInAccountActions = new SignInAccountActions();

	@Given("^I am on the Home Page \"([^\"]*)\" of Magneto Website$")
	public void i_am_on_the_Home_Page_of_CarsGuide_Website(String webSiteURL)  {
	    SeleniumDriver.openPage(webSiteURL);
	    
	}

	@When("I click on search input and provide the {string}")
	public void iClickOnSearchInputAndProvideThe(String searchText) throws InterruptedException {
		addToCartActions.searchTee(searchText);
	}

	@And("I select size as medium")
	public void iSelectSizeAsMedium() {
		addToCartActions.selectSize();
	}

	@And("I select colour as green")
	public void iSelectColourAsGreen() {
		addToCartActions.selectColor();
	}

	@And("scroll down on the web page till the tee is visible")
	public void scrollDownOnTheWebPageTillTheTeeIsVisible() {
		addToCartActions.scrollDownToSelectTee();
	}

	@And("select the tee")
	public void selectTheTee() {
		addToCartActions.selectTee();
	}


	@And("select quantity as {string}")
	public void selectQuantityAs(String qty) {
		addToCartActions.updateQuantity(qty);
	}

	@And("click on AddtoCart button")
	public void clickOnAddtoCartButton() {
		addToCartActions.addToCart();
	}

	@When("I Sign in my account")
	public void iSignInMyAccount() {
		signInAccountActions.signInAccount();

	}

	@And("click on shopping cart link")
	public void clickOnShoppingCartLink() {
		addToCartActions.clickShoppingCart();
	}

	@And("click on shipping tab")
	public void clickOnShippingTab() {
		addToCartActions.clickShippingTab();
	}

	@And("verify country is selected as {string}")
	public void verifyCountryIsSelectedAs(String countryVal) {
		addToCartActions.verifyCounty(countryVal);
	}

	@And("Check cart total is {string}")
	public void checkCartTotalIs(String arg0) {
		addToCartActions.verifyCartTotal(arg0);
	}

	@And("Update the Quantity of Gwyn Endurance Tee Medium Green to {string}")
	public void updateTheQuantityOfGwynEnduranceTeeMediumGreenTo(String arg0) {
		addToCartActions.updateCartQuantity(arg0);
	}

	@And("I select size as small")
	public void iSelectSizeAsSmall() {
		addToCartActions.selectSizeSmall();
	}

	@And("I select colour as Yellow")
	public void iSelectColourAsYellow() {
		addToCartActions.selectcolorYellow();
	}

	@And("select the band")
	public void selectTheBand() {
		addToCartActions.selectBand();
	}
}
