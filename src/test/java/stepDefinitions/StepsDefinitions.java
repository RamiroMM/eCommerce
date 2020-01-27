package stepDefinitions;

import eCommTests.eCommCucumber.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pageObjects.GetQuotePage;
import pageObjects.QuoteSummaryPage;
import pageObjects.ResultsPage;
import pageObjects.SignInPage;
import pageObjects.StoreFrontHomeHeaderMenu;
import pageObjects.YourAccountPage;

import org.apache.commons.lang.StringUtils;

public class StepsDefinitions extends BaseDriver{
	public StoreFrontHomeHeaderMenu home = new StoreFrontHomeHeaderMenu(driver);
	public SignInPage signin = new SignInPage(driver);
	public YourAccountPage accpage = new YourAccountPage(driver);
	public ResultsPage result = new ResultsPage(driver);
	public GetQuotePage gquote = new GetQuotePage(driver);
	public QuoteSummaryPage summpage = new QuoteSummaryPage(driver);
	
	@Given("^User is on StoreFront homepage with (.+)$")
    public void user_is_on_storefront_homepage_with(String link) throws Throwable {
        driver.navigate().to(link);
        home.check_HomePage_isLoaded();
    }

    @When("^User goes to login page$")
    public void user_goes_to_login_page() throws Throwable {
        home.goto_loginPage();
        signin.check_SignInPage_isLoaded();
    }

    @Then("^SignIn options is not displayed$")
    public void signin_options_is_not_displayed() throws Throwable {
    	gquote.validate_SignIn_isDisplayed();
    }

    @And("^User logins with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_logins_with_something_and_something(String strArg1, String strArg2) throws Throwable {
    	signin.user_Login(strArg1, strArg2);
    	accpage.check_accountPage_isLoaded();
    }

    @And("^User searches and opens \"([^\"]*)\"$")
    public void user_searches_and_opens_something(String strArg1) throws Throwable {
        home.search_product(strArg1);
        result.open_firstResult();
    }

    @And("^User clicks on get quote button$")
    public void user_clicks_on_get_quote_button() throws Throwable {
    	result.click_GetQuote();
    }

    @Then("^Head tag has not \"([^\"]*)\" abbreviations$")
    public void head_tag_has_not_something_abbreviations(String strArg1) throws Throwable {
        String source = driver.getPageSource();
        String head_tag = StringUtils.substringBetween(source, "head", "/head");
        boolean isTextPresent = head_tag.contains(strArg1);
        Assert.assertFalse(isTextPresent);
    }
    
    @Then("^Relevance sorting is selected by default$")
    public void relevance_sorting_is_selected_by_default() throws Throwable {
        String default_selection = result.check_sortBy_Selection();
        //String corrected = default_selection.replaceAll("\\s+", "");
        System.out.println("Default selection: " + default_selection);
        Assert.assertEquals("relevance", default_selection);
    }

    @Then("^Name ascending sorting is displayed$")
    public void name_ascending_sorting_is_displayed() throws Throwable {
        System.out.println("Sorting ascending result is:");
        boolean isSorted = result.isSortNameAsc();
        Assert.assertTrue(isSorted);
    }

    @Then("^Name descending sorting is displayed$")
    public void name_descending_sorting_is_displayed() throws Throwable {
    	System.out.println("Sorting descending result is:");
    	boolean isSorted = result.isSortNameDesc();
        Assert.assertTrue(isSorted);
    }

    @And("^User searches for \"([^\"]*)\"$")
    public void user_searches_for_something(String strArg1) throws Throwable {
    	home.search_product(strArg1);
    }

    @And("^User selects sort by name ascending$")
    public void user_selects_sort_by_name_ascending() throws Throwable {
    	System.out.println("Selecting Sorting ascending...");
    	result.sortby_NameAsc();
    }

    @And("^User selects sort by name descending$")
    public void user_selects_sort_by_name_descending() throws Throwable {
    	System.out.println("Selecting Sorting descending...");
    	result.sortby_NameDesc();
    }
    
    @And("^User logins with (.+) and (.+)$")
    public void user_logins_with_and(String user, String password) throws Throwable {
    	signin.user_Login(user, password);
    	accpage.check_accountPage_isLoaded();
    }
    
    @When("^User goes to Servers Catalog$")
    public void user_goes_to_servers_catalog() throws Throwable {
        home.open_serverCatalog();
    }

    @When("^User completes the quote request form$")
    public void user_completes_the_quote_request_form() throws Throwable {
        gquote.complete_Form();
    }

    @Then("^H1 tag is present$")
    public void h1_tag_is_present() throws Throwable {
    	String source = driver.getPageSource();
    	String html_code = StringUtils.substringBetween(source, "<html", "/html>");
    	boolean isH1TagPresent = html_code.contains("<h1");
        Assert.assertTrue(isH1TagPresent);
    }
    
    @When("^User fills up the form$")
    public void user_fills_up_the_form() throws Throwable {
        gquote.fillUpForm();
    }
    
    @When("^User clicks on get quote$")
    public void user_clicks_on_get_quote() throws Throwable {
        gquote.click_getQuote();
    }

    @Then("^Address suggestion message is displayed$")
    public void address_suggestion_message_is_displayed() throws Throwable {
        Assert.assertTrue(gquote.isAddressSuggestion_Displayed());
    }

    @Then("^Quote details are displayed$")
    public void quote_details_are_displayed() throws Throwable {
        Assert.assertTrue(summpage.isAllDetailsCorrect());
    }

}
