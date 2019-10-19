package testLayer;

import common.MobileAPI;
import objectLayer.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearchPage extends MobileAPI
{
    SearchPage searchPage;

    @BeforeMethod
    public void init()
    {
        searchPage = PageFactory.initElements(ad, SearchPage.class);
    }

    @Test
    //test case #1
    public void testClickOnSearchBar()
    {
        searchPage.clickOnSearchBar();
    }

    @Test
    //test case #2
    public void testIsToolBarDisplayed()
    {
        searchPage.isToolBarDisplayed();
    }

    @Test
    //test case #3
    public void testSearchFilter()
    {
        searchPage.searchFilter();
    }

    @Test
    //test case #4
    public void testSearchOptions()
    {
        searchPage.searchOptions();
    }

    @Test
    //test case #5
    public void testBackButton()
    {
        searchPage.backButton();
    }

    @Test
    //test case #6
    public void testTextOfErrorOnPage()
    {
        searchPage.textOfErrorOnPage();
    }

    @Test
    //test case #7
    public void testSearchUser()
    {
        searchPage.searchUser();
    }

    @Test
    //test case #8
    public void testTwitterLatest()
    {
        searchPage.twitterLatestButton();
    }

    @Test
    //test case #9
    public void testTwitterPeopleButton()
    {
        searchPage.twitterPeopleButton();
    }

    @Test
    //test case #10
    public void testTwitterPhotosButton()
    {
        searchPage.twitterPhotosButton();
    }
}
