package Pages;

import Base.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class AddUserPage {

  protected WebDriver driver;

  private By fieldFullName = By.xpath("//*[@data-id='fieldFullName']");
  private By fieldEmail = By.xpath("//*[@data-id='fieldEmail']");
  private By fieldUsername = By.xpath("//*[@data-id='fieldUsername']");
  private By fieldPassword = By.xpath("//*[@data-id='fieldPassword']//input");
  private By selectorMonth = By.xpath("//*[@id='select-month']");
  private By selectorDay = By.xpath("//*[@id='select-day']");
  private By selectorYear = By.xpath("//*[@id='select-year']");
  private By selectorPermissions = By.xpath("//*[@id='select-permissions']");
  private By selectorRole = By.xpath("//*[@id='select-role']");
  private By lastMonth = By.xpath("//*[@id='menu-month']//li[position()= last()]");
  private By lastDay = By.xpath("//*[@id='menu-day']//li[position()= last()]");
  private By lastYear = By.xpath("(//*[@id='menu-year']//li)[1]");
  private By menuRoleOptions = By.xpath("//*[@id='menu-role']//li");
  private By menuPermissions = By.xpath("//*[@id='menu-permissions']");
  private By dropdownOptions = By.xpath("//li");
  private By cancel = By.xpath("//*[@data-id='cancelButton']");
  private By buttonSaveDisabled = By.xpath("//*[@data-id='changeButton'][@disabled]");
  private By buttonSaveEnabled = By.xpath("//*[@data-id='changeButton']");
  private By errorFullName = By.xpath("//*[@data-id='errorFULL NAME']");
  private By errorEmail = By.xpath("//*[@data-id='errorEMAIL']");
  private By errorUsername = By.xpath("//*[@data-id='errorUSERNAME']");
  private By errorPassword = By.xpath("//*[@data-id='errorPASSWORD']");
  private By errorBirthday = By.xpath("//p[contains(text(),'Must be 13 or older to have an account.')]");
  private By dialogAddUser = By.xpath("//*[@data-id='addUserDialog']");
  private By toastSuccess = By.xpath("//*[@class='Toastify__toast Toastify__toast--success']");


  public AddUserPage(WebDriver driver) {

    this.driver = driver;
  }

  public boolean FullNameFieldIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFullName));
      WebElement field = driver.findElement(fieldFullName);
      return field.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean EmailFieldIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldEmail));
      WebElement field = driver.findElement(fieldEmail);
      return field.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean UsernameFieldIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldUsername));
      WebElement field = driver.findElement(fieldUsername);
      return field.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean PasswordFieldIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldPassword));
      WebElement field = driver.findElement(fieldPassword);
      return field.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean MonthSelectorIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorMonth));
      WebElement selector = driver.findElement(selectorMonth);
      return selector.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean DaySelectorIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorDay));
      WebElement selector = driver.findElement(selectorDay);
      return selector.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean YearSelectorIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorYear));
      WebElement selector = driver.findElement(selectorYear);
      return selector.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean RoleSelectorIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorRole));
      WebElement selector = driver.findElement(selectorRole);
      return selector.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean PermissionsSelectorIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorPermissions));
      WebElement selector = driver.findElement(selectorPermissions);
      return selector.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean SaveButtonIsEnabled() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonSaveEnabled));
      WebElement button = driver.findElement(buttonSaveEnabled);
      return button.isEnabled();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ErrorFullNameIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(errorFullName));
      WebElement error = driver.findElement(errorFullName);
      return error.isDisplayed();
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

  public boolean ErrorUsernameIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(errorUsername));
      WebElement error = driver.findElement(errorUsername);
      return error.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ErrorPasswordIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(errorPassword));
      WebElement error = driver.findElement(errorPassword);
      return error.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ErrorBirthdayIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(errorBirthday));
      WebElement error = driver.findElement(errorBirthday);
      return error.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void clearFullNameField() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFullName));
      WebElement field = driver.findElement(fieldFullName);
      for (int i = 0; i < 50; i++) {
        field.sendKeys(Keys.BACK_SPACE);
      }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clearUsernameField() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldUsername));
      WebElement field = driver.findElement(fieldUsername);
      for (int i = 0; i < 50; i++) {
        field.sendKeys(Keys.BACK_SPACE);
      }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clearPasswordField() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldPassword));
      WebElement field = driver.findElement(fieldPassword);
      for (int i = 0; i < 50; i++) {
        field.sendKeys(Keys.BACK_SPACE);
      }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean SaveButtonIsDisabled() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonSaveDisabled));
      WebElement button = driver.findElement(buttonSaveDisabled);
      return button.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void PutInFullName(String input) {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFullName));
      WebElement field = driver.findElement(fieldFullName);
      field.sendKeys(input);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void PutInEmail(String input) {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldEmail));
      WebElement field = driver.findElement(fieldEmail);
      field.sendKeys(input);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void PutInUsername(String input) {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldUsername));
      WebElement field = driver.findElement(fieldUsername);
      field.sendKeys(input);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void PutInPassword(String input) {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldPassword));
      WebElement field = driver.findElement(fieldPassword);
      field.sendKeys(input);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  /*public void PutInRandomEmail(int length) {

    try {
      char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"
              .toCharArray();
      StringBuilder sb = new StringBuilder();
      Random random = new Random();
      for (int i = 0; i < length; i++) {
        char c = chars[random.nextInt(chars.length)];
        sb.append(c);
      }
      String randomString = sb.toString();
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldEmail));
      WebElement field = driver.findElement(fieldEmail);
      field.sendKeys(randomString + "@bkstg.com");
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }*/

  public String StringRandomizer(int length) {


    char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            .toCharArray();
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
      char c = chars[random.nextInt(chars.length)];
      sb.append(c);
    }
    String randomString = sb.toString();
    return randomString;
  }

  public void clickSaveButton() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(dialogAddUser));
      WebElement dialog = driver.findElement(dialogAddUser);
      WebElement button = driver.findElement(buttonSaveEnabled);
      Actions move = new Actions(driver);
      move.moveToElement(dialog).click().build().perform();
      Thread.sleep(1000);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickSelectorMonth() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorMonth));
      WebElement selector = driver.findElement(selectorMonth);
      selector.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickSelectorDay() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorDay));
      WebElement selector = driver.findElement(selectorDay);
      selector.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickSelectorYear() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorYear));
      WebElement selector = driver.findElement(selectorYear);
      selector.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void SelectLastMonth() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(lastMonth));
      WebElement month = driver.findElement(lastMonth);
      month.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void SelectLastDay() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(lastDay));
      WebElement day = driver.findElement(lastDay);
      day.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void SelectLastYear() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(lastYear));
      WebElement year = driver.findElement(lastYear);
      year.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void SelectOptionFromDropdown(String value) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dropdownOptions));
      List<WebElement> options = driver.findElements(dropdownOptions);
      for (WebElement i : options)
        if (i.getText().contains(value)) {
          i.click();
        } else {
        }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickRoleSelector() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorRole));
      WebElement selector = driver.findElement(selectorRole);
      selector.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickPermissionsSelector() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorPermissions));
      WebElement selector = driver.findElement(selectorPermissions);
      selector.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean SelectorPermissionsIsEnabled() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorPermissions));
      WebElement state = driver.findElement(selectorPermissions);
      return state.isEnabled();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean MenuPermissionsIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 3);
      wait.until(ExpectedConditions.visibilityOfElementLocated(menuPermissions));
      WebElement menu = driver.findElement(menuPermissions);
      return menu.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ToastSuccessIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 7);
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
