package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInAccountLocators {

    @FindBy(how = How.LINK_TEXT, using = "Sign In")
    public WebElement signInbtn;

    @FindBy(how = How.ID, using = "email")
    public WebElement enterEmail;

    @FindBy(how = How.ID, using = "pass")
    public WebElement enterPassword;

    @FindBy(how = How.ID, using = "send2")
    public WebElement signSubmit;
}
