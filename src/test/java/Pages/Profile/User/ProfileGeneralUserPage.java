package Pages.Profile.User;

import Base.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProfileGeneralUserPage {

  protected WebDriver driver;

  private By profileAvatar = By.xpath("//*[@data-id='avatar']");
  private By profileFullName = By.xpath("//*[@data-id='profileFullName']");
  private By profileUsername = By.xpath("//*[@data-id='profileUsername']");
  private By profileBirthdate = By.xpath("//*[@data-id='profileBirthdate']");
  private By profileEmail = By.xpath("//*[@data-id='profileEmail']");
  private By profileLocation = By.xpath("//*[@data-id='profileLocation']");
  private By profileRole = By.xpath("//*[@data-id='profileRole']");
  private By editButton = By.xpath("//*[@data-id='editButton']");
  private By buttonResetPassword = By.xpath("//*[@data-id='forgotPasswordButton']");
  private By buttonDisable = By.xpath("//*[@data-id='disableButton']/span[contains(text(),'Disable')]");
  private By buttonEnable = By.xpath("//*[@data-id='disableButton']/span[contains(text(),'Enable')]");


 /* private By myVideosTab = By.xpath("//*[@data-id='myVideosTab']");
  private By clipsTab = By.xpath("//*[@data-id='clipsTab']");
  private By searchesTab = By.xpath("//*[@data-id='searchesTab']");*/


  public ProfileGeneralUserPage(WebDriver driver) {
    this.driver = driver;
  }

  public boolean UserAvatarIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(profileAvatar));
      WebElement avatar = driver.findElement(profileAvatar);
      return avatar.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean UsernameIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(profileUsername));
      WebElement username = driver.findElement(profileUsername);
      return username.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean FullNameIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(profileFullName));
      WebElement fullName = driver.findElement(profileFullName);
      return fullName.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean EmailIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(profileEmail));
      WebElement email = driver.findElement(profileEmail);
      return email.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean LocationIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(profileLocation));
      WebElement location = driver.findElement(profileLocation);
      return location.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean RoleIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(profileRole));
      WebElement role = driver.findElement(profileRole);
      return role.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean BirthdateIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(profileBirthdate));
      WebElement birthdate = driver.findElement(profileBirthdate);
      return birthdate.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean EditButtonIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(editButton));
      WebElement edit = driver.findElement(editButton);
      return edit.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void clickEditButton() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(editButton));
      WebElement edit = driver.findElement(editButton);
      edit.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickResetPassButton() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonResetPassword));
      WebElement button = driver.findElement(buttonResetPassword);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean ButtonResetPassIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonResetPassword));
      WebElement reset = driver.findElement(buttonResetPassword);
      return reset.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }


  /*public boolean MyVideosTabIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(myVideosTab));
      WebElement myVideos = driver.findElement(myVideosTab);
      return myVideos.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ClipsTabIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(clipsTab));
      WebElement clips = driver.findElement(clipsTab);
      return clips.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean SearchesTabIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(searchesTab));
      WebElement searches = driver.findElement(searchesTab);
      return searches.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }*/


  public void clickDisableButton() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonDisable));
      WebElement button = driver.findElement(buttonDisable);
      button.click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonEnable));
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickEnableButton() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonEnable));
      WebElement button = driver.findElement(buttonEnable);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }
    public String getUserEmail() {

      try {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(profileEmail));
        WebElement field = driver.findElement(profileEmail);
        return field.getText();
      } catch (Throwable e) {
        ExtentTestManager.getTest().log(Status.INFO, e);
        System.out.println(e);
        return null;
      }
  }
}