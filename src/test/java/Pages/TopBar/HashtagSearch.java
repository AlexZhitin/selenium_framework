package Pages.TopBar;

import Base.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HashtagSearch {

  protected WebDriver driver;

  private By searchButton = By.xpath("//*[@data-id='searchButton']");
  private By listSuggestions = By.xpath("//*[@data-id='listSuggestions']");
  private By suggestions = By.xpath("//*[@data-id='listSuggestions']//li/div/div/span");
  private By inputField = By.xpath("//*[@id='hashtag-search-input']");
  private By buttonClose = By.xpath("//*[@data-id='hashtagCloseButton']");
  private By emptyState = By.xpath("//*[@data-id='emptyState']");
  private By pageTile = By.xpath("//*[@data-id='videosGridTitle']");
  private By videoTags = By.xpath("(//*[@class='video']//*[@data-id='videoTags'])[1]/a");
  private By videos = By.xpath("//*[@data-id='videos']//*[@data-id='video']//*[@data-id='clipVideo']");

  public HashtagSearch(WebDriver driver) {

    this.driver = driver;
  }

  public void clickSearchButton() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
      WebElement button = driver.findElement(searchButton);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickSuggestion() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(listSuggestions));
      List<WebElement> list = driver.findElements(listSuggestions);
      list.get(0).click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean SuggestionsListIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(listSuggestions));
      WebElement list = driver.findElement(listSuggestions);
      return list.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public int SuggestionsCount() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(suggestions));
      List<WebElement> list = driver.findElements(suggestions);
      return list.size();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return 0;
    }
  }

  public void scrollSuggestionsList() {
    try {
      Thread.sleep(1000);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(listSuggestions));
      JavascriptExecutor je = (JavascriptExecutor) driver;
      je.executeScript("document.querySelector('div.menu-list-container').scrollBy(0, 10000)");
      Thread.sleep(1000);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void inputHashtag(String input) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(inputField));
      WebElement field = driver.findElement(inputField);
      field.sendKeys(input);
      Thread.sleep(2000);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public int CountOfResultsWithSearchedHashtag(String hashtag) {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(suggestions));
      List listNames = new ArrayList();
      List<WebElement> list = driver.findElements(suggestions);
      for (WebElement name : list) {
        listNames.add(name.getText());
      }
      return Collections.frequency(listNames, hashtag);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return 0;
    }
  }


  public void clickClose() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonClose));
      WebElement button = driver.findElement(buttonClose);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean EmptyStateIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(emptyState));
      WebElement state = driver.findElement(emptyState);
      return state.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean PageTitleIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(pageTile));
      WebElement title = driver.findElement(pageTile);
      return title.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public String GetSuggestionText() {//see the index

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(suggestions));
      List<WebElement> list = driver.findElements(suggestions);
      return list.get(0).getText();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return null;
    }
  }

  public String GetInputText() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(inputField));
      WebElement field = driver.findElement(inputField);
      return field.getText();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return null;
    }
  }

  public String GetTitleText() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(pageTile));
      WebElement title = driver.findElement(pageTile);
      return title.getText();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return null;
    }
  }

  public boolean VideoHasVideoTag(String hashtag) {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(videoTags));
      List<WebElement> list = driver.findElements(videoTags);
      for (WebElement i : list)
        if (i.getText().contains(hashtag)) {
          return true;
        } else {
        }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
    return false;
  }

  public void clickHashtag(String hashtag) { //clicks any hashtag which doesn't contain a predefined hashtag
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(videoTags));
      List<WebElement> list = driver.findElements(videoTags);
      for (WebElement i : list)
        if (!i.getText().contains(hashtag)) {
          i.click();
        } else {
        }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickSpecificHashtag(String hashtag) { //clicks specific hashtag
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(videoTags));
      List<WebElement> list = driver.findElements(videoTags);
      for (WebElement i : list)
        if (i.getText().contains(hashtag)) {
          i.click();
        } else {
        }
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(videos));
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public int VideosCount() {

    try {
      List<WebElement> aggregatedVideosList = driver.findElements(videos);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(videos));
      return aggregatedVideosList.size();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return 0;
    }
  }
}