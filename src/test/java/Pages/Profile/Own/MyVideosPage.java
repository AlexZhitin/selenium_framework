package Pages.Profile.Own;

import Base.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyVideosPage {

  protected WebDriver driver;
  private By postDescription = By.xpath("(//*[@data-id='postDescription'])[1]");
  private By postUsername = By.xpath("(//*[@data-id='postUsername'])[1]");
  private By postDate = By.xpath("(//*[@data-id='postDate'])[1]");
  private By postAvatar = By.xpath("(//*[@data-id='postAvatar'])[1]");
  private By postVideoContainer = By.xpath("(//*[@data-id='myVideosTab']//following::*[@data-id='clipVideo'])[1]");
  private By postLikeCount = By.xpath("(//*[@data-id='postLikesCount'])[1]");
  private By postCommentCount = By.xpath("(//*[@data-id='postCommentsCount'])[1]");
  private By postRepostCount = By.xpath("(//*[@data-id='postRepostsCount'])[1]");
  private By posts= By.xpath("//*[@data-id='myVideosTab']//following::*[@data-id='clipVideo']");
  private By postsLoader = By.xpath("//*[@role='progressbar']");



  public MyVideosPage(WebDriver driver) {
    this.driver = driver;
  }

  public String PostDescriptionText() {
    try {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      WebElement description = driver.findElement(postDescription);
      return description.getText();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return "No description found";
    }
  }

  public boolean AvatarIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(postAvatar));
      WebElement avatar = driver.findElement(postAvatar);
      return avatar.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean CreationTimeIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(postDate));
      WebElement time = driver.findElement(postDate);
      return time.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean UsernameIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(postUsername));
      WebElement username = driver.findElement(postUsername);
      return username.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean VideoIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(postVideoContainer));
      WebElement container = driver.findElement(postVideoContainer);
      return container.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean DescriptionIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(postDescription));
      WebElement description = driver.findElement(postDescription);
      return description.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean LikeCountIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(postLikeCount));
      WebElement likeCount = driver.findElement(postLikeCount);
      return likeCount.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean CommentCountIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(postCommentCount));
      WebElement commentCount = driver.findElement(postCommentCount);
      return commentCount.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean RepostCountIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(postRepostCount));
      WebElement repostCount = driver.findElement(postRepostCount);
      return repostCount.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public int PostsCount() {

    try {
      List<WebElement> list = driver.findElements(posts);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(posts));
      return list.size();

    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return 0;
    }
  }

  public boolean PostsLoaderDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(postsLoader));
      WebElement loader = driver.findElement(postsLoader);
      return loader.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }
}
