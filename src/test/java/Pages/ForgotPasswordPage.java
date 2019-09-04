package Pages;

import Base.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPasswordPage {

  protected WebDriver driver;

  private By titleForgotPassword = By.xpath("//*[@data-id='forgotTitle']");
  private By buttonSubmitDisabled = By.xpath("//*[@data-id='submitButton'][@disabled]");
  private By buttonSubmitEnabled = By.xpath("//*[@data-id='submitButton'][not(@disabled)]");
  private By inputEmail = By.xpath("//*[@data-id='forgotTitle']//following::*[@id='email']");
  private By errorEmail = By.xpath("//*[@data-id='forgotTitle']//following::*[@data-id='errorEmail']");
  private By linkGoBack = By.xpath("//*[@data-id='goBackLink']");


  public ForgotPasswordPage(WebDriver driver) {

    this.driver = driver;
  }

  public boolean TitleForgotPassIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(titleForgotPassword));
      WebElement title = driver.findElement(titleForgotPassword);
      return title.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void EmailInput(String email) {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmail));
      WebElement input = driver.findElement(inputEmail);
      input.sendKeys(email);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickGoBack() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(linkGoBack));
      WebElement link = driver.findElement(linkGoBack);
      link.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean SubmitButtonIsDisabled() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonSubmitDisabled));
      WebElement button = driver.findElement(buttonSubmitDisabled);
      return button.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean EmailInputIsDisaplyed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmail));
      WebElement field = driver.findElement(inputEmail);
      return field.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ErrorEmailIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(errorEmail));
      WebElement error = driver.findElement(errorEmail);
      return error.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean LinkGoBackIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(linkGoBack));
      WebElement link = driver.findElement(linkGoBack);
      return link.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void clickButtonSubmit() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonSubmitEnabled));
      WebElement button = driver.findElement(buttonSubmitEnabled);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public String getUserEmail() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmail));
      WebElement field = driver.findElement(inputEmail);
      return field.getAttribute("value");
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return null;
    }
  }
}
