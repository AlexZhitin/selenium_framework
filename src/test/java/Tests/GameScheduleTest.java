package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.HomePage;
import Pages.SignInPage;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GameScheduleTest extends TestBase {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C38921*/

  public void ScheduleTitleDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage scheduleTitle = new HomePage(driver);

    login.LoginGlobalAdmin();

    try {
      if (scheduleTitle.ScheduleTitleDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Schedule title is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38921 completed");
  }

  @Test /*C38884*/

  public void ScheduleTimeDisplayed() {
    SignInPage login = new SignInPage(driver);
    HomePage scheduleTime = new HomePage(driver);

    login.LoginGlobalAdmin();

    try {
      if (scheduleTime.ScheduleTimeDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Schedule time is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38884 completed");
  }

  @Test /*C38891*/

  public void ScheduleTeamLogoDisplayed() {
    SignInPage login = new SignInPage(driver);
    HomePage scheduleTeamLogo = new HomePage(driver);

    login.LoginGlobalAdmin();


    if (scheduleTeamLogo.ScheduleTeamLogoDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println("Team logo is not displayed");
      Assert.fail();
    }
    System.out.println("Test C38891 completed");
  }

  @Test /*C38883*/

  public void ScheduleTeamNameDisplayed() {
    SignInPage login = new SignInPage(driver);
    HomePage scheduleTeamName = new HomePage(driver);

    login.LoginGlobalAdmin();

    try {
      if (scheduleTeamName.ScheduleTeamNameDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Team name is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38883 completed");
  }

  @Test /*C38884*/

  public void ScheduleGameDateDisplayed() {
    SignInPage login = new SignInPage(driver);
    HomePage scheduleGameDate = new HomePage(driver);

    login.LoginGlobalAdmin();

    try {
      if (scheduleGameDate.ScheduleGameDateDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Game date is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38884 completed");
  }

  @Test /*C38882*/

  public void ScheduleLeagueNameDisplayed() {
    SignInPage login = new SignInPage(driver);
    HomePage scheduleLeagueName = new HomePage(driver);

    login.LoginGlobalAdmin();

    try {
      if (scheduleLeagueName.ScheduleLeagueNameDisplayed()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Game date is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Test C38882 completed");
  }

  @Test /*C38922*/

  public void ScheduleLiveLabelDisplayed() {
    SignInPage login = new SignInPage(driver);
    HomePage scheduleLiveLogo = new HomePage(driver);
    HomePage live = new HomePage(driver);
    String error = "Live logo in schedule section is either not present or not displayed";
    String skip = "Test is skipped cause there's no live game at the moment";

    login.LoginGlobalAdmin();
    if (live.LiveTitleDisplayed()) {
      System.out.println("Live title is displayed hence the live label in schedule section should be shown");
    } else {System.out.println(skip);
      ExtentTestManager.getTest().log(Status.INFO, skip);
      throw new SkipException("Skipped");
    }

    if (scheduleLiveLogo.ScheduleLiveLabelDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38922 completed");
  }

  @Test /*C38885*/

  public void ScheduleScrollable() {
    SignInPage login = new SignInPage(driver);
    HomePage verticalScroll = new HomePage(driver);

    login.LoginGlobalAdmin();

    if (verticalScroll.ScheduleScrollable()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, "No scroll available");
      Assert.fail();
      System.out.println("No scroll available");
    }
    System.out.println("Test C38885 completed");
  }
}
