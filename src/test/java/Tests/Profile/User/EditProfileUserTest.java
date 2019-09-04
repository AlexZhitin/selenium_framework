package Tests.Profile.User;

import Base.ExtentTestManager;
import Base.TestBase;
import Common_pages.Toast;
import Pages.Profile.User.EditProfileUserPage;
import Pages.Profile.User.ProfileGeneralUserPage;
import Pages.SignInPage;
import Pages.TopBar.TopBarSection;
import Pages.UsersPage;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class EditProfileUserTest extends TestBase {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = getDriver();
    }

    @Test /*C39250*/

    public void SetUpBirthdate() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage month = new EditProfileUserPage(driver);
        EditProfileUserPage day = new EditProfileUserPage(driver);
        EditProfileUserPage year = new EditProfileUserPage(driver);
        EditProfileUserPage save = new EditProfileUserPage(driver);
        EditProfileUserPage valueBirthday = new EditProfileUserPage(driver);
        Toast toast = new Toast(driver);

        String error = "Birthday has not been updated";
        String test = "Testcase C39250";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
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
        toast.closeToast();
        driver.navigate().refresh();
        Thread.sleep(2000);


        String after = valueBirthday.GetBirthdayValue();

        if (before.equals(after)) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39251*/

    public void AgeIsLessThan13() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage month = new EditProfileUserPage(driver);
        EditProfileUserPage day = new EditProfileUserPage(driver);
        EditProfileUserPage year = new EditProfileUserPage(driver);
        EditProfileUserPage save = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String error = "Birthday has not been updated";
        String test = "Testcase C39251";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
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
    @Test /*C39115*/

    public void SetUpAvatar(String browserType) throws InterruptedException, IOException {

        String skip = "Test is skipped as it can't be performed on Safari";

        if (browserType.equals("safari")) {
            ExtentTestManager.getTest().log(Status.INFO, skip);
            System.out.println(skip);
            throw new SkipException("Skipped");
        }

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage avatar = new EditProfileUserPage(driver);
        EditProfileUserPage cropper = new EditProfileUserPage(driver);

        String error = "Avatar has not been updated";
        String test = "Testcase C39115";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
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
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39102*/

    public void UpdateFirstName() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage field = new EditProfileUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        Toast toast = new Toast(driver);

        String error = "First name has not been updated";
        String test = "Testcase C39102";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();


        String initialFirstName = field.GetFirstNameValue();
        field.generateRandomFirstName(5);//argument is the length of first name
        button.clickSaveButton();
        toast.closeToast();
        driver.navigate().refresh();
        Thread.sleep(2000);
        String updatedFirstName = field.GetFirstNameValue();
        field.retrieveFirstName(initialFirstName);

        if (initialFirstName.equals(updatedFirstName)) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }


    @Test /*C39103*/

    public void UpdateLastName() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage field = new EditProfileUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        Toast toast = new Toast(driver);

        String error = "Last name has not been updated";
        String test = "Testcase C39103";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();


        String initialLastName = field.GetLastNameValue();
        field.generateRandomLastName(5);//argument is the length of first name
        button.clickSaveButton();
        toast.closeToast();
        driver.navigate().refresh();
        Thread.sleep(2000);
        String updatedLastName = field.GetLastNameValue();
        field.retrieveLastName(initialLastName);

        if (initialLastName.equals(updatedLastName)) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39104*/

    public void UpdateEmail() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage field = new EditProfileUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        Toast toast = new Toast(driver);

        String error = "Email has not been updated";
        String test = "Testcase C39104";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();


        String initialEmail = field.GetEmail();
        field.generateRandomEmail(5);
        button.clickSaveButton();
        toast.closeToast();
        driver.navigate().refresh();
        Thread.sleep(2000);
        String updatedEmail = field.GetEmail();
        field.retrieveEmail(initialEmail);

        if (initialEmail.equals(updatedEmail)) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }


    /*@Test *//*C39098*//*

  public void LongFirstNameError() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
    EditProfileUserPage firstName = new EditProfileUserPage(driver);
    EditProfileUserPage saveButton = new EditProfileUserPage(driver);
    Toast errorToast = new Toast(driver);
    EditProfileUserPage toastClose = new EditProfileUserPage(driver);

    String error = "More than 32 symbols error wasn't shown or shown, but changes were still applied";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialFirstName = firstName.GetFirstNameValue();
    firstName.generateRandomFirstName(33); //argument is the length of first name
    saveButton.clickSaveButton();
    String laterFirstName = firstName.GetFirstNameValue();

    if (errorToast.ErrorToastIsDisplayed() && (!initialFirstName.equals(laterFirstName))) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    toastClose.clickToastClose();
    firstName.retrieveFirstName(initialFirstName);
    System.out.println("Test C39098 completed");
  }*/

    /*@Test *//*C39099*//*

  public void LongLastNameError() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
    EditProfileUserPage lastName = new EditProfileUserPage(driver);
    EditProfileUserPage saveButton = new EditProfileUserPage(driver);
    Toast errorToast = new Toast(driver);
    EditProfileUserPage toastClose = new EditProfileUserPage(driver);

    String error = "More than 32 symbols error wasn't shown or shown, but changes were still applied";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    editButton.clickEditButton();
    String initialLastName = lastName.GetEmail();
    lastName.generateRandomLastName(33); //argument is the length of first name
    saveButton.clickSaveButton();
    String laterLastName = lastName.GetEmail();

    if (errorToast.ErrorToastIsDisplayed() && (!initialLastName.equals(laterLastName))) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    toastClose.clickToastClose();
    lastName.retrieveLastName(initialLastName);
    System.out.println("Test C39098 completed");
  }*/

    @Test /*C39100*/

    public void EditSectionIsOpened() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage buttonSave = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);


        String error = "Edit profile section wasn't opened";
        String test = "Testcase C39100";
        String email = "cusptestadmin@bkstg.com";


        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        if (buttonSave.SaveButtonIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39101*/

    public void UnsavedChangesAlertIsShown() {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage field = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);


        String error = "Changes were not saved.";
        String test = "Testcase C39101";
        String email = "cusptestadmin@bkstg.com";


        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();
        String nameBefore = field.GetFirstNameValue();
        field.generateRandomFirstName(5);
        driver.navigate().back();
        driver.switchTo().alert().dismiss();
        String nameAfter = field.GetFirstNameValue();


        if (nameBefore.equals(nameAfter)) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    /*@Test *//*C39069*//*

  public void FistNameFieldIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
    EditProfileUserPage firstName = new EditProfileUserPage(driver);

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

  @Test *//*C39070*//*

  public void LastNameFieldIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
    EditProfileUserPage lastName = new EditProfileUserPage(driver);

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

  @Test *//*C39071*//*

  public void EmailFieldIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
    EditProfileUserPage email = new EditProfileUserPage(driver);

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

  @Test *//*C39073*//*

  public void BirthdateLabelIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
    EditProfileUserPage birthdate = new EditProfileUserPage(driver);

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

  @Test *//*C39072*//*

  public void MonthDayYearSelectorsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
    EditProfileUserPage selectors = new EditProfileUserPage(driver);

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

  @Test *//*C39074*//*

  public void MonthMenuListDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
    EditProfileUserPage selectorMonth = new EditProfileUserPage(driver);
    EditProfileUserPage menuListMonth = new EditProfileUserPage(driver);

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

  @Test *//*C39075*//*

  public void DayMenuListDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
    EditProfileUserPage selectorDay = new EditProfileUserPage(driver);
    EditProfileUserPage menuListDay = new EditProfileUserPage(driver);

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

  @Test *//*C39076*//*

  public void YearMenuListDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
    EditProfileUserPage selectorYear = new EditProfileUserPage(driver);
    EditProfileUserPage menuListYear = new EditProfileUserPage(driver);

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

  @Test *//*C39077*//* //Save button is disabled when the first name, last name or both fields are empty

  public void EmptyFirstNameField() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
    EditProfileUserPage firstName = new EditProfileUserPage(driver);
    EditProfileUserPage saveButton = new EditProfileUserPage(driver);


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

  @Test *//*C39078*//* //Save button is disabled when the email field is empty

  public void EmptyEmailField() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
    EditProfileUserPage email = new EditProfileUserPage(driver);
    EditProfileUserPage saveButton = new EditProfileUserPage(driver);


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

  @Test *//*C39080*//* //Save button is enabled if any changes has been made (e.g. email has been changed)

  public void SaveButtonIsEnabled() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
    EditProfileUserPage email = new EditProfileUserPage(driver);
    EditProfileUserPage saveButton = new EditProfileUserPage(driver);


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
  }*/

    @Test /*C39131*/(priority = 1)

    public void RoleIsChangedToInfluencerPermissionsSelected() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        ProfileGeneralUserPage button = new ProfileGeneralUserPage(driver);
        EditProfileUserPage buttonSave = new EditProfileUserPage(driver);
        EditProfileUserPage role = new EditProfileUserPage(driver);
        EditProfileUserPage permissions = new EditProfileUserPage(driver);
        Toast toast = new Toast(driver);


        String userRole = "Influencer";
        String userPermissions = "Euroleague";
        String error = "Role has not been changed to Influencer";
        String test = "Testcase C39131";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        button.clickEditButton();


        role.clickRoleSelector();
        role.SelectOptionFromDropdown(userRole);
        Thread.sleep(2000);

        permissions.clickPermissionsSelector();
        permissions.SelectOptionFromDropdown(userPermissions);
        Thread.sleep(2000);

        buttonSave.clickSaveButton();
        toast.closeToast();

        driver.navigate().refresh();

        int tries = 0;
        while (!role.GetRoleValue().equals(userRole) && tries < 25) {//1 try in 2 seconds
            driver.navigate().refresh();
            Thread.sleep(2000);
            tries++;
            System.out.println(tries);
        }

        if (role.GetRoleValue().equals(userRole) &&
                permissions.GetPermissionsValue().equals(userPermissions)) {
            Thread.sleep(3000);
            Assert.assertTrue(true);
        } else {
            Thread.sleep(3000);
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39252*/(priority = 2)

    public void RoleIsChangedToAdmin() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        ProfileGeneralUserPage button = new ProfileGeneralUserPage(driver);
        EditProfileUserPage buttonSave = new EditProfileUserPage(driver);
        EditProfileUserPage role = new EditProfileUserPage(driver);
        EditProfileUserPage permissions = new EditProfileUserPage(driver);
        Toast toast = new Toast(driver);

        String userRole = "CUSP Admin";
        String error = "Role has not been changed to CUSP Admin";
        String test = "Testcase C39252";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        button.clickEditButton();

        role.clickRoleSelector();
        role.SelectOptionFromDropdown(userRole);
        Thread.sleep(2000);

        buttonSave.clickSaveButton();
        toast.closeToast();

        driver.navigate().refresh();

        int tries = 0;
        while (!role.GetRoleValue().equals(userRole) && tries < 25) {//1 try in 2 seconds
            driver.navigate().refresh();
            Thread.sleep(2000);
            tries++;
            System.out.println(tries);
        }

        if (role.GetRoleValue().equals(userRole) &&
                permissions.SelectorPermissionsDisabled()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }


    @Test /*C39593*/

    public void LongFirstNameError() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage field = new EditProfileUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage firstName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String error = "More than 128 symbols error wasn't shown or shown, but changes were still applied";
        String test = "Testcase C39593";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();


        String initialFirstName = field.GetFirstNameValue();
        field.generateRandomFirstName(129);//argument is the length of first name
        button.clickSaveButton();
        String laterFirstName = firstName.GetFirstNameValue();

        if (errorPopUp.ErrorFirstNameIsDisplayed() && (!initialFirstName.equals(laterFirstName))) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        firstName.retrieveFirstName(initialFirstName);
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39601*/

    public void LongLastNameError() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage field = new EditProfileUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage lastName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String error = "More than 128 symbols error wasn't shown or shown, but changes were still applied";
        String test = "Testcase C39601";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();


        String initialLastName = field.GetLastNameValue();
        field.generateRandomLastName(129);//argument is the length of first name
        button.clickSaveButton();
        String laterLastName = lastName.GetLastNameValue();

        if (errorPopUp.ErrorLastNameIsDisplayed() && (!initialLastName.equals(laterLastName))) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        lastName.retrieveLastName(initialLastName);
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39594*/

    public void FirstNameCanContainMultipleWords() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage firstName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);
        Toast toast = new Toast(driver);

        String name = "First Name";
        String error = "Multiple words are not accepted in the first name field";
        String test = "Testcase C39594";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        String initialFirstName = firstName.GetFirstNameValue();
        firstName.PutInFirstName(name);
        button.clickSaveButton();
        toast.closeToast();

        String updatedFirstName = firstName.GetFirstNameValue();

        if (initialFirstName.equals(updatedFirstName) && !errorPopUp.ErrorFirstNameIsDisplayed()) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        firstName.retrieveFirstName(initialFirstName);
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39602*/

    public void LastNameCanContainMultipleWords() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage lastName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);
        Toast toast = new Toast(driver);

        String name = "Last Name";
        String error = "Multiple words are not accepted in the last name field";
        String test = "Testcase C39602";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        String initialLastName = lastName.GetLastNameValue();
        lastName.PutInLastName(name);
        button.clickSaveButton();
        toast.closeToast();

        String updatedLastName = lastName.GetLastNameValue();

        if (initialLastName.equals(updatedLastName) && !errorPopUp.ErrorLastNameIsDisplayed()) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        lastName.retrieveLastName(initialLastName);
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39595*/

    public void FirstNameCanContainApostrophe() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage firstName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);
        Toast toast = new Toast(driver);

        String name = "Fi'rst";
        String error = "Apostrophe is not accepted when it should be";
        String test = "Testcase C39595";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        String initialFirstName = firstName.GetFirstNameValue();
        firstName.PutInFirstName(name);
        button.clickSaveButton();
        toast.closeToast();

        String updatedFirstName = firstName.GetFirstNameValue();

        if (initialFirstName.equals(updatedFirstName) && !errorPopUp.ErrorFirstNameIsDisplayed()) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        firstName.retrieveFirstName(initialFirstName);
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39595*/

    public void FirstNameCanContainHyphen() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage firstName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);
        Toast toast = new Toast(driver);

        String name = "Fi-rst";
        String error = "Hyphen is not accepted when it should be";
        String test = "Testcase C39595";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        String initialFirstName = firstName.GetFirstNameValue();
        firstName.PutInFirstName(name);
        button.clickSaveButton();
        toast.closeToast();

        String updatedFirstName = firstName.GetFirstNameValue();

        if (initialFirstName.equals(updatedFirstName) && !errorPopUp.ErrorFirstNameIsDisplayed()) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        firstName.retrieveFirstName(initialFirstName);
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39596*/

    public void FirstNameBeginsWithApostrophe() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage firstName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "'First";
        String error = "Apostrophe is accepted in the beginning when it shouldn't. No error message was shown";
        String test = "Testcase C39596";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        firstName.PutInFirstName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorFirstNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39596*/

    public void FirstNameBeginsWithHyphen() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage firstName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "-First";
        String error = "Hyphen is accepted in the beginning when it shouldn't. No error message was shown";
        String test = "Testcase C39596";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        firstName.PutInFirstName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorFirstNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39596*/

    public void FirstNameEndsWithHyphen() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage firstName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "First-";
        String error = "Hyphen is accepted in the end when it shouldn't. No error message was shown";
        String test = "Testcase C39596";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        firstName.PutInFirstName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorFirstNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39596*/

    public void FirstNameEndsWithApostrophe() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage firstName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "First'";
        String error = "Apostrophe is accepted in the end when it shouldn't. No error message was shown";
        String test = "Testcase C39596";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        firstName.PutInFirstName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorFirstNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39597*/

    public void FirstNameCanContainASCII() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage firstName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);
        Toast toast = new Toast(driver);

        String name = "Firsêt NameÐð";
        String error = "Extended ASCII characters (\\x{00C0}-\\x{00FF}) are not accepted when it should be";
        String test = "Testcase C39597";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        String initialFirstName = firstName.GetFirstNameValue();
        firstName.PutInFirstName(name);
        button.clickSaveButton();
        toast.closeToast();

        String updatedFirstName = firstName.GetFirstNameValue();

        if (initialFirstName.equals(updatedFirstName) && !errorPopUp.ErrorFirstNameIsDisplayed()) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        firstName.retrieveFirstName(initialFirstName);
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39598*/

    public void FirstNameEndsWithSpace() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage firstName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "First ";
        String error = "Space is accepted in the end when it shouldn't. No error message was shown";
        String test = "Testcase C39598";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        firstName.PutInFirstName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorFirstNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39598*/

    public void FirstNameBeginsWithSpace() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage firstName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = " First";
        String error = "Space is accepted in the beginning when it shouldn't. No error message was shown";
        String test = "Testcase C39598";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        firstName.PutInFirstName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorFirstNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39599*/

    public void FirstNameContainsEmoji() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage firstName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "Fir☑️st";
        String error = "Emoji is accepted within a word. No error message was shown";
        String test = "Testcase C39599";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        firstName.PutInFirstName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorFirstNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39600*/

    public void FirstNameContainsSpecialSymbols() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage firstName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "Fir@#$%st";
        String error = "Special symbols are accepted within a word. No error message was shown";
        String test = "Testcase C39600";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        firstName.PutInFirstName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorFirstNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39603*/

    public void LastNameCanContainApostrophe() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage lastName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);
        Toast toast = new Toast(driver);

        String name = "La'st";
        String error = "Apostrophe is not accepted when it should be";
        String test = "Testcase C39603";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        String initialLastName = lastName.GetLastNameValue();
        lastName.PutInLastName(name);
        button.clickSaveButton();
        toast.closeToast();

        String updatedLastName = lastName.GetLastNameValue();

        if (initialLastName.equals(updatedLastName) && !errorPopUp.ErrorLastNameIsDisplayed()) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        lastName.retrieveLastName(initialLastName);
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39603*/

    public void LastNameCanContainHyphen() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage lastName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);
        Toast toast = new Toast(driver);

        String name = "La-st";
        String error = "Hyphen is not accepted when it should be";
        String test = "Testcase C39603";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        String initialLastName = lastName.GetLastNameValue();
        lastName.PutInLastName(name);
        button.clickSaveButton();
        toast.closeToast();

        String updatedLastName = lastName.GetLastNameValue();

        if (initialLastName.equals(updatedLastName) && !errorPopUp.ErrorLastNameIsDisplayed()) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        lastName.retrieveLastName(initialLastName);
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39604*/

    public void LastNameBeginsWithApostrophe() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage lastName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "'Last";
        String error = "Apostrophe is accepted in the beginning when it shouldn't. No error message was shown";
        String test = "Testcase C39604";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        lastName.PutInLastName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorLastNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39604*/

    public void LastNameBeginsWithHyphen() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage lastName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "-Last";
        String error = "Hyphen is accepted in the beginning when it shouldn't. No error message was shown";
        String test = "Testcase C39604";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        lastName.PutInLastName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorLastNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39604*/

    public void LastNameEndsWithHyphen() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage lastName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "Last-";
        String error = "Hyphen is accepted in the end when it shouldn't. No error message was shown";
        String test = "Testcase C39604";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        lastName.PutInLastName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorLastNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39604*/

    public void LastNameEndsWithApostrophe() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage lastName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "Last'";
        String error = "Apostrophe is accepted in the end when it shouldn't. No error message was shown";
        String test = "Testcase C39604";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        lastName.PutInLastName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorLastNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39605*/

    public void LastNameCanContainASCII() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage lastName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);
        Toast toast = new Toast(driver);

        String name = "Lastêt NameÐð";
        String error = "Extended ASCII characters (\\x{00C0}-\\x{00FF}) are not accepted when it should be";
        String test = "Testcase C39605";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        String initialLastName = lastName.GetLastNameValue();
        lastName.PutInLastName(name);
        button.clickSaveButton();
        toast.closeToast();

        String updatedLastName = lastName.GetLastNameValue();

        if (initialLastName.equals(updatedLastName) && !errorPopUp.ErrorLastNameIsDisplayed()) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        lastName.retrieveLastName(initialLastName);
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39606*/

    public void LastNameEndsWithSpace() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage lastName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "Last ";
        String error = "Space is accepted in the end when it shouldn't. No error message was shown";
        String test = "Testcase C39606";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();
        lastName.PutInLastName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorLastNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39606*/

    public void LastNameBeginsWithSpace() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage lastName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = " Last";
        String error = "Space is accepted in the beginning when it shouldn't. No error message was shown";
        String test = "Testcase C39606";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();
        lastName.PutInLastName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorLastNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39607*/

    public void LastNameContainsEmoji() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage lastName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "La☑️st";
        String error = "Emoji is accepted within a word. No error message was shown";
        String test = "Testcase C39607";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        lastName.PutInLastName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorLastNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39608*/

    public void LastNameContainsSpecialSymbols() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage lastName = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);

        String name = "La@#$%st";
        String error = "Special symbols are accepted within a word. No error message was shown";
        String test = "Testcase C39608";
        String email = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        userFullName.clickFullName();
        editButton.clickEditButton();

        lastName.PutInLastName(name);
        button.clickSaveButton();

        if (errorPopUp.ErrorLastNameIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39609*/

    public void EmailWithoutDomain() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage userEmail = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);


        String error = "Email without domain is accepted";
        String emailWithoutDomain = "cusptestadmin@";
        String test = "Testcase C39553";
        String emailAddress = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(emailAddress);
        userFullName.clickFullName();
        editButton.clickEditButton();
        String initialEmail = userEmail.GetEmail();

        userEmail.PutInEmail(emailWithoutDomain);
        button.clickSaveButton();
        String updatedEmail = userEmail.GetEmail();

        if (errorPopUp.ErrorEmailIsDisplayed() && !updatedEmail.equals(initialEmail)) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39610*/

    public void EmailWithSpace() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage userEmail = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);


        String error = "Email with a space is accepted";
        String emailWithSpace = "cusptest admin@bkstg.com";
        String test = "Testcase C39610";
        String emailAddress = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(emailAddress);
        userFullName.clickFullName();
        editButton.clickEditButton();
        String initialEmail = userEmail.GetEmail();

        userEmail.PutInEmail(emailWithSpace);
        button.clickSaveButton();
        String updatedEmail = userEmail.GetEmail();

        if (errorPopUp.ErrorEmailIsDisplayed() && !updatedEmail.equals(initialEmail)) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39611*/

    public void EmailWithEmoji() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage userEmail = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);


        String error = "Email with emoji is accepted";
        String emailWithEmoji = "cusptest☑admin@bkstg.com";
        String test = "Testcase C39611";
        String emailAddress = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(emailAddress);
        userFullName.clickFullName();
        editButton.clickEditButton();
        String initialEmail = userEmail.GetEmail();

        userEmail.PutInEmail(emailWithEmoji);
        button.clickSaveButton();
        String updatedEmail = userEmail.GetEmail();

        if (errorPopUp.ErrorEmailIsDisplayed() && !updatedEmail.equals(initialEmail)) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39612*/

    public void EmailWithoutLocalPart() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        ProfileGeneralUserPage editButton = new ProfileGeneralUserPage(driver);
        EditProfileUserPage button = new EditProfileUserPage(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage userFullName = new UsersPage(driver);
        EditProfileUserPage userEmail = new EditProfileUserPage(driver);
        EditProfileUserPage errorPopUp = new EditProfileUserPage(driver);


        String error = "Email without local part (just domain) is accepted.";
        String emailWitoutLocalPart = "@bkstg.com";
        String test = "Testcase C39612";
        String emailAddress = "cusptestadmin@bkstg.com";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(emailAddress);
        userFullName.clickFullName();
        editButton.clickEditButton();
        String initialEmail = userEmail.GetEmail();

        userEmail.PutInEmail(emailWitoutLocalPart);
        button.clickSaveButton();
        String updatedEmail = userEmail.GetEmail();

        if (errorPopUp.ErrorEmailIsDisplayed() && !updatedEmail.equals(initialEmail)) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }
}








