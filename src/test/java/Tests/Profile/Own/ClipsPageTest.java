package Tests.Profile.Own;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.*;
import Pages.Profile.Own.ClipsPage;
import Pages.TopBar.TopBarSection;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClipsPageTest extends TestBase {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Parameters({"browserType"})
  @Test /*C39032*/

  public void BookmarkedVideoDisplayed(String browserType) throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    HomePage bookmark = new HomePage(driver);
    HomePage leagueVideo = new HomePage(driver);
    HomePage leagueVideoTitle = new HomePage(driver);
    HomePage closeToast = new HomePage(driver);
    ClipsPage clipsTab = new ClipsPage(driver);
    ClipsPage clipTitle = new ClipsPage(driver);
    ClipsPage deleteBtn = new ClipsPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);

    String error = "Bookmarked video is not shown under Clips in Profile";

    login.LoginGlobalAdmin();
    String text1 = leagueVideoTitle.LeagueSectionVideoTitleText();
    leagueVideo.LeagueVideoHover(browserType);
    bookmark.clickLeagueVideoBookmark();
    closeToast.clickBookmarkToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    driver.navigate().refresh();
    clipsTab.clickClipsTab();
    String text2 = clipTitle.ClipsVideoDescriptionText();
    deleteBtn.clickDeleteBtn();
    Thread.sleep(3000);


    if (text1.equals(text2)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39032 completed");
  }
  @Parameters({"browserType"})
  @Test /*C39038*/

  public void ClipsDeleteBtnDisplayed(String browserType) throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    HomePage bookmark = new HomePage(driver);
    HomePage leagueVideo = new HomePage(driver);
    HomePage closeToast = new HomePage(driver);
    ClipsPage clipsTab = new ClipsPage(driver);
    ClipsPage deleteBtn = new ClipsPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ClipsPage videosClipsTab = new ClipsPage(driver);

    String error = "Delete button is not available";

    login.LoginGlobalAdmin();

    leagueVideo.LeagueVideoHover(browserType);
    bookmark.clickLeagueVideoBookmark();
    closeToast.clickBookmarkToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    driver.navigate().refresh();
    clipsTab.clickClipsTab();

    if (deleteBtn.ClipsDeleteBtnDisplayed()) {
      deleteBtn.clickDeleteBtn();
      Thread.sleep(3000);
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39033 completed");
  }

  @Parameters({"browserType"})
  @Test/*C39038*/

  public void ClipsVideoDisplayed(String browserType) throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    HomePage bookmark = new HomePage(driver);
    HomePage leagueVideo = new HomePage(driver);
    HomePage closeToast = new HomePage(driver);
    ClipsPage clipsTab = new ClipsPage(driver);
    ClipsPage deleteBtn = new ClipsPage(driver);
    ClipsPage videoContainer = new ClipsPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);

    String error = "Clips video container is not available";

    login.LoginGlobalAdmin();

    leagueVideo.LeagueVideoHover(browserType);
    bookmark.clickLeagueVideoBookmark();
    closeToast.clickBookmarkToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    driver.navigate().refresh();
    clipsTab.clickClipsTab();

    if (videoContainer.ClipsVideoDisplayed()) {
      deleteBtn.clickDeleteBtn();
      Thread.sleep(3000);
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39033 completed");
  }

  @Parameters({"browserType"})
  @Test /*C39039*/

  public void ClipVideoIsDeleted(String browserType) {

    SignInPage login = new SignInPage(driver);
    HomePage bookmark = new HomePage(driver);
    HomePage leagueVideo = new HomePage(driver);
    HomePage closeToast = new HomePage(driver);
    ClipsPage clipsTab = new ClipsPage(driver);
    ClipsPage deleteBtn = new ClipsPage(driver);
    ClipsPage emptyState = new ClipsPage(driver);
    ClipsPage toastDeleted = new ClipsPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);

    String error = "Bookmarked video was not deleted";

    login.LoginGlobalAdmin();

    leagueVideo.LeagueVideoHover(browserType);
    bookmark.clickLeagueVideoBookmark();
    closeToast.clickBookmarkToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    driver.navigate().refresh();
    clipsTab.clickClipsTab();
    deleteBtn.clickDeleteBtn();

    if (emptyState.ClipsEmptyStateDisplayed() && toastDeleted.BookmarkDeletionSuccessToast()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39039 completed");
  }

  @Parameters({"browserType"})
  @Test /*C39040*/

  public void BookmarkDeletionSuccessToast(String browserType) {

    SignInPage login = new SignInPage(driver);
    HomePage bookmark = new HomePage(driver);
    HomePage leagueVideo = new HomePage(driver);
    HomePage closeToast = new HomePage(driver);
    ClipsPage clipsTab = new ClipsPage(driver);
    ClipsPage deleteBtn = new ClipsPage(driver);
    ClipsPage toastDeleted = new ClipsPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);

    String error = "No toast showed up after the bookmarked video was deleted";

    login.LoginGlobalAdmin();

    leagueVideo.LeagueVideoHover(browserType);
    bookmark.clickLeagueVideoBookmark();
    closeToast.clickBookmarkToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    driver.navigate().refresh();
    clipsTab.clickClipsTab();
    deleteBtn.clickDeleteBtn();

    if (toastDeleted.BookmarkDeletionSuccessToast()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39040 completed");
  }

  @Parameters({"browserType"})
  @Test /*C39036*/

  public void ClipsVideoTitleDisplayed(String browserType) throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    HomePage bookmark = new HomePage(driver);
    HomePage leagueVideo = new HomePage(driver);
    HomePage closeToast = new HomePage(driver);
    ClipsPage clipsTab = new ClipsPage(driver);
    ClipsPage deleteBtn = new ClipsPage(driver);
    ClipsPage videoTitle = new ClipsPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);

    String error = "Clips video does not have title/description";

    login.LoginGlobalAdmin();

    leagueVideo.LeagueVideoHover(browserType);
    bookmark.clickLeagueVideoBookmark();
    closeToast.clickBookmarkToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    driver.navigate().refresh();
    clipsTab.clickClipsTab();

    if (videoTitle.ClipsVideoTitleDisplayed()) {
      deleteBtn.clickDeleteBtn();
      Thread.sleep(3000);
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39036 completed");
  }

  @Parameters({"browserType"})
  @Test /*C39037*/

  public void ClipsVideoDateDisplayed(String browserType) throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    HomePage bookmark = new HomePage(driver);
    HomePage leagueVideo = new HomePage(driver);
    HomePage closeToast = new HomePage(driver);
    ClipsPage clipsTab = new ClipsPage(driver);
    ClipsPage deleteBtn = new ClipsPage(driver);
    ClipsPage videoDate = new ClipsPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);

    String error = "Clips video do not have dates";

    login.LoginGlobalAdmin();

    leagueVideo.LeagueVideoHover(browserType);
    bookmark.clickLeagueVideoBookmark();
    closeToast.clickBookmarkToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    driver.navigate().refresh();
    clipsTab.clickClipsTab();

    if (videoDate.ClipsVideoDateDisplayed()) {
      deleteBtn.clickDeleteBtn();
      Thread.sleep(3000);
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39037 completed");
  }

  @Test /*C39046*/

  public void ClipsEmptyStateDisplayed() {

    SignInPage login = new SignInPage(driver);
    ClipsPage clipsTab = new ClipsPage(driver);
    ClipsPage emptyState = new ClipsPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);

    String error = "Empty state text is either wrong or not shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    clipsTab.clickClipsTab();

    if (emptyState.ClipsEmptyStateDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39046 completed");
  }


  @Parameters({"browserType"})
  @Test /*C39034*/

  public void ClipsVideoBookmarkDisplayed(String browserType) throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    HomePage bookmark = new HomePage(driver);
    HomePage leagueVideo = new HomePage(driver);
    HomePage closeToast = new HomePage(driver);
    ClipsPage clipsTab = new ClipsPage(driver);
    ClipsPage deleteBtn = new ClipsPage(driver);
    ClipsPage clipsBookmark = new ClipsPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);

    String error = "No bookmark is shown on the video in clips";

    login.LoginGlobalAdmin();

    leagueVideo.LeagueVideoHover(browserType);
    bookmark.clickLeagueVideoBookmark();
    closeToast.clickBookmarkToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    driver.navigate().refresh();
    clipsTab.clickClipsTab();

    if (clipsBookmark.ClipsVideoBookmarkDisplayed()) {
      deleteBtn.clickDeleteBtn();
      Thread.sleep(3000);
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39034 completed");
  }

  @Parameters({"browserType"})
  @Test /*C39043*/(priority = 1)//Need to be executed when there's no bookmarked videos in Clips

  public void ClipsPagination(String browserType) throws InterruptedException {


    HomePage leagueSectionName = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    SearchResultsPage videosSearchResults = new SearchResultsPage(driver);
    SearchResultsPage viewButton = new SearchResultsPage(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ClipsPage clipsTab = new ClipsPage(driver);
    ClipsPage videosCount = new ClipsPage(driver);


    String error = "The count of videos after scroll didn't change, so pagination doesn't work";


    login.LoginGlobalAdmin();
    leagueSectionName.clickLeagueSectionName();
    Thread.sleep(3000);
    viewButton.clickChangeViewBtn();
    js.executeScript("window.scrollBy(0,10000)");
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,-10000)");
    videosSearchResults.BookmarkMultipleVideos(browserType);
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    driver.navigate().refresh();
    clipsTab.clickClipsTab();
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,10000)");
    Thread.sleep(3000);

    if (videosCount.ClipsVideosCount() > 21) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39043 completed");
  }

  @Test /*C39044*/(priority = 2)//Need to be executed when there's no bookmarked videos in Clips

  public void ClipsLoader() throws InterruptedException {


    SignInPage login = new SignInPage(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ClipsPage clipsTab = new ClipsPage(driver);
    ClipsPage clipsLoader = new ClipsPage(driver);

    String error = "Loader is not showing when another batch of videos is being loaded";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    clipsTab.clickClipsTab();
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,3000)");

    if (clipsLoader.ClipsLoaderDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39044 completed");
  }

  @Parameters({"browserType"})
  @Test /*C39044*/(priority = 3)//Need to be executed when there's no bookmarked videos in Clips

  public void ClickClipsVideoTitle(String browserType) throws InterruptedException {


    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ClipsPage clipsTab = new ClipsPage(driver);
    ClipsPage videoTitle = new ClipsPage(driver);
    ClipDetailsPage similarClips = new ClipDetailsPage(driver);
    ClipsPage videosClipsTab = new ClipsPage(driver);

    String error = "Clips details page is not opened";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    clipsTab.clickClipsTab();
    videoTitle.clickVideoTitle();

    if (similarClips.SimilarClipsSectionDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    clipsTab.clickClipsTab();
    videosClipsTab.deleteAllBookmarkedVideos(browserType);
    driver.navigate().refresh();
    clipsTab.clickClipsTab();
    videosClipsTab.deleteAllBookmarkedVideos(browserType);
    System.out.println("Test C39044 completed");
  }
}





