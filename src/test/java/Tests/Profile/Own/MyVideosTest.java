package Tests.Profile.Own;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.Profile.Own.MyVideosPage;
import Pages.SignInPage;
import Pages.TopBar.TopBarSection;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyVideosTest extends TestBase {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C39022*/ //At least one shared post should by available under My Videos

  public void AvatarIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    MyVideosPage avatar = new MyVideosPage(driver);

    String error = "Avatar is not displayed on the share post in My Videos";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (avatar.AvatarIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39022 completed");
  }

  @Test /*C39023*/ //At least one shared post should by available under My Videos

  public void CreationTimeIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    MyVideosPage time = new MyVideosPage(driver);

    String error = "Creation time is not displayed on a shared post in My Videos";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (time.CreationTimeIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39022 completed");
  }

  @Test /*C39024*/ //At least one shared post should by available under My Videos

  public void UsernameIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    MyVideosPage username = new MyVideosPage(driver);

    String error = "Author username is not displayed on a shared post in My Videos";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (username.UsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39024 completed");
  }

  @Test /*C39025*/ //At least one shared post should by available under My Videos

  public void VideoContainerIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    MyVideosPage video = new MyVideosPage(driver);

    String error = "Post video container is not displayed on a shared post in My Videos";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (video.VideoIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39025 completed");
  }

  @Test /*C39026*/ //At least one shared post should by available under My Videos

  public void PostDescriptionIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    MyVideosPage description = new MyVideosPage(driver);

    String error = "Post description is not displayed on a shared post in My Videos";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (description.DescriptionIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39026 completed");
  }

  @Test /*C39027*/ //At least one shared post should by available under My Videos

  public void LikeCountIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    MyVideosPage likeCount = new MyVideosPage(driver);

    String error = "Like count is not displayed on a shared post in My Videos";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (likeCount.LikeCountIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39027 completed");
  }

  @Test /*C39028*/ //At least one shared post should by available under My Videos

  public void CommentCountIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    MyVideosPage commentCount = new MyVideosPage(driver);

    String error = "Comment count is not displayed on a shared post in My Videos";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (commentCount.CommentCountIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39028 completed");
  }

  @Test /*C39029*/ //At least one shared post should by available under My Videos

  public void RepostCountIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    MyVideosPage repostCount = new MyVideosPage(driver);

    String error = "Repost count is not displayed on a shared post in My Videos";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (repostCount.RepostCountIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39029 completed");
  }

  @Test /*C39030*/ //More than 10 posts should be under My videos to test pagination

  public void PostsPagination() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    MyVideosPage videosCount = new MyVideosPage(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;


    String error = "Less than 10 posts where shown, so pagination didn't work";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    videosCount.PostsCount();
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,3000)");
    Thread.sleep(3000);

    if (videosCount.PostsCount()>10) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39030 completed");
  }

  @Test /*C39031*/ //More than 10 posts should be under My videos to test pagination

  public void LoaderIsDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    MyVideosPage loader = new MyVideosPage(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;


    String error = "Less than 10 posts were shown, so pagination didn't work";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,3000)");

    if (loader.PostsLoaderDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39031 completed");
  }
}
