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
	@FindBy(how = How.XPATH, using = Locators.CPU_FILTER_2)
	WebElement cpuFilter2;
	@FindBy(how = How.XPATH, using = Locators.LINK_TAG)
	WebElement linkTag;
	@FindBy(how = How.XPATH, using = Locators.CLEAR_FACET_BUTTON)
	WebElement clearFacet;
	
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
	
	public void click_2CPUFilter() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(cpuFilter2));
			if(cpuFilter2.isDisplayed()) {
				cpuFilter2.click();
				Thread.sleep(3000);
			}
			else {
				System.out.println("Filter was not found: Processors 2");
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}
	
	public void click_ClearFacets() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(clearFacet));
			if(clearFacet.isDisplayed() && clearFacet.isEnabled()) {
				clearFacet.click();
				Thread.sleep(1500);
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}
	
	public boolean isModified_BaseURL() {
		try {
			String canonical = linkTag.getAttribute("href");
			String url = driver.getCurrentUrl();
			if(url.equals(canonical+"?q=") || canonical.equals(url)) {
				System.out.println("URL is not modified");
				return false;
			}
			else {
				System.out.println("URL is modified");
				return true;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return true;
		}
	}

}
