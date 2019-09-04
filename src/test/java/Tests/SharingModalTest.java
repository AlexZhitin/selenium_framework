package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.*;
import Pages.Profile.Own.MyVideosPage;
import Pages.TopBar.TopBarSection;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SharingModalTest extends TestBase {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }


  @Test /*C38937*/

  public void SharePopUpDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal sharePopUp = new SharingModal(driver);
    String error = "Share pop up is not shown";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();

    if (sharePopUp.SharePopUpDisplayed()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38937 completed");
  }


  @Test /*C38938*/

  public void SharePopUpTitleDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal sharePopUpTitle = new SharingModal(driver);
    String error = "Share pop up title is not shown or the pop-up is not shown";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();

    if (sharePopUpTitle.SharePopUpTitleDisplayed()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38938 completed");
  }

  @Test /*C38939*/

  public void ShareToCuspBtnDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCusp = new SharingModal(driver);
    String error = "Share to Cusp button is not shown or the pop-up is not shown";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();

    if (shareToCusp.ShareToCuspBtnDisplayed()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38939 completed");
  }

  @Test /*C38952*/

  public void ShareToCuspModalDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal shareToCuspModal = new SharingModal(driver);
    String error = "Share to Cusp modal is not shown after click on the Share to Cusp button";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();


    if (shareToCuspModal.ShareToCuspModalDisplayed()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38952 completed");
  }

  @Test /*C38940*/

  public void ShareToCuspTitleDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal shareToCuspModalTitle = new SharingModal(driver);
    String error = "Share to Cusp title is not shown on the modal window or the modal window is not shown";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();


    if (shareToCuspModalTitle.ShareToCuspModalTitleDisplayed()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38940 completed");
  }

  @Test /*C38941*/

  public void ShareToCuspModalVideoDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal shareToCuspModalVideo = new SharingModal(driver);
    String error = "Video preview is not showing or the share modal is not showing";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();


    if (shareToCuspModalVideo.ShareToCuspModalVideoDisplayed()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38941 completed");
  }

  @Test /*C38942*/

  public void ShareToCuspModalVideoTitleDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal shareToCuspModalVideoTitle = new SharingModal(driver);
    String error = "Video creation time/date is not showing or the share modal is not showing";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();


    if (shareToCuspModalVideoTitle.ShareToCuspModalVideoTitleDisplayed()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38942 completed");
  }

  @Test /*C38943*/

  public void ShareToCuspModalVideoTimeDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal shareToCuspModalVideoTime = new SharingModal(driver);
    String error = "Video creation time/date is not showing or the share modal is not showing";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();


    if (shareToCuspModalVideoTime.ShareToCuspModalVideoTimeDisplayed()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38943 completed");
  }

  @Test /*C38944*/

  public void ShareToCuspModalDescriptionDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal shareToCuspModalDescription = new SharingModal(driver);
    String error = "Description is not showing or the share modal is not showing";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();


    if (shareToCuspModalDescription.ShareToCuspModalDescriptionDisplayed()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38944 completed");
  }

  @Test /*C38945*/

  public void ShareToCuspDescriptionEditable() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal shareToCuspDescriptionEdited = new SharingModal(driver);
    String error = "Description can't be edited or the share modal is not showing";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();


    if (shareToCuspDescriptionEdited.ShareToCuspDescriptionEditable()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38945 completed");
  }

  @Test /*C38946*/ //Calendar need to be added to select a certain game from a league where tags are shown

  public void ShareToCuspModalTagsDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal shareToCuspTags = new SharingModal(driver);
    String error = "Tags are not shown or the share modal is not showing";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();


    if (shareToCuspTags.ShareToCuspModalTagsDisplayed() > 0) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38946 completed");
  }

  @Test /*C38947*/

  public void ShareToCuspModalCancelDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal shareToCuspModalCancel = new SharingModal(driver);
    String error = "Cancel button is not showing or the share modal is not showing";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();


    if (shareToCuspModalCancel.ShareToCuspModalCancelDisplayed()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38947 completed");
  }

  @Test /*C38953*/

  public void clickShareToCuspCancelBtn() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal shareToCuspModalCancelBtn = new SharingModal(driver);
    String error = "Cancel button is still showing, so the sharing modal was not closed";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();
    shareToCuspModalCancelBtn.clickShareToCuspCancelBtn();

    if (shareToCuspModalCancelBtn.ShareToCuspModalCancelDisplayed()) {
      Assert.fail();
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C38953 completed");
  }

  @Test /*C38948*/

  public void PostToCuspBtnDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal postToCuspBtn = new SharingModal(driver);
    String error = "Post to CUSP button is not showing";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();

    if (postToCuspBtn.PostToCuspBtnDisplayed()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C38948 completed");
  }

  @Test

  public void PostToCuspSuccess() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal postToCuspBtn = new SharingModal(driver);
    SharingModal videoDescription = new SharingModal(driver);
    MyVideosPage description = new MyVideosPage(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    SharingModal toastSuccess = new SharingModal(driver);
    SharingModal toastSuccessClose = new SharingModal(driver);

    String error = "Shared post is not shown under MY VIDEOS in Profile";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();

    String text1 = videoDescription.ShareToCuspModalDescriptionText();
    System.out.println(text1);

    postToCuspBtn.clickPostToCusp();

    if (toastSuccess.PostToCuspSuccessToast()) {
      toastSuccessClose.clickSuccessToastClose();
      profileIcon.clickMenuIcon();
      profileOption.clickProfileOption();

    } else {
      System.out.println("No success toast has been shown");
      Assert.fail();
    }

    Thread.sleep(3000);
    driver.navigate().refresh();
    String text2 = description.PostDescriptionText();
    System.out.println(text2);

    if (text2.startsWith(text1)) {
      Assert.assertTrue(true);
    } else {
      Assert.fail();
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
    }
    System.out.println("Test C38954 completed");
  }

  @Test /*C39003*/

  public void PostToCuspSuccessToast() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal postToCuspBtn = new SharingModal(driver);
    SharingModal postToCuspSuccess = new SharingModal(driver);

    String error = "Success toast wasn't shown";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();
    postToCuspBtn.clickPostToCusp();

    if (postToCuspSuccess.PostToCuspSuccessToast()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39003 completed");
  }

  @Test /*C39005*/

  public void ProcessingPopUpDisplayed() {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal postToCuspBtn = new SharingModal(driver);
    SharingModal processingPopUp = new SharingModal(driver);

    String error = "Processing pop-up with a loader is not shown";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();
    postToCuspBtn.clickPostToCusp();

    if (processingPopUp.ProcessingPopUpDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39005 completed");
  }

  @Parameters({"browserType"})
  @Test /*C39062*/

  public void ShareVideoBookmark(String browserType) throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    HomePage leagueVideoDescription = new HomePage(driver);
    ClipDetailsPage shareButton = new ClipDetailsPage(driver);
    SharingModal shareToCuspBtn = new SharingModal(driver);
    SharingModal hover = new SharingModal(driver);
    SharingModal bookmark = new SharingModal(driver);
    String error = "No bookmark icon available on the video on the sharing modal";

    login.LoginGlobalAdmin();
    leagueVideoDescription.clickLeagueSectionVideoDescription();
    shareButton.clickShareBtn();
    shareToCuspBtn.clickShareToCuspBtn();
    hover.VideoHover(browserType);


    if (bookmark.ShareModalBookmark()) {
      Assert.assertTrue(true);
    } else {
      ExtentTestManager.getTest().log(Status.INFO, error);
      System.out.println(error);
      Assert.fail();
    }
    System.out.println("Test C39062 completed");
  }
}