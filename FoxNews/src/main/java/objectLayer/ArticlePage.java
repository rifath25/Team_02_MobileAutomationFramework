package objectLayer;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends MobileAPI {


    public WebElement getBtn() {
        return btn;
    }


    @FindBy(xpath= "//android.widget.TextView[@content-desc=\"Related story: Mulvaney comments seized on by critics saying it's proof of Ukraine quid pro quo\"]\n")
    public WebElement btn;

        public void click(){

            getBtn().click();
        }

    public WebElement getAgree() {
        return agree;
    }

    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.TextView\n")
    public WebElement agree;

    public void clickAgree(){

        getAgree().click();
    }






















}
