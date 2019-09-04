package Pages.Profile.Own;

import Base.ExtentTestManager;
import Pages.HomePage;
import Pages.SignInPage;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ClipsPage {

  protected WebDriver driver;

  private By clipsTab = By.xpath("//*[@data-id='clipsTab']");
  private By clipsVideoTitle = By.xpath("(//*[@data-id='videoTitle'])[1]");
  private By deleteButton = By.xpath("//*[@data-id='deleteButton']");
  private By deleteButtonFirstVideo = By.xpath("(//*[@data-id='deleteButton'])[1]"); //locator for the delete button of the very first video
  private By editButton = By.xpath("//*[@data-id='editButton']");
  private By emptyState = By.xpath("//*[@data-id='emptyState']");
  private By clipsVideo = By.xpath("//*[@data-id='clipVideo']");
  private By toastBookmarkDeletionSuccess = By.xpath("//*[@class='Toastify__toast Toastify__toast--success']");
  private By clipsVideoDate = By.xpath("(//span[@data-id='videoPublishedDate'])[1]");
  private By bookmarkIcon = By.xpath("//*[@data-id='bookmarkIcon']");
  private By clipsLoader = By.xpath("//*[@role='progressbar']");


  public ClipsPage(WebDriver driver) {
    this.driver = driver;
  }

  public void clickClipsTab() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(clipsTab));
      WebElement clips = driver.findElement(clipsTab);
      clips.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public String ClipsVideoDescriptionText() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(clipsVideoTitle));
      WebElement title = driver.findElement(clipsVideoTitle);
      return title.getAttribute("title");
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return "No title found";
    }
  }

  public boolean ClipsDeleteBtnDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(deleteButton));
      WebElement deleteBtn = driver.findElement(deleteButton);
      return deleteBtn.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void clickDeleteBtn() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(deleteButton));
      WebElement delete = driver.findElement(deleteButton);
      delete.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean ClipsEmptyStateDisplayed() {

    try {
      Thread.sleep(1000);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(emptyState));
      WebElement empty = driver.findElement(emptyState);
      return empty.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ClipsVideoDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(clipsVideo));
      WebElement video = driver.findElement(clipsVideo);
      return video.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean BookmarkDeletionSuccessToast() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(toastBookmarkDeletionSuccess));
      WebElement toast = driver.findElement(toastBookmarkDeletionSuccess);
      return toast.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ClipsVideoTitleDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(clipsVideoTitle));
      WebElement videoTitle = driver.findElement(clipsVideoTitle);
      return videoTitle.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ClipsVideoDateDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(clipsVideoDate));
      WebElement videoDate = driver.findElement(clipsVideoDate);
      return videoDate.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ClipsVideoBookmarkDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(bookmarkIcon));
      WebElement bookmark = driver.findElement(bookmarkIcon);
      return bookmark.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public int ClipsVideosCount() {

    try {
      List<WebElement> list = driver.findElements(clipsVideo);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(clipsVideo));
      return list.size();

    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return 0;
    }
  }

  public boolean ClipsLoaderDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(clipsLoader));
      WebElement loader = driver.findElement(clipsLoader);
      return loader.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void clickVideoTitle() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(clipsVideoTitle));
      WebElement title = driver.findElement(clipsVideoTitle);
      title.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void deleteAllBookmarkedVideos(String browserType) {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,-3000)");

      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(deleteButton));
      List<WebElement> videosList = driver.findElements(deleteButton);
      java.util.Iterator<WebElement> i = videosList.iterator();
      while (i.hasNext()) {
        WebElement element = i.next();

        if (browserType.equals("safari")) {
          String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
          js.executeScript(mouseOverScript, element);
        } else {
          Actions action = new Actions(driver);
          action.moveToElement(element).build().perform();
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteButtonFirstVideo));
        WebElement delete = driver.findElement(deleteButtonFirstVideo);
        delete.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(toastBookmarkDeletionSuccess));
        WebElement close = driver.findElement(toastBookmarkDeletionSuccess);
        close.click();
      }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

}

