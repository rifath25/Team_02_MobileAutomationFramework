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

    public void test1 (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        article.clickAgree();
        article.click();
    }
















}
