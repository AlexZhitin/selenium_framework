package Pages;

import Base.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ClipDetailsPage {

  protected WebDriver driver;

  private By clipTitle = By.xpath("//*[@data-id='clipTitle']");
  private By clipVideo = By.xpath("//*[@data-id='topBar']//following::*[@data-id='clipVideo']");
  private By clipDescription = By.xpath("//*[@data-id='topBar']//following::*[@data-id='clipDescription']");
  private By clipHashtag = By.xpath("//*[@data-id='topBar']//following::*[@data-id='clipHashtags']");
  private By clipEditBtn = By.xpath("//*[@data-id='clipEditBtn']");
  private By clipShareBtn = By.xpath("//*[@data-id='clipShareBtn']");


  private By similarClipsSection = By.xpath("//*[@data-id='similarClipsSection']");
  private By similarClipsEmptyState = By.xpath("//*[@data-id='videosGridNoResults']");
  private By similarClip = By.xpath("(//*[@data-id='similarClipsSection']//following::*[@data-id='clipVideo'])[1]");


  public ClipDetailsPage(WebDriver driver) {
    this.driver = driver;
  }


  public boolean ClipTitleDisplayed() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement title = driver.findElement(clipTitle);
    return title.isDisplayed();
  }

  public boolean ClipVideoDisplayed() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement video = driver.findElement(clipVideo);
    return video.isDisplayed();
  }

  public boolean ClipDescriptionDisplayed() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement description = driver.findElement(clipDescription);
    return description.isDisplayed();
  }

  public boolean ClipHashtagsDisplayed() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement hashtags = driver.findElement(clipHashtag);
    return hashtags.isDisplayed();
  }

  public boolean ClipEditBtnDisplayed() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement edit = driver.findElement(clipEditBtn);
    return edit.isDisplayed();
  }

  public boolean ClipShareBtnDisplayed() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement share = driver.findElement(clipShareBtn);
    return share.isDisplayed();
  }

  public void clickShareBtn() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement share = driver.findElement(clipShareBtn);
      share.click();
    } catch (Throwable e) {
      System.out.println(e);
      System.out.println("Share button wasn't clicked");
    }
  }

  public boolean SimilarClipsSectionDisplayed() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement similarSection = driver.findElement(similarClipsSection);
    return similarSection.isDisplayed();
  }

  public boolean SimilarClipsEmptyState() {
    try {
      WebElement emptyState = driver.findElement(similarClipsEmptyState);
      return emptyState.isDisplayed();
    } catch (Throwable e) {
      System.out.println(e);
      return false;
    }
  }

  public boolean SimilarClips() {
    try {
      WebElement similarVideos = driver.findElement(similarClip);
      return similarVideos.isDisplayed();
    } catch (Throwable e) {
      System.out.println(e);
      return false;
    }
  }
}