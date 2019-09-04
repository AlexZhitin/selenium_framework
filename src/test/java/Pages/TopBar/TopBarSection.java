package Pages.TopBar;

import Base.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TopBarSection {

  protected WebDriver driver;

  /*Create elements with locators*/

  private By logo = By.xpath("//*[@data-id='logo']");
  private By topBar = By.xpath("//*[@data-id='topBar']");
  private By profileIcon = By.xpath("//*[@data-id='profileIcon']");
  private By profileDropdown = By.xpath("//*[@data-id='optionsPopUp']");
  private By profileOption = By.xpath("//*[@data-id='menuItemProfile']");
  private By usersOption = By.xpath("//*[@data-id='menuItemUsers']");
  private By notifyOption = By.xpath("//*[@data-id='menuItemNotifyCUSP']");
  private By logoutOption = By.xpath("//*[@data-id='menuItemLogOut']");
  private By userFullName = By.xpath("(//*[@data-id='userName'])[1]");
  private By leagueSectionName = By.xpath("(//*[@data-id='leaguesSection']//h6)[1]");

  public TopBarSection(WebDriver driver) {
    this.driver = driver;
  }

  public boolean LogoIsDisplayed() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement logoElement = driver.findElement(logo);
    return logoElement.isDisplayed();
  }

  public void clickLogo() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
      WebElement logoElement = driver.findElement(logo);
      logoElement.click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(leagueSectionName));
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean TopBarDisplayed() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement topBarElement = driver.findElement(topBar);
    return topBarElement.isDisplayed();
  }

  public boolean ProfileIconDisplayed() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement profileIconElement = driver.findElement(profileIcon);
    return profileIconElement.isDisplayed();

  }

  public void clickMenuIcon() {

    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(profileIcon));
    driver.findElement(profileIcon).click();
  }

  public void clickLogOutOption() {

    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(logoutOption));
    driver.findElement(logoutOption).click();
  }

  public boolean ProfileDropdownDisplayed() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement profileDropdownElement = driver.findElement(profileDropdown);
    return profileDropdownElement.isDisplayed();
  }

  public boolean ProfileOptionDisplayed() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement profileOptionElement = driver.findElement(profileOption);
    return profileOptionElement.isDisplayed();

  }

  public void clickProfileOption() {
    try {
      Thread.sleep(500);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(profileOption));
      WebElement profile = driver.findElement(profileOption);
      profile.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean UsersOptionDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(usersOption));
      WebElement usersOptionElement = driver.findElement(usersOption);
      return usersOptionElement.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void clickUsersOption() {
    try {
      Thread.sleep(500);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(usersOption));
      WebElement users = driver.findElement(usersOption);
      users.click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(userFullName));
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean LogoutOptionDisplayed() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement logoutOptionElement = driver.findElement(logoutOption);
    return logoutOptionElement.isDisplayed();
  }

  public void clickNotifyOption() {
    try {
      Thread.sleep(500);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(notifyOption));
      WebElement option = driver.findElement(notifyOption);
      option.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }
}

