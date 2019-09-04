package Pages.Profile.Own;

import Base.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProfileGeneralPageOwn {

  protected WebDriver driver;

  private By profileAvatar = By.xpath("//*[@data-id='avatar']");
  private By profileFullName = By.xpath("//*[@data-id='profileFullName']");
  private By profileUsername = By.xpath("//*[@data-id='profileUsername']");
  private By profileBirthdate = By.xpath("//*[@data-id='profileBirthdate']");
  private By profileEmail = By.xpath("//*[@data-id='profileEmail']");
  private By profileLocation = By.xpath("//*[@data-id='profileLocation']");
  private By profileRole = By.xpath("//*[@data-id='profileRole']");
  private By editButton = By.xpath("//*[@data-id='editButton']");
  private By changePassword = By.xpath("//*[@data-id='changePasswordButton']");
  private By myVideosTab = By.xpath("//*[@data-id='myVideosTab']");
  private By clipsTab = By.xpath("//*[@data-id='clipsTab']");
  private By searchesTab = By.xpath("//*[@data-id='searchesTab']");

  private By dialogChangePassword = By.xpath("//*[@data-id='changePasswordDialog']");
  private By inputOldPassword = By.xpath("//*[@id='old-password']");
  private By inputNewPassword = By.xpath("//*[@id='new-password']");
  private By inputNewPasswordRepeat = By.xpath("//*[@id='new-password-repeat']");
  private By buttonChangeDisabled = By.xpath("//*[@data-id='changeButton'][@disabled]");
  private By buttonChangeEnabled = By.xpath("//*[@data-id='changeButton'][not(@disabled)]");
  private By errorOldPassword = By.xpath("//*[@data-id='errorOld Password']");
  private By errorNewPassword = By.xpath("//*[@data-id='errorNew Password']");
  private By toastSuccess = By.xpath("//*[@class='Toastify__toast Toastify__toast--success']");
  private By buttonChangePass = By.xpath("//*[@data-id='changePasswordButton']");
  private By buttonResetPass = By.xpath("//*[@data-id='forgotPasswordButton']");
  private By linkForgotPass = By.xpath("//*[@data-id='forgotPasswordLink']");


  public ProfileGeneralPageOwn(WebDriver driver) {
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

  public void clickChangePassButton() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonChangePass));
      WebElement button = driver.findElement(buttonChangePass);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickResetPassButton() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonResetPass));
      WebElement button = driver.findElement(buttonResetPass);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickChangeButton() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonChangeEnabled));
      WebElement button = driver.findElement(buttonChangeEnabled);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickLinkForgotPass() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(linkForgotPass));
      WebElement link = driver.findElement(linkForgotPass);
      link.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }


  public void OldPasswordInput(String input) {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(inputOldPassword));
      WebElement field = driver.findElement(inputOldPassword);
      field.sendKeys(input);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }


  public void NewPasswordInput(String input) {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(inputNewPassword));
      WebElement field = driver.findElement(inputNewPassword);
      field.sendKeys(input);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void NewPasswordRepeatInput(String input) {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(inputNewPasswordRepeat));
      WebElement field = driver.findElement(inputNewPasswordRepeat);
      field.sendKeys(input);

    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clearOldPassField() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(inputOldPassword));
      WebElement field = driver.findElement(inputOldPassword);
      for (int i = 0; i < 50; i++) {
        field.sendKeys(Keys.BACK_SPACE);
      }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clearNewPassField() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(inputNewPassword));
      WebElement field = driver.findElement(inputNewPassword);
      for (int i = 0; i < 50; i++) {
        field.sendKeys(Keys.BACK_SPACE);
      }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clearNewPassRepeatField() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(inputNewPasswordRepeat));
      WebElement field = driver.findElement(inputNewPasswordRepeat);
      for (int i = 0; i < 50; i++) {
        field.sendKeys(Keys.BACK_SPACE);
      }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }


  public boolean ResetPasswordIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(changePassword));
      WebElement reset = driver.findElement(changePassword);
      return reset.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

 /* public boolean DisableButtonIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(disableButton));
      WebElement disable = driver.findElement(disableButton);
      return disable.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }*/

  public boolean MyVideosTabIsDisplayed() {

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
  }

  public boolean ChangePassDialogIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(dialogChangePassword));
      WebElement dialog = driver.findElement(dialogChangePassword);
      return dialog.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ChangeButtonIsDisabled() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonChangeDisabled));
      WebElement button = driver.findElement(buttonChangeDisabled);
      return button.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean OldPassErrorIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(errorOldPassword));
      WebElement error = driver.findElement(errorOldPassword);
      return error.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean NewPassErrorIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(errorNewPassword));
      WebElement error = driver.findElement(errorNewPassword);
      return error.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ToastSuccessIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(toastSuccess));
      WebElement toast = driver.findElement(toastSuccess);
      return toast.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }
}