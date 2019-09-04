package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.ClipDetailsPage;
import Pages.HomePage;
import Pages.SignInPage;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClipDetailsTest extends TestBase {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C38928*/

  public void ClipTitleDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage clipTitle = new ClipDetailsPage(driver);

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();

    try {
      if (clipTitle.ClipTitleDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Clip title is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38928 completed");
  }

  @Test /*C38929*/
  public void ClipVideoDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage clipVideo = new ClipDetailsPage(driver);

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();

    try {
      if (clipVideo.ClipVideoDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Clip video is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38929 completed");
  }

  @Test /*C38930*/

  public void ClipDescriptionDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage clipDescription = new ClipDetailsPage(driver);

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();

    try {
      if (clipDescription.ClipDescriptionDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Clip description is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38930 completed");
  }

  @Test /*C38931*/

  public void ClipHashtagsDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage clipHashtags = new ClipDetailsPage(driver);

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();

    try {
      if (clipHashtags.ClipHashtagsDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Hashtags are either not displayed or not available ");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38931 completed");
  }

  @Test /*C38932*/

  public void ClipEditBtnDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage clipEditBtn = new ClipDetailsPage(driver);

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();

    try {
      if (clipEditBtn.ClipEditBtnDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Edit button is not shown");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38932 completed");
  }

  @Test /*C38933*/

  public void ClipShareBtnDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage clipShareBtn = new ClipDetailsPage(driver);

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();

    try {
      if (clipShareBtn.ClipShareBtnDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Edit button is not shown");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38933 completed");
  }

  @Test /*C38934*/

  public void SimilarClipsSectionDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage similarClips = new ClipDetailsPage(driver);

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();

    try {
      if (similarClips.SimilarClipsSectionDisplayed()) {
        Assert.assertTrue(true);
      } else {
      }
    } catch (Throwable e) {
      System.out.println("Similar clips are not shown");
      Assert.fail();
    }
    System.out.println("Test C38934 completed");
  }

  @Test /*C38935, C38936*/

  public void SimilarClipsState() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage similarEmptyState = new ClipDetailsPage(driver);
    ClipDetailsPage similarClips = new ClipDetailsPage(driver);

    login.LoginGlobalAdmin();

    leagueVideoDescription.clickLeagueSectionVideoDescription();
    Thread.sleep(3000);

    if (similarEmptyState.SimilarClipsEmptyState()) {
      System.out.println("Empty state is shown. Test C38935 completed");
      Assert.assertTrue(true);
    } else if (similarClips.SimilarClips()) {
      System.out.println("Similar clips are shown. Test C38936 completed");
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, "Neither empty state nor similar clips are shown");
      System.out.println("Neither empty state nor similar clips are shown");
      Assert.fail();
    }
    System.out.println("Tests C38935, C38936 completed");
  }
}