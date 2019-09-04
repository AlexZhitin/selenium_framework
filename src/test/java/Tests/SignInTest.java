package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.SignInPage;
import Pages.TopBar.TopBarSection;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignInTest extends TestBase {

  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test

  public void LoginSuccessful() {
    ExtentTestManager.getTest().log(Status.INFO, "Started LoginSuccessful()");

    SignInPage inputEmail = new SignInPage(driver);
    SignInPage inputPassword = new SignInPage(driver);
    SignInPage signin = new SignInPage(driver);
    TopBarSection logo = new TopBarSection(driver);


    inputEmail.typeEmail("cusptestglobaladmin@bkstg.com");
    inputPassword.typePassword("Abcd1234");
    signin.clickSignInBtn();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    try {
      if (logo.LogoIsDisplayed()){
        Assert.assertTrue(true);
      } else {
        System.out.println("Logo is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Tests completed");
  }


  @Test

  public void LoginFailed() {
    ExtentTestManager.getTest().log(Status.INFO, "Started LoginFailed()");

    SignInPage inputEmail = new SignInPage(driver);
    SignInPage inputPassword = new SignInPage(driver);
    SignInPage signin = new SignInPage(driver);
    TopBarSection logo = new TopBarSection(driver);


    inputEmail.typeEmail("cusptestglobaladmin@bkstg.com");
    inputPassword.typePassword("wrong password");
    signin.clickSignInBtn();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    try {
      if (logo.LogoIsDisplayed()) {
        Assert.fail();
      } else {
        System.out.println("Logo is not displayed");
      }
    } catch (Throwable e) {
      Assert.assertTrue(true);
    }
    System.out.println("Tests completed");
  }


  @Test

  public void InvalidEmailError() {
    ExtentTestManager.getTest().log(Status.INFO, "Started LoginError()");

    SignInPage inputEmail = new SignInPage(driver);
    SignInPage inputPassword = new SignInPage(driver);
    SignInPage signIn = new SignInPage(driver);
    SignInPage loginError = new SignInPage(driver);


    inputEmail.typeEmail("InvalidEmailAddress@bkstg.com");

    inputPassword.typePassword("Abcd1234");

    signIn.clickSignInBtn();


    try {
      if (loginError.InvalidEmailError()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Invalid email error is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Tests completed");
  }

  @Test

  public void InvalidEmailFormatError() {
    ExtentTestManager.getTest().log(Status.INFO, "Started LoginError()");

    SignInPage inputEmail = new SignInPage(driver);
    SignInPage inputPassword = new SignInPage(driver);
    SignInPage signIn = new SignInPage(driver);
    SignInPage loginError = new SignInPage(driver);


    inputEmail.typeEmail("cusptestglobaladmin@");
    inputPassword.typePassword("Abcd1234");
    signIn.clickSignInBtn();

    try {
      if (loginError.InvalidEmailFormatError()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Invalid email format error is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Tests completed");
  }

  @Test

  public void InvalidPasswordError() {
    ExtentTestManager.getTest().log(Status.INFO, "Started LoginError()");

    SignInPage inputEmail = new SignInPage(driver);
    SignInPage inputPassword = new SignInPage(driver);
    SignInPage signIn = new SignInPage(driver);
    SignInPage loginError = new SignInPage(driver);


    inputEmail.typeEmail("cusptestglobaladmin@bkstg.com");
    inputPassword.typePassword("wrong password");
    signIn.clickSignInBtn();

    try {
      if (loginError.InvalidPasswordError()) {
        Assert.assertTrue(true);
      } else {
        System.out.println("Invalid password error is not displayed");
      }
    } catch (Throwable e) {
      Assert.fail();
    }
    System.out.println("Tests completed");
  }

  @Test

  public void NoEmailInput() {
    ExtentTestManager.getTest().log(Status.INFO, "Started NoEmailInput()");

    SignInPage inputPassword = new SignInPage(driver);
    SignInPage signInBtn = new SignInPage(driver);


    inputPassword.typePassword("Abcd1234");

    try {
      if (signInBtn.SignInBtnEnabled()) {
        Assert.fail("Sign In button is enabled. It shouldn't be enabled.");
      } else {
        System.out.println("Sign In button is disabled as expected");
      }
    } catch (Throwable e) {
      Assert.assertTrue(true);
    }
    System.out.println("Tests completed");
  }



  @Test

  public void NoPasswordInput() {
    ExtentTestManager.getTest().log(Status.INFO, "Started NoEmailInput()");

    SignInPage signInBtn = new SignInPage(driver);
    SignInPage inputEmail = new SignInPage(driver);

    inputEmail.typeEmail("cusptestglobaladmin@bkstg.com");

    try {
      if (signInBtn.SignInBtnEnabled()) {
        Assert.fail("Sign In button is enabled. It shouldn't be enabled.");
      } else {
        System.out.println("Sign In button is disabled as expected");
      }
    } catch (Throwable e) {
      Assert.assertTrue(true);
    }
    System.out.println("Tests completed");
  }
}

