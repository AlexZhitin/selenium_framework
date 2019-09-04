package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.AddUserPage;
import Pages.Profile.Own.EditProfileOwnPage;
import Pages.Profile.Own.ProfileGeneralPageOwn;
import Pages.Profile.User.EditProfileUserPage;
import Pages.Profile.User.ProfileGeneralUserPage;
import Pages.SignInPage;
import Pages.TopBar.TopBarSection;
import Pages.UsersPage;
import Tests.Profile.User.EditProfileUserTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PermissionsTest extends TestBase {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = getDriver();
    }

    @Test /*C39741*/

    public void UsersSectionIsNotAvailableForInfluencer() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        String error = "Users section is available for Influencer";
        String test = "Testcase C39741";


        login.LoginInfluencer();
        Thread.sleep(2000);
        driver.navigate().refresh();
        menu.clickMenuIcon();

        if (usersOption.UsersOptionDisplayed()) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39742*/

    public void InfluencerCanEditOwnProfile() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection profileOption = new TopBarSection(driver);
        ProfileGeneralPageOwn buttonEdit = new ProfileGeneralPageOwn(driver);
        EditProfileOwnPage buttonSave = new EditProfileOwnPage(driver);

        String error = "Influencer can't edit own profile";
        String test = "Testcase C39742";


        login.LoginInfluencer();
        menu.clickMenuIcon();
        profileOption.clickProfileOption();
        buttonEdit.clickEditButton();


        if (buttonSave.SaveButtonIsDisabled()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39758*/

    public void GlobalAdminCanEditOwnProfile() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection profileOption = new TopBarSection(driver);
        ProfileGeneralPageOwn buttonEdit = new ProfileGeneralPageOwn(driver);
        EditProfileOwnPage buttonSave = new EditProfileOwnPage(driver);

        String error = "Global Admin can edit own profile";
        String test = "Testcase C39758";


        login.LoginGlobalAdmin();
        menu.clickMenuIcon();
        profileOption.clickProfileOption();
        buttonEdit.clickEditButton();


        if (buttonSave.SaveButtonIsDisabled()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39749*/

    public void AdminCanEditOwnProfile() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection profileOption = new TopBarSection(driver);
        ProfileGeneralPageOwn buttonEdit = new ProfileGeneralPageOwn(driver);
        EditProfileOwnPage buttonSave = new EditProfileOwnPage(driver);

        String error = "Admin can't edit own profile";
        String test = "Testcase C39749";


        login.LoginAdmin();
        menu.clickMenuIcon();
        profileOption.clickProfileOption();
        buttonEdit.clickEditButton();


        if (buttonSave.SaveButtonIsDisabled()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39748*/

    public void UsersSectionIsAvailableForAdmin() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);


        String error = "Admin doesn't have access to Users section";
        String test = "Testcase C39748";


        login.LoginAdmin();
        menu.clickMenuIcon();


        if (usersOption.UsersOptionDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39757*/

    public void UsersSectionIsAvailableForGlobalAdmin() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);


        String error = "Global Admin doesn't have access to Users section";
        String test = "Testcase C39757";


        login.LoginGlobalAdmin();
        menu.clickMenuIcon();


        if (usersOption.UsersOptionDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39750*/

    public void AdminCanEditInfluencerProfile() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage user = new UsersPage(driver);
        EditProfileUserPage buttonSave = new EditProfileUserPage(driver);

        String error = "Admin can't edit Influencer's profile";
        String test = "Testcase C39750";
        String email = "cusptestinfluencer@bkstg.com";


        login.LoginAdmin();
        menu.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        user.clickEdit();


        if (buttonSave.SaveButtonIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39759*/

    public void GlobalAdminCanEditInfluencerProfile() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage user = new UsersPage(driver);
        EditProfileUserPage buttonSave = new EditProfileUserPage(driver);

        String error = "Global Admin can't edit Influencer's profile";
        String test = "Testcase C39759";
        String email = "cusptestinfluencer@bkstg.com";


        login.LoginGlobalAdmin();
        menu.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);
        user.clickEdit();


        if (buttonSave.SaveButtonIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39754*/

    public void AdminCantEditAdminProfile() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage user = new UsersPage(driver);
        ProfileGeneralUserPage button = new ProfileGeneralUserPage(driver);

        String error = "Admin can edit Admin profile";
        String test = "Testcase C39754";


        login.LoginAdmin();
        menu.clickMenuIcon();
        usersOption.clickUsersOption();
        search.clickRoleColumnLabel();
        user.clickFullName();

        if (button.EditButtonIsDisplayed()) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39760*/

    public void GlobalAdminCanEditAdminProfile() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage user = new UsersPage(driver);
        ProfileGeneralUserPage button = new ProfileGeneralUserPage(driver);

        String error = "Global Admin can't edit Admin profile";
        String test = "Testcase C39760";


        login.LoginGlobalAdmin();
        menu.clickMenuIcon();
        usersOption.clickUsersOption();
        search.clickRoleColumnLabel();
        user.clickFullName();

        if (button.EditButtonIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39761*/

    public void GlobalAdminCantEditGlobalAdminProfile() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage user = new UsersPage(driver);
        ProfileGeneralUserPage button = new ProfileGeneralUserPage(driver);

        String error = "Global Admin can edit Global Admin profile";
        String test = "Testcase C39761";
        String searchItem = "cusp_global_admin";


        login.LoginGlobalAdmin();
        menu.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(searchItem);
        user.clickFullName();

        if (button.EditButtonIsDisplayed()) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39751*/

    public void AdminCanSeeInfluencersInUsersSection() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage user = new UsersPage(driver);
        EditProfileUserPage buttonSave = new EditProfileUserPage(driver);

        String error = "Admin can't see Influencers in Users section";
        String test = "Testcase C39751";
        String email = "cusptestinfluencer@bkstg.com";


        login.LoginAdmin();
        menu.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);

        if (user.EmailIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39762*/

    public void GlobalAdminCanSeeAdminsInUsersSection() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage user = new UsersPage(driver);
        EditProfileUserPage buttonSave = new EditProfileUserPage(driver);

        String error = "Global admin can't see Admins in Users section";
        String test = "Testcase C39762";
        String email = "cusptestadmin@bkstg.com";


        login.LoginGlobalAdmin();
        menu.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);

        if (user.EmailIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39763*/

    public void GlobalAdminCanSeeGlobalAdminsInUsersSection() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage user = new UsersPage(driver);
        EditProfileUserPage buttonSave = new EditProfileUserPage(driver);

        String error = "Global admin can't see global admins in Users section";
        String test = "Testcase C39763";
        String email = "cusptestglobaladmin@bkstg.com";


        login.LoginGlobalAdmin();
        menu.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);

        if (user.EmailIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39765*/

    public void GlobalAdminCanSeeInfluencersInUsersSection() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage user = new UsersPage(driver);

        String error = "Global admin can't see influencers in Users section";
        String test = "Testcase C39765";
        String email = "cusptestinfluencer@bkstg.com";


        login.LoginGlobalAdmin();
        menu.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);

        if (user.EmailIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39752, C39755*/

    public void AdminCanSeeAdminsInUsersSection() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage user = new UsersPage(driver);

        String error = "Admin can't see Admins in Users section";
        String test = "Testcase C39752, C39755";
        String email = "cusptestadmin@bkstg.com";


        login.LoginAdmin();
        menu.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);

        if (user.EmailIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39756*/

    public void AdminCantSeeGlobalAdminsInUsersSection() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        UsersPage search = new UsersPage(driver);
        UsersPage user = new UsersPage(driver);

        String error = "Admin can't see Global Admins in Users section";
        String test = "Testcase C39756";
        String email = "cusptestglobaladmin@bkstg.com";


        login.LoginAdmin();
        menu.clickMenuIcon();
        usersOption.clickUsersOption();
        search.SearchUserByEmail(email);

        if (user.EmailIsDisplayed()) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39753*/

    public void AdminCanAddInfluencer() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        AddUserPage selector = new AddUserPage(driver);
        UsersPage button = new UsersPage(driver);

        String error = "Admin can't add Influencer";
        String test = "Testcase C39753";


        login.LoginAdmin();
        menu.clickMenuIcon();
        usersOption.clickUsersOption();
        button.clickAddUser();

        if (selector.PermissionsSelectorIsDisplayed() && !selector.RoleSelectorIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39766, C39767*/

    public void GlobalAdminCanAddInfluencer() {

        SignInPage login = new SignInPage(driver);
        TopBarSection menu = new TopBarSection(driver);
        TopBarSection usersOption = new TopBarSection(driver);
        AddUserPage selector = new AddUserPage(driver);
        UsersPage button = new UsersPage(driver);

        String error = "Global Admin can't add Influencer";
        String test = "Testcase C39766, C39767";


        login.LoginGlobalAdmin();
        menu.clickMenuIcon();
        usersOption.clickUsersOption();
        button.clickAddUser();

        if (selector.PermissionsSelectorIsDisplayed() && selector.RoleSelectorIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }


}
