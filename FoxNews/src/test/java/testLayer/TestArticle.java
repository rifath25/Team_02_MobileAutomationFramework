package testLayer;

import common.MobileAPI;
import objectLayer.ArticlePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestArticle extends MobileAPI {


    ArticlePage article;

    @BeforeMethod
    public void init(){
        article = PageFactory.initElements(ad,ArticlePage.class);
    }

    @Test
    public void articleRead (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        article.checkArticle();
    }
    @Test
    public void checkImgDisplay(){

        article.imgDisplay();
    }
    @Test
    public void testGetText(){

        article.scrollAndGetText();
    }
    @Test
    public void testCheckTopNews (){
        article.checkTopNews();
    }
    @Test
    public void testLogoDisplay(){
        article.logoDisplay();

    }
    @Test
    public void testImgText (){
        article.imgText();
    }
    @Test
    public void checkBtn (){
        article.clickBtn();
    }
    @Test
    public void testCheckText (){
        article.checkText();
    }
    @Test
    public void testAgree(){
        article.clickAgree();

    }

    @Test
    public void clickBtn() {
        article.clickBtn();
    }

}
