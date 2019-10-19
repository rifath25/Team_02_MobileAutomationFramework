package java.o

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends MobileAPI {


    @FindBy(xpath= "//android.widget.ImageView[@content-desc=\"Home\"]\n")
    public WebElement btn;
    @FindBy(xpath= "(//android.widget.ImageView[@content-desc=\"Article header image\"])[1]\n")
    public WebElement img;
    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.TextView\n")
    public WebElement agree;
    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView[2]")
    public WebElement topNews ;
    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView\n")
    public WebElement logo;
    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView[1]\n")
    public WebElement imgText;
    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView[2]\n")
    public WebElement articleA;
    @FindBy(xpath= "//android.widget.TextView[@content-desc=\"Related story: DOUG SCHOEN: Hillary vs. Trump in 2020? If Clinton is serious, here's best way for her to defeat the president\"]\n")
    public WebElement textLine;

    public WebElement getAgree() {
        return agree;
    }
    public WebElement getBtn() {
        return btn;
    }
    public WebElement getImg() {
        return img;
    }

    public WebElement getTopNews() {
        return topNews;
    }

    public WebElement getLogo() {
        return logo;
    }

    public WebElement getImgText() {
        return imgText;
    }

    public WebElement getArticleA() {
        return articleA;
    }

    public WebElement getTextLine() {
        return textLine;
    }

    public void checkTopNews (){
        clickAgree();
        getTopNews().getText();
    }
    public void logoDisplay(){
        clickAgree();
        getLogo().isDisplayed();
    }
    public void imgText (){
        clickAgree();
        getImgText().isDisplayed();
        getImgText().isDisplayed();
    }
    public void checkArticle (){
        clickAgree();
        getArticleA().getText();
    }

    public void checkText (){
        clickAgree();
        getTextLine().getText();
        getTextLine().isDisplayed();

    }

    public void clickAgree(){

        getAgree().click();
    }

    public void imgDisplay(){

        clickAgree();
        getImg().isDisplayed();
    }
    public void clickBtn(){
        clickAgree();
        getBtn().click();
    }
    public void scrollAndGetText(){
        clickAgree();
        scrollToElement(ad,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView[2]\n");
    }



















}
