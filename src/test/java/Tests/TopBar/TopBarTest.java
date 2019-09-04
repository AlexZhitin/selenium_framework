package Tests.TopBar;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.HomePage;
import Pages.Profile.Own.ProfileGeneralPageOwn;
import Pages.SignInPage;
import Pages.TopBar.TopBarSection;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TopBarTest extends TestBase {

  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C38877*/

  public void TopBarDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection topBar = new TopBarSection(driver);
    login.LoginGlobalAdmin();

    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    try {
      if (topBar.TopBarDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Top bar is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38877 completed");
  }

  @Test /*C38865*/

  public void LogoIsDisplayed() {
    SignInPage login = new SignInPage(driver);
    login.LoginGlobalAdmin();

    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    TopBarSection logo = new TopBarSection(driver);
    try {
      if (logo.LogoIsDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Logo is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38865 completed");
  }

  @Test /*C38867*/

  public void ProfileIconDisplayed() {
    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    login.LoginGlobalAdmin();

    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    try {
      if (profileIcon.ProfileIconDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Profile icon is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38867 completed");
  }

  @Test /*C38878*/

  public void ProfileDropdownDisplayed() {
    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileDropdown = new TopBarSection(driver);

    login.LoginGlobalAdmin();

    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    profileIcon.clickMenuIcon();


    try {
      if (profileDropdown.ProfileDropdownDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Profile dropdown is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38878 completed");
  }

  @Test /*C38878*/

  public void ProfileOptionDisplayed() {
    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);

    login.LoginGlobalAdmin();

    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    profileIcon.clickMenuIcon();


    try {
      if (profileOption.ProfileOptionDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Profile option is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38878 completed");
  }

  @Test /*C38878*/

  public void UsersOptionDisplayed() {
    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);

    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();


    try {
      if (usersOption.UsersOptionDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("User option is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38878 completed");
  }

  @Test /*C38878*/

  public void LogoutOptionDisplayed() {
    ExtentTestManager.getTest().log(Status.INFO, "Started LogoutOptionDisplayed()");

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection logoutOption = new TopBarSection(driver);

    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();


    try {
      if (logoutOption.LogoutOptionDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Log out option is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38878 completed");
  }

  @Test /*C38879*/

  public void ProfileSectionIsDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn tab = new ProfileGeneralPageOwn(driver);


    String error = "Profile section is not opened";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    Thread.sleep(1000);
    profileOption.clickProfileOption();

    if (tab.MyVideosTabIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38879 completed");
  }

  @Test /*C38881*/

  public void UserIsLoggedOut() throws InterruptedException {

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection logOutOption = new TopBarSection(driver);
    SignInPage buttonSignIn = new SignInPage(driver);
    SignInPage login = new SignInPage(driver);

    String error = "User wasn't logged out";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    logOutOption.clickLogOutOption();

    if (buttonSignIn.SignInBtnDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38881 completed");
  }

  @Test /*C38881*/

  public void LogoRedirectToHomePage() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    TopBarSection logo = new TopBarSection(driver);
    HomePage schedule = new HomePage(driver);


    String error = "User wasn't redirected to the home page from profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    logo.clickLogo();

    if (schedule.ScheduleTitleDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38881 completed");
  }
}



