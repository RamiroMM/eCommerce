package stepDefinitions;

import eCommTests.eCommCucumber.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pageObjects.GetQuotePage;
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
        Assert.assertEquals(default_selection, "Relevance");
    }

    @Then("^Name ascending sorting is displayed$")
    public void name_ascending_sorting_is_displayed() throws Throwable {
        
    }

    @Then("^Name descending sorting is displayed$")
    public void name_descending_sorting_is_displayed() throws Throwable {
        
    }

    @And("^User searches for \"([^\"]*)\"$")
    public void user_searches_for_something(String strArg1) throws Throwable {
    	home.search_product(strArg1);
    }

    @And("^User selects sort by name ascending$")
    public void user_selects_sort_by_name_ascending() throws Throwable {
        
    }

    @And("^User selects sort by name descending$")
    public void user_selects_sort_by_name_descending() throws Throwable {
        
    }

}
