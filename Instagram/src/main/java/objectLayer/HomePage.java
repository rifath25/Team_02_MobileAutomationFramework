package objectLayer;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage extends MobileAPI{
    @FindBy(how = How.ID,using = "com.instagram.android:id/log_in_button")
    public static WebElement logInButtonWebElement;
    @FindBy(how = How.ID,using = "com.instagram.android:id/sign_up_with_email_or_phone")
    public static WebElement createNewAccountButtonWebElement;
    @FindBy(how = How.ID,using = "com.instagram.android:id/logo")
    public static WebElement logoWebElement;
    @FindBy(how = How.ID,using = "com.instagram.android:id/language_selector_button")
    public static WebElement languageSelectorButtonWebElement;
    @FindBy(how = How.ID,using = "com.instagram.android:id/branding_text")
    public static WebElement textWebElement;
    @FindBy(how = How.XPATH,using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")
    public static WebElement inputUserNameWebElement;
    @FindBy(how = How.ID,using = "com.instagram.android:id/button_text")
    public static WebElement nextButtonWebElement;
    public static WebElement getLogInButtonWebElement(){
        return logInButtonWebElement;
    }
    public static WebElement getCreateNewAccountButtonWebElement(){
        return createNewAccountButtonWebElement;
    }
    public static WebElement getLogoWebElement(){
        return logoWebElement;
    }
    public static WebElement getLanguageSelectorButtonWebElement(){
        return  languageSelectorButtonWebElement;
    }
    public static WebElement getTextWebElement(){
        return textWebElement;
    }
    public static WebElement getInputUserNameWebElement(){
        return inputUserNameWebElement;
    }
    public static WebElement getNextButtonWebElement(){
        return nextButtonWebElement;
    }
    public void clickOnLoginButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getLogInButtonWebElement().click();
    }
    public void  clickOnCreateNewAccountButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCreateNewAccountButtonWebElement().click();
    }
    public void logoIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnLoginButton();
        getLogoWebElement().isDisplayed();
    }
    public void clickOnLanguageSelectorButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getLanguageSelectorButtonWebElement().click();
    }
    public void getText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String text=getTextWebElement().getText();
        System.out.println(text);
    }
    public void inputUserName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnLoginButton();
        getInputUserNameWebElement().sendKeys("lgrinika");
    }
    public void clickOnNextButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnLoginButton();
        inputUserName();
        getNextButtonWebElement().click();
    }
}
