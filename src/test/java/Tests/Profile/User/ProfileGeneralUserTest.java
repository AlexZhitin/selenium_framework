package Tests.Profile.User;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.*;
import Pages.Profile.User.EditProfileUserPage;
import Pages.Profile.User.ProfileGeneralUserPage;
import Pages.TopBar.TopBarSection;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileGeneralUserTest extends TestBase {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C39140*/

  public void UserAvatarIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    ProfileGeneralUserPage avatar = new ProfileGeneralUserPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage userName = new UsersPage(driver);

    String error = "User avatar is not shown in other user profile";
    String email = "cusptestadmin@bkstg.com";
    String test = "C39140";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    userName.clickFullName();

    if (avatar.UserAvatarIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39141*/

  public void UsernameIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    ProfileGeneralUserPage username = new ProfileGeneralUserPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage userFullName = new UsersPage(driver);

    String email = "cusptestadmin@bkstg.com";
    String error = "Username is not shown in user profile";
    String test = "C39141";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    userFullName.clickFullName();

    if (username.UsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39142*/

  public void FullNameIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    ProfileGeneralUserPage name = new ProfileGeneralUserPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage userFullName = new UsersPage(driver);

    String email = "cusptestadmin@bkstg.com";
    String error = "Full name is not shown in user profile";
    String test = "C39142";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    userFullName.clickFullName();

    if (name.FullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39143*/

  public void EmailIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    ProfileGeneralUserPage userEmail = new ProfileGeneralUserPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage userFullName = new UsersPage(driver);

    String email = "cusptestadmin@bkstg.com";
    String error = "Email address is not shown in user profile";
    String test = "C39143";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    userFullName.clickFullName();

    if (userEmail.EmailIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39145*/

  public void BirthdateIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    ProfileGeneralUserPage birthdate = new ProfileGeneralUserPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage userFullName = new UsersPage(driver);

    String email = "cusptestadmin@bkstg.com";
    String error = "Birthdate is not shown in user profile";
    String test = "C39145";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    userFullName.clickFullName();

    if (birthdate.BirthdateIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39144*/

  public void LocationIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    ProfileGeneralUserPage location = new ProfileGeneralUserPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage userFullName = new UsersPage(driver);

    String email = "cusptestadmin@bkstg.com";
    String error = "Location is not shown in user profile";
    String test = "C39144";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    userFullName.clickFullName();

    if (location.LocationIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39146*/

  public void UserRoleIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    ProfileGeneralUserPage role = new ProfileGeneralUserPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage userFullName = new UsersPage(driver);

    String email = "cusptestadmin@bkstg.com";
    String error = "User role is not shown in user profile";
    String test = "C39146";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    userFullName.clickFullName();

    if (role.RoleIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39238*/

  public void EditProfilePageIsOpened() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    ProfileGeneralUserPage button = new ProfileGeneralUserPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage userFullName = new UsersPage(driver);
    EditProfileUserPage buttonSave = new EditProfileUserPage(driver);

    String email = "cusptestadmin@bkstg.com";
    String error = "User edit profile page is not opened";
    String test = "C39238";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    userFullName.clickFullName();
    button.clickEditButton();

    if (buttonSave.SaveButtonIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  /*@Test *//*C39017*//*

  public void ResetPasswordIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage reset = new ProfileGeneralUserPage(driver);

    String error = "Reset password button is not shown in profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (reset.ResetPasswordIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39017 completed");
  }*/

//Other user profile
  /*@Test *//*C39018*//*

  public void DisableButtonIsDisplayed(){

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralUserPage disableButton =  new ProfileGeneralUserPage(driver);

    String error = "Disable button is not shown in profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (disableButton.DisableButtonIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39018 completed");
  }*/

  @Test /*C39239*/

  public void ForgotPasswordPageWithPrepopulatedEmailIsOpened() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    ProfileGeneralUserPage button = new ProfileGeneralUserPage(driver);
    ProfileGeneralUserPage userEmail = new ProfileGeneralUserPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage userFullName = new UsersPage(driver);
    ForgotPasswordPage field = new ForgotPasswordPage(driver);

    String email = "cusptestadmin@bkstg.com";
    String error = "Either the Reset password page wasn't opened or the email address was not prepopulated on the reset password page";
    String test = "C39239";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    userFullName.clickFullName();

    String email1 = userEmail.getUserEmail();
    button.clickResetPassButton();
    String email2 = field.getUserEmail();

    if (email1.equals(email2)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39240*/(priority = 1)

  public void AccountIsDisabled() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    ProfileGeneralUserPage button = new ProfileGeneralUserPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage status = new UsersPage(driver);
    UsersPage userFullName = new UsersPage(driver);

    String email = "cusptestadmin@bkstg.com";
    String error = "Status is still Enabled on the Users page";
    String test = "C39240";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    userFullName.clickFullName();
    button.clickDisableButton();

    profileIcon.clickMenuIcon(); //check if the status is really disabled on the Users section
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    status.StatusDisabledIsDisplayed();


    if (status.StatusDisabledIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39241*/(priority = 2)

  public void AccountIsEnabled() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    ProfileGeneralUserPage button = new ProfileGeneralUserPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage status = new UsersPage(driver);
    UsersPage userFullName = new UsersPage(driver);

    String email = "cusptestadmin@bkstg.com";
    String error = "Status is still Disabled on the Users page";
    String test = "C39241";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    userFullName.clickFullName();
    button.clickEnableButton();

    profileIcon.clickMenuIcon(); //check if the status is really Enabled on the Users section
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);


    if (status.StatusEnabledIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }
}
