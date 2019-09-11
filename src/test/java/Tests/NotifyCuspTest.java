package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Common_pages.Toast;
import Common_pages.Utilities;
import Pages.NotifyCusp;
import Pages.SignInPage;
import Pages.TopBar.TopBarSection;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NotifyCuspTest extends TestBase{
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        this.driver = getDriver();
    }

    @Test /*C39253*/

    public void FullNameFieldIsDisplayed(){

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection notifyOption = new TopBarSection(driver);
        NotifyCusp dialog = new NotifyCusp(driver);

        String error = "Notify CUSP dialog is not shown on click of the Notify Cusp";
        String test = "Testcase C39253";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        notifyOption.clickNotifyOption();

        if (dialog.NotifyCuspDialogIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39254*/

    public void TitleCantContainMoreThan100Symbols() {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection notifyOption = new TopBarSection(driver);
        NotifyCusp errorTitle = new NotifyCusp(driver);
        NotifyCusp field = new NotifyCusp(driver);
        Utilities text = new Utilities(driver);
        NotifyCusp button = new NotifyCusp(driver);

        String textDescription = "Autotest";
        String error = "Notification was sent with the title containing more than 100 symbols. No error was shown.";
        String test = "Testcase C39254";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        notifyOption.clickNotifyOption();
        field.putInTitle(text.StringRandomizer(120));
        field.putInDescription(textDescription);
        button.clickSendButton();

        if (errorTitle.ErrorTitleIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39255*/

    public void SendButtonIsDisabledIfDescriptionIsEmpty() {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection notifyOption = new TopBarSection(driver);
        NotifyCusp field = new NotifyCusp(driver);
        NotifyCusp button = new NotifyCusp(driver);

        String text = "Autotest";
        String error = "Send button is enabled even though the description field is empty";
        String test = "Testcase C39255";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        notifyOption.clickNotifyOption();
        field.putInTitle(text);

        if (button.SendButtonIsDisabled()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39256*/

    public void NotificationCanBeSentWithoutTitle() {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection notifyOption = new TopBarSection(driver);
        NotifyCusp field = new NotifyCusp(driver);
        NotifyCusp button = new NotifyCusp(driver);
        Toast toast = new Toast(driver);

        String text = "Autotest";
        String error = "Notification was not sent.";
        String test = "Testcase C39256";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        notifyOption.clickNotifyOption();
        field.putInDescription(text);
        button.clickSendButton();

        if (toast.SuccessToastIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39257*/

    public void NotificationIsSentWithTitleAndDescription() {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection notifyOption = new TopBarSection(driver);
        NotifyCusp field = new NotifyCusp(driver);
        NotifyCusp button = new NotifyCusp(driver);
        Toast toast = new Toast(driver);

        String text = "Autotest";
        String error = "Notification was not sent.";
        String test = "Testcase C39256";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        notifyOption.clickNotifyOption();
        field.putInDescription(text);
        field.putInTitle(text);
        button.clickSendButton();

        if (toast.SuccessToastIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }
}
