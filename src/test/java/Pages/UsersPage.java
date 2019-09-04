package Pages;

import Base.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class UsersPage {

  protected WebDriver driver;

  private By buttonAddUser = By.xpath("//*[@data-id='addUserButton']");
  private By search = By.xpath("//*[@id='search-user-field']");
  private By dialogAddUser = By.xpath("//*[@data-id='addUserDialog']");
  private By labelNameColumn = By.xpath("//*[@data-id='columnNameLabel']");
  private By labelEmailColumn = By.xpath("//*[@data-id='columnEmailLabel']");
  private By labelRoleColumn = By.xpath("//*[@data-id='columnRoleLabel']");
  private By labelPermissionsColumn = By.xpath("//*[@data-id='columnPermissionsLabel']");
  private By labelUsernameColumn = By.xpath("//*[@data-id='columnUsernameLabel']");
  private By userFullName = By.xpath("(//*[@data-id='userName'])[1]");
  private By usersFullName = By.xpath("//*[@data-id='userName']");
  private By userEmail = By.xpath("(//*[@data-id='userEmail'])[1]");
  private By userUsername = By.xpath("(//*[@data-id='userUsername'])[1]");
  private By usersUsername = By.xpath("//*[@data-id='userUsername']");
  private By usersEmail = By.xpath("//*[@data-id='userEmail']");
  private By userRole = By.xpath("(//*[@data-id='userRole'])[1]");
  private By usersRole = By.xpath("//*[@data-id='userRole']");
  private By userPermissions = By.xpath("(//*[@data-id='userPermissions'])[1]");
  private By buttonEdit = By.xpath("//*[@data-id='editLink']");
  private By buttonDisable = By.xpath("(//*[@data-id='buttonEnableDisable'][contains(text(),'disable')])[1]");
  private By buttonEnable = By.xpath("(//*[@data-id='buttonEnableDisable'][contains(text(),'enable')])[1]");
  private By userAccStatusIndicatorEnabled = By.xpath("(//*[@data-id='userStatus'][contains(@class,'active')])[1]");
  private By userAccStatusIndicatorDisabled = By.xpath("(//*[@data-id='userStatus'][contains(@class,'disabled')])[1]");
  private By paginationList = By.xpath("//*[@data-id='paginationList']");
  private By page2 = By.xpath("(//*[@data-id='paginationList']//button)[2]");//page two from the pagination list
  private By tableRow = By.xpath("//*[@data-id='tableRow']");
  private By buttonResetPassword = By.xpath("//*[@data-id='forgotPasswordButton']");
  private By stateEmpty = By.xpath("//*[@class='table-body__no-results']/h3");


  public UsersPage(WebDriver driver) {
    this.driver = driver;
  }

  public boolean AddUserButtonIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonAddUser));
      WebElement button = driver.findElement(buttonAddUser);
      return button.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean AddUserDialogisDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(dialogAddUser));
      WebElement dialog = driver.findElement(dialogAddUser);
      return dialog.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void clickAddUser() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonAddUser));
      WebElement button = driver.findElement(buttonAddUser);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean NameColumnLabelIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(labelNameColumn));
      WebElement label = driver.findElement(labelNameColumn);
      return label.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean UsernameColumnLabelIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(labelUsernameColumn));
      WebElement label = driver.findElement(labelUsernameColumn);
      return label.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean EmailColumnLabelIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(labelEmailColumn));
      WebElement label = driver.findElement(labelEmailColumn);
      return label.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean RoleColumnLabelIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(labelRoleColumn));
      WebElement label = driver.findElement(labelRoleColumn);
      return label.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean PermissionsColumnLabelIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(labelPermissionsColumn));
      WebElement label = driver.findElement(labelPermissionsColumn);
      return label.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean FullNameIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(userFullName));
      WebElement name = driver.findElement(userFullName);
      return name.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean UsernameIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(userUsername));
      WebElement username = driver.findElement(userUsername);
      return username.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean EmailIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(userEmail));
      WebElement email = driver.findElement(userEmail);
      return email.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean RoleIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(userRole));
      WebElement role = driver.findElement(userRole);
      return role.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean UserSpecificRoleIsDisplayed(String input) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(userRole));
      WebElement role = driver.findElement(userRole);
      return role.getText().contains(input);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean UserSpecificPermissionsIsDisplayed(String input) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(userPermissions));
      WebElement permissions = driver.findElement(userPermissions);
      return permissions.getText().contains(input);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }


  public boolean PermissionsIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(userPermissions));
      WebElement permissions = driver.findElement(userPermissions);
      return permissions.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void clickNameColumnLabel() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(labelNameColumn));
      WebElement label = driver.findElement(labelNameColumn);
      label.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickUsernameColumnLabel() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(labelUsernameColumn));
      WebElement label = driver.findElement(labelUsernameColumn);
      label.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickEmailColumnLabel() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(labelEmailColumn));
      WebElement label = driver.findElement(labelEmailColumn);
      label.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickRoleColumnLabel() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(labelRoleColumn));
      WebElement label = driver.findElement(labelRoleColumn);
      label.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public List ListNames() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(usersFullName));
      List listNames = new ArrayList();
      List<WebElement> list = driver.findElements(usersFullName);
      for (WebElement name : list) {
        listNames.add(name.getText());
      }
      System.out.println(listNames);
      return listNames;
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
    return null;
  }

  public List ListUsernames() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(usersUsername));
      List listNames = new ArrayList();
      List<WebElement> list = driver.findElements(usersUsername);
      for (WebElement name : list) {
        listNames.add(name.getText());
      }
      System.out.println(listNames);
      return listNames;
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
    return null;
  }

  public List ListEmails() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(usersEmail));
      List listEmails = new ArrayList();
      List<WebElement> list = driver.findElements(usersEmail);
      for (WebElement email : list) {
        listEmails.add(email.getText());
      }
      System.out.println(listEmails);
      return listEmails;
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
    return null;
  }

  public List ListRoles() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(usersRole));
      List listRoles = new ArrayList();
      List<WebElement> list = driver.findElements(usersRole);
      for (WebElement role : list) {
        listRoles.add(role.getText());
      }
      System.out.println(listRoles);
      return listRoles;
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
    return null;
  }

  public void clickFullName() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(userFullName));
      WebElement name = driver.findElement(userFullName);
      name.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickEdit() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonEdit));
      WebElement edit = driver.findElement(buttonEdit);
      edit.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickDisable() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonDisable));
      WebElement button = driver.findElement(buttonDisable);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void clickEnable() {

    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonEnable));
      WebElement button = driver.findElement(buttonEnable);
      button.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean EnableButtonIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonEnable));
      WebElement button = driver.findElement(buttonEnable);
      return button.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean DisableButtonIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonDisable));
      WebElement button = driver.findElement(buttonDisable);
      return button.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean StatusEnabledIsDisplayed() {
    try {
      Thread.sleep(500);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(userAccStatusIndicatorEnabled));
      WebElement status = driver.findElement(userAccStatusIndicatorEnabled);
      return status.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean StatusDisabledIsDisplayed() {
    try {
      Thread.sleep(500);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(userAccStatusIndicatorDisabled));
      WebElement status = driver.findElement(userAccStatusIndicatorDisabled);
      return status.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean PaginationListIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(paginationList));
      WebElement pagination = driver.findElement(paginationList);
      return pagination.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void clickPageNumber() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(page2));
      WebElement page = driver.findElement(page2);
      page.click();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public int UsersCount() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(tableRow));
      List<WebElement> usersList = driver.findElements(tableRow);
      return usersList.size();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return 100;
    }
  }

  public boolean ResetPasswordButtonIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(buttonResetPassword));
      WebElement button = driver.findElement(buttonResetPassword);
      return button.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean SearchIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(search));
      WebElement searchUser = driver.findElement(search);
      return searchUser.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public void SearchUserByEmail(String input) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(search));
      WebElement page = driver.findElement(search);
      page.sendKeys(input);
      wait.until(ExpectedConditions.textToBe(userEmail, input.toLowerCase()));
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void SearchUserByFirstName(String input) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(search));
      WebElement page = driver.findElement(search);
      page.sendKeys(input);
      WebElement name = driver.findElement(userFullName);
      ExpectedCondition<Boolean> elementTextContainsString = arg0 -> name.getText().contains(input);
      wait.until(elementTextContainsString);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void SearchUserByLastName(String input) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(search));
      WebElement page = driver.findElement(search);
      WebElement name = driver.findElement(userFullName);
      page.sendKeys(input);
      ExpectedCondition<Boolean> elementTextContainsString = arg0 -> name.getText().contains(input);
      wait.until(elementTextContainsString);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public void SearchUserByUsername(String input) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(search));
      WebElement page = driver.findElement(search);
      WebElement name = driver.findElement(userUsername);
      page.sendKeys(input);
      ExpectedCondition<Boolean> elementTextContainsString = arg0 -> name.getText().contains(input);
      wait.until(elementTextContainsString);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
  }

  public boolean UserIsFoundByFirstOrLastName(String input) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(usersFullName));
      List<WebElement> list = driver.findElements(usersFullName);
      for (WebElement name : list)
        if (name.getText().contains(input)) {
          return true;
        } else {
        }
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
    }
    return false;
  }


  public boolean UserIsFoundByUsername(String input) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfElementLocated(userUsername));
      WebElement username = driver.findElement(userUsername);
      return username.getText().contains(input);
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean UserIsFoundByEmail(String input) {
    try {
      Thread.sleep(1000);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(userEmail));
      WebElement email = driver.findElement(userEmail);
      return email.getText().contains(input.toLowerCase());
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }

  public boolean SearchEmptyStateIsDisplayed() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfElementLocated(stateEmpty));
      WebElement state = driver.findElement(stateEmpty);
      return state.isDisplayed();
    } catch (Throwable e) {
      ExtentTestManager.getTest().log(Status.INFO, e);
      System.out.println(e);
      return false;
    }
  }
}