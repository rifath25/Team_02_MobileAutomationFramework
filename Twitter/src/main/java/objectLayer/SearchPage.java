package objectLayer;

import common.MobileAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class SearchPage extends MobileAPI
{
    @FindBy (how = How.XPATH,using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.EditText\n")
    public static WebElement searchBarWebElement;

    @FindBy (how = How.XPATH,using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup\n")
    public static WebElement toolBarWebElement;

    @FindBy (how = How.XPATH,using = "//android.widget.TextView[@content-desc=\"Search filters\"]\n")
    public static WebElement searchFilterWebElement;

    @FindBy (how = How.XPATH,using = "//android.widget.ImageView[@content-desc=\"More options\"]")
    public static WebElement searchOptionsWebElement;

    @FindBy (how = How.XPATH,using = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public static WebElement backButtonWebElement;

    @FindBy (how = How.XPATH,using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]\n")
    public static WebElement textOfErrorOnPageWebElement;

    @FindBy (how = How.XPATH,using = "//androidx.appcompat.app.a.c[@content-desc=\"Latest\"]/android.widget.TextView\n")
    public static WebElement twitterLatestButtonWebElement;

    @FindBy (how = How.XPATH,using = "//androidx.appcompat.app.a.c[@content-desc=\"People\"]/android.widget.TextView")
    public static WebElement twitterPeopleButtonWebElement;

    @FindBy (how = How.XPATH,using = "//androidx.appcompat.app.a.c[@content-desc=\"Photos\"]/android.widget.TextView")
    public static WebElement twitterPhotosButtonWebElement;

//----------------------------------------------------------------------------------------------------------------------

    public static WebElement getSearchBarWebElement()
    {
        return searchBarWebElement;
    }

    public static WebElement getToolBarWebElement()
    {
        return toolBarWebElement;
    }

    public static WebElement getSearchFilterWebElement()
    {
        return searchFilterWebElement;
    }

    public static WebElement getSearchOptionsWebElement()
    {
        return searchOptionsWebElement;
    }

    public static WebElement getBackButtonWebElement()
    {
        return backButtonWebElement;
    }

    public static WebElement getTextOfErrorOnPageWebElement()
    {
        return textOfErrorOnPageWebElement;
    }

    public static WebElement getTwitterLatestButtonWebElement()
    {
        return twitterLatestButtonWebElement;
    }

    public static WebElement getTwitterPeopleButtonWebElement()
    {
        return twitterPeopleButtonWebElement;
    }

    public static WebElement getTwitterPhotosButtonWebElement()
    {
        return twitterPhotosButtonWebElement;
    }

    //----------------------------------------------------------------------------------------------------------------------

    public void  clickOnSearchBar()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSearchBarWebElement().click();
    }

    public void isToolBarDisplayed()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getToolBarWebElement().isDisplayed();
    }

    public void searchFilter()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSearchFilterWebElement().click();
    }

    public void searchOptions()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSearchOptionsWebElement().click();
    }

    public void backButton()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getBackButtonWebElement().click();
    }

    public void textOfErrorOnPage()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        System.out.println(getTextOfErrorOnPageWebElement().getText());
    }

    public void searchUser()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getSearchBarWebElement().click();
        getSearchBarWebElement().sendKeys("DJ Khaled",Keys.ENTER);
    }

    public void twitterLatestButton()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getTwitterLatestButtonWebElement().click();
    }

    public void twitterPeopleButton()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getTwitterPeopleButtonWebElement().click();
    }

    public void twitterPhotosButton()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getTwitterPhotosButtonWebElement().click();
    }
}
