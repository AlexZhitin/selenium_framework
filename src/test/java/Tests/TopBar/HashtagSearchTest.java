package Tests.TopBar;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.SignInPage;
import Pages.TopBar.HashtagSearch;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HashtagSearchTest extends TestBase {

  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C39527*/

  public void HashtagSuggestionsListIsShown() {

    SignInPage login = new SignInPage(driver);
    HashtagSearch button = new HashtagSearch(driver);
    HashtagSearch list = new HashtagSearch(driver);

    String error = "Hashtag suggestions list is not opened on click of the search button";
    String test = "Testcase C39527";

    login.LoginGlobalAdmin();
    button.clickSearchButton();

    if (list.SuggestionsListIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39528*/

  public void HashtagSuggestionsPagination() {

    SignInPage login = new SignInPage(driver);
    HashtagSearch button = new HashtagSearch(driver);
    HashtagSearch list = new HashtagSearch(driver);
    HashtagSearch suggestions = new HashtagSearch(driver);

    String error = "Hashtag suggestions pagination is not working";
    String test = "Testcase C39528";

    login.LoginGlobalAdmin();
    button.clickSearchButton();

    int countBefore = suggestions.SuggestionsCount();
    list.scrollSuggestionsList();
    int countAfter = suggestions.SuggestionsCount();

    if (countBefore < countAfter) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39529*/

  public void SuggestionsWithSearchedHashtagShown() {

    SignInPage login = new SignInPage(driver);
    HashtagSearch button = new HashtagSearch(driver);
    HashtagSearch suggestions = new HashtagSearch(driver);
    HashtagSearch input = new HashtagSearch(driver);

    String error = "Not all the suggestions match the searched hashtag";
    String test = "Testcase C39529";
    String searchedItem = "Madrid";

    login.LoginGlobalAdmin();
    button.clickSearchButton();
    input.inputHashtag(searchedItem);

    suggestions.CountOfResultsWithSearchedHashtag(searchedItem);
    if (suggestions.CountOfResultsWithSearchedHashtag(searchedItem) == 20) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39530*/

  public void HashtagSearchIsClosed() {

    SignInPage login = new SignInPage(driver);
    HashtagSearch button = new HashtagSearch(driver);
    HashtagSearch list = new HashtagSearch(driver);
    HashtagSearch suggestions = new HashtagSearch(driver);
    HashtagSearch input = new HashtagSearch(driver);

    String error1 = "Search button didn't work";
    String error2 = "Close button didn't work";
    String test = "Testcase C39530";

    login.LoginGlobalAdmin();
    button.clickSearchButton();

    if (list.SuggestionsListIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error1);
      ExtentTestManager.getTest().log(Status.INFO, error1);
      Assert.fail();
    }

    button.clickClose();

    if (!list.SuggestionsListIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error2);
      ExtentTestManager.getTest().log(Status.INFO, error2);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39531*/

  public void EmptyStateIsShown() {

    SignInPage login = new SignInPage(driver);
    HashtagSearch button = new HashtagSearch(driver);
    HashtagSearch input = new HashtagSearch(driver);
    HashtagSearch state = new HashtagSearch(driver);

    String error = "Empty state is not shown";
    String test = "Testcase C39531";
    String searchedItem = "blablabla";

    login.LoginGlobalAdmin();
    button.clickSearchButton();
    input.inputHashtag(searchedItem);

    if (state.EmptyStateIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39532*/

  public void SuggestionClickOpensAggregatedPage() {

    SignInPage login = new SignInPage(driver);
    HashtagSearch button = new HashtagSearch(driver);
    HashtagSearch title = new HashtagSearch(driver);
    HashtagSearch suggestion = new HashtagSearch(driver);

    String error = "Aggregated page is not opened on click of the suggestion from the list";
    String test = "Testcase C39532";

    login.LoginGlobalAdmin();
    button.clickSearchButton();
    suggestion.clickSuggestion();

    if (title.PageTitleIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39533*/

  public void HashtagIsPrepopulatedInInput() {

    SignInPage login = new SignInPage(driver);
    HashtagSearch button = new HashtagSearch(driver);
    HashtagSearch title = new HashtagSearch(driver);
    HashtagSearch input = new HashtagSearch(driver);
    HashtagSearch suggestion = new HashtagSearch(driver);


    String error = "Selected hashtag is not pre-populated in input on the aggregated page";
    String test = "Testcase C39533";

    login.LoginGlobalAdmin();
    button.clickSearchButton();

    suggestion.clickSuggestion();
    String inputText = input.GetInputText();
    String titleText = title.GetTitleText();

    if (titleText.contains(inputText)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39534*/

  public void FoundByHashtagVideoHasTags() {

    SignInPage login = new SignInPage(driver);
    HashtagSearch button = new HashtagSearch(driver);
    HashtagSearch videoTag = new HashtagSearch(driver);
    HashtagSearch suggestion = new HashtagSearch(driver);
    HashtagSearch input = new HashtagSearch(driver);


    String error = "There's no hashtags on videos found by hashtag search";
    String test = "Testcase C39534";
    String hashtag = "Torino";

    login.LoginGlobalAdmin();
    button.clickSearchButton();
    input.inputHashtag(hashtag);
    suggestion.clickSuggestion();


    if (videoTag.VideoHasVideoTag(hashtag)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39535*/

  public void AggregatedPageIsOpenedOnHashtagClick() {

    SignInPage login = new SignInPage(driver);
    HashtagSearch button = new HashtagSearch(driver);
    HashtagSearch videoTag = new HashtagSearch(driver);
    HashtagSearch suggestion = new HashtagSearch(driver);
    HashtagSearch input = new HashtagSearch(driver);
    HashtagSearch title = new HashtagSearch(driver);


    String error = "Aggregated page was not opened on click of a hashtag under a video";
    String test = "Testcase C39535";
    String hashtag = "Torino";

    login.LoginGlobalAdmin();
    button.clickSearchButton();
    input.inputHashtag(hashtag);
    suggestion.clickSuggestion();
    videoTag.clickHashtag(hashtag);
    String titleText = title.GetTitleText();

    if (title.PageTitleIsDisplayed() && !titleText.contains(hashtag)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39536*/

  public void ClickedHashtagIsPrepopulatedInSearch() {

    SignInPage login = new SignInPage(driver);
    HashtagSearch button = new HashtagSearch(driver);
    HashtagSearch videoTag = new HashtagSearch(driver);
    HashtagSearch suggestion = new HashtagSearch(driver);
    HashtagSearch input = new HashtagSearch(driver);
    HashtagSearch title = new HashtagSearch(driver);


    String error = "Clicked hashtag is not pre-populated in the input field on the hashtag search";
    String test = "Testcase C39536";
    String hashtag = "Torino";

    login.LoginGlobalAdmin();
    button.clickSearchButton();
    input.inputHashtag(hashtag);
    suggestion.clickSuggestion();
    videoTag.clickHashtag(hashtag);
    String titleText = title.GetTitleText();

    if (titleText.contains(input.GetInputText())) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39537*/

  public void PaginationOnAggregatedPage() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    HashtagSearch button = new HashtagSearch(driver);
    HashtagSearch suggestion = new HashtagSearch(driver);
    HashtagSearch input = new HashtagSearch(driver);
    HashtagSearch videos = new HashtagSearch(driver);
    HashtagSearch videoTag = new HashtagSearch(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;


    String error = "Pagination on the hashtag search results page is not working";
    String test = "Testcase C39537";
    String hashtag = "Torino";

    login.LoginGlobalAdmin();
    button.clickSearchButton();
    input.inputHashtag(hashtag);
    suggestion.clickSuggestion();
    videoTag.clickSpecificHashtag(hashtag);

    int countBefore = videos.VideosCount();

    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,10000)");
    Thread.sleep(3000);

    int countAfter = videos.VideosCount();


    if (countAfter>countBefore) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }
}
