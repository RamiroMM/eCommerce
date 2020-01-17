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

import java.util.List;

public class SearchMetaTag extends BaseDriver{
    public StoreFrontHomeHeaderMenu home = new StoreFrontHomeHeaderMenu(driver);
    public SignInPage signin = new SignInPage(driver);
    public YourAccountPage accpage = new YourAccountPage(driver);
    public ResultsPage result = new ResultsPage(driver);
    public GetQuotePage gquote = new GetQuotePage(driver);



    @Given("^User is on the homepage with (.+)$")
    public void user_is_on_the_homepage_with(String link) throws Throwable {

    }

    @Then("^Search for the \"([^\"]*)\" name$")
    public void search_for_the_something_name(String strArg1) throws Throwable {

    }

    @And("^Navigate to PLP/PDP page$")
    public void navigate_to_plppdp_page() throws Throwable {

    }

    @And("^Get the source code elements$")
    public void get_the_source_code_elements() throws Throwable {

    }

    @And("^verify content is \"([^\"]*)\"$")
    public void verify_content_is_something(List<String> list1) throws Throwable {

    }

    @And("^Verify for checkout pages meta tag is \"([^\"]*)\"$")
    public void verify_for_checkout_pages_is_something(List<String> list1) throws Throwable {

    }

}