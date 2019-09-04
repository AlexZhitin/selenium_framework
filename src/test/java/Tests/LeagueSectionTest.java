package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.SearchResultsPage;
import Pages.HomePage;
import Pages.SignInPage;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LeagueSectionTest extends TestBase {

  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }


  @Test /*C38901*/

  public void LeagueSectionNameDisplayed() {
    SignInPage login = new SignInPage(driver);
    HomePage leagueSectionName = new HomePage(driver);

    login.LoginGlobalAdmin();


    if (leagueSectionName.LeagueSectionNameDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println("League section name is either not displayed or no sections are shown");
      Assert.fail();
    }
    System.out.println("Test C38901 completed");
  }

  @Test /*C38899*/

  public void LeagueSectionVideosDisplayed() {
    SignInPage login = new SignInPage(driver);
    HomePage leagueSectionVideos = new HomePage(driver);

    login.LoginGlobalAdmin();

    if (leagueSectionVideos.LeagueSectionVideosDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println("League section videos are not shown");
      Assert.fail();
    }
    System.out.println("Test C38899 completed");
  }

  @Test /*C38902*/

  public void RedirectionToAggregatedPage() {
    HomePage leagueSectionName = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    SearchResultsPage aggregatedResultsTitle = new SearchResultsPage(driver);

    login.LoginGlobalAdmin();

    leagueSectionName.clickLeagueSectionName();

    try {
      if (aggregatedResultsTitle.ResultsTitle()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Aggregated videos page is not opened");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38902 completed");
  }

  @Test /*C38909*/

  public void LeagueSectionVideoDescription() {
    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);

    login.LoginGlobalAdmin();

    if (leagueVideoDescription.LeagueSectionVideoDescription()) {
      Assert.assertTrue(true);
    } else {
      System.out.println("Video description is not shown");
      Assert.fail();
    }
    System.out.println("Test C38909 completed");
  }

  @Test  /*C38910*/

  public void LeagueSectionVideoTime() {
    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoTime = new HomePage(driver);

    login.LoginGlobalAdmin();


    if (leagueVideoTime.LeagueSectionVideoTime()) {
      Assert.assertTrue(true);
    } else {
      System.out.println("Time under videos is not shown");
      Assert.fail();
    }
    System.out.println("Test C38910 completed");
  }

  @Parameters({"browserType"})
  @Test /*C38919*/

  public void VideoPlaying(String browserType) throws InterruptedException {
    SignInPage login = new SignInPage(driver);
    HomePage videoHover = new HomePage(driver);
    HomePage videoStartPlay = new HomePage(driver);
    HomePage videoPlaying = new HomePage(driver);

    login.LoginGlobalAdmin();

    videoHover.LeagueVideoHover(browserType);
    Thread.sleep(1000);
    videoStartPlay.clickVideoPlay();

    try {
      if (videoPlaying.VideoPlaying()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Timer 00:03 didn't show up. Video is not playing.");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38919 completed");
  }

  @Parameters({"browserType"})
  @Test /*C38920*/

  public void VideoPaused(String browserType) throws InterruptedException {
    SignInPage login = new SignInPage(driver);
    HomePage videoHover = new HomePage(driver);
    HomePage videoStartPlay = new HomePage(driver);
    HomePage video = new HomePage(driver);

    login.LoginGlobalAdmin();

    videoHover.LeagueVideoHover(browserType);

    videoStartPlay.clickVideoPlay();//Click play

    Thread.sleep(1000);

    videoStartPlay.clickVideoPause();//Click pause


    try {
      if (video.VideoPaused()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Video is not paused.");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38920 completed");
  }

  @Test /*C38900*/

  public void LeagueSectionVideosCount() {
    SignInPage login = new SignInPage(driver);

    login.LoginGlobalAdmin();

    HomePage videosCount = new HomePage(driver);


    if (videosCount.LeagueSectionVideosCount() > 4) {
      Assert.fail();
      System.out.println("There's more than 4 videos shown");
      ExtentTestManager.getTest().log(Status.INFO, "There's more than 4 videos shown for leagues on the home page");
    } else {
      Assert.assertTrue(true);
    }
  }

  @Parameters({"browserType"})
  @Test /*C39060*/

  public void LeagueSectionBookmark(String browserType) throws InterruptedException {
    SignInPage login = new SignInPage(driver);
    HomePage bookmarkIcon = new HomePage(driver);
    HomePage leagueVideo = new HomePage(driver);

    String error = "No bookmark icon available on hover of the video on the league section on the home page";

    login.LoginGlobalAdmin();
    leagueVideo.LeagueVideoHover(browserType);

    if (bookmarkIcon.LeagueSectionBookmark()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C39060 completed");
  }
}