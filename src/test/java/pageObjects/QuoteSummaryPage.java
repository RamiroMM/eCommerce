package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.util.Locators;

public class QuoteSummaryPage {
	WebDriver driver;
	
	public QuoteSummaryPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how = How.XPATH, using = Locators.QUOTESUMM_START_DATE)
	WebElement startDate;
	@FindBy(how = How.XPATH, using = Locators.QUOTESUMM_QUOTE_NUM)
	WebElement quoteNumber;
	@FindBy(how = How.XPATH, using = Locators.QUOTESUMM_CONTACT_NAME)
	WebElement contactName;
	@FindBy(how = How.XPATH, using = Locators.QUOTESUMM_CONTACT_LASTNAME)
	WebElement contactLastName;
	@FindBy(how = How.XPATH, using = Locators.QUOTESUMM_CONTACT_COMPANY)
	WebElement contactCompany;
	@FindBy(how = How.XPATH, using = Locators.QUOTESUMM_CONTACT_PHONE)
	WebElement contactPhoneNum;
	@FindBy(how = How.XPATH, using = Locators.QUOTESUMM_CONTACT_EMAIL)
	WebElement contactEmail;
	@FindBy(how = How.XPATH, using = Locators.QUOTESUMM_CONTACT_ADDRESS)
	WebElement contactAddress;
	@FindBy(how = How.XPATH, using = Locators.QUOTESUMM_CONTACT_CITY)
	WebElement contactCity;
	@FindBy(how = How.XPATH, using = Locators.QUOTESUMM_CONTACT_POSTALCODE)
	WebElement contactPostalCode;
	@FindBy(how = How.XPATH, using = Locators.QUOTESUMM_CONTACT_COUNTRY)
	WebElement contactCountry;

	public boolean isAllDetailsCorrect() {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(startDate));
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(quoteNumber));
			if(startDate.isEnabled() && quoteNumber.isEnabled() && contactName.isEnabled() && contactLastName.isEnabled() &&
					contactCompany.isEnabled() && contactPhoneNum.isEnabled() && contactEmail.isEnabled() && contactAddress.isEnabled() &&
					contactCity.isEnabled() && contactPostalCode.isEnabled() && contactCountry.isEnabled()){
				System.out.println("QUOTE DETAILS:\n");
				System.out.println(startDate.getText());
				System.out.println(quoteNumber.getText());
				System.out.println(contactName.getText());
				System.out.println(contactLastName.getText());
				System.out.println(contactCompany.getText());
				System.out.println(contactPhoneNum.getText());
				System.out.println(contactEmail.getText());
				System.out.println(contactAddress.getText());
				System.out.println(contactCity.getText());
				System.out.println(contactPostalCode.getText());
				System.out.println(contactCountry.getText());
				return true;
			}
			else {
				System.out.println("Else block here...");
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
}
