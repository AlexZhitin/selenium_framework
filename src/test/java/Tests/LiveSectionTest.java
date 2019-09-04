package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.*;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LiveSectionTest extends TestBase {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }


  @Test /*C38888*/

  //Can only be tested if Live section is available, else will fail.

  public void LiveTitleDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage liveTitle = new HomePage(driver);
    HomePage badgeLive = new HomePage(driver);
    String error = "The live title is not shown.";
    String skip = "There's no live videos shown now, so the live section is not available. Test skipped.";

    login.LoginGlobalAdmin();

    if (badgeLive.LiveBadge()) {
      System.out.println("Live badge is shown on videos, so there're live videos now");
    } else {
      System.out.println(skip);
      ExtentTestManager.getTest().log(Status.INFO, skip);
      throw new SkipException("Skipped");
    }

    if (liveTitle.LiveTitleDisplayed()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38888 completed");
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

  @Test /*C38890*/

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

  @Test/*C38889*/

  public void LiveLabelDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage liveLabel = new HomePage(driver);
    HomePage live = new HomePage(driver);

    String skip = "Test is skipped cause there's no live game at the moment";
    String error = "Live label is not shown on live videos in the live section";

    login.LoginGlobalAdmin();

    if (live.LiveTitleDisplayed()) {
      System.out.println("Live title is displayed hence the live label on live videos in the live section should be shown");
    } else {
      System.out.println(skip);
      ExtentTestManager.getTest().log(Status.INFO, skip);
      throw new SkipException("Skipped");
    }

    if (liveLabel.LiveBadge()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38889 completed");
  }

  @Test /*C38904*/

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
    System.out.println("Test C38904 completed");
  }

  @Test /*C38905*/

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
    System.out.println("Test C38905 completed");
  }

  @Parameters({"browserType"})
  @Test /*C39058*/

  public void LiveSectionBookmark(String browserType) {
    SignInPage login = new SignInPage(driver);
    HomePage bookmarkIcon = new HomePage(driver);
    HomePage liveVideo = new HomePage(driver);

    String error = "No bookmark icon available on hover of the live video on the home page";

    login.LoginGlobalAdmin();
    liveVideo.LiveVideoHover(browserType);


    if (bookmarkIcon.LiveOrHighlightsBookmark()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C39058 completed");
  }
}