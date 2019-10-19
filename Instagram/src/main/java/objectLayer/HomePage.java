package objectLayer;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage extends MobileAPI {
    @FindBy(how = How.ID,using = "com.instagram.android:id/log_in_button")
    public static WebElement logInButtonWebElement;
    public static WebElement getLogInButtonWebElement(){
        return logInButtonWebElement;
    }
    public void clickOnLoginButton(){
        getLogInButtonWebElement().click();
    }
}
