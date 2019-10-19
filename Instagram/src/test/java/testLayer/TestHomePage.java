package testLayer;

import common.MobileAPI;
import objectLayer.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends MobileAPI {
    HomePage homePage;
    @BeforeMethod
    public void init(){
        homePage= PageFactory.initElements(ad, HomePage.class);
    }
    @Test
    public void testClickOnLoginButton(){
        homePage.clickOnLoginButton();
    }
    @Test
    public void testClickOnCreateNewAccount(){
        homePage.clickOnCreateNewAccountButton();
    }
    @Test
    public void testLogoIsDisplayed(){
        homePage.logoIsDisplayed();
    }
    @Test
    public void testClickOnLanguageSelectorButton(){
        homePage.clickOnLanguageSelectorButton();
    }
    @Test
    public void testGetText(){
        homePage.getText();
    }
    @Test
    public void testInputUserName(){
        homePage.inputUserName();
    }
    @Test
    public void testClickOnNextButton(){
        homePage.clickOnNextButton();
    }
}



