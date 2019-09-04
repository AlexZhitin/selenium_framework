package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.AggregatedPage;
import Pages.HomePage;
import Pages.SignInPage;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AggregatedPageTest extends TestBase {

  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C39051*/

  public void AggregatedPageTitle() {
    HomePage liveHighlightsTitle = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    AggregatedPage aggregatedTitle = new AggregatedPage(driver);

    String error = "Live Now or Recent Highlights title is not shown on the aggregated page";

    login.LoginGlobalAdmin();

    liveHighlightsTitle.clickLiveHighlightsTitle();

    if (aggregatedTitle.AggregatedTitle()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C39051 completed");
  }

  @Test /*C38897*/

  public void AggregatedVideosCount() {
    HomePage liveHighlightsTitle = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    AggregatedPage aggregatedVideos = new AggregatedPage(driver);

    String error = "More than 20 videos is shown on the aggregated page";

    login.LoginGlobalAdmin();

    liveHighlightsTitle.clickLiveHighlightsTitle();

    if (aggregatedVideos.VideosCount() > 20) {
      Assert.fail();
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C38897 completed");
  }

  @Test /*C39052*/

  public void AggregatedPagePagination() throws InterruptedException {

    HomePage liveHighlightsTitle = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    AggregatedPage aggregatedVideos = new AggregatedPage(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    String error = "Count of videos after scroll is the same as it was before scroll. Pagination didn't work.";
    String skip = "Test skipped cause there's 20 or less than 20 videos on the aggregated page to test pagination";

    login.LoginGlobalAdmin();

    liveHighlightsTitle.clickLiveHighlightsTitle();
    int countBeforeScroll = aggregatedVideos.VideosCount();
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,1000)");

    if (aggregatedVideos.VideosCount() <= 20) {
      Thread.sleep(2000);
      System.out.println(skip);
      ExtentTestManager.getTest().log(Status.INFO, skip);
      throw new SkipException("Skipped");
    }

    int countAfterScroll = aggregatedVideos.VideosCount();

    if (countAfterScroll > countBeforeScroll) {
      Assert.assertTrue(true);
    } else {
      Assert.fail();
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
    }
    System.out.println("Test C39052 completed");
  }

  @Test /*C39053*/

  public void AggregatedPageDefaultView() {
    HomePage liveHighlightsTitle = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    AggregatedPage defaultView = new AggregatedPage(driver);

    String error = "Default column view is not set up";

    login.LoginGlobalAdmin();

    liveHighlightsTitle.clickLiveHighlightsTitle();

    if (defaultView.DefaultView()) {
      Assert.assertTrue(true);
    } else {
      Assert.fail();
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
    }
    System.out.println("Tests C39053 completed");
  }

  @Test /*C39054*/

  public void AggregatedPageChangeView() {
    HomePage liveHighlightsTitle = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    AggregatedPage changeView = new AggregatedPage(driver);
    AggregatedPage changedView = new AggregatedPage(driver);

    String error = "Default column view wasn't changed to row view";

    login.LoginGlobalAdmin();
    liveHighlightsTitle.clickLiveHighlightsTitle();
    changeView.clickChangeViewBtn();

    if (changedView.ChangedView()) {
      Assert.assertTrue(true);
    } else {
      Assert.fail();
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
    }
    System.out.println("Tests C39054 completed");
  }

  @Test /*C39055*/

  public void AggregatedPageVideoDescription() throws InterruptedException {
    HomePage liveHighlightsTitle = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    AggregatedPage videoDescription = new AggregatedPage(driver);

    String error = "Video description/title is not showing";

    login.LoginGlobalAdmin();
    liveHighlightsTitle.clickLiveHighlightsTitle();

    if (videoDescription.AggregatedVideoDescription()) {
      Assert.assertTrue(true);
    } else {
      Assert.fail();
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
    }
    System.out.println("Tests C39055 completed");
  }

  @Test /*C39056*/

  public void AggregatedPageVideoTime() {
    HomePage liveHighlightsTitle = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    AggregatedPage videoTime = new AggregatedPage(driver);

    String error = "Video time is not showing";

    login.LoginGlobalAdmin();
    liveHighlightsTitle.clickLiveHighlightsTitle();

    if (videoTime.AggregatedVideoTime()) {
      Assert.assertTrue(true);
    } else {
      Assert.fail();
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
    }
    System.out.println("Test C39056 completed");
  }


  @Parameters({"browserType"})
  @Test /*C39057*/

  public void AggregatedPageVideoBookmark(String browserType) {
    SignInPage login = new SignInPage(driver);
    AggregatedPage bookmarkIcon = new AggregatedPage(driver);
    AggregatedPage video = new AggregatedPage(driver);

    String error = "No bookmark icon available on hover of the video on the aggregated page";

    login.LoginGlobalAdmin();
    video.VideoHover(browserType);


    if (bookmarkIcon.AggregatedBookmark()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C39057 completed");
  }
}
