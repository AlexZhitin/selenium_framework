package Pages;

import Base.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

@Parameters({"browserType"})
public class SharingModal {

  protected WebDriver driver;

  private By sharePopUpTitle = By.xpath("//*[@data-id='sharePopUpTitle']");
  private By sharePopUp = By.xpath("//*[@data-id='sharePopUp']");
  private By shareToCuspBtn = By.xpath("//*[@data-id='shareToCuspBtn']");
  private By shareToCuspModalTitle = By.xpath("//*[@data-id='shareToCuspModalTitle']");
  private By shareToCuspModal = By.xpath("//*[@data-id='shareToCuspModal']");
  private By shareToCuspModalVideo = By.xpath("//*[@data-id='shareToCuspModal']//following::*[@data-id='clipVideo']");
  private By shareToCuspModalVideoTitle = By.xpath("//*[@data-id='shareToCuspModal']//following::*[@data-id='videoTitle']");
  private By shareToCuspModalVideoTime = By.xpath("//*[@data-id='shareToCuspModal']//following::*[@data-id='videoPublishedDate']");
  private By shareToCuspModalDescription = By.xpath("//*[@data-id='shareToCuspModal']//following::textarea[(last())-1]");
  private By shareToCuspModalTags = By.xpath("//div[@data-id='shareToCuspModalTags']/div/div/div");
  private By shareToCuspModalCancel = By.xpath("//*[@data-id='shareToCuspModalCancel']");
  private By postToCuspBtn = By.xpath("//*[@data-id='postToCuspBtn']");
  private By bookmarkIcon = By.xpath("//*[@data-id='bookmarkIcon']");
  private By successToast = By.xpath("//*[@class='Toastify__toast Toastify__toast--success']");
  private By successToastClose = By.xpath("//*[@class='Toastify__close-button Toastify__close-button--success']");
  private By processingPopUp = By.xpath("//*[@data-id='processingPopUp']");


  public SharingModal(WebDriver driver) {
    this.driver = driver;

  }


  public boolean SharePopUpTitleDisplayed() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement title = driver.findElement(sharePopUpTitle);
      return title.isDisplayed();
    } catch (Throwable e) {
      System.out.println(e);
      return false;
    }
  }

  public boolean SharePopUpDisplayed() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement sharepopup = driver.findElement(sharePopUp);
      return sharepopup.isDisplayed();
    } catch (Throwable e) {
      System.out.println(e);
      return false;
    }
  }

  public boolean ShareToCuspBtnDisplayed() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement shareToCusp = driver.findElement(shareToCuspBtn);
      return shareToCusp.isDisplayed();
    } catch (Throwable e) {
      System.out.println(e);
      return false;
    }
  }

  public void clickShareToCuspBtn() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(shareToCuspBtn));
      WebElement shareToCusp = driver.findElement(shareToCuspBtn);
      shareToCusp.click();
    } catch (Throwable e) {
      System.out.println(e);
      System.out.println("Share to CUSP button wasn't clicked");
    }
  }

  public boolean ShareToCuspModalDisplayed() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement modal = driver.findElement(shareToCuspModal);
      return modal.isDisplayed();
    } catch (Throwable e) {
      System.out.println(e);
      return false;
    }
  }

  public boolean ShareToCuspModalTitleDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      WebElement modalTile = driver.findElement(shareToCuspModalTitle);
      wait.until(ExpectedConditions.visibilityOfElementLocated(shareToCuspModalVideoTitle));
      return modalTile.isDisplayed();
    } catch (Throwable e) {
      System.out.println(e);
      return false;
    }
  }

  public boolean ShareToCuspModalVideoDisplayed() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement modalVideo = driver.findElement(shareToCuspModalVideo);
      return modalVideo.isDisplayed();
    } catch (Throwable e) {
      System.out.println(e);
      return false;
    }
  }

  public boolean ShareToCuspModalVideoTitleDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      WebElement modalVideoTitle = driver.findElement(shareToCuspModalVideoTitle);
      wait.until(ExpectedConditions.visibilityOfElementLocated(shareToCuspModalVideoTitle));
      return modalVideoTitle.isDisplayed();
    } catch (Throwable e) {
      System.out.println(e);
      ExtentTestManager.getTest().log(Status.INFO, e);
      return false;
    }
  }

  public boolean ShareToCuspModalVideoTimeDisplayed() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement modalVideoTime = driver.findElement(shareToCuspModalVideoTime);
      return modalVideoTime.isDisplayed();
    } catch (Throwable e) {
      System.out.println(e);
      return false;
    }
  }

  public boolean ShareToCuspModalDescriptionDisplayed() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement modalDescription = driver.findElement(shareToCuspModalDescription);
      return modalDescription.isDisplayed();
    } catch (Throwable e) {
      System.out.println(e);
      return false;
    }
  }

  public String ShareToCuspModalDescriptionText() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement description = driver.findElement(shareToCuspModalDescription);
      String text = description.getText();
      if (text.contains("/")) {
        text = text.substring(0, text.indexOf("/"));
        System.out.println(text);
        return text;
      }
    } catch (Throwable e) {
      System.out.println(e);
      return "No description found";
    }
    return null;
  }

  public boolean ShareToCuspDescriptionEditable() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement modalDescription = driver.findElement(shareToCuspModalDescription);
      modalDescription.sendKeys("test");
      String textAfter = modalDescription.getText();
      return textAfter.contains("test");
    } catch (Throwable e) {
      System.out.println(e);
      return false;
    }
  }

  public int ShareToCuspModalTagsDisplayed() {
    try {
      List<WebElement> tags = driver.findElements(shareToCuspModalTags);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(shareToCuspModalTags));

      return tags.size();
    } catch (Throwable e) {
      System.out.println(e);
      return 0;// 0 will cause false
    }
  }

  public boolean ShareToCuspModalCancelDisplayed() {
    try {
      Thread.sleep(1000);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(shareToCuspModalCancel));
      WebElement modalCancel = driver.findElement(shareToCuspModalCancel);
      return modalCancel.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void clickShareToCuspCancelBtn() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(shareToCuspModalCancel));
      WebElement cancelButton = driver.findElement(shareToCuspModalCancel);
      cancelButton.click();
    } catch (Throwable e) {
      System.out.println(e);
      System.out.println("Cancel button wasn't clicked");
    }
  }

  public boolean PostToCuspBtnDisplayed() {
    try {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
      WebElement modalPost = driver.findElement(postToCuspBtn);
      return modalPost.isDisplayed();
    } catch (Throwable e) {
      System.out.println(e);
      return false;
    }
  }

  public void clickPostToCusp() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement modalPost = driver.findElement(postToCuspBtn);
      modalPost.click();
    } catch (Throwable e) {
      System.out.println(e);
      System.out.println("Post to CUSP button wasn't clicked");
    }
  }

  public boolean PostToCuspSuccessToast() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 180);
      wait.until(ExpectedConditions.visibilityOfElementLocated(successToast));
      WebElement postSuccess = driver.findElement(successToast);
      return postSuccess.isDisplayed();
    } catch (Throwable e) {
      System.out.println(e);
      return false;
    }
  }

  public void clickSuccessToastClose() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement close = driver.findElement(successToastClose);
      close.click();
    } catch (Throwable e) {
      System.out.println(e);
      System.out.println("Close button on success toast after sharing wasn't clicked");
    }
  }

  public boolean ProcessingPopUpDisplayed() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement popUp = driver.findElement(processingPopUp);
      return popUp.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }


  public void VideoHover(String browserType) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(shareToCuspModalVideo));
      WebElement video = driver.findElement(shareToCuspModalVideo);

      if (browserType.equals("safari")) {
        String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(mouseOverScript, video);
      } else {
        Actions action = new Actions(driver);
        action.moveToElement(video).build().perform();
      }

    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }


  public boolean ShareModalBookmark() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfElementLocated(bookmarkIcon));
      WebElement bookmark = driver.findElement(bookmarkIcon);
      return bookmark.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void CutOffString() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfElementLocated(shareToCuspModalVideo));
      WebElement video = driver.findElement(shareToCuspModalVideo);
      Actions action = new Actions(driver);
      action.moveToElement(video).build().perform();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }
}