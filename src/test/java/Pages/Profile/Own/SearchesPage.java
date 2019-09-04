package Pages.Profile.Own;

import Base.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchesPage {

  protected WebDriver driver;

  private By searchesTab = By.xpath("//*[@data-id='searchesTab']");
  private By presetName = By.xpath("(//*[@data-id='searchName'])[1]");
  private By presetNames = By.xpath("//*[@data-id='searchName']");
  private By buttonEdit = By.xpath("(//*[@data-id='searchesTab']//following::*[@data-id='editButton'])[1]");
  private By buttonDelete = By.xpath("(//*[@data-id='searchesTab']//following::*[@data-id='deleteButton'])[1]");
  private By presetLeagueFilter = By.xpath("(//*[@data-id='presetLeague'])[1]");
  private By presetActionTypeFilter = By.xpath("(//*[@data-id='presetAction'])[1]");
  private By presetGameFilter = By.xpath("(//*[@data-id='presetGames'])[1]");
  private By presetPlayerFilter = By.xpath("(//*[@data-id='presetPlayers'])[1]");
  private By presetTeamFilter = By.xpath("(//*[@data-id='presetTeams'])[1]");
  private By presetDateFilter = By.xpath("(//*[@data-id='presetDate'])[1]");
  private By presetRatingFilter = By.xpath("(//*[@data-id='presetRating'])[1]");
  private By presetClipType = By.xpath("(//*[@data-id='presetClipType'])[1]");
  private By toastSuccess = By.xpath("//*[@class='Toastify__toast Toastify__toast--success']");

  public SearchesPage(WebDriver driver) {
    this.driver = driver;
  }

  public void clickSearchesTab() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.elementToBeClickable(searchesTab));
      WebElement tab = driver.findElement(searchesTab);
      tab.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickButtonEdit() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonEdit));
      WebElement button = driver.findElement(buttonEdit);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public String PresetNameText() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(presetName));
      WebElement name = driver.findElement(presetName);
      return name.getText();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return null;
    }
  }

  public boolean PresetIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(presetName));
      WebElement preset = driver.findElement(presetName);
      return preset.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean PresetLeagueIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(presetLeagueFilter));
      WebElement presetFilter = driver.findElement(presetLeagueFilter);
      return presetFilter.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean PresetActionIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(presetActionTypeFilter));
      WebElement presetFilter = driver.findElement(presetActionTypeFilter);
      return presetFilter.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean PresetGameIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(presetGameFilter));
      WebElement presetFilter = driver.findElement(presetGameFilter);
      return presetFilter.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean PresetPlayerIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(presetPlayerFilter));
      WebElement presetFilter = driver.findElement(presetPlayerFilter);
      return presetFilter.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean PresetTeamIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(presetTeamFilter));
      WebElement presetFilter = driver.findElement(presetTeamFilter);
      return presetFilter.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean PresetDateIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(presetDateFilter));
      WebElement presetFilter = driver.findElement(presetDateFilter);
      return presetFilter.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean PresetRatingIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(presetRatingFilter));
      WebElement presetFilter = driver.findElement(presetRatingFilter);
      return presetFilter.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean PresetClipTypeIsDisplayed() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(presetClipType));
      WebElement presetFilter = driver.findElement(presetClipType);
      return presetFilter.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void clickPresetName() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(presetName));
      WebElement preset = driver.findElement(presetName);
      preset.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickDeletePresetButton() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonDelete));
      WebElement button = driver.findElement(buttonDelete);
      button.click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(toastSuccess));
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public int PresetsCount() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(presetNames));
      List<WebElement> list = driver.findElements(presetNames);
      return list.size();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return 0;
    }
  }

}
