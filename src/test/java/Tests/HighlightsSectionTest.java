package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.AggregatedPage;
import Pages.HomePage;
import Pages.SignInPage;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HighlightsSectionTest extends TestBase {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C38893*/

  public void HighlightsSectionDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage liveSectionTitle = new HomePage(driver);
    HomePage highlightsSectionTitle = new HomePage(driver);
    String error = "Neither Live nor Highlights section is available";


    login.LoginGlobalAdmin();


    if (highlightsSectionTitle.HighlightsTitleDisplayed()) {
      System.out.println("Highlights section is shown");
      Assert.assertTrue(true);
    } else if (liveSectionTitle.LiveTitleDisplayed()) {
      System.out.println("Live section is shown");
      Assert.fail();
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38893 completed ");
  }


  @Test /*C38894*/

  public void HighlightsTitleDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage highlightsTitle = new HomePage(driver);
    String error = "Either the title is not shown or the title text is incorrect. Make sure live or highlights section is available";

    login.LoginGlobalAdmin();


    if (highlightsTitle.HighlightsTitleDisplayed()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38894 completed");
  }

  @Test /*C39048*/

  public void LiveHighlightsVideosCount() {
    SignInPage login = new SignInPage(driver);
    HomePage videosCount = new HomePage(driver);
    String error = "There's more than 4 videos shown on the Live/Highlights section";
    login.LoginGlobalAdmin();

    if (videosCount.LiveHighlightsVideosCount() > 4) {
      Assert.fail();
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C39048 completed");
  }

  @Test /*C38896*/

  public void ClickLiveHighlightsTitle() {
    SignInPage login = new SignInPage(driver);
    HomePage liveOrHighlightsTitle = new HomePage(driver);
    AggregatedPage aggregatedTitle = new AggregatedPage(driver);

    String error = "Aggregated page is not shown or no videos available";
    login.LoginGlobalAdmin();
    liveOrHighlightsTitle.clickLiveHighlightsTitle();

    if (aggregatedTitle.AggregatedTitle()) {
      Assert.assertTrue(true);
    } else {
      Assert.fail();
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
    }
    System.out.println("Test C38896 completed");
  }

  @Test/*C38890*/

  public void MoreButtonDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage moreButton = new HomePage(driver);
    String error = "More button is not displayed. Make sure there's more than 4 videos available for Live/Highlights";

    login.LoginGlobalAdmin();


    if (moreButton.MoreButton()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38890 completed");
  }

  @Test(dependsOnMethods = {"MoreButtonDisplayed"}) /*C39049*/

  public void clickMoreButton() {

    SignInPage login = new SignInPage(driver);
    HomePage moreButton = new HomePage(driver);
    AggregatedPage resultsTitle = new AggregatedPage(driver);

    String error = "Aggregated page is not opened";

    login.LoginGlobalAdmin();
    moreButton.clickMoreButton();


    if (resultsTitle.AggregatedTitle()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C39049 completed");
  }

  @Test /*C38906*/

  public void LiveHighlightsVideoDescription() {
    SignInPage login = new SignInPage(driver);
    HomePage liveHighlightsVideoDescription = new HomePage(driver);

    login.LoginGlobalAdmin();

    if (liveHighlightsVideoDescription.LiveHighlightsVideoDescription()) {
      Assert.assertTrue(true);
    } else {
      System.out.println("Video description is not shown on live/highlights videos");
      Assert.fail();
    }
    System.out.println("Test  C38906 completed");
  }

  @Test /*C38907*/

  public void LiveHighlightsVideoTime() {
    SignInPage login = new SignInPage(driver);
    HomePage liveHighlightsVideoTime = new HomePage(driver);

    login.LoginGlobalAdmin();

    if (liveHighlightsVideoTime.LiveHighlightsVideoTime()) {
      Assert.assertTrue(true);
    } else {
      System.out.println("Video time is not shown on live/highlights videos");
      Assert.fail();
    }
    System.out.println("Test C38907 completed");
  }

  @Parameters({"browserType"})
  @Test /*C39059*/

  public void HighlightsSectionBookmark(String browserType) {
    SignInPage login = new SignInPage(driver);
    HomePage bookmarkIcon = new HomePage(driver);
    HomePage highlightVideo = new HomePage(driver);

    String error = "No bookmark icon available on hover of the highlight video on the home page";

    login.LoginGlobalAdmin();
    highlightVideo.HighlightVideoHover(browserType);


    if (bookmarkIcon.LiveOrHighlightsBookmark()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C39059 completed");
  }
}