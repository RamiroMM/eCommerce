package stepDefinitions;

import eCommTests.eCommCucumber.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.GetQuotePage;
import pageObjects.ResultsPage;
import pageObjects.SignInPage;
import pageObjects.StoreFrontHomeHeaderMenu;
import pageObjects.YourAccountPage;
import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchMetaTag extends BaseDriver{
    public StoreFrontHomeHeaderMenu home = new StoreFrontHomeHeaderMenu(driver);
    public SignInPage signin = new SignInPage(driver);
    public YourAccountPage accpage = new YourAccountPage(driver);
    public ResultsPage result = new ResultsPage(driver);
    public GetQuotePage gquote = new GetQuotePage(driver);
    public String MetaRobot = "<meta name=\"robots\" content=\"index,follow\"/>";
    public String source;
    public String MetaString;


    @Given("^User is on the homepage with (.+)$")
    public void user_is_on_the_homepage_with(String link) throws Throwable {
        driver.navigate().to(link);

    }

    @And("Navigate to PLP-PDP page")
    public void navigateToPage() throws Throwable {
        home.check_HomePage_isLoaded();
        home.search_product("DL160");
        result.open_firstResult();
    }

    @Then("^Search for the robot meta tag name$")
    public void search_for_the_something_name() throws Throwable {
        String source = driver.getPageSource();
        String PatternText = ("robots");
        Pattern patternTag = Pattern.compile(PatternText);
        Matcher SourceMatch = patternTag.matcher(source);

        while (SourceMatch.find()) {
            System.out.println(SourceMatch.group());
        }
    }
}