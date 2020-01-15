package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.util.Locators;

import org.junit.Assert;


public class GetQuotePage {
	WebDriver driver;
	
	public GetQuotePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how = How.XPATH, using = Locators.GET_QUOTE_SIGN_IN_BUTTON)
	WebElement signInButton;
	
	public void validate_SignIn_isDisplayed() {
		try {
			new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(signInButton));
			if (signInButton.isDisplayed()) {
				System.out.println("TEST FAILED: Sign In button is displayed");
				Assert.assertTrue(false);
			}
		}
		catch(Exception ex){
			System.out.println("TEST PASSED: Sign In button is NOT displayed");
		}
	}

}
