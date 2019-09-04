package Tests.Profile.Own;

import Base.ExtentTestManager;
import Base.TestBase;
import Pages.FiltersBar;
import Pages.Profile.Own.SearchesPage;
import Pages.SignInPage;
import Pages.TopBar.TopBarSection;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchesPageTest extends TestBase {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = getDriver();
    }

    @Test /*C39267*/

    public void SelectedFiltersDisplayedOnPreset() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        FiltersBar filterLeague = new FiltersBar(driver);
        FiltersBar filterTeam = new FiltersBar(driver);
        FiltersBar filterGame = new FiltersBar(driver);
        FiltersBar filterPlayer = new FiltersBar(driver);
        FiltersBar filterAction = new FiltersBar(driver);
        FiltersBar filterDate = new FiltersBar(driver);
        FiltersBar filterMoreFilters = new FiltersBar(driver);
        FiltersBar button = new FiltersBar(driver);
        FiltersBar searchName = new FiltersBar(driver);
        FiltersBar toast = new FiltersBar(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection profileOption = new TopBarSection(driver);
        SearchesPage tab = new SearchesPage(driver);
        SearchesPage presetFilter = new SearchesPage(driver);

        String date = "20/April 2019";
        String leagueName = "Serie A";
        String rating = "3";
        String clipType = "PlayByPlay";

        String error = "One or more filters are not shown on the preset in Searches";
        String test = "Testcase C39267";

        login.LoginGlobalAdmin();
        filterLeague.clickLeagueFilter();
        Thread.sleep(1000);
        filterLeague.InputAndSelectLeague(leagueName);
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
        filterDate.clickDateFilter();
        Thread.sleep(1000);
        filterDate.SelectDate(date);
        button.clickApplyButton();
        filterMoreFilters.clickMoreFilters();
        filterMoreFilters.selectRating(rating);
        filterMoreFilters.selectClipType(clipType);
        button.clickSaveSearch();
        searchName.PresetNameInput(searchName.StringRandomizer(3));
        button.clickSave();
        toast.clickToastClose();
        profileIcon.clickMenuIcon();
        profileOption.clickProfileOption();
        tab.clickSearchesTab();


        if (presetFilter.PresetLeagueIsDisplayed()
                && presetFilter.PresetActionIsDisplayed()
                && presetFilter.PresetGameIsDisplayed()
                && presetFilter.PresetPlayerIsDisplayed()
                && presetFilter.PresetTeamIsDisplayed()
                && presetFilter.PresetDateIsDisplayed()
                && presetFilter.PresetRatingIsDisplayed()
                && presetFilter.PresetClipTypeIsDisplayed()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
        ;
    }

    @Test /*C39268*/

    public void SearchPageIsOpenedWithFiltersSetUp() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        FiltersBar filterLeague = new FiltersBar(driver);
        FiltersBar filterTeam = new FiltersBar(driver);
        FiltersBar filterGame = new FiltersBar(driver);
        FiltersBar filterPlayer = new FiltersBar(driver);
        FiltersBar filterAction = new FiltersBar(driver);
        FiltersBar filterDate = new FiltersBar(driver);
        FiltersBar filterMoreFilters = new FiltersBar(driver);
        FiltersBar button = new FiltersBar(driver);
        FiltersBar searchName = new FiltersBar(driver);
        FiltersBar toast = new FiltersBar(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection profileOption = new TopBarSection(driver);
        SearchesPage tab = new SearchesPage(driver);
        SearchesPage presetName = new SearchesPage(driver);
        FiltersBar badge = new FiltersBar(driver);

        String date = "20/April 2019";
        String leagueName = "Serie A";
        String rating = "3";
        String clipType = "PlayByPlay";

        String error = "Either the search page is not opened or some of the filters are not set up";
        String test = "Testcase C39268";

        login.LoginGlobalAdmin();
        filterLeague.clickLeagueFilter();
        Thread.sleep(1000);
        filterLeague.InputAndSelectLeague(leagueName);
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
        filterDate.clickDateFilter();
        Thread.sleep(1000);
        filterDate.SelectDate(date);
        button.clickApplyButton();
        filterMoreFilters.clickMoreFilters();
        filterMoreFilters.selectRating(rating);
        filterMoreFilters.selectClipType(clipType);
        button.clickSaveSearch();
        searchName.PresetNameInput(searchName.StringRandomizer(3));
        button.clickSave();
        toast.clickToastClose();
        profileIcon.clickMenuIcon();
        profileOption.clickProfileOption();
        tab.clickSearchesTab();
        presetName.clickPresetName();

//7 is the total amount of badges on all filters when those are set up
        if (badge.FilterBadgesCount() == 7) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39269*/

    public void SearchPageIsOpenedInEditMode() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        FiltersBar filterLeague = new FiltersBar(driver);
        FiltersBar filterTeam = new FiltersBar(driver);
        FiltersBar filterGame = new FiltersBar(driver);
        FiltersBar filterPlayer = new FiltersBar(driver);
        FiltersBar filterAction = new FiltersBar(driver);
        FiltersBar filterDate = new FiltersBar(driver);
        FiltersBar filterMoreFilters = new FiltersBar(driver);
        FiltersBar button = new FiltersBar(driver);
        FiltersBar searchName = new FiltersBar(driver);
        FiltersBar toast = new FiltersBar(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection profileOption = new TopBarSection(driver);
        SearchesPage tab = new SearchesPage(driver);
        SearchesPage buttonEdit = new SearchesPage(driver);
        FiltersBar buttonEditSearch = new FiltersBar(driver);

        String date = "20/April 2019";
        String leagueName = "Serie A";
        String rating = "3";
        String clipType = "PlayByPlay";

        String error = "Search page was not opened in edit mode";
        String test = "Testcase C39269";

        login.LoginGlobalAdmin();
        filterLeague.clickLeagueFilter();
        Thread.sleep(1000);
        filterLeague.InputAndSelectLeague(leagueName);
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
        filterDate.clickDateFilter();
        Thread.sleep(1000);
        filterDate.SelectDate(date);
        button.clickApplyButton();
        filterMoreFilters.clickMoreFilters();
        filterMoreFilters.selectRating(rating);
        filterMoreFilters.selectClipType(clipType);
        button.clickSaveSearch();
        searchName.PresetNameInput(searchName.StringRandomizer(3));
        button.clickSave();
        toast.clickToastClose();
        profileIcon.clickMenuIcon();
        profileOption.clickProfileOption();
        tab.clickSearchesTab();
        buttonEdit.clickButtonEdit();

        if (buttonEditSearch.EditButtonIsDisabled()) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39270*/

    public void PresetIsDeleted() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        FiltersBar filterLeague = new FiltersBar(driver);
        FiltersBar filterTeam = new FiltersBar(driver);
        FiltersBar filterGame = new FiltersBar(driver);
        FiltersBar filterPlayer = new FiltersBar(driver);
        FiltersBar filterAction = new FiltersBar(driver);
        FiltersBar filterDate = new FiltersBar(driver);
        FiltersBar filterMoreFilters = new FiltersBar(driver);
        FiltersBar button = new FiltersBar(driver);
        FiltersBar searchName = new FiltersBar(driver);
        FiltersBar toast = new FiltersBar(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection profileOption = new TopBarSection(driver);
        SearchesPage tab = new SearchesPage(driver);
        SearchesPage buttonDelete = new SearchesPage(driver);
        SearchesPage presetName = new SearchesPage(driver);

        String date = "20/April 2019";
        String leagueName = "Serie A";
        String rating = "3";
        String clipType = "PlayByPlay";

        String error = "Preset was not deleted";
        String test = "Testcase C39270";

        login.LoginGlobalAdmin();
        filterLeague.clickLeagueFilter();
        Thread.sleep(1000);
        filterLeague.InputAndSelectLeague(leagueName);
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
        filterDate.clickDateFilter();
        Thread.sleep(1000);
        filterDate.SelectDate(date);
        button.clickApplyButton();
        filterMoreFilters.clickMoreFilters();
        filterMoreFilters.selectRating(rating);
        filterMoreFilters.selectClipType(clipType);
        button.clickSaveSearch();
        searchName.PresetNameInput(searchName.StringRandomizer(3));
        button.clickSave();
        toast.clickToastClose();
        profileIcon.clickMenuIcon();
        profileOption.clickProfileOption();
        tab.clickSearchesTab();

        String searchNameBeforeDeletion = presetName.PresetNameText();
        buttonDelete.clickDeletePresetButton();
        String searchNameAfterDeletion = presetName.PresetNameText();


        if (searchNameBeforeDeletion.equals(searchNameAfterDeletion)) {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        } else {
            Assert.assertTrue(true);
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }

    @Test /*C39271*/

    public void SearchesPagination() throws InterruptedException {

        SignInPage login = new SignInPage(driver);
        TopBarSection profileIcon = new TopBarSection(driver);
        TopBarSection profileOption = new TopBarSection(driver);
        SearchesPage tab = new SearchesPage(driver);
        SearchesPage presetName = new SearchesPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String error = "Pagination didn't work.";
        String test = "Testcase C39271";

        login.LoginGlobalAdmin();
        profileIcon.clickMenuIcon();
        profileOption.clickProfileOption();
        tab.clickSearchesTab();

        int countBefore = presetName.PresetsCount();
        js.executeScript("window.scrollBy(0,10000)");
        Thread.sleep(3000);
        int countAfter = presetName.PresetsCount();

        if (countAfter>countBefore) {
            Assert.assertTrue(true);
        } else {
            System.out.println(error);
            ExtentTestManager.getTest().log(Status.INFO, error);
            Assert.fail();
        }
        ExtentTestManager.getTest().log(Status.INFO, test);
    }
}