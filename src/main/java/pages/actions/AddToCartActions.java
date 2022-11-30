package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.locators.AddToCartLocators;
import utils.SeleniumDriver;

import java.time.Duration;

public class AddToCartActions {
	
	AddToCartLocators addToCartLocators=null;
	public AddToCartActions()
	{
		
		this.addToCartLocators=new AddToCartLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), addToCartLocators);
	}
	
	public void searchTee(String searchText) throws InterruptedException {
		addToCartLocators.searchBox.click();
		addToCartLocators.searchBox.sendKeys(searchText);
		addToCartLocators.searchBox.sendKeys(Keys.RETURN);
	}

	public void scrollDownToSelectTee() {
		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
		js.executeScript("arguments[0].scrollIntoView();",addToCartLocators.teeSelect);
	}

	public void selectTee() {
		addToCartLocators.teeSelect.click();
	}

	public void selectSize() {
		addToCartLocators.selectSize.click();
	}

	public void selectColor() {
		addToCartLocators.selectColor.click();
	}

	public void updateQuantity(String quantity) {
		addToCartLocators.selectQuantity.clear();
		addToCartLocators.selectQuantity.sendKeys(quantity);
	}

	public void addToCart() {
		addToCartLocators.addCartButton.click();
	}

	public void clickShoppingCart() {
		addToCartLocators.shoppingCartLink.click();
	}

	public void clickShippingTab() {
		addToCartLocators.shippingTab.click();
	}

	public void verifyCounty(String countryVal) {
		Select country = new Select(addToCartLocators.selectCountry);
		String selectedOption = country.getFirstSelectedOption().getText();
		Assert.assertEquals(countryVal,selectedOption);
	}

	public void verifyCartTotal(String expectedCartValue) {
		String actualCartVal = addToCartLocators.cartTotal.getText();
		Assert.assertEquals(actualCartVal,expectedCartValue);
	}

	public void updateCartQuantity(String cartQty) {
		addToCartLocators.cartQuantity.clear();
		addToCartLocators.cartQuantity.sendKeys(cartQty);
		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
		js.executeScript("arguments[0].click",addToCartLocators.updateCartBtn);
	}

	public void selectSizeSmall() {
		addToCartLocators.selectSizeS.click();
	}

	public void selectcolorYellow() {
		addToCartLocators.selectColorYellow.click();
	}

	public void selectBand() {
		addToCartLocators.selectBand.click();
	}
}
