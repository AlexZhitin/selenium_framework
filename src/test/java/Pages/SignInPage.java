package Pages;

import Base.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SignInPage {


  protected WebDriver driver;

  /*Create elements with locators*/

  private By email = By.xpath("//*[@id='email']");
  private By password = By.xpath("//*[@id='password']");
  private By loginButton = By.xpath("//*[@data-id='loginButton'][not(@disabled)]");
  private By loginButtonDisabled = By.xpath("//*[@data-id='loginButton'][@disabled]");
  private By errorEmail = By.xpath("//*[@data-id='errorEmail']");
  private By errorEmailFormat = By.xpath("//*[@data-id='errorEmail']");
  private By errorPassword = By.xpath("//*[@data-id='errorPassword']");
  private By forgotPassword = By.xpath("//*[@data-id='forgotPasswordLink']");
  private By logo = By.xpath("//*[@data-id='logo']");



  private String validGlobalAdminEmail = "cusptestglobaladmin@bkstg.com";
  private String validAdminEmail = "cusptestadmin@bkstg.com";
  private String validInfluencerEmail = "cusptestinfluencer@bkstg.com";
  private String validPasswordCommon = "Abcd1234";


  public SignInPage(WebDriver driver) {
    this.driver = driver;
  }


  public void typeEmail(String useremail) {
    System.out.println("Type the email address on the Sign in page");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(email).sendKeys(useremail);

  }

  public void typePassword(String userpassword) {
    System.out.println("Type in the password on the Sign in page");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(password).sendKeys(userpassword);
  }

  public void clickSignInBtn() {

    System.out.println("Click on sign in button");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(loginButton).click();

  }

  public void LoginGlobalAdmin() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.findElement(email).sendKeys(validGlobalAdminEmail);
      driver.findElement(password).sendKeys(validPasswordCommon);
      driver.findElement(loginButton).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void LoginAdmin() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.findElement(email).sendKeys(validAdminEmail);
      driver.findElement(password).sendKeys(validPasswordCommon);
      driver.findElement(loginButton).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void LoginInfluencer() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.findElement(email).sendKeys(validInfluencerEmail);
      driver.findElement(password).sendKeys(validPasswordCommon);
      driver.findElement(loginButton).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean SignInBtnEnabled() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
      WebElement button = driver.findElement(loginButton);
      return button.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean SignInBtnDisabled() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(loginButtonDisabled));
      WebElement button = driver.findElement(loginButtonDisabled);
      return button.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean InvalidEmailError() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement invalidEmail = driver.findElement(errorEmail);
    return invalidEmail.isDisplayed();

  }

  public boolean InvalidEmailFormatError() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement invalidEmailFormat = driver.findElement(errorEmailFormat);
    return invalidEmailFormat.isDisplayed();

  }

  public boolean InvalidPasswordError() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement invalidPassword = driver.findElement(errorPassword);
    return invalidPassword.isDisplayed();

  }

  public void clickForgotPassword() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPassword));
      WebElement password = driver.findElement(forgotPassword);
      password.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }
}