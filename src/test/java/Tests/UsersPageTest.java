package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.Profile.Own.EditProfileOwnPage;
import Pages.SignInPage;
import Pages.TopBar.TopBarSection;
import Pages.UsersPage;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class UsersPageTest extends TestBase {

  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C39159*/

  public void NamesOrderChangedDescending() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage listNames = new UsersPage(driver);
    UsersPage labelName = new UsersPage(driver);


    String error = "Names column has not been sorted";
    String test = "Testcase C39159";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    List beforeSorting = listNames.ListNames();
    labelName.clickNameColumnLabel();
    List afterSorting = listNames.ListNames();

    if (beforeSorting.equals(afterSorting)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39198*/

  public void UsernamesOrderChangedDescending() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage listUsernames = new UsersPage(driver);
    UsersPage labelUsername = new UsersPage(driver);


    String error = "Username column has not been sorted";
    String test = "Testcase C39198";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    List beforeSorting = listUsernames.ListUsernames();
    labelUsername.clickUsernameColumnLabel();
    List afterSorting = listUsernames.ListUsernames();

    if (beforeSorting.equals(afterSorting)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39160*/

  public void EmailsOrderChangedDescending() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage listEmails = new UsersPage(driver);
    UsersPage labelEmail = new UsersPage(driver);


    String error = "Emails column has not been sorted";
    String test = "Testcase C39160";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    List beforeSorting = listEmails.ListEmails();
    labelEmail.clickEmailColumnLabel();
    List afterSorting = listEmails.ListEmails();

    if (beforeSorting.equals(afterSorting)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39161*/

  public void RolesOrderChangedDescending() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage listRoles = new UsersPage(driver);
    UsersPage labelRole = new UsersPage(driver);


    String error = "Role column has not been sorted";
    String test = "Testcase C39161";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    List beforeSorting = listRoles.ListRoles();
    labelRole.clickRoleColumnLabel();
    List afterSorting = listRoles.ListRoles();

    if (beforeSorting.equals(afterSorting)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39153*/

  public void AddUserButtonisDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);


    String error = "Add new user button is not displayed";
    String test = "Testcase C39153";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (buttonAddUser.AddUserButtonIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39154*/

  public void AddUserDialogisDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage buttonAddUser = new UsersPage(driver);
    UsersPage dialog = new UsersPage(driver);


    String error = "On click of Add User button the add user dialog was not shown";
    String test = "Testcase C39154";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    buttonAddUser.clickAddUser();

    if (dialog.AddUserDialogisDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39155*/

  public void NameColumnLabelIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage name = new UsersPage(driver);


    String error = "Name column heading is not shown";
    String test = "Testcase C39155";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (name.NameColumnLabelIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39196*/

  public void UsernameColumnLabelIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage username = new UsersPage(driver);


    String error = "Username column heading is not shown";
    String test = "Testcase C39196";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (username.UsernameColumnLabelIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39156*/

  public void EmailColumnLabelIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage email = new UsersPage(driver);


    String error = "Email column heading is not shown";
    String test = "Testcase C39156";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (email.EmailColumnLabelIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39157*/

  public void RoleColumnLabelIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage role = new UsersPage(driver);


    String error = "Role column heading is not shown";
    String test = "Testcase C39157";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (role.RoleColumnLabelIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39158*/

  public void PermissionsColumnLabelIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage permissions = new UsersPage(driver);


    String error = "Permissions column heading is not shown";
    String test = "Testcase C39158";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (permissions.PermissionsColumnLabelIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39168*/

  public void FullNameIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage name = new UsersPage(driver);


    String error = "User full name is not shown under name column";
    String test = "Testcase C39168";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (name.FullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39169*/

  public void EmailIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage email = new UsersPage(driver);


    String error = "User email is not shown under email column";
    String test = "Testcase C39169";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (email.EmailIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39197*/

  public void UsernameIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage username = new UsersPage(driver);


    String error = "Username is not shown under username column";
    String test = "Testcase C39197";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (username.UsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39170*/

  public void RoleIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage role = new UsersPage(driver);


    String error = "User role is not shown under role column";
    String test = "Testcase C39170";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (role.RoleIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39171*/

  public void PermissionsIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage permissions = new UsersPage(driver);


    String error = "User role is not shown under role column";
    String test = "Testcase C39171";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (permissions.PermissionsIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39163*/

  public void UserProfileIsOpened() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage fullName = new UsersPage(driver);
    UsersPage profile = new UsersPage(driver);
    UsersPage search = new UsersPage(driver);
    String email = "cusptestadmin@bkstg.com";

    String error = "User profile has not been opened on click of the user full name";
    String test = "Testcase C39163";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    fullName.clickFullName();

    if (profile.ResetPasswordButtonIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39164*/

  public void EditProfilePageIsOpened() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage editButton = new UsersPage(driver);
    UsersPage search = new UsersPage(driver);
    EditProfileOwnPage saveButton = new EditProfileOwnPage(driver);
    String email = "cusptestadmin@bkstg.com";

    String error = "User profile edit page has not been opened on click of the edit button on the Users page";
    String test = "Testcase C39164";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    editButton.clickEdit();

    if (saveButton.SaveButtonIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39165*/

  public void AccountIsDisabled() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage button = new UsersPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage statusIndicator = new UsersPage(driver);
    String email = "cusptestadmin@bkstg.com";

    String error = "User account has not been disabled on click on Disable button";
    String test = "Testcase C39165";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    button.clickDisable();

    if (statusIndicator.StatusDisabledIsDisplayed() && button.EnableButtonIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39166, C39167*/

  public void AccountIsEnabled() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage button = new UsersPage(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage statusIndicator = new UsersPage(driver);
    String email = "cusptestadmin@bkstg.com";


    String error = "User account has not been enabled on click on Enable button";
    String test = "Testcases C39166, C39167";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);
    button.clickEnable();


    if (statusIndicator.StatusEnabledIsDisplayed() && button.DisableButtonIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39172*/

  public void PageSelectorIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage pageSelector = new UsersPage(driver);
    UsersPage usersList = new UsersPage(driver);


    String error = "Page selector is not available on the bottom of the Users page";
    String skip = "There's less than 20 users, so the page selector is not shown. Test is skipped.";
    String test = "Testcase C39172";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (usersList.UsersCount() < 20) {
      System.out.println(skip);
      ExtentTestManager.getTest().log(Status.INFO, skip);
      throw new SkipException("Skipped");
    } else if (pageSelector.PaginationListIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39173*/

  public void PageIsSelected() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage usersList = new UsersPage(driver);
    UsersPage page = new UsersPage(driver);


    String error = "Page 2 has not been opened";
    String skip = "There's less than 20 users, so the page selector is not shown. Test is skipped.";
    String test = "Testcase C39173";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    List pagePrevious = usersList.ListNames();

    if (usersList.UsersCount() < 20) {
      System.out.println(skip);
      ExtentTestManager.getTest().log(Status.INFO, skip);
      throw new SkipException("Skipped");
    } else {
      page.clickPageNumber();// page 2 is selected
    }

    List pageNext = usersList.ListNames();

    if (pagePrevious.equals(pageNext)) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39193*/

  public void UsersCount() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage usersList = new UsersPage(driver);


    String error = "More than 20 users are shown on one page";
    String skip = "There's less than 20 users on one page. Test is skipped.";
    String test = "Testcase C39193";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (usersList.UsersCount() < 20) {
      System.out.println(skip);
      ExtentTestManager.getTest().log(Status.INFO, skip);
      throw new SkipException("Skipped");
    } else if (usersList.UsersCount() > 20) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39199*/

  public void SearchIsAvailable() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage search = new UsersPage(driver);


    String error = "Search is not available on the Users page";
    String test = "Testcase C39199";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();

    if (search.SearchIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39200*/

  public void UserFoundByFirstName() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage search = new UsersPage(driver);
    String firstName = "FirstName";


    String error = "User was not found by first name";
    String test = "Testcase C39200";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByFirstName(firstName);

    if (search.UserIsFoundByFirstOrLastName(firstName)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39201*/

  public void UserFoundByLastName() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage search = new UsersPage(driver);
    String lastName = "LastName";


    String error = "User was not found by last name";
    String test = "Testcase C39201";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByLastName(lastName);

    if (search.UserIsFoundByFirstOrLastName(lastName)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39203*/

  public void UserFoundByUsername() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage search = new UsersPage(driver);
    String username = "Username";


    String error = "User was not found by username";
    String test = "Testcase C39203";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByUsername(username);

    if (search.UserIsFoundByUsername(username)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39202*/

  public void UserFoundByEmail() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage search = new UsersPage(driver);
    String email = "cusptestadmin@bkstg.com";


    String error = "User was not found by email";
    String test = "Testcase C39202";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);

    if (search.UserIsFoundByEmail(email)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39204*/

  public void SearchEmptyState() {

    SignInPage login = new SignInPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection usersOption = new TopBarSection(driver);
    UsersPage search = new UsersPage(driver);
    UsersPage state = new UsersPage(driver);
    String email = "non-existingemail@blabla.com";


    String error = "Search empty state is not shown";
    String test = "Testcase C39204";


    login.LoginGlobalAdmin();

    profileIcon.clickMenuIcon();
    usersOption.clickUsersOption();
    search.SearchUserByEmail(email);

    if (state.SearchEmptyStateIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }
}
