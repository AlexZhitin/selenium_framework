package Pages.Profile.Own;

import Base.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


// // Edit own profile

public class EditProfileOwnPage {

  protected WebDriver driver;

  private By avatar = By.xpath("//*[@data-id='avatar']/img");
  private By fieldFirstName = By.xpath("//*[@data-id='fieldFirstName']");
  private By fieldLastName = By.xpath("//*[@data-id='fieldLastName']");
  private By fieldEmail = By.xpath("//*[@data-id='email']");
  private By labelBirthday = By.xpath("//*[@data-id='birthdaySectionTitle']");
  private By selectorMonth = By.xpath("//*[@id='select-month']");
  private By selectorDay = By.xpath("//*[@id='select-day']");
  private By selectorYear = By.xpath("//*[@id='select-year']");
  private By buttonSave = By.xpath("//*[@data-id='saveProfile']");
  private By buttonSaveDisabled = By.xpath("//*[@data-id='saveProfile'][@disabled]");
  private By menuMonth = By.xpath("//*[@id='menu-month']");
  private By months = By.xpath("//*[@id='menu-month']//li");
  private By menuDay = By.xpath("//*[@id='menu-day']");
  private By days = By.xpath("//*[@id='menu-day']//li");
  private By menuYear = By.xpath("//*[@id='menu-year']");
  private By years = By.xpath("//*[@id='menu-year']//li");
  private By toastSuccess = By.xpath("//*[@class='Toastify__toast Toastify__toast--success']");
  private By toastFail = By.xpath("//*[@class='Toastify__toast Toastify__toast--error']");
  private By toastClose = By.xpath("//*[@aria-label='close']");
  private By cropperUpload = By.xpath("//*[@data-id='cropperUpload']");

  private By errorFirstName = By.xpath("//*[@data-id='errorFIRST NAME']");
  private By errorLastName = By.xpath("//*[@data-id='errorLAST NAME']");
  private By errorEmail = By.xpath("//*[@data-id='errorEMAIL']");
  private By errorBirthday = By.xpath("//*[@data-id='errorBirthday']");


  public EditProfileOwnPage(WebDriver driver) {
    this.driver = driver;
  }

  public boolean SaveButtonIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonSave));
      WebElement save = driver.findElement(buttonSave);
      return save.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ErrorFirstNameIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(errorFirstName));
      WebElement error = driver.findElement(errorFirstName);
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

  public boolean ErrorLastNameIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(errorLastName));
      WebElement error = driver.findElement(errorLastName);
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

  public boolean FirstNameFieldIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFirstName));
      WebElement field = driver.findElement(fieldFirstName);
      return field.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean LastNameFieldIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldLastName));
      WebElement field = driver.findElement(fieldLastName);
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

  public boolean BirthdayLabelIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(labelBirthday));
      WebElement label = driver.findElement(labelBirthday);
      return label.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean DayMonthYearTabsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorMonth));
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorDay));
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorYear));

      WebElement month = driver.findElement(selectorMonth);
      WebElement day = driver.findElement(selectorDay);
      WebElement year = driver.findElement(selectorYear);


      return month.isDisplayed() && day.isDisplayed() && year.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean MonthMenuListIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(menuMonth));
      WebElement menu = driver.findElement(menuMonth);
      return menu.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean DayMenuListIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(menuDay));
      WebElement menu = driver.findElement(menuDay);
      return menu.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean YearMenuListIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(menuYear));
      WebElement menu = driver.findElement(menuYear);
      return menu.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
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

  public boolean SaveButtonIsEnabled() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonSave));
      WebElement button = driver.findElement(buttonSave);
      return button.isEnabled();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void clearFirstNameField() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFirstName));
      WebElement field = driver.findElement(fieldFirstName);
      for (int i = 0; i < 150; i++) {
        field.sendKeys(Keys.BACK_SPACE);
      }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clearEmailField() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldEmail));
      WebElement field = driver.findElement(fieldEmail);
      for (int i = 0; i < 32; i++) {
        field.sendKeys(Keys.BACK_SPACE);
      }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickSaveButton() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonSave));
      WebElement button = driver.findElement(buttonSave);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void SelectRandomMonth() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(months));
      List<WebElement> list = driver.findElements(months);
      int size = list.size();
      int randomNumber = ThreadLocalRandom.current().nextInt(0, size);
      list.get(randomNumber).click();

    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void SelectRandomDay() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(days));
      List<WebElement> list = driver.findElements(days);
      int size = list.size();
      int randomNumber = ThreadLocalRandom.current().nextInt(0, size);
      list.get(randomNumber).click();

    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void SelectRandomYear() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(years));
      List<WebElement> list = driver.findElements(years);
      int size = list.size();
      int randomNumber = ThreadLocalRandom.current().nextInt(0, size);
      list.get(randomNumber).click();

    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public String GetBirthdayValue() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 15);
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorMonth));
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorDay));
      wait.until(ExpectedConditions.visibilityOfElementLocated(selectorYear));

      WebElement month = driver.findElement(selectorMonth);
      WebElement day = driver.findElement(selectorDay);
      WebElement year = driver.findElement(selectorYear);

      String birthday = month.getText() + day.getText() + year.getText();
      System.out.println(birthday);

      return birthday;
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
    return null;
  }

  public void clickAvatar() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(avatar));
      WebElement ava = driver.findElement(avatar);
      ava.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public String GetAvatarImageUrl() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 15);
      wait.until(ExpectedConditions.visibilityOfElementLocated(avatar));
      WebElement ava = driver.findElement(avatar);

      String src = ava.getAttribute("src");
      System.out.println(src);
      return src;
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
    return null;
  }


  public void clickCropperUpload() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 15);
      wait.until(ExpectedConditions.visibilityOfElementLocated(cropperUpload));
      WebElement upload = driver.findElement(cropperUpload);
      upload.click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(toastSuccess));
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void generateRandomFirstName(int length) throws InterruptedException {
    char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            .toCharArray();
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
      char c = chars[random.nextInt(chars.length)];
      sb.append(c);
    }
    String randomString = sb.toString();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFirstName));
    WebElement firstName = driver.findElement(fieldFirstName);

    for (int i = 0; i < 150; i++) {
      firstName.sendKeys(Keys.BACK_SPACE);
    }
    firstName.sendKeys(randomString);
  }

  public void PutInFirstName(String name) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFirstName));
      WebElement firstName = driver.findElement(fieldFirstName);

      for (int i = 0; i < 150; i++) {
        firstName.sendKeys(Keys.BACK_SPACE);
      }

      firstName.sendKeys(name);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void PutInLastName(String name) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldLastName));
      WebElement lastName = driver.findElement(fieldLastName);

      for (int i = 0; i < 150; i++) {
        lastName.sendKeys(Keys.BACK_SPACE);
      }

      lastName.sendKeys(name);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void PutInEmail(String email) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldEmail));
      WebElement userEmail = driver.findElement(fieldEmail);

      for (int i = 0; i < 40; i++) {
        userEmail.sendKeys(Keys.BACK_SPACE);
      }

      userEmail.sendKeys(email);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void generateRandomLastName(int length) {
    char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            .toCharArray();
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
      char c = chars[random.nextInt(chars.length)];
      sb.append(c);
    }
    String randomString = sb.toString();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(fieldLastName));
    WebElement lastName = driver.findElement(fieldLastName);

    for (int i = 0; i < 150; i++) {
      lastName.sendKeys(Keys.BACK_SPACE);
    }
    lastName.sendKeys(randomString);
  }

  public void generateRandomEmail(int length) {
    char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            .toCharArray();
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
      char c = chars[random.nextInt(chars.length)];
      sb.append(c);
    }
    String randomString = sb.toString();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(fieldEmail));
    WebElement email = driver.findElement(fieldEmail);

    for (int i = 0; i < 40; i++) {
      email.sendKeys(Keys.BACK_SPACE);
    }
    email.sendKeys(randomString + "@bkstg.com");
  }

  public String GetFirstNameValue() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 15);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFirstName));

      WebElement name = driver.findElement(fieldFirstName);
      String firstName = name.getAttribute("value");
      System.out.println(firstName);
      return firstName;
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
    return null;
  }


  public void retrieveFirstName(String initialFirstName) {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFirstName));
    WebElement name = driver.findElement(fieldFirstName);
    for (int i = 0; i < 150; i++) {
      name.sendKeys(Keys.BACK_SPACE);
    }
    name.sendKeys(initialFirstName);

    WebElement save = driver.findElement(buttonSave);
    save.click();

    wait.until(ExpectedConditions.visibilityOfElementLocated(toastClose));
  }

  public String GetLastNameValue() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 15);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldLastName));

      WebElement name = driver.findElement(fieldLastName);
      String lastName = name.getAttribute("value");

      return lastName;
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
    return null;
  }

  public void retrieveLastName(String initialLastName) {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(fieldLastName));
    WebElement name = driver.findElement(fieldLastName);
    for (int i = 0; i < 150; i++) {
      name.sendKeys(Keys.BACK_SPACE);
    }
    name.sendKeys(initialLastName);

    WebElement save = driver.findElement(buttonSave);
    save.click();

    wait.until(ExpectedConditions.visibilityOfElementLocated(toastClose));

  }

  public String GetEmailValue() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 15);
      wait.until(ExpectedConditions.visibilityOfElementLocated(fieldEmail));

      WebElement name = driver.findElement(fieldEmail);
      String email = name.getAttribute("value");

      return email;
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
    return null;
  }

  public void retrieveEmail(String initialEmail) {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(fieldEmail));
    WebElement name = driver.findElement(fieldEmail);
    for (int i = 0; i < 40; i++) {
      name.sendKeys(Keys.BACK_SPACE);
    }
    name.sendKeys(initialEmail);

    WebElement save = driver.findElement(buttonSave);
    save.click();

    wait.until(ExpectedConditions.visibilityOfElementLocated(toastClose));

  }

  public boolean ErrorToastIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfElementLocated(toastFail));
      WebElement error = driver.findElement(toastFail);
      return error.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void clickToastClose() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(toastClose));
      WebElement close = driver.findElement(toastClose);
      close.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void SelectLastMonth() {
    try {
      Thread.sleep(500);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(months));
      List<WebElement> list = driver.findElements(months);
      list.get(list.size() - 1).click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void SelectLastDay() {
    try {
      Thread.sleep(500);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(days));
      List<WebElement> list = driver.findElements(days);
      list.get(list.size() - 1).click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void SelectClosestYear() {
    try {
      Thread.sleep(500);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(years));
      List<WebElement> list = driver.findElements(years);
      list.get(1).sendKeys(Keys.ARROW_UP, Keys.RETURN);//such an approach was used cause option[0] can't be clicked as it goes under the top bar when running the automation test
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }
}


