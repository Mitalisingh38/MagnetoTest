package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.AddToCartLocators;
import pages.locators.SignInAccountLocators;
import utils.SeleniumDriver;

public class SignInAccountActions {
    SignInAccountLocators signInAccountLocators=null;
    public SignInAccountActions()
    {

        this.signInAccountLocators=new SignInAccountLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), signInAccountLocators);
    }

    public void signInAccount() {
        signInAccountLocators.signInbtn.click();
        signInAccountLocators.enterEmail.sendKeys("mitalisingh38@gmail.com");
        signInAccountLocators.enterPassword.sendKeys("Mits@12345");
        signInAccountLocators.signSubmit.click();

    }
}
