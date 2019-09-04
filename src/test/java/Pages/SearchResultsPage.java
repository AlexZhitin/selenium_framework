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

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class SearchResultsPage {

  protected WebDriver driver;
  private By resultsTitle = By.xpath("//*[@data-id='videosGridTitle']");

  private By defaultGridView = By.xpath("//*[@data-id='defaultGridView']");
  private By listView = By.xpath("//*[@data-id='listView']");
  private By changeToListViewBtn = By.xpath("//*[@data-id='changeToListViewBtn']");
  private By videos = By.xpath("//*[@data-id='videos']//*[@data-id='video']//*[@data-id='clipVideo']");
  private By video = By.xpath("(//*[@data-id='videos']//*[@data-id='video']//*[@data-id='clipVideo'])[1]");
  private By videoTitle = By.xpath("(//*[@data-id='videoTitle'])[1]");
  private By videoTime = By.xpath("(//*[@data-id='videoPublishedDate'])[1]");
  private By bookmarkIcon = By.xpath("//*[@data-id='bookmarkIcon']");
  private By toastBookmarkSuccess = By.xpath("//*[@class='Toastify__close-button Toastify__close-button--success']");
  private By toastBookmarkSuccessClose = By.xpath("//button[@class='Toastify__close-button Toastify__close-button--success']");
  private By bookmarkIconLast = By.xpath("(//*[name()='svg'][contains(@data-id,'bookmarkIcon')])[last()]");//selects last available bookmark

  public SearchResultsPage(WebDriver driver) {
    this.driver = driver;
  }

  public boolean ResultsTitle() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement results = driver.findElement(resultsTitle);
    return results.isDisplayed();
  }

  public int VideosCount() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    List<WebElement> aggregatedVideosList = driver.findElements(videos);
    return aggregatedVideosList.size();
  }

  public void clickChangeViewBtn() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement aggregatedChangeViewBtn = driver.findElement(changeToListViewBtn);
    aggregatedChangeViewBtn.click();

  }

  public boolean DefaultView() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement aggregatedView = driver.findElement(defaultGridView);
    return aggregatedView.isDisplayed();
  }

  public boolean ChangedView() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement aggregatedRowView = driver.findElement(listView);
    return aggregatedRowView.isDisplayed();
  }

  public boolean SearchPageVideoDescription() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement description = driver.findElement(videoTitle);
      return description.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public String SearchPageVideoDescriptionText() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement description = driver.findElement(videoTitle);
      return description.getText();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return "Fail";
    }
  }

  public boolean SearchPageVideoTime() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement time = driver.findElement(videoTime);
      return time.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void VideoHover(String browserType) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(video));
      WebElement videoBox = driver.findElement(video);

      if (browserType.equals("safari")) {
        String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(mouseOverScript, video);
      } else {
        Actions action = new Actions(driver);
        action.moveToElement(videoBox).build().perform();
      }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean SearchResultsBookmark() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement bookmark = driver.findElement(bookmarkIcon);
      return bookmark.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void BookmarkMultipleVideos(String browserType) {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(videos));
      List<WebElement> videosList = driver.findElements(videos);
      java.util.Iterator<WebElement> i = videosList.iterator();
      while (i.hasNext()) {
        WebElement element = i.next();

        if (browserType.equals("safari")) {
          String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
          JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript(mouseOverScript, element);
        } else {
          Actions action = new Actions(driver);
          action.moveToElement(element).build().perform();
        }

        WebElement bookmark = driver.findElement(bookmarkIconLast);
        bookmark.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastBookmarkSuccess));
        WebElement close = driver.findElement(toastBookmarkSuccessClose);
        close.click();
      }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }
}



