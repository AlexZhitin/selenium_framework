package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.AddUserPage;
import Pages.SignInPage;
import Pages.TopBar.TopBarSection;
import Pages.UsersPage;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddUserTest extends TestBase {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C39205*/

  public void FullNameFieldIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage field = new AddUserPage(driver);

    String error = "Full name field is not shown on Add User dialog";
    String test = "Testcase C39205";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    
    if (field.FullNameFieldIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39206*/

  public void EmailFieldIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage field = new AddUserPage(driver);

    String error = "Email field is not shown on Add User dialog";
    String test = "Testcase C39206";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();


    if (field.EmailFieldIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39207*/

  public void UsernameFieldIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage field = new AddUserPage(driver);

    String error = "Username field is not shown on Add User dialog";
    String test = "Testcase C39207";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();


    if (field.UsernameFieldIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39208*/

  public void PasswordFieldIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage field = new AddUserPage(driver);

    String error = "Password field is not shown on Add User dialog";
    String test = "Testcase C39208";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();


    if (field.PasswordFieldIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39209*/

  public void MonthSelectorIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage selector = new AddUserPage(driver);

    String error = "Month selector is not shown on Add User dialog";
    String test = "Testcase C39209";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();


    if (selector.MonthSelectorIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39210*/

  public void DaySelectorIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage selector = new AddUserPage(driver);

    String error = "Day selector is not shown on Add User dialog";
    String test = "Testcase C39210";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();


    if (selector.DaySelectorIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39211*/

  public void YearSelectorIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage selector = new AddUserPage(driver);

    String error = "Year selector is not shown on Add User dialog";
    String test = "Testcase C39211";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();


    if (selector.YearSelectorIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39212*/

  public void RoleSelectorIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage selector = new AddUserPage(driver);

    String error = "Role selector is not shown on Add User dialog";
    String test = "Testcase C39212";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();


    if (selector.RoleSelectorIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39213*/

  public void PermissionsSelectorIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage selector = new AddUserPage(driver);

    String error = "Permissions selector is not shown on Add User dialog";
    String test = "Testcase C39213";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();


    if (selector.PermissionsSelectorIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39214*/

  public void SaveButtonIsEnabled() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage buttonSave = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);

    String error = "Save button is not enabled when all required fields are filled out";
    String test = "Testcase C39214";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(password.StringRandomizer(5));

    if (buttonSave.SaveButtonIsEnabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39215*/

  public void SaveButtonIsDisabled() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage buttonSave = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);

    String error = "Save button is not disabled if one of required fields";
    String test = "Testcase C39215";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(username.StringRandomizer(5));

    if (buttonSave.SaveButtonIsDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39216*/

  public void FirstNameIsLong() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "\"First name can contain not more than 128 characters\" error is not shown";
    String test = "Testcase C39216";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(129) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(password.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39218*/

  public void LastNameIsLong() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "\"Last name can contain not more than 128 characters\" error is not shown";
    String test = "Testcase C39218";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(129));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(password.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39217*/

  public void NoLastNameIsPut() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "\"Last name is required\" error is not shown";
    String test = "Testcase C39217";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(password.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39219*/

  public void FullNameContainsSpecSymbolsEmojisUnderscoresDots() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "\"Each word can include only letters and hyphens or apostrophes within\" error is not shown";
    String test = "Testcase C39219";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + "☑️ " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail"); // invalid email is put to avoid creating an account
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(password.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearFullNameField();
    field.PutInFullName(name.StringRandomizer(5) + "#$%@️ " + name.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearFullNameField();
    field.PutInFullName(name.StringRandomizer(5) + "- " + name.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearFullNameField();
    field.PutInFullName(name.StringRandomizer(5) + "' " + name.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);


    field.clearFullNameField();
    field.PutInFullName("-name " + name.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearFullNameField();
    field.PutInFullName("'name " + name.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearFullNameField();
    field.PutInFullName(name.StringRandomizer(5) + "_ " + name.StringRandomizer(5));//emoji
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearFullNameField();
    field.PutInFullName(name.StringRandomizer(5) + ". " + name.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

  }

  @Test /*C39559*/

  public void FullNameCanContainApostrophe() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "\"Each word can include only letters and hyphens or apostrophes within\" error is shown when it shouldn't";
    String test = "Testcase C39559";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName("first'Name lastName");
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail"); // invalid email is put to avoid creating an account
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(password.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39560*/

  public void FullNameCanContainHyphen() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "\"Each word can include only letters and hyphens or apostrophes within\" error is shown when it shouldn't";
    String test = "Testcase C39560";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName("first-Name lastName");
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail"); // invalid email is put to avoid creating an account
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(password.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

  }

  @Test /*C39560*/

  public void FullNameContainsNumbers() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "\"Each word can include only letters and hyphens or apostrophes within\" error is not shown";
    String test = "Testcase C39560";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName("123 456");
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail"); // invalid email is put to avoid creating an account
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(password.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorFullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39222*/

  public void ErrorEmailHasNoDomain() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "\"Invalid email\" error is not shown";
    String test = "Testcase C39222";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(password.StringRandomizer(8));
    button.clickSaveButton();

    if (errorPopUp.ErrorEmailIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39561*/

  public void ErrorEmailHasNoAtSign() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "\"Invalid email\" error is not shown";
    String test = "Testcase C39561";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + ".bkstg.com");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(password.StringRandomizer(8));
    button.clickSaveButton();

    if (errorPopUp.ErrorEmailIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39223*/

  public void ErrorEmailTaken() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "\"Email taken\" error is not shown";
    String test = "Testcase C39223";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail("cusptestadmin@bkstg.com");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(password.StringRandomizer(8));
    button.clickSaveButton();

    if (errorPopUp.ErrorEmailIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39224*/

  public void UsernameIsTaken() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "\"Username is taken\" error is not shown";
    String test = "Testcase C39224";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername("Username");
    field.PutInPassword(password.StringRandomizer(8));
    button.clickSaveButton();

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39562*/

  public void ErrorUsernameLessThan3Symbols() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "Error is not shown";
    String test = "Testcase C39562";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(field.StringRandomizer(2));
    field.PutInPassword(password.StringRandomizer(8));
    button.clickSaveButton();

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39563*/

  public void ErrorUsernameTooLong() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "Error is not shown";
    String test = "Testcase C39563";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(field.StringRandomizer(30));
    field.PutInPassword(password.StringRandomizer(8));
    button.clickSaveButton();

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39564*/

  public void ErrorUsernameUnderscoreDotBeginning() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "Error is not shown";
    String test = "Testcase C39564";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername("_username");
    field.PutInPassword(password.StringRandomizer(8));
    button.clickSaveButton();

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearUsernameField();
    field.PutInUsername(".username");

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39565*/

  public void ErrorUsernameUnderscoreDotEnd() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "Error is not shown";
    String test = "Testcase C39565";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername("username_");
    field.PutInPassword(password.StringRandomizer(8));
    button.clickSaveButton();

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearUsernameField();
    field.PutInUsername("username.");

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39566*/

  public void ErrorUsernameContainsSpace() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "Error is not shown";
    String test = "Testcase C39566";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(" username");
    field.PutInPassword(password.StringRandomizer(8));
    button.clickSaveButton();

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearUsernameField();
    field.PutInUsername("username ");

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearUsernameField();
    field.PutInUsername("user name");

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39567*/

  public void UsernameUnderscoreDotAllowedWithin() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "Error is not shown";
    String test = "Testcase C39567";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername("user_name");
    field.PutInPassword(password.StringRandomizer(8));
    button.clickSaveButton();

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearUsernameField();
    field.PutInUsername("user.name");

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }



  @Test /*C39225*/

  public void ErrorUsernameContainsSpecSymbols() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "\"Username can only contain letters, numbers, underscores and dots\" error is not shown";
    String test = "Testcase C39225";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail"); // invalid email is put to avoid creating an account
    field.PutInUsername(username.StringRandomizer(5) + "☑️ ");
    field.PutInPassword(password.StringRandomizer(8));
    button.clickSaveButton();

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearUsernameField();
    field.PutInUsername(name.StringRandomizer(5) + "#$%@");
    button.clickSaveButton();

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearUsernameField();
    field.PutInUsername(name.StringRandomizer(5) + "-");
    button.clickSaveButton();

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearUsernameField();
    field.PutInUsername(name.StringRandomizer(5) + " ");
    button.clickSaveButton();

    if (errorPopUp.ErrorUsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39226*/

  public void ErrorPasswordContainsLessThan8Symbols() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "\"Password must be at least 8 characters.\" error is not shown";
    String test = "Testcase C39226";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(password.StringRandomizer(5));
    button.clickSaveButton();

    if (errorPopUp.ErrorPasswordIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39568*/

  public void ErrorPasswordContainsOnlyLetters() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "No error is shown if password has only lowercase letters";
    String test = "Testcase C39568";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword("asdfghjk");
    button.clickSaveButton();

    if (errorPopUp.ErrorPasswordIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39569*/

  public void ErrorPasswordContainsOnlyNumbers() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "No error is shown if password has only numbers";
    String test = "Testcase C39569";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword("12345678");
    button.clickSaveButton();

    if (errorPopUp.ErrorPasswordIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39570*/

  public void ErrorPasswordContainsLowerCaseLettersNumbers() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "No error is shown if password has lowercase numbers and letters";
    String test = "Testcase C39570";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword("asdfgh12345678");
    button.clickSaveButton();

    if (errorPopUp.ErrorPasswordIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39571*/

  public void ErrorPasswordContainsSpace() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "No error is shown if password has space";
    String test = "Testcase C39571";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(" Aasdf1234");
    button.clickSaveButton();

    if (errorPopUp.ErrorPasswordIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearPasswordField();
    field.PutInPassword("Aasdf1234 ");
    button.clickSaveButton();

    if (errorPopUp.ErrorPasswordIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearPasswordField();
    field.PutInPassword("Aasdf 1234");
    button.clickSaveButton();

    if (errorPopUp.ErrorPasswordIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

  }

  @Test /*C39572*/

  public void ErrorPasswordContainsEmojiSpecSymbols() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);


    String error = "No error is shown if password has emojis or spec symbols";
    String test = "Testcase C39572";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword("Aasdfgh☑️123");
    button.clickSaveButton();

    if (errorPopUp.ErrorPasswordIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);

    field.clearPasswordField();
    field.PutInPassword("Aasdfgh#$%️123");
    button.clickSaveButton();
  }

  @Test /*C39227*/

  public void ErrorBirthdayIsDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage button = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage errorPopUp = new AddUserPage(driver);
    AddUserPage birthday = new AddUserPage(driver);

    String error = "\"Must be 13 or older to have an account.\" error is not shown";
    String test = "Testcase C39227";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(email.StringRandomizer(5) + "@invalidemail");
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword(password.StringRandomizer(8));

    birthday.clickSelectorMonth();
    Thread.sleep(1000);
    birthday.SelectLastMonth();
    Thread.sleep(1000);

    birthday.clickSelectorDay();
    Thread.sleep(1000);
    birthday.SelectLastDay();
    Thread.sleep(1000);

    birthday.clickSelectorYear();
    Thread.sleep(1000);
    birthday.SelectLastYear();
    Thread.sleep(1000);

    button.clickSaveButton();

    if (errorPopUp.ErrorBirthdayIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39228*/

  public void SelectorPermissionsIsDisabled() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage role = new AddUserPage(driver);
    AddUserPage permissions = new AddUserPage(driver);

    String error = "Permissions selector is active even though the Admin role is selected";
    String test = "Testcase C39228";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    role.clickRoleSelector();
    role.SelectOptionFromDropdown("Admin");
    Thread.sleep(1000);

    permissions.clickPermissionsSelector();

    if (permissions.MenuPermissionsIsDisplayed()) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39229*/

  public void SelectorPermissionsIsEnabled() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    AddUserPage role = new AddUserPage(driver);
    AddUserPage permissions = new AddUserPage(driver);

    String error = "Permissions selector is not active even though the Influencer role is selected";
    String test = "Testcase C39229";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    role.clickRoleSelector();
    role.SelectOptionFromDropdown("Influencer");
    Thread.sleep(1000);

    permissions.clickPermissionsSelector();

    if (permissions.MenuPermissionsIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39230*/

  public void InfluencerUserIsAdded() throws InterruptedException {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage user = new UsersPage(driver);

    AddUserPage buttonSave = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage role = new AddUserPage(driver);
    AddUserPage permissions = new AddUserPage(driver);
    AddUserPage toastSuccess = new AddUserPage(driver);

    String userEmail = email.StringRandomizer(5) + "@bkstg.com";
    String userRole = "Influencer";
    String userPermissions = "Euroleague";
    String error = "Influencer user was not added";
    String test = "Testcase C39230";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(userEmail);
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword("Abcd12345");

    role.clickRoleSelector();
    role.SelectOptionFromDropdown(userRole);
    Thread.sleep(1000);

    permissions.clickPermissionsSelector();
    permissions.SelectOptionFromDropdown(userPermissions);
    Thread.sleep(1000);

    buttonSave.clickSaveButton();

    if (toastSuccess.ToastSuccessIsDisplayed()) {
      driver.navigate().refresh();
      Thread.sleep(1000);
    } else {
      System.out.println("Success toast wasn't shown");
      ExtentTestManager.getTest().log(Status.INFO, "Success toast wasn't shown");
      Assert.fail();
    }

    search.SearchUserByEmail(userEmail);

    if (user.UserIsFoundByEmail(userEmail)
            && user.UserSpecificRoleIsDisplayed(userRole)
            && user.UserSpecificPermissionsIsDisplayed(userPermissions)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39231*/

  public void AdminUserIsAdded() throws InterruptedException {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage user = new UsersPage(driver);

    AddUserPage buttonSave = new AddUserPage(driver);
    AddUserPage field = new AddUserPage(driver);
    AddUserPage name = new AddUserPage(driver);
    AddUserPage email = new AddUserPage(driver);
    AddUserPage username = new AddUserPage(driver);
    AddUserPage password = new AddUserPage(driver);
    AddUserPage role = new AddUserPage(driver);
    AddUserPage toastSuccess = new AddUserPage(driver);

    String userEmail = email.StringRandomizer(5) + "@bkstg.com";
    String userRole = "Admin";
    String userPermissions = "All";
    String error = "Admin user was not added";
    String test = "Testcase C39230";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();
    field.PutInFullName(name.StringRandomizer(5) + " " + name.StringRandomizer(5));
    field.PutInEmail(userEmail);
    field.PutInUsername(username.StringRandomizer(5));
    field.PutInPassword("Abcd12345");

    role.clickRoleSelector();
    role.SelectOptionFromDropdown(userRole);
    Thread.sleep(1000);

    buttonSave.clickSaveButton();

    if (toastSuccess.ToastSuccessIsDisplayed()) {
      driver.navigate().refresh();
      Thread.sleep(1000);
    } else {
      System.out.println("Success toast wasn't shown");
      ExtentTestManager.getTest().log(Status.INFO, "Success toast wasn't shown");
      Assert.fail();
    }

    search.SearchUserByEmail(userEmail);

    if (user.UserIsFoundByEmail(userEmail)
            && user.UserSpecificRoleIsDisplayed(userRole)
            && user.UserSpecificPermissionsIsDisplayed(userPermissions)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }
}