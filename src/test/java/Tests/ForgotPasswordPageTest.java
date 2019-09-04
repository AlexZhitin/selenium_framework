package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.*;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPasswordPageTest extends TestBase {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C39234*/

  public void ForgotPassPageIsOpened() {

    SignInPage forgotPass = new SignInPage(driver);
    ForgotPasswordPage title = new ForgotPasswordPage(driver);

    String error = "Forgot password page wasn't opened";
    String test = "Testcase C39234";


    forgotPass.clickForgotPassword();

    if (title.TitleForgotPassIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39235*/

  public void SubmitButtonIsDisabled() {

    SignInPage forgotPass = new SignInPage(driver);
    ForgotPasswordPage button = new ForgotPasswordPage(driver);

    String error = "Submit button is not disabled if the email input field is empty";
    String test = "Testcase C39235";


    forgotPass.clickForgotPassword();

    if (button.SubmitButtonIsDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C38860*/

  public void EmailInputIsDisaplyed() {

    SignInPage forgotPass = new SignInPage(driver);
    ForgotPasswordPage field = new ForgotPasswordPage(driver);

    String error = "Email input field is not available.";
    String test = "Testcase C38860";


    forgotPass.clickForgotPassword();

    if (field.EmailInputIsDisaplyed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }


  @Test /*C38863*/

  public void InvalidEmailInput() {

    SignInPage forgotPass = new SignInPage(driver);
    ForgotPasswordPage input = new ForgotPasswordPage(driver);
    ForgotPasswordPage errorMessage = new ForgotPasswordPage(driver);
    ForgotPasswordPage button = new ForgotPasswordPage(driver);


    String error = "No error was shown when submitting invalid email";
    String test = "Testcase C38863";
    String email = "invalidEmail";


    forgotPass.clickForgotPassword();
    input.EmailInput(email);
    button.clickButtonSubmit();


    if (errorMessage.ErrorEmailIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39236*/

  public void NotRegisteredEmail() {

    SignInPage forgotPass = new SignInPage(driver);
    ForgotPasswordPage input = new ForgotPasswordPage(driver);
    ForgotPasswordPage errorMessage = new ForgotPasswordPage(driver);
    ForgotPasswordPage button = new ForgotPasswordPage(driver);


    String error = "No error was shown when submitting the email address which is not registered";
    String test = "Testcase C39236";
    String email = "notregisteredemail@gmail.com";


    forgotPass.clickForgotPassword();
    input.EmailInput(email);
    button.clickButtonSubmit();


    if (errorMessage.ErrorEmailIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C38864*/

  public void ValidEmailInput() {

    SignInPage forgotPass = new SignInPage(driver);
    ForgotPasswordPage input = new ForgotPasswordPage(driver);
    ForgotPasswordPage button = new ForgotPasswordPage(driver);


    String error = "Forgot password email was not sent";
    String test = "Testcase C38864";
    String email = "qacrewrocks@gmail.com";//email address is registered on both dev. and prod.


    forgotPass.clickForgotPassword();
    input.EmailInput(email);
    button.clickButtonSubmit();


    if (button.LinkGoBackIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39237*/

  public void LinkGoBack() throws InterruptedException {

    SignInPage forgotPass = new SignInPage(driver);
    SignInPage buttonLogIn = new SignInPage(driver);
    ForgotPasswordPage input = new ForgotPasswordPage(driver);
    ForgotPasswordPage button = new ForgotPasswordPage(driver);


    String error = "User was not brought back to the login page";
    String test = "Testcase C39237";
    String email = "qacrewrocks@gmail.com";//email address is registered on both dev. and prod.


    forgotPass.clickForgotPassword();
    input.EmailInput(email);
    button.clickButtonSubmit();
    button.clickGoBack();


    if (buttonLogIn.SignInBtnDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }
}
