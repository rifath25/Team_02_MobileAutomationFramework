package testLayer;

import common.MobileAPI;
import objectLayer.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignInPage extends MobileAPI {
    public SignInPage signInPage;
    @BeforeMethod
    public void init(){
        signInPage= PageFactory.initElements(ad,SignInPage.class);
    }
    @Test
    public void testClickOnLoginButton(){
        signInPage.clickOnLoginButton();
    }
}
