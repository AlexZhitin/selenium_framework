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

public class AggregatedPage {

  //test
  protected WebDriver driver;

  private By aggregatedTitle = By.xpath("//*[@data-id='videosGridTitle']");
  private By defaultGridView = By.xpath("//*[@data-id='defaultGridView']");
  private By listView = By.xpath("//*[@data-id='listView']");
  private By changeToListViewBtn = By.xpath("//*[@data-id='changeToListViewBtn']");
  private By videos = By.xpath("//*[@data-id='videos']//*[@data-id='video']");
  private By video = By.xpath("(//*[@data-id='videos']//*[@data-id='video'])[1]");
  private By videoTitle = By.xpath("(//*[@data-id='videoTitle'])[1]");
  private By videoTime = By.xpath("(//*[@data-id='videoPublishedDate'])[1]");
  private By bookmarkIcon = By.xpath("//*[@data-id='bookmarkIcon']");


  public AggregatedPage(WebDriver driver) {
    this.driver = driver;
  }

  public boolean AggregatedTitle() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement aggregated = driver.findElement(aggregatedTitle);
      return aggregated.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public int VideosCount() {

    try {
      List<WebElement> aggregatedVideosList = driver.findElements(videos);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(videos));
      return aggregatedVideosList.size();

    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return 1000;
    }
  }

  public void clickChangeViewBtn() {

    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement aggregatedChangeViewBtn = driver.findElement(changeToListViewBtn);
      aggregatedChangeViewBtn.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean DefaultView() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement aggregatedView = driver.findElement(defaultGridView);
      return aggregatedView.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean ChangedView() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement aggregatedRowView = driver.findElement(listView);
      return aggregatedRowView.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean AggregatedVideoDescription() {
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

  public boolean AggregatedVideoTime() {
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

  public boolean AggregatedBookmark() {
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
}


