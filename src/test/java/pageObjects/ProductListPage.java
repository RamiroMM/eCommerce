package pageObjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.util.Locators;

public class ProductListPage {
	WebDriver driver;
	
	public ProductListPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how = How.XPATH, using = Locators.DROPDOWN_PRICE_DESC)
	WebElement sortByPriceDesc;
	@FindBy(how = How.XPATH, using = Locators.PLP_LIST_PRICE)
	WebElement listPrice;
	@FindBy(how = How.XPATH, using = Locators.PLP_VAT_MESSAGE)
	WebElement vatMsg;
	
	public boolean sortby_PriceDesc() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(sortByPriceDesc));
			if(sortByPriceDesc.isEnabled()) {
				sortByPriceDesc.click();
				Thread.sleep(1000);
				return true;
			}
			else {
				System.out.println("Sort By Price Descendent was not found");
				throw new TimeoutException();
			}
		}
		catch(Exception ex) {
			System.out.println("Sort By Price Descendent was not found: " + ex);
			return false;
		}
	}
	
	public boolean verify_Currency(String currency) {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(listPrice));
			if(listPrice.getText().contains(currency)) {
				System.out.println("Currency is correct");
				System.out.println("Actual currency: " + listPrice.getText());
				System.out.println("Expected currency: " + currency);
				return true;
			}
			else {
				System.out.println("Currency is not correct");
				System.out.println("Actual currency: " + listPrice.getText());
				System.out.println("Expected currency: " + currency);
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean verify_VATIncluded() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(vatMsg));
			if(vatMsg.getText()!=null) {
				System.out.println("VAT message included");
				return true;
			}
			else {
				System.out.println("VAT message not included");
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}

}
