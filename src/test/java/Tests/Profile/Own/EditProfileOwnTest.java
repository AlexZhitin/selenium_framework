package Tests.Profile.Own;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.Profile.Own.EditProfileOwnPage;
import Pages.Profile.Own.ProfileGeneralPageOwn;
import Pages.SignInPage;
import Pages.TopBar.TopBarSection;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class EditProfileOwnTest extends TestBase {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C39079*/

  public void SetUpBirthdate() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage month = new EditProfileOwnPage(driver);
    EditProfileOwnPage day = new EditProfileOwnPage(driver);
    EditProfileOwnPage year = new EditProfileOwnPage(driver);
    EditProfileOwnPage save = new EditProfileOwnPage(driver);
    EditProfileOwnPage valueBirthday = new EditProfileOwnPage(driver);

    String error = "Birthdate has not been set up";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String before = valueBirthday.GetBirthdayValue();

    month.clickSelectorMonth();
    month.SelectRandomMonth();
    Thread.sleep(2000);

    day.clickSelectorDay();
    day.SelectRandomDay();
    Thread.sleep(2000);

    year.clickSelectorYear();
    year.SelectRandomYear();
    Thread.sleep(2000);

    save.clickSaveButton();
    driver.navigate().refresh();

    String after = valueBirthday.GetBirthdayValue();

    if (before.equals(after)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C39079 completed");
  }

  @Test /*C39557*/

  public void AgeIsLessThan13() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);
    EditProfileOwnPage month = new EditProfileOwnPage(driver);
    EditProfileOwnPage day = new EditProfileOwnPage(driver);
    EditProfileOwnPage year = new EditProfileOwnPage(driver);
    EditProfileOwnPage save = new EditProfileOwnPage(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage valueBirthday = new EditProfileOwnPage(driver);

    String error = "No error is shown if age <13 y.o.";
    String test = "Testcase C39557";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();

    month.clickSelectorMonth();
    month.SelectLastMonth();
    Thread.sleep(2000);

    day.clickSelectorDay();
    day.SelectLastDay();
    Thread.sleep(2000);

    year.clickSelectorYear();
    year.SelectClosestYear();
    Thread.sleep(2000);

    save.clickSaveButton();

    if (errorPopUp.ErrorBirthdayIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Parameters({"browserType"})
  @Test /*C39092*/

  public void SetUpAvatar(String browserType) throws InterruptedException, IOException {

    String skip = "Test is skipped as it can't be performed on Safari";

    if (browserType.equals("safari")){
      ExtentTestManager.getTest().log(Status.INFO, skip);
      System.out.println(skip);
      throw new SkipException("Skipped");
    }

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage avatar = new EditProfileOwnPage(driver);
    EditProfileOwnPage cropper = new EditProfileOwnPage(driver);


    String error = "Avatar has not been updated";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String avatarBefore = avatar.GetAvatarImageUrl();
    avatar.clickAvatar();
    String command = "osascript " + System.getProperty("user.dir") + "/src/main/resources/avatar.scpt";
    Runtime.getRuntime().exec(command);
    cropper.clickCropperUpload();
    driver.navigate().refresh();
    String avatarAfter = avatar.GetAvatarImageUrl();

    if (avatarBefore.equals(avatarAfter)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C39092 completed");
  }

  @Test /*C39091*/

  public void UpdateFirstName() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);

    String error = "First name has not been updated";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialFirstName = firstName.GetFirstNameValue();
    firstName.generateRandomFirstName(5);//argument is the length of first name
    saveButton.clickSaveButton();
    toastClose.clickToastClose();
    String updatedFirstName = firstName.GetFirstNameValue();
    firstName.retrieveFirstName(initialFirstName);

    if (initialFirstName.equals(updatedFirstName)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C39091 completed");
  }

  @Test /*C39538*/

  public void FirstNameCanContainMultipleWords() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);

    String name = "First Name";
    String error = "Multiple words are not accepted in the first name field";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialFirstName = firstName.GetFirstNameValue();
    firstName.PutInFirstName(name);
    saveButton.clickSaveButton();
    toastClose.clickToastClose();
    driver.navigate().refresh();
    Thread.sleep(2000);

    String updatedFirstName = firstName.GetFirstNameValue();
    firstName.retrieveFirstName(initialFirstName);

    if (initialFirstName.equals(updatedFirstName)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C39538 completed");
  }

  @Test /*C39539*/

  public void FirstNameCanContainApostrophe() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);

    String name = "Fir'st";
    String error = "Apostrophe is not accepted when it should be";
    String test = "Testcase C39539";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialFirstName = firstName.GetFirstNameValue();
    firstName.PutInFirstName(name);
    saveButton.clickSaveButton();
    toastClose.clickToastClose();
    driver.navigate().refresh();
    Thread.sleep(2000);

    String updatedFirstName = firstName.GetFirstNameValue();
    firstName.retrieveFirstName(initialFirstName);

    if (initialFirstName.equals(updatedFirstName)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39539*/

  public void FirstNameCanContainHyphen() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);

    String name = "Fir-st";
    String error = "Hyphen is not accepted when it should be";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialFirstName = firstName.GetFirstNameValue();
    firstName.PutInFirstName(name);
    saveButton.clickSaveButton();
    toastClose.clickToastClose();
    driver.navigate().refresh();
    Thread.sleep(2000);

    String updatedFirstName = firstName.GetFirstNameValue();
    firstName.retrieveFirstName(initialFirstName);

    if (initialFirstName.equals(updatedFirstName)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C39539 completed");
  }

  @Test /*C39540*/

  public void FirstNameBeginsWithApostrophe() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "'First";
    String error = "Apostrophe is accepted in the beginning when it shouldn't. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    firstName.PutInFirstName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorFirstNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39540 completed");
  }

  @Test /*C39540*/

  public void FirstNameBeginsWithHyphen() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "-First";
    String error = "Hyphen is accepted in the beginning when it shouldn't. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    firstName.PutInFirstName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorFirstNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39540 completed");
  }

  @Test /*C39540*/

  public void FirstNameEndsWithHyphen() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "First-";
    String error = "Hyphen is accepted in the end when it shouldn't. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    firstName.PutInFirstName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorFirstNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39540 completed");
  }

  @Test /*C39540*/

  public void FirstNameEndsWithApostrophe() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "First'";
    String error = "Apostrophe is accepted in the end when it shouldn't. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    firstName.PutInFirstName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorFirstNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39540 completed");
  }

  @Test /*C39541*/

  public void FirstNameCanContainASCII() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);

    String name = "Firsêt NameÐð";
    String error = "Extended ASCII characters (\\x{00C0}-\\x{00FF}) are not accepted when it should be";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialFirstName = firstName.GetFirstNameValue();
    firstName.PutInFirstName(name);
    saveButton.clickSaveButton();
    toastClose.clickToastClose();
    driver.navigate().refresh();
    Thread.sleep(2000);

    String updatedFirstName = firstName.GetFirstNameValue();
    firstName.retrieveFirstName(initialFirstName);

    if (initialFirstName.equals(updatedFirstName)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C39541 completed");
  }

  @Test /*C39542*/

  public void FirstNameEndsWithSpace() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "First ";
    String error = "Space is accepted in the end when it shouldn't. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    firstName.PutInFirstName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorFirstNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39542 completed");
  }

  @Test /*C39542*/

  public void FirstNameBeginsWithSpace() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = " First";
    String error = "Space is accepted in the beginning when it shouldn't. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    firstName.PutInFirstName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorFirstNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39542 completed");
  }

  @Test /*C39543*/

  public void FirstNameContainsEmoji() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "Fir☑️st";
    String error = "Emoji is accepted within a word. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    firstName.PutInFirstName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorFirstNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39543 completed");
  }

  @Test /*C39544*/

  public void FirstNameContainsSpecialSymbols() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "Fir@#$%st";
    String error = "Special symbols are accepted within a word. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    firstName.PutInFirstName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorFirstNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39544 completed");
  }

  @Test /*C39096*/

  public void UpdateLastName() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);

    String error = "Last name has not been updated";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialLastName = lastName.GetLastNameValue();
    lastName.generateRandomLastName(5); //argument is the length of name
    saveButton.clickSaveButton();
    toastClose.clickToastClose();
    String updatedLastName = lastName.GetLastNameValue();
    lastName.retrieveLastName(initialLastName);

    if (initialLastName.equals(updatedLastName)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C39096 completed");
  }

  @Test /*C39546*/

  public void LastNameCanContainMultipleWords() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);

    String name = "Last Name";
    String error = "Multiple words are not accepted in the last name field";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialLastName = lastName.GetLastNameValue();
    lastName.PutInLastName(name);
    saveButton.clickSaveButton();
    toastClose.clickToastClose();
    driver.navigate().refresh();
    Thread.sleep(2000);

    String updatedLastName = lastName.GetLastNameValue();
    lastName.retrieveLastName(initialLastName);

    if (initialLastName.equals(updatedLastName)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C39546 completed");
  }

  @Test /*C39547*/

  public void LastNameCanContainApostrophe() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);

    String name = "L'ast";
    String error = "Apostrophe is not accepted when it should be";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialLastName = lastName.GetLastNameValue();
    lastName.PutInLastName(name);
    saveButton.clickSaveButton();
    toastClose.clickToastClose();
    driver.navigate().refresh();
    Thread.sleep(2000);

    String updatedLastName = lastName.GetFirstNameValue();
    lastName.retrieveLastName(initialLastName);

    if (initialLastName.equals(updatedLastName)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C39547 completed");
  }

  @Test /*C39548*/

  public void LastNameCanContainHyphen() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);

    String name = "La-st";
    String error = "Hyphen is not accepted when it should be";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialLastName = lastName.GetLastNameValue();
    lastName.PutInLastName(name);
    saveButton.clickSaveButton();
    toastClose.clickToastClose();
    driver.navigate().refresh();
    Thread.sleep(2000);

    String updatedLastName = lastName.GetLastNameValue();
    lastName.retrieveLastName(initialLastName);

    if (initialLastName.equals(updatedLastName)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C39548 completed");
  }

  @Test /*C39548*/

  public void LastNameBeginsWithApostrophe() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "'Last";
    String error = "Apostrophe is accepted in the beginning when it shouldn't. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    lastName.PutInLastName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorLastNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39548 completed");
  }

  @Test /*C39548*/

  public void LastNameBeginsWithHyphen() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "-Last";
    String error = "Hyphen is accepted in the beginning when it shouldn't. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    lastName.PutInLastName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorLastNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39548 completed");
  }

  @Test /*C39548*/

  public void LastNameEndsWithHyphen() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "Last-";
    String error = "Hyphen is accepted in the end when it shouldn't. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    lastName.PutInLastName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorLastNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39548 completed");
  }

  @Test /*C39548*/

  public void LastNameEndsWithApostrophe() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "Last'";
    String error = "Apostrophe is accepted in the end when it shouldn't. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    lastName.PutInLastName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorLastNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39548 completed");
  }

  @Test /*C39549*/

  public void LastNameCanContainASCII() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);

    String name = "Lasêt NameÐð";
    String error = "Extended ASCII characters (\\x{00C0}-\\x{00FF}) are not accepted when it should be";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialLastName = lastName.GetLastNameValue();
    lastName.PutInLastName(name);
    saveButton.clickSaveButton();
    toastClose.clickToastClose();
    driver.navigate().refresh();
    Thread.sleep(2000);

    String updatedLastName = lastName.GetLastNameValue();
    lastName.retrieveLastName(initialLastName);

    if (initialLastName.equals(updatedLastName)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C39549 completed");
  }

  @Test /*C39550*/

  public void LastNameEndsWithSpace() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "Last ";
    String error = "Space is accepted in the end when it shouldn't. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    lastName.PutInLastName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorLastNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39550 completed");
  }

  @Test /*C39550*/

  public void LastNameBeginsWithSpace() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = " Last";
    String error = "Space is accepted in the beginning when it shouldn't. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    lastName.PutInLastName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorLastNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39550 completed");
  }

  @Test /*C39551*/

  public void LastNameContainsEmoji() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "La☑️st";
    String error = "Emoji is accepted within a word. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    lastName.PutInLastName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorLastNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39551 completed");
  }

  @Test /*C39552*/

  public void LastNameContainsSpecialSymbols() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String name = "La@#$%st";
    String error = "Special symbols are accepted within a word. No error message was shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    lastName.PutInLastName(name);
    saveButton.clickSaveButton();

    if (errorPopUp.ErrorLastNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39552 completed");
  }


  @Test /*C39097*/

  public void UpdateEmail() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage email = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage toastClose = new EditProfileOwnPage(driver);

    String error = "Email has not been updated";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialEmail = email.GetEmailValue();
    email.generateRandomEmail(5); //argument is the length of email
    saveButton.clickSaveButton();
    toastClose.clickToastClose();
    String updatedEmail = email.GetEmailValue();
    email.retrieveEmail(initialEmail);

    if (initialEmail.equals(updatedEmail)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C39097 completed");
  }

  @Test /*C39553*/

  public void EmailWithoutDomain() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage userEmail = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);


    String error = "Email without domain is accepted";
    String email = "cusptestadmin@";
    String test = "Testcase C39553";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialEmail = userEmail.GetEmailValue();

    userEmail.PutInEmail(email);
    saveButton.clickSaveButton();
    String updatedEmail = userEmail.GetEmailValue();
    System.out.println(updatedEmail);

    if (errorPopUp.ErrorEmailIsDisplayed() && !updatedEmail.equals(initialEmail)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39554*/

  public void EmailWithSpace() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage userEmail = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);


    String error = "Email with a space is accepted";
    String email = "cusptest admin@bkstg.com";
    String test = "Testcase C39554";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialEmail = userEmail.GetEmailValue();

    userEmail.PutInEmail(email);
    saveButton.clickSaveButton();
    String updatedEmail = userEmail.GetEmailValue();


    if (errorPopUp.ErrorEmailIsDisplayed() && !updatedEmail.equals(initialEmail)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39555*/

  public void EmailWithEmoji() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage userEmail = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String error = "Email with emoji is accepted";
    String email = "cusptest☑admin@bkstg.com";
    String test = "Testcase C39555";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialEmail = userEmail.GetEmailValue();

    userEmail.PutInEmail(email);
    saveButton.clickSaveButton();
    String updatedEmail = userEmail.GetEmailValue();


    if (errorPopUp.ErrorEmailIsDisplayed() && !updatedEmail.equals(initialEmail)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39556*/

  public void EmailWithoutLocalPart() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage userEmail = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String error = "Email without local part (just domain) is accepted.";
    String email = "@bkstg.com";
    String test = "Testcase C39556";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialEmail = userEmail.GetEmailValue();


    userEmail.PutInEmail(email);
    saveButton.clickSaveButton();
    String updatedEmail = userEmail.GetEmailValue();


    if (errorPopUp.ErrorEmailIsDisplayed() && !updatedEmail.equals(initialEmail)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }



  @Test /*C39098*/

  public void LongFirstNameError() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String error = "More than 128 symbols error wasn't shown or shown, but changes were still applied";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialFirstName = firstName.GetFirstNameValue();
    firstName.generateRandomFirstName(129); //argument is the length of first name
    saveButton.clickSaveButton();
    String laterFirstName = firstName.GetFirstNameValue();

    if (errorPopUp.ErrorFirstNameIsDisplayed() && (!initialFirstName.equals(laterFirstName))) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    firstName.retrieveFirstName(initialFirstName);
    System.out.println("Test C39098 completed");
  }

  @Test /*C39099*/

  public void LongLastNameError() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    EditProfileOwnPage errorPopUp = new EditProfileOwnPage(driver);

    String error = "More than 128 symbols error wasn't shown or shown, but changes were still applied";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialLastName = lastName.GetLastNameValue();
    lastName.generateRandomLastName(129); //argument is the length of last name
    saveButton.clickSaveButton();
    String laterLastName = lastName.GetLastNameValue();

    if (errorPopUp.ErrorLastNameIsDisplayed() && (!initialLastName.equals(laterLastName))) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    lastName.retrieveLastName(initialLastName);
    System.out.println("Test C39098 completed");
  }

  @Test /*C39067*/

  public void EditSectionIsOpened() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage buttonSave = new EditProfileOwnPage(driver);

    String error = "Edit profile section wasn't opened";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();

    if (buttonSave.SaveButtonIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39067 completed");
  }

  @Test /*C39069*/

  public void FistNameFieldIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);

    String error = "First name field is not available";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();

    if (firstName.FirstNameFieldIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39069 completed");
  }

  @Test /*C39070*/

  public void LastNameFieldIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage lastName = new EditProfileOwnPage(driver);

    String error = "Last name field is not available";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();

    if (lastName.LastNameFieldIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39070 completed");
  }

  @Test /*C39071*/

  public void EmailFieldIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage email = new EditProfileOwnPage(driver);

    String error = "Email field is not available";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();

    if (email.EmailFieldIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39071 completed");
  }

  @Test /*C39073*/

  public void BirthdateLabelIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage birthdate = new EditProfileOwnPage(driver);

    String error = "Birthdate label is not shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();

    if (birthdate.BirthdayLabelIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39073 completed");
  }

  @Test /*C39072*/

  public void MonthDayYearSelectorsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage selectors = new EditProfileOwnPage(driver);

    String error = "Either month, year or day tab is missing";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();

    if (selectors.DayMonthYearTabsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39069 completed");
  }

  @Test /*C39074*/

  public void MonthMenuListDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage selectorMonth = new EditProfileOwnPage(driver);
    EditProfileOwnPage menuListMonth = new EditProfileOwnPage(driver);

    String error = "On click of month selector no list to select from is shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    selectorMonth.clickSelectorMonth();

    if (menuListMonth.MonthMenuListIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39074 completed");
  }

  @Test /*C39075*/

  public void DayMenuListDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage selectorDay = new EditProfileOwnPage(driver);
    EditProfileOwnPage menuListDay = new EditProfileOwnPage(driver);

    String error = "On click of day selector no list to select from is shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    selectorDay.clickSelectorDay();

    if (menuListDay.DayMenuListIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39075 completed");
  }

  @Test /*C39076*/

  public void YearMenuListDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage selectorYear = new EditProfileOwnPage(driver);
    EditProfileOwnPage menuListYear = new EditProfileOwnPage(driver);

    String error = "On click of year selector no list to select from is shown";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    selectorYear.clickSelectorYear();

    if (menuListYear.YearMenuListIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39076 completed");
  }

  @Test /*C39077*/ //Save button is disabled when the first name, last name or both fields are empty

  public void EmptyFirstNameField() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage firstName = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);


    String error = "Save button is enabled even when the first name field has been cleared";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    firstName.clearFirstNameField();

    if (saveButton.SaveButtonIsDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39077 completed");
  }

  @Test /*C39078*/ //Save button is disabled when the email field is empty

  public void EmptyEmailField() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage email = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);


    String error = "Save button is enabled even when the first name field has been cleared";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    email.clearEmailField();

    if (saveButton.SaveButtonIsDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39078 completed");
  }

  @Test /*C39080*/ //Save button is enabled if any changes has been made (e.g. email has been changed)

  public void SaveButtonIsEnabled() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn editButton = new ProfileGeneralPageOwn(driver);
    EditProfileOwnPage email = new EditProfileOwnPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);


    String error = "Save button is not enabled after the email has been changed";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    email.generateRandomEmail(5);

    if (saveButton.SaveButtonIsEnabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39080 completed");
  }
}
