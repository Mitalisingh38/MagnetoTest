package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddToCartLocators {
	
	
	@FindBy(how=How.XPATH,using="//input[@id='search']")
	public WebElement searchBox;

	@FindBy(how = How.LINK_TEXT,using="Gwyn Endurance Tee")
	public WebElement teeSelect;

	@FindBy(how = How.ID,using = "option-label-size-143-item-168")
	public WebElement selectSize;

	@FindBy(how = How.ID, using = "option-label-color-93-item-53")
	public WebElement selectColor;

	@FindBy(how = How.ID, using = "qty")
	public WebElement selectQuantity;

	@FindBy(how = How.ID, using = "product-addtocart-button")
	public WebElement addCartButton;

	@FindBy(how = How.LINK_TEXT, using = "shopping cart")
	public WebElement shoppingCartLink;

	@FindBy(how=How.XPATH,using="//*[@id=\"block-shipping\"]/div[1]")
	public WebElement shippingTab;

	@FindBy(how = How.NAME , using = "country_id")
	public WebElement selectCountry;

	@FindBy(how = How.XPATH , using = "//*[@id=\"cart-totals\"]/div/table/tbody/tr[4]/td/strong/span")
	public WebElement cartTotal;

	@FindBy(how = How.XPATH, using ="//*[@class=\"input-text qty\"]")
	public WebElement cartQuantity;

	@FindBy(how = How.NAME , using = "update_cart_action")
	public WebElement updateCartBtn;

	@FindBy(how = How.ID,using = "option-label-size-143-item-167")
	public WebElement selectSizeS;

	@FindBy(how = How.ID, using = "option-label-color-93-item-60")
	public WebElement selectColorYellow;

	@FindBy(how = How.LINK_TEXT,using="Quest Lumaflex™ Band")
	public WebElement selectBand;

}
