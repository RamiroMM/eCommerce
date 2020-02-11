package stepDefinitions;

import eCommTests.eCommCucumber.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pageObjects.GetQuotePage;
import pageObjects.ProductDescPage;
import pageObjects.ProductListPage;
import pageObjects.QuoteSummaryPage;
import pageObjects.RegistrationPage;
import pageObjects.ResultsPage;
import pageObjects.SignInPage;
import pageObjects.SourceCodePage;
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
	public SourceCodePage srccode = new SourceCodePage(driver);
	public RegistrationPage regpage = new RegistrationPage(driver);
	public ProductDescPage pdp = new ProductDescPage(driver);
	public ProductListPage plp = new ProductListPage(driver);
	
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
    
    @Then("^Head tag has (.+)$")
    public void head_tag_has(String title) throws Throwable {
    	Assert.assertTrue(srccode.verifyHeadTagTitle(title));
    }
    
    @Then("^Canonical URL is displayed in source$")
    public void canonical_url_is_displayed_in_source() throws Throwable {
        Assert.assertTrue(srccode.isDisplayed_CanonicalLink());
    }
    
    @Then("^Social meta tags are displayed$")
    public void social_meta_tags_are_displayed() throws Throwable {
        Assert.assertTrue(srccode.isDisplayed_SocialMetaTags());
    }
    
    @Then("^Strong tags are not displayed$")
    public void strong_tags_are_not_displayed() throws Throwable {
        Assert.assertFalse(srccode.isDisplayed_StrongTags());
    }
    
    @Then("^Logo alt tag has \"([^\"]*)\"$")
    public void logo_alt_tag_has_something(String strArg1) throws Throwable {
        Assert.assertTrue(srccode.isDisplayed_HPELogoAltTag(strArg1));
    }

    @Then("^Logo link points to (.+)$")
    public void logo_link_points_to(String link) throws Throwable {
        Assert.assertTrue(srccode.verify_LogoLink(link));
    }
    
    @Then("^Basic canonical (.+) is displayed in source$")
    public void basic_canonical_is_displayed_in_source(String link) throws Throwable {
        Assert.assertTrue(srccode.isContained_CanonicalURL(link));
    }
    
    @Then("^PLP URL matches the right format (.+)$")
    public void plp_url_matches_the_right_format(String link) throws Throwable {
    	Assert.assertTrue(srccode.check_PLPURL(link));
    }
    
    @Then("^URL contains (.+)$")
    public void url_contains(String code) throws Throwable {
        Assert.assertTrue(srccode.isDisplayed_CountryAndLangCode(code));
    }
    
    @When("^User goes to registration page$")
    public void user_goes_to_registration_page() throws Throwable {
        signin.click_CreateAccount();
    }

    @When("^User completes registration (.+) (.+) (.+)$")
    public void user_completes_registration(String address, String city, String zip) throws Throwable {
        regpage.default_Registration(address, city, zip);
    }

    @Then("^URL does not contain capital letters or underscores$")
    public void url_does_not_contain_capital_letters() throws Throwable {
        Assert.assertFalse(srccode.isDisplayed_CapitalLettersAndUnderscoreinURL());
    }
    
    @Then("^Green SignIn Indicator is displayed$")
    public void green_signin_indicator_is_displayed() throws Throwable {
        Assert.assertTrue(home.isDisplayed_SignInIndicator());
    }
    
    @When("^User complete registration with existing mail id (.+) (.+) (.+)$")
    public void user_complete_registration_with_existing_mail_id(String address, String city, String zip) throws Throwable {
        regpage.default_Registration_ExistingMailID(address, city, zip);
    }

    @Then("^Error is displayed for existing user IDs$")
    public void error_is_displayed_for_existing_user_ids() throws Throwable {
        Assert.assertTrue(regpage.isDisplayed_RegistrationError());
    }

    @Then("^(.+) and (.+) are displayed in sourcecode$")
    public void and_are_displayed_in_sourcecode(String countrycode, String lang) throws Throwable {
        Assert.assertTrue(srccode.verify_MetaTagCountry(countrycode));
        Assert.assertTrue(srccode.verify_MetaTagLang(lang));
    }
    
    @When("^User clicks on services tab$")
    public void user_clicks_on_services_tab() throws Throwable {
        pdp.click_ServicesTab();
    }

    @Then("^Breadcrumb of the page has four level of categorization$")
    public void breadcrumb_of_the_page_has_four_level_of_categorization() throws Throwable {
        Assert.assertTrue(pdp.verify_LevelsOfCat());
    }

    @And("^User opens first services product$")
    public void user_opens_first_services_product() throws Throwable {
        pdp.open_FirstServiceProd();
    }
    
    @Then("^Sourcecode contains only one h1 tag$")
    public void sourcecode_contains_only_one_h1_tag() throws Throwable {
        Assert.assertTrue(srccode.count_H1Tags());
    }
    
    @Then("^Quickspec link is displayed with download options$")
    public void quickspec_link_is_displayed_with_download_options() throws Throwable {
        Assert.assertTrue(pdp.verify_QuickspecLink());
    }
    
    @Then("^Verify that hyphens can be used in the URL$")
    public void verify_that_hyphens_can_be_used_in_the_url() throws Throwable {
    	Assert.assertTrue(srccode.verify_HyphensInURL());
    }
    
    @Then("^Verify that stop words are not in URL$")
    public void verify_that_stop_words_are_not_in_url() throws Throwable {
        Assert.assertFalse(srccode.verify_StopWordsInURL());
    }
    
    @Then("^List Price is displayed for countries (.+)$")
    public void list_price_is_displayed_for_countries(String withprice) throws Throwable {
        if(withprice.equals("yes")) {
        	System.out.println("Country with Price");
        	Assert.assertTrue(plp.sortby_PriceDesc());
        }
        if(withprice.equals("no")) {
        	System.out.println("Country without Price");
        	Assert.assertFalse(plp.sortby_PriceDesc());
        }
    }

    @Then("^(.+) is displayed according to country$")
    public void is_displayed_according_to_country(String currency) throws Throwable {
        if(!currency.equals("N/A")) {
        	Assert.assertTrue(plp.verify_Currency(currency));
        }
        if(currency.equals("N/A")) {
        	System.out.println("Country without price");
        }
    }
    
    @When("^User goes to MicroServers Catalog$")
    public void user_goes_to_microservers_catalog() throws Throwable {
        home.open_microServerCatalog();
    }

    @When("^User opens first result$")
    public void user_opens_first_result() throws Throwable {
    	result.open_firstResult();
    }

    @Then("^VAT is displayed in PLP for countries (.+)$")
    public void vat_is_displayed_in_plp_for_countries(String withprice) throws Throwable {
    	if(withprice.equals("yes")) {
        	System.out.println("Country with Price");
        	Assert.assertTrue(plp.verify_VATIncluded());
        }
        if(withprice.equals("no")) {
        	System.out.println("Country without Price");
        	Assert.assertFalse(plp.verify_VATIncluded());
        }
    }

    @Then("^VAT is displayed in PDP for countries (.+)$")
    public void vat_is_displayed_in_pdp_for_countries(String withprice) throws Throwable {
    	if(withprice.equals("yes")) {
        	System.out.println("Country with Price");
        	Assert.assertTrue(pdp.verify_VATIncluded());
        }
        if(withprice.equals("no")) {
        	System.out.println("Country without Price");
        	Assert.assertFalse(pdp.verify_VATIncluded());
        }
    }

    @Then("^VAT is displayed in Summary Page for countries (.+)$")
    public void vat_is_displayed_in_summary_page_for_countries(String withprice) throws Throwable {
        // Need to check if Price should be in Quote Summary Page
    }
    
    @When("^User clicks on Config and Quote button$")
    public void user_clicks_on_config_and_quote_button() throws Throwable {
        pdp.click_ConfigAndQuote();
    }

    @Then("^Channel central config is displayed$")
    public void channel_central_config_is_displayed() throws Throwable {
        Assert.assertTrue(pdp.isDisplayed_ConfCarousel());
    }

    @And("^User selects twenty articles per page$")
    public void user_selects_twenty_articles_per_page() throws Throwable {
        pdp.select20ArticlesPerPage();
    }

    @And("^Articles per page is \"([^\"]*)\"$")
    public void articles_per_page_is_something(String strArg1) throws Throwable {
        Assert.assertTrue(pdp.verify_ArticlesPerPage(strArg1));
    }
    
    @When("^User selects first processor filter$")
    public void user_selects_first_processor_filter() throws Throwable {
        plp.click_2CPUFilter();
    }

    @Then("^URL is not modified after deselecting the facets$")
    public void url_is_not_modified_after_deselecting_the_facets() throws Throwable {
        Assert.assertFalse(plp.isModified_BaseURL());
    }

    @And("^User removes filter$")
    public void user_removes_filter() throws Throwable {
        plp.click_ClearFacets();
    }
    
    @When("^User selects first filter$")
    public void user_selects_first_filter() throws Throwable {
        result.click_FirstFacet();
    }
    
    @Then("^SRP URL is not modified after removing facets$")
    public void srp_url_is_not_modified_after_removing_facets() throws Throwable {
        Assert.assertFalse(result.isModified_BaseURL());
    }
    
    @Then("^Robot metatag content is \"([^\"]*)\"$")
    public void robot_metatag_content_is_something(String strArg1) throws Throwable {
        Assert.assertTrue(srccode.verify_RobotMetatag(strArg1));
    }
    
    @Then("^URL displays canonical link plus \"([^\"]*)\"$")
    public void url_displays_canonical_link_plus_something(String strArg1) throws Throwable {
        Assert.assertTrue(plp.verify_FilteredURL(strArg1));
    }
    
    @Then("^Selected facet result is displayed$")
    public void selected_facet_result_is_displayed() throws Throwable {
        Assert.assertTrue(pdp.isDisplayed_FirstFacet()); 
    }

}
