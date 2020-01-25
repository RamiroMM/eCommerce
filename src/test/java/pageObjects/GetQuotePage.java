package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
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
	@FindBy(how = How.XPATH, using = Locators.EMAIL_CHECKBOX)
	WebElement emailCheckbox;
	@FindBy(how = How.XPATH, using = Locators.BUSINESS_NEED_TEXT_FIELD)
	WebElement bussNeedField;
	@FindBy(how = How.XPATH, using = Locators.BUDGET_TEXT_FIELD)
	WebElement budgetField;
	@FindBy(how = How.XPATH, using = Locators.TIMEFRAME_DROPDOWN_BOX)
	WebElement timeFrameBox;
	@FindBy(how = How.XPATH, using = Locators.GET_QUOTE)
	WebElement getQuoteBtn;
	@FindBy(how = How.XPATH, using = Locators.VERIFY_ADDRESS_QUOTE_WARNING)
	WebElement verifyAddWarning;
	@FindBy(how = How.XPATH, using = Locators.QUOTE_SUMMARY_CART_HEADER)
	WebElement quoteSummHeader;
	
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
	
	public void complete_Form() {
		// This complete form function considers those fields that needs completion when the user is already logged in
		// If this function is used when the user has not logged in yet, this will cause a failure
		try {
			// This is to check the email checkbox in the contact section
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(emailCheckbox));
			if (emailCheckbox.isEnabled() && emailCheckbox.isDisplayed()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", emailCheckbox);
				Thread.sleep(1500);
				emailCheckbox.click();
			}
			else {
				System.out.println("Email checkbox is not enabled");
			}
			// This is to complete the information of the solution section
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(bussNeedField));
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(budgetField));
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(timeFrameBox));
			if(bussNeedField.isEnabled() && budgetField.isEnabled() && timeFrameBox.isEnabled()) {
				Thread.sleep(1000);
				bussNeedField.sendKeys("Test");
				Thread.sleep(500);
				budgetField.sendKeys("6500");
				Thread.sleep(500);
				timeFrameBox.click();
			}
			// After remaining mandatory fields are filled, clicking on get quote button
			if(getQuoteBtn.isEnabled()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getQuoteBtn);
				getQuoteBtn.click();
				// After previous actions, a warning should come up to verify the address, since it is correct we click on get quote button again
				new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(verifyAddWarning));
				if(verifyAddWarning.isDisplayed()) {
					Thread.sleep(1500);
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getQuoteBtn);
					Thread.sleep(3000);
					getQuoteBtn.click();
					if (quoteSummHeader.isDisplayed() && quoteSummHeader.isEnabled()) {
						System.out.println("Quote Summary page loaded");
					}
					else {
						while(!quoteSummHeader.isDisplayed()) {
							System.out.println("Loading quote summary page...");
							// wait for the summary page to load
						}
					}
				}
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}

}
