package Tests.Profile.Own;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.ForgotPasswordPage;
import Pages.Profile.Own.ProfileGeneralPageOwn;
import Pages.SignInPage;
import Pages.TopBar.TopBarSection;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileGeneralOwnTest extends TestBase {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C39006*/

  public void UserAvatarIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn avatar = new ProfileGeneralPageOwn(driver);

    String error = "User avatar is not shown in profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (avatar.UserAvatarIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39006 completed");
  }

  @Test /*C39007*/

  public void UsernameIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn username = new ProfileGeneralPageOwn(driver);

    String error = "Username is not shown in profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (username.UsernameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39007 completed");
  }

  @Test /*C39008*/

  public void FullNameIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn fullName = new ProfileGeneralPageOwn(driver);

    String error = "Full name is not shown in profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (fullName.FullNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39008 completed");
  }

  @Test /*C39009*/

  public void EmailIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn email = new ProfileGeneralPageOwn(driver);

    String error = "Email is not shown in profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (email.EmailIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39008 completed");
  }

  @Test /*C39011*/

  public void BirthdateIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn birthdate = new ProfileGeneralPageOwn(driver);

    String error = "Birthdate is not shown in profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (birthdate.BirthdateIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39011 completed");
  }

  @Test /*C39064*/

  public void LocationIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn location = new ProfileGeneralPageOwn(driver);

    String error = "Location is not shown in profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (location.LocationIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39064 completed");
  }

  @Test /*C39013*/

  public void RoleIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn role = new ProfileGeneralPageOwn(driver);

    String error = "Role is not shown in profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (role.RoleIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39013 completed");
  }

  @Test /*C39016*/

  public void EditButtonIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn edit = new ProfileGeneralPageOwn(driver);

    String error = "Edit button is not shown in profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (edit.EditButtonIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39016 completed");
  }

  /*@Test *//*C39017*//*

  public void ResetPasswordIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn reset = new ProfileGeneralPageOwn(driver);

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
    ProfileGeneralPageOwn disableButton =  new ProfileGeneralPageOwn(driver);

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

  @Test /*C39019*/

  public void MyVideosTabIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn myVideosTab = new ProfileGeneralPageOwn(driver);

    String error = "My videos tab is not shown in profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (myVideosTab.MyVideosTabIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39019 completed");
  }

  @Test /*C39020*/

  public void ClipsTabIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn clipsTab = new ProfileGeneralPageOwn(driver);

    String error = "Clips tab is not shown in profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (clipsTab.ClipsTabIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39020 completed");
  }

  @Test /*C39021*/

  public void SearchesTabIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn searches = new ProfileGeneralPageOwn(driver);

    String error = "Searches tab is not shown in profile";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();

    if (searches.SearchesTabIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39021 completed");
  }

  @Test /*C39242*/

  public void ChangePassDialogIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn button = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn dialog = new ProfileGeneralPageOwn(driver);

    String error = "Change password dialog is not shown on click of Change Password";
    String test = "Testcase C39242";

    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    button.clickChangePassButton();

    if (dialog.ChangePassDialogIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39244*/

  public void ChangeButtonIsDisabled() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn button = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn field = new ProfileGeneralPageOwn(driver);

    String error = "Change button is not disabled if old password being put contains less than 8 symbols";
    String test = "Testcase C39244";
    String passwordOld = "1234567";
    String passwordNew = "12345678";
    String passwordNewRepeat = "12345678";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    button.clickChangePassButton();
    field.OldPasswordInput(passwordOld);
    field.NewPasswordInput(passwordNew);
    field.NewPasswordRepeatInput(passwordNewRepeat);

    if (button.ChangeButtonIsDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39245*/

  public void InvalidOldPassError() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn button = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn field = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn errorMessage = new ProfileGeneralPageOwn(driver);

    String error = "No \"Invalid password\" error is shown";
    String test = "Testcase C39245";
    String passwordOld = "invalid password";
    String passwordNew = "Abcd1234"; //valid password
    String passwordNewRepeat = "Abcd1234"; //valid password


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    button.clickChangePassButton();
    field.OldPasswordInput(passwordOld);
    field.NewPasswordInput(passwordNew);
    field.NewPasswordRepeatInput(passwordNewRepeat);
    button.clickChangeButton();

    if (errorMessage.OldPassErrorIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39246*/

  public void PasswordNewNoMatch() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn button = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn field = new ProfileGeneralPageOwn(driver);

    String error = "Change button is not disabled if new password doesn't match the one being put in new password repeat";
    String test = "Testcase C39246";
    String passwordOld = "Abcd1234";
    String passwordNew = "new password";
    String passwordNewRepeat = "new password no match";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    button.clickChangePassButton();
    field.OldPasswordInput(passwordOld);
    field.NewPasswordInput(passwordNew);
    field.NewPasswordRepeatInput(passwordNewRepeat);

    if (button.ChangeButtonIsDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39247*/

  public void EmptyFieldChangeIsDisabled() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn button = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn field = new ProfileGeneralPageOwn(driver);

    String error = "Change button is not disabled if there's an empty field on the change password dialog";

    String test = "Testcase C39247";
    String passwordOld = "Abcd1234";
    String passwordNew = "new password";
    String passwordNewRepeat = "new password repeat";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    button.clickChangePassButton();

    //empty new password field
    field.NewPasswordInput(passwordNew);
    field.NewPasswordRepeatInput(passwordNewRepeat);

    if (button.ChangeButtonIsDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);


    //empty new password field
    field.OldPasswordInput(passwordOld);
    field.clearNewPassField();

    if (button.ChangeButtonIsDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);


    //empty new password repeat field
    field.NewPasswordInput(passwordNew);
    field.clearNewPassRepeatField();

    if (button.ChangeButtonIsDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39248*/

  public void PasswordChangeSuccess() throws InterruptedException {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn button = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn field = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn toast = new ProfileGeneralPageOwn(driver);

    String error = "Password wasn't changed";
    String test = "Testcase C39248";
    String passwordOld = "Abcd1234";
    String passwordNew = "Abcd1234";
    String passwordNewRepeat = "Abcd1234";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    button.clickChangePassButton();

    field.OldPasswordInput(passwordOld);
    field.NewPasswordInput(passwordNew);
    field.NewPasswordRepeatInput(passwordNewRepeat);


    button.clickChangeButton();

    if (toast.ToastSuccessIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39573*/

  public void ErrorPasswordHas8LowerCaseLetters() throws InterruptedException {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn button = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn field = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn toast = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn errorPopUp = new ProfileGeneralPageOwn(driver);

    String error = "No error is shown if password has 8 lowercase letters";
    String test = "Testcase C39573";
    String passwordOld = "Abcd1234";
    String passwordNew = "abcdefgh";
    String passwordNewRepeat = "abcdefgh";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    button.clickChangePassButton();

    field.OldPasswordInput(passwordOld);
    field.NewPasswordInput(passwordNew);
    field.NewPasswordRepeatInput(passwordNewRepeat);


    button.clickChangeButton();

    if (errorPopUp.NewPassErrorIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39574*/

  public void ErrorPasswordHas8Digits() throws InterruptedException {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn button = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn field = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn errorPopUp = new ProfileGeneralPageOwn(driver);

    String error = "No error is shown if password has 8 digits";
    String test = "Testcase C39574";
    String passwordOld = "Abcd1234";
    String passwordNew = "12345678";
    String passwordNewRepeat = "12345678";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    button.clickChangePassButton();

    field.OldPasswordInput(passwordOld);
    field.NewPasswordInput(passwordNew);
    field.NewPasswordRepeatInput(passwordNewRepeat);


    button.clickChangeButton();

    if (errorPopUp.NewPassErrorIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39575*/

  public void ErrorPasswordHasOneCapitalLetterAndLowercaseLetters() throws InterruptedException {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn button = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn field = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn errorPopUp = new ProfileGeneralPageOwn(driver);

    String error = "No error is shown if password one capital letters and lowercase letters";
    String test = "Testcase C39575";
    String passwordOld = "Abcd1234";
    String passwordNew = "Abcdefgh";
    String passwordNewRepeat = "Abcdefgh";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    button.clickChangePassButton();

    field.OldPasswordInput(passwordOld);
    field.NewPasswordInput(passwordNew);
    field.NewPasswordRepeatInput(passwordNewRepeat);


    button.clickChangeButton();

    if (errorPopUp.NewPassErrorIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39576*/

  public void ErrorPasswordHasSpace() throws InterruptedException {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn button = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn field = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn errorPopUp = new ProfileGeneralPageOwn(driver);

    String error = "No error is shown if password has space";
    String test = "Testcase C39576";
    String passwordOld = "Abcd1234";
    String passwordNew = "Abcd 1234";
    String passwordNewRepeat = "Abcd 1234";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    button.clickChangePassButton();

    field.OldPasswordInput(passwordOld);
    field.NewPasswordInput(passwordNew);
    field.NewPasswordRepeatInput(passwordNewRepeat);


    button.clickChangeButton();

    if (errorPopUp.NewPassErrorIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39577*/

  public void ErrorPasswordHasSpecialSymbols() throws InterruptedException {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn button = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn field = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn errorPopUp = new ProfileGeneralPageOwn(driver);

    String error = "No error is shown if password has special symbols";
    String test = "Testcase C39577";
    String passwordOld = "Abcd1234";
    String passwordNew = "Abcd@#$1234";
    String passwordNewRepeat = "Abcd@#$1234";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    button.clickChangePassButton();

    field.OldPasswordInput(passwordOld);
    field.NewPasswordInput(passwordNew);
    field.NewPasswordRepeatInput(passwordNewRepeat);


    button.clickChangeButton();

    if (errorPopUp.NewPassErrorIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }


  @Test /*C39578*/

  public void ErrorPasswordHasEmoji() throws InterruptedException {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn button = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn field = new ProfileGeneralPageOwn(driver);
    ProfileGeneralPageOwn errorPopUp = new ProfileGeneralPageOwn(driver);

    String error = "No error is shown if password has emojis";
    String test = "Testcase C39578";
    String passwordOld = "Abcd1234";
    String passwordNew = "Abcd☑️1234";
    String passwordNewRepeat = "Abcd☑️1234";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    button.clickChangePassButton();

    field.OldPasswordInput(passwordOld);
    field.NewPasswordInput(passwordNew);
    field.NewPasswordRepeatInput(passwordNewRepeat);


    button.clickChangeButton();

    if (errorPopUp.NewPassErrorIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39249*/

  public void ForgotPassPageIsDisplayed() {

    SignInPage login = new SignInPage(driver);

    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    ProfileGeneralPageOwn button = new ProfileGeneralPageOwn(driver);
    ForgotPasswordPage title = new ForgotPasswordPage(driver);

    String error = "Forgot password page is not opened";
    String test = "Testcase C39249";


    login.LoginGlobalAdmin();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    button.clickChangePassButton();


    button.clickLinkForgotPass();

    if (title.TitleForgotPassIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }
}
