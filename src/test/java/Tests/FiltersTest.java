package Tests;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.FiltersBar;
import Pages.Profile.Own.SearchesPage;
import Pages.SearchResultsPage;
import Pages.SignInPage;
import Pages.TopBar.TopBarSection;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FiltersTest extends TestBase {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = getDriver();
  }

  @Test /*C38923*/

  public void LeagueFilterIsDisplayedEnabled() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);

    String error = "Filter league is either not shown or shown, but disabled ";

    login.LoginGlobalAdmin();

    if (filterLeague.LeagueFilterIsDisplayedEnabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38923 completed");
  }

  @Test /*C38869*/

  public void TeamFilterIsDisplayedDisabled() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterTeam = new FiltersBar(driver);

    String error = "Team filter is either not shown or shown, but enabled.";

    login.LoginGlobalAdmin();

    if (filterTeam.TeamFilterIsDisplayedDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38869 completed");
  }

  @Test /*C38868*/

  public void GameFilterIsDisplayedDisabled() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterGame = new FiltersBar(driver);

    String error = "Game filter is either not shown or shown, but enabled.";

    login.LoginGlobalAdmin();

    if (filterGame.GameFilterIsDisplayedDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38868 completed");
  }

  @Test /*C38870*/

  public void PlayerFilterIsDisplayedDisabled() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterPlayer = new FiltersBar(driver);

    String error = "Player filter is either not shown or shown, but enabled.";

    login.LoginGlobalAdmin();

    if (filterPlayer.PlayerFilterIsDisplayedDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38870 completed");
  }

  @Test /*C38924*/

  public void ActionFilterIsDisplayedDisabled() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterAction = new FiltersBar(driver);

    String error = "Action filter is either not shown or shown, but enabled.";

    login.LoginGlobalAdmin();

    if (filterAction.ActionFilterIsDisplayedDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38924 completed");
  }

  @Test /*C39065*/

  public void DateFilterIsDisplayedDisabled() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterDate = new FiltersBar(driver);

    String error = "Date filter is either not shown or shown, but enabled.";

    login.LoginGlobalAdmin();

    if (filterDate.DateFilterIsDisplayedDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39065 completed");
  }

  @Test /*C39066*/

  public void MoreFilterIsDisplayedDisabled() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterMore = new FiltersBar(driver);

    String error = "More filter is either not shown or shown, but enabled.";

    login.LoginGlobalAdmin();

    if (filterMore.MoreFilterIsDisplayedDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C39066 completed");
  }

  @Test /*C38970*/

  public void AllFiltersEnabled() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterTeam = new FiltersBar(driver);
    FiltersBar filterGame = new FiltersBar(driver);
    FiltersBar filterPlayer = new FiltersBar(driver);
    FiltersBar filterAction = new FiltersBar(driver);
    FiltersBar filterDate = new FiltersBar(driver);
    FiltersBar filterMore = new FiltersBar(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterLeagueOption = new FiltersBar(driver);


    String error = "Either all or some of filters are still disabled";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeagueOption.SelectOptionFromDropdown();

    if (filterTeam.TeamFilterIsDisplayedEnabled()
            && filterGame.GameFilterIsDisplayedEnabled()
            && filterPlayer.PlayerFilterIsDisplayedEnabled()
            && filterAction.ActionFilterIsDisplayedEnabled()
            && filterDate.DateFilterIsDisplayedEnabled()
            && filterMore.MoreFilterIsDisplayedEnabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38970 completed");
  }

  @Test /*C38971*/

  public void LeaguesDropDownIsDisabled() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterLeagueDropdown = new FiltersBar(driver);

    String error = "No league filter dropdown is shown";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();

    if (filterLeagueDropdown.FilterDropdownIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38971 completed");
  }

  @Test /*C38972*/

  public void ItemFoundThroughSearch() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterInput = new FiltersBar(driver);
    FiltersBar foundItem = new FiltersBar(driver);

    String error = "Either 0 or more than 1 options available. Search doesn't work.";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterInput.PutInLeagueName("Serie A");

    if (foundItem.FoundOptionsCount() == 1) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38972 completed");
  }

  @Test /*C38973*/

  public void LeagueSelectedFromList() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar selectLeague = new FiltersBar(driver);
    FiltersBar leagueName = new FiltersBar(driver);

    String error = "League is not selected from dropdown options";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    selectLeague.InputAndSelectLeague("Serie A");

    if (leagueName.SelectedLeagueNameOnFilter().equals("Serie A")) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38973 completed");
  }

  @Test /*C38975*/

  public void DropdownIsClosed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar selectLeague = new FiltersBar(driver);
    FiltersBar dropdown = new FiltersBar(driver);

    String error = "Dropdown still shows up";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    selectLeague.SelectOptionFromDropdown();
    Thread.sleep(2000);

    if (dropdown.FilterDropdownIsDisplayed()) {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    } else {
      Assert.assertTrue(true);
    }
    System.out.println("Test C38975 completed");
  }

  @Test /*C38977*/

  public void NoResultPlaceholderIsDisplayed() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterInput = new FiltersBar(driver);
    FiltersBar placeholder = new FiltersBar(driver);

    String error = "No options placeholder is not shown";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterInput.PutInLeagueName("No such league should be found");

    if (placeholder.NoResultPlaceholderIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38977 completed");
  }

  @Test /*C38979*/ /*C38978*/

  public void SuggestionsScrollPagination() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterPLayer = new FiltersBar(driver);
    FiltersBar suggestionsCount = new FiltersBar(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar selectLeague = new FiltersBar(driver);
    FiltersBar dropdown = new FiltersBar(driver);

    String error = "Pagination for filter dropdown list is not working or scroll is not working";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    selectLeague.SelectOptionFromDropdown();
    filterPLayer.clickPlayerFilter();
    suggestionsCount.FoundOptionsCount();
    System.out.println(suggestionsCount.FoundOptionsCount());
    dropdown.ScrollFilterDropdown();
    Thread.sleep(3000);

    if (suggestionsCount.FoundOptionsCount() == 40) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38979 and C38978 completed");
  }

  @Test /*C38980*/

  public void FiltersDropped() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterTeam = new FiltersBar(driver);
    FiltersBar filterGame = new FiltersBar(driver);
    FiltersBar filterPlayer = new FiltersBar(driver);
    FiltersBar filterAction = new FiltersBar(driver);


    String error = "Filters are not dropped when another league is selected";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    Thread.sleep(1000);
    filterLeague.InputAndSelectLeague("Serie A");
    Thread.sleep(1000);
    filterTeam.clickTeamFilter();
    Thread.sleep(1000);
    filterTeam.SelectOptionFromDropdown();
    Thread.sleep(1000);
    filterGame.clickGameFilter();
    Thread.sleep(1000);
    filterGame.SelectOptionFromDropdown();
    Thread.sleep(1000);
    filterPlayer.clickPlayerFilter();
    Thread.sleep(1000);
    filterPlayer.SelectOptionFromDropdown();
    Thread.sleep(1000);
    filterAction.clickActionFilter();
    Thread.sleep(1000);
    filterAction.SelectOptionFromDropdown();
    Thread.sleep(1000);
    filterLeague.clickOnLeagueFilterSelected();
    Thread.sleep(1000);
    filterLeague.SelectSecondOptionFromDropdown();
    Thread.sleep(1000);

    if (filterTeam.TeamFilterIsDisplayedEnabled()
            && filterGame.GameFilterIsDisplayedEnabled()
            && filterPlayer.PlayerFilterIsDisplayedEnabled()
            && filterAction.ActionFilterIsDisplayedEnabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38980 completed");
  }

  @Test /*C38981*/

  public void ApplyButtonIsEnabledDisplayed() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar button = new FiltersBar(driver);

    String error = "Action filter is either not shown or shown, but enabled.";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.SelectOptionFromDropdown();

    if (button.ApplyButtonIsDisplayedEnabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38981 completed");
  }

  @Test /*C38982*/

  public void ApplyButtonIsDisabledDisplayed() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar button = new FiltersBar(driver);

    String error = "Action filter is either not shown or shown, but enabled.";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.SelectOptionFromDropdown();
    button.clickApplyButton();

    if (button.ApplyButtonIsDisplayedDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38982 completed");
  }

  @Test /*C38983*/

  public void Multiselection() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterPlayer = new FiltersBar(driver);
    FiltersBar multiselectedOptions = new FiltersBar(driver);


    String error = "Multiple selection doesn't work";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.SelectOptionFromDropdown();
    filterPlayer.clickPlayerFilter();
    Thread.sleep(1000);
    filterPlayer.SelectOptionFromDropdown();
    Thread.sleep(1000);
    filterPlayer.SelectSecondOptionFromDropdown();
    Thread.sleep(1000);


    if (multiselectedOptions.MultiSelectedOptionsCount() == 2) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38983 completed");
  }

  @Test /*C38984*/

  public void SelectedItemRemoved() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterPlayer = new FiltersBar(driver);


    String error = "One of multiselected options wasn't removed";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.SelectOptionFromDropdown();
    filterPlayer.clickPlayerFilter();
    Thread.sleep(1000);
    filterPlayer.SelectOptionFromDropdown();
    Thread.sleep(1000);
    filterPlayer.SelectSecondOptionFromDropdown();
    Thread.sleep(1000);
    int countBefore = filterPlayer.MultiSelectedOptionsCount();
    Thread.sleep(1000);
    filterPlayer.RemoveSelectedOption();
    Thread.sleep(1000);
    int countAfter = filterPlayer.MultiSelectedOptionsCount();

    if (countBefore > countAfter) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38984 completed");
  }

  @Test /*C38985*/

  public void SelectedItemsRemoved() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterPlayer = new FiltersBar(driver);


    String error = "Multiselected options were not removed";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.SelectOptionFromDropdown();
    filterPlayer.clickPlayerFilter();
    Thread.sleep(1000);
    filterPlayer.SelectOptionFromDropdown();
    Thread.sleep(1000);
    filterPlayer.SelectSecondOptionFromDropdown();
    Thread.sleep(1000);
    filterPlayer.RemoveSelectedOptions();
    Thread.sleep(1000);
    int countAfter = filterPlayer.MultiSelectedOptionsCount();
    System.out.println(countAfter);

    if (countAfter == 0) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38985 completed");
  }

  @Test /*C38987*/

  public void TeamsDropdownDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterTeam = new FiltersBar(driver);


    String error = "Teams of the selected league are not shown on the dropdown list";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Serie A");//Serie A league is selected
    filterTeam.clickTeamFilter();
    Thread.sleep(1000);


    if (filterTeam.DropdownOptionValue("Atalanta")) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38987 completed");
  }

  @Test /*C38986*/

  public void TeamVideosDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterTeam = new FiltersBar(driver);
    FiltersBar apply = new FiltersBar(driver);
    SearchResultsPage videoTitle = new SearchResultsPage(driver);


    String error = "Videos of the selected team are not displayed";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Serie A");//Serie A league is selected
    filterTeam.clickTeamFilter();
    filterTeam.SelectSpecificDropdownOption("Atalanta");
    apply.clickApplyButton();
    Thread.sleep(1000);


    if (filterTeam.SelectedTeamNameOnFilter().contains("Atalanta") && videoTitle.SearchPageVideoDescriptionText().contains("Atalanta")) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38986 completed");
  }

  @Test /*C38988*/

  public void GamesDropdownDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterGame = new FiltersBar(driver);
    FiltersBar filterTeam = new FiltersBar(driver);


    String error = "Games of the selected league are not shown on the dropdown list";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Serie A");//Serie A league is selected
    Thread.sleep(1000);
    filterTeam.clickTeamFilter();
    filterTeam.SelectSpecificDropdownOption("Atalanta");
    Thread.sleep(3000);
    filterGame.clickGameFilter();
    Thread.sleep(3000);

    if (filterGame.DropdownOptionValue("Atalanta")) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38988 completed");
  }

  @Test /*C38989*/

  public void GameVideosDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterTeam = new FiltersBar(driver);
    FiltersBar filterGame = new FiltersBar(driver);
    FiltersBar apply = new FiltersBar(driver);
    SearchResultsPage videoTitle = new SearchResultsPage(driver);
    String teamName = "Atalanta";


    String error = "Videos of the selected team and game are not shown";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Serie A");//Serie A league is selected
    Thread.sleep(1000);
    filterTeam.clickTeamFilter();
    filterTeam.SelectSpecificDropdownOption(teamName);
    Thread.sleep(3000);
    filterGame.clickGameFilter();
    Thread.sleep(3000);
    filterGame.SelectOptionFromDropdown();
    Thread.sleep(3000);
    apply.clickApplyButton();

    if (filterGame.SelectedGameNameOnFilter().contains(teamName) && videoTitle.SearchPageVideoDescriptionText().contains(teamName)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38989 completed");
  }

  @Test /*C38990*/

  public void PlayersDropdownDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterPlayer = new FiltersBar(driver);
    FiltersBar apply = new FiltersBar(driver);


    String error = "Players of the selected league are not shown on the dropdown list";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Serie A");//Serie A league is selected
    Thread.sleep(1000);
    apply.clickApplyButton();
    Thread.sleep(1000);
    filterPlayer.clickPlayerFilter();
    Thread.sleep(3000);

    if (filterPlayer.DropdownOptionValue("Adam")) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38990 completed");
  }

  @Test /*C38992*/

  public void ActionsDropdownDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterActions = new FiltersBar(driver);
    FiltersBar apply = new FiltersBar(driver);


    String error = "Actions of the selected league are not shown on the dropdown list";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Serie A");//Serie A league is selected
    Thread.sleep(1000);
    apply.clickApplyButton();
    Thread.sleep(1000);
    filterActions.clickActionFilter();
    Thread.sleep(3000);

    if (filterActions.DropdownOptionValue("Cross")) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38992 completed");
  }

  @Test /*C38994*/

  public void DatePickerIsDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterDate = new FiltersBar(driver);


    String error = "Date picker is not shown";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Serie A");//Serie A league is selected
    Thread.sleep(1000);
    filterDate.clickDateFilter();

    if (filterDate.DatePickerIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38994 completed");
  }

  @Test /*C38997*/

  public void MoreFiltersPopUpIsDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterMoreFilters = new FiltersBar(driver);
    FiltersBar moreFiltersPopUp = new FiltersBar(driver);


    String error = "More Filters pop up is not shown";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Serie A");//Serie A league is selected
    Thread.sleep(1000);
    filterMoreFilters.clickMoreFilters();

    if (moreFiltersPopUp.MoreFiltersPopUpIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38997 completed");
  }

  @Test /*C38998*/

  public void RatingRadiogroupIsDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterMoreFilters = new FiltersBar(driver);
    FiltersBar rating = new FiltersBar(driver);


    String error = "Rating radiogroup is not displayed";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Serie A");//Serie A league is selected
    Thread.sleep(1000);
    filterMoreFilters.clickMoreFilters();

    if (rating.RatingRadiogroupIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38998 completed");
  }

  @Test /*C38999*/

  public void ClipTypeRadiogroupIsDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar filterMoreFilters = new FiltersBar(driver);
    FiltersBar clipType = new FiltersBar(driver);


    String error = "Clip type radiogroup is not displayed";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Serie A");//Serie A league is selected
    Thread.sleep(1000);
    filterMoreFilters.clickMoreFilters();

    if (clipType.ClipTypeRadiogroupIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    System.out.println("Test C38999 completed");
  }

  @Test /*C39232*/

  public void SaveButtonIsEnabled() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar button = new FiltersBar(driver);


    String error = "Save search button is enabled";
    String test = "Testcase C39232";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Euroleague");

    if (button.SaveButtonIsEnabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39233*/

  public void ErrorNameIsDisplayed() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar button = new FiltersBar(driver);
    FiltersBar errorMessage = new FiltersBar(driver);


    String error = "No error was shown when saving the preset without a name";
    String test = "Testcase C39233";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Euroleague");
    button.clickSaveSearch();
    button.clickSave();

    if (errorMessage.ErrorNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39258*/

  public void PresetIsCreated() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar button = new FiltersBar(driver);
    FiltersBar input = new FiltersBar(driver);
    FiltersBar toast = new FiltersBar(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    SearchesPage tab = new SearchesPage(driver);
    SearchesPage preset = new SearchesPage(driver);


    String error = "Preset was not created";
    String test = "Testcase C39258";
    String name = input.StringRandomizer(5);

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Euroleague");
    button.clickSaveSearch();
    input.PresetNameInput(name);
    button.clickSave();
    toast.clickToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    tab.clickSearchesTab();

    String name2 = preset.PresetNameText();


    if (name.equals(name2)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39258*/

  public void EditButtonIsDisabled() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar button = new FiltersBar(driver);
    FiltersBar input = new FiltersBar(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    SearchesPage tab = new SearchesPage(driver);
    SearchesPage edit = new SearchesPage(driver);
    FiltersBar toast = new FiltersBar(driver);


    String error = "Edit button is enabled even though no changes to filters have been applied";
    String test = "Testcase C39258";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Euroleague");
    button.clickSaveSearch();
    input.PresetNameInput(input.StringRandomizer(5));
    button.clickSave();
    toast.clickToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    tab.clickSearchesTab();
    edit.clickButtonEdit();

    if (button.EditButtonIsDisabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39261*/

  public void EditButtonIsEnabled() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar button = new FiltersBar(driver);
    FiltersBar input = new FiltersBar(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    SearchesPage tab = new SearchesPage(driver);
    SearchesPage edit = new SearchesPage(driver);
    FiltersBar toast = new FiltersBar(driver);
    FiltersBar filter = new FiltersBar(driver);


    String error = "Edit button is not enabled after changes to filters have been made";
    String test = "Testcase C39261";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Euroleague");
    button.clickSaveSearch();
    input.PresetNameInput(input.StringRandomizer(5));
    button.clickSave();
    toast.clickToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    tab.clickSearchesTab();
    edit.clickButtonEdit();
    filter.clickLeagueFilter();
    filter.InputAndSelectLeague("Serie A");


    if (button.EditButtonIsEnabled()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39262*/

  public void PresetNameIsPrepopulated() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar button = new FiltersBar(driver);
    FiltersBar input = new FiltersBar(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    SearchesPage tab = new SearchesPage(driver);
    SearchesPage edit = new SearchesPage(driver);
    FiltersBar toast = new FiltersBar(driver);
    FiltersBar filter = new FiltersBar(driver);


    String error = "Preset name is not prepopulated on the save preset dialog in edit mode";
    String test = "Testcase C39262";
    String name = input.StringRandomizer(5);

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Euroleague");
    button.clickSaveSearch();
    input.PresetNameInput(name);
    button.clickSave();
    toast.clickToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    tab.clickSearchesTab();
    edit.clickButtonEdit();
    filter.clickLeagueFilter();
    filter.InputAndSelectLeague("Serie A");
    button.clickEditSearchButton();

    String namePrepopulated = input.PresetNamePrepopulated();


    if (name.equals(namePrepopulated)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39263*/

  public void PresetNameIsUpdated() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar button = new FiltersBar(driver);
    FiltersBar input = new FiltersBar(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    SearchesPage tab = new SearchesPage(driver);
    SearchesPage edit = new SearchesPage(driver);
    FiltersBar toast = new FiltersBar(driver);
    FiltersBar filter = new FiltersBar(driver);


    String error = "Preset name wasn't updated";
    String test = "Testcase C39263";
    String presetNameBefore = input.StringRandomizer(5);
    System.out.println(presetNameBefore);

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Euroleague");
    button.clickSaveSearch();
    input.PresetNameInput(presetNameBefore);
    button.clickSave();
    toast.clickToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    tab.clickSearchesTab();
    edit.clickButtonEdit();
    filter.clickLeagueFilter();
    filter.InputAndSelectLeague("Serie A");
    button.clickEditSearchButton();

    String presetNameAfter = input.StringRandomizer(5);
    input.PresetNameInput(presetNameAfter);
    System.out.println(presetNameAfter);
    button.clickSave();


    if (!presetNameBefore.equals(presetNameAfter)) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39264*/

  public void SearchTabIsOpened() throws InterruptedException {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar button = new FiltersBar(driver);
    FiltersBar input = new FiltersBar(driver);
    TopBarSection profileIcon = new TopBarSection(driver);
    TopBarSection profileOption = new TopBarSection(driver);
    SearchesPage tab = new SearchesPage(driver);
    SearchesPage edit = new SearchesPage(driver);
    FiltersBar toast = new FiltersBar(driver);
    FiltersBar filter = new FiltersBar(driver);


    String error = "Searches tab is not opened in profile after the preset was edited";
    String test = "Testcase C39264";
    String presetNameBefore = input.StringRandomizer(5);
    System.out.println(presetNameBefore);

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Euroleague");
    button.clickSaveSearch();
    input.PresetNameInput(presetNameBefore);
    button.clickSave();
    toast.clickToastClose();
    profileIcon.clickMenuIcon();
    profileOption.clickProfileOption();
    tab.clickSearchesTab();
    edit.clickButtonEdit();
    Thread.sleep(3000);
    filter.clickLeagueFilter();
    filter.InputAndSelectLeague("Serie A");
    button.clickEditSearchButton();

    String presetNameAfter = input.StringRandomizer(5);
    input.PresetNameInput(presetNameAfter);
    button.clickSave();

    if (tab.PresetIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39265*/

  public void PresetNameIsLong() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar button = new FiltersBar(driver);
    FiltersBar input = new FiltersBar(driver);
    FiltersBar errorMessage = new FiltersBar(driver);


    String error = "No error message \" Preset name is limited to 64 symbols\" was shown";
    String test = "Testcase C39265";
    String name = input.StringRandomizer(70);

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Euroleague");
    button.clickSaveSearch();
    input.PresetNameInput(name);
    button.clickSave();

    if (errorMessage.ErrorNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }

  @Test /*C39266*/

  public void PresetNameValidation() {

    SignInPage login = new SignInPage(driver);
    FiltersBar filterLeague = new FiltersBar(driver);
    FiltersBar button = new FiltersBar(driver);
    FiltersBar input = new FiltersBar(driver);
    FiltersBar errorMessage = new FiltersBar(driver);


    String error = "No error message \" Allowed characters in name are latin alphabetic, numbers, underscore and hyphen.\" was shown";
    String test = "Testcase C39266";

    login.LoginGlobalAdmin();
    filterLeague.clickLeagueFilter();
    filterLeague.InputAndSelectLeague("Euroleague");
    button.clickSaveSearch();

    input.PresetNameInput("#$%");
    button.clickSave();
    if (errorMessage.ErrorNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);


    input.PresetNameInput("☑️");
    button.clickSave();
    if (errorMessage.ErrorNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);


    input.PresetNameInput("傳");
    button.clickSave();
    if (errorMessage.ErrorNameIsDisplayed()) {
      Assert.assertTrue(true);
    } else {
      System.out.println(error);
      ExtentTestManager.getTest().log(Status.INFO, error);
      Assert.fail();
    }
    ExtentTestManager.getTest().log(Status.INFO, test);
  }
}