package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.SearchResultsPage;
import Pages.HomePage;
import Pages.SignInPage;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchResultsPageTest extends TestBase {

  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C38903*/

  public void SearchResultsTitle() {
    HomePage leagueSectionName = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    SearchResultsPage resultsTitle = new SearchResultsPage(driver);

    login.LoginGlobalAdmin();

    leagueSectionName.clickLeagueSectionName();


    try {
      if (resultsTitle.ResultsTitle()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Results for \"<team name>\"is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38903 completed");
  }

  @Test /*C38911*/

  public void SearchResultsVideosCount() throws InterruptedException {
    HomePage leagueSectionName = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    SearchResultsPage aggregatedVideos = new SearchResultsPage(driver);

    login.LoginGlobalAdmin();

    leagueSectionName.clickLeagueSectionName();
    Thread.sleep(3000);

    Assert.assertEquals(aggregatedVideos.VideosCount(), 20);
    System.out.println("Test C38911 completed");
  }

  @Test /*C38912*/

  public void SearchResultsPagination() throws InterruptedException {

    HomePage leagueSectionName = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    SearchResultsPage aggregatedVideos = new SearchResultsPage(driver);
    SearchResultsPage viewButton = new SearchResultsPage(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    login.LoginGlobalAdmin();

    leagueSectionName.clickLeagueSectionName();
    Thread.sleep(3000);
    viewButton.clickChangeViewBtn();
    int countBeforeScroll = aggregatedVideos.VideosCount();

    js.executeScript("window.scrollBy(0,10000)");
    Thread.sleep(3000);
    int countAfterScroll = aggregatedVideos.VideosCount();

    Assert.assertTrue(countBeforeScroll < countAfterScroll);
    System.out.println("Test C38912 completed");
  }

  @Test /*C38917*/

  public void SearchResultsDefaultView(){
    HomePage leagueSectionName = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    SearchResultsPage defaultView = new SearchResultsPage(driver);

    login.LoginGlobalAdmin();

    leagueSectionName.clickLeagueSectionName();

    try {
      if (defaultView.DefaultView()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("No default view (not a grid view)");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Tests C38917 completed");
  }

  @Test /*C38913*/

  public void SearchResultsChangeView() {
    HomePage leagueSectionName = new HomePage(driver);
    SignInPage login = new SignInPage(driver);
    SearchResultsPage changeView = new SearchResultsPage(driver);
    SearchResultsPage changedView = new SearchResultsPage(driver);

    login.LoginGlobalAdmin();
    leagueSectionName.clickLeagueSectionName();
    changeView.clickChangeViewBtn();

    try {
      if (changedView.ChangedView()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("View didn't change from default column view to row view");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Tests C38913 completed");
  }

  @Test /*C38915*/

  public void SearchResultsVideoDescription() throws InterruptedException {
    SignInPage login = new SignInPage(driver);
    SearchResultsPage videoDescription = new SearchResultsPage(driver);
    HomePage leagueSectionName = new HomePage(driver);

    login.LoginGlobalAdmin();

    leagueSectionName.clickLeagueSectionName();
    Thread.sleep(3000);

    if (videoDescription.SearchPageVideoDescription()) {
      Assert.assertTrue(true);
    } else {
      System.out.println("Video description is not shown");
      Assert.fail();
    }
    System.out.println("Tests C38915 completed");
  }

  @Test /*C38916*/

  public void SearchResultsVideoTime() {
    SignInPage login = new SignInPage(driver);
    SearchResultsPage videoTime = new SearchResultsPage(driver);
    HomePage leagueSectionName = new HomePage(driver);

    login.LoginGlobalAdmin();

    leagueSectionName.clickLeagueSectionName();

    if (videoTime.SearchPageVideoTime()) {
      Assert.assertTrue(true);
    } else {
      System.out.println("Time under videos is not shown");
      Assert.fail();
    }
    System.out.println("Test C38916 completed");
  }

  @Parameters({"browserType"})
  @Test /*C38955*/

  public void SearchResultsVideoBookmark(String browserType) {
    SignInPage login = new SignInPage(driver);
    SearchResultsPage bookmarkIcon = new SearchResultsPage(driver);
    SearchResultsPage video = new SearchResultsPage(driver);
    HomePage leagueSectionName = new HomePage(driver);

    String error = "No bookmark icon available on hover of the video on the search results page";

    login.LoginGlobalAdmin();
    leagueSectionName.clickLeagueSectionName();
    video.VideoHover(browserType);


    if (bookmarkIcon.SearchResultsBookmark()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38955 completed");
  }
}

