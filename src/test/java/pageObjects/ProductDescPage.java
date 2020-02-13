package pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.util.Locators;

public class ProductDescPage {
	WebDriver driver;
	
	public ProductDescPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how = How.XPATH, using = Locators.PDP_SERVICES_TAB)
	WebElement servTab;
	@FindBy(how = How.XPATH, using = Locators.FIRST_SERVICE_PRODUCT)
	WebElement firstProd;
	@FindBy(how = How.XPATH, using = Locators.PDP_PRODUCT_HEADER)
	WebElement prodHeader;
	@FindBy(how = How.XPATH, using = Locators.BREADCRUMB)
	List<WebElement> breadcrumbList;
	@FindBy(how = How.XPATH, using = Locators.PDP_QUICKSPEC_OPTIONS)
	List<WebElement> quickspecLink;
	@FindBy(how = How.XPATH, using = Locators.PDP_VAT_MESSAGE)
	WebElement vatMsg;
	@FindBy(how = How.XPATH, using = Locators.PAGE_SIZE_20_ITEMS)
	WebElement pageSize20;
	@FindBy(how = How.XPATH, using = Locators.PAGE_SIZE_100_ITEMS)
	WebElement pageSize100;
	@FindBy(how = How.XPATH, using = Locators.PAGE_SIZE_SELECTOR)
	WebElement pageSizeselector;
	@FindBy(how = How.XPATH, using = Locators.CONFIG_AND_QUOTE_BUTTON)
	WebElement confAndQuoteBtn;
	@FindBy(how = How.XPATH, using = Locators.CONFIGURATION_CAROUSEL)
	WebElement confCarousel;
	@FindBy(how = How.XPATH, using = Locators.FIRST_FILTER_HTMLELEM)
	WebElement firstFacetElem;
	@FindBy(how = How.XPATH, using = Locators.PAGINATION_ARROW)
	WebElement paginationLink;
	@FindBy(how = How.XPATH, using = Locators.PAGINATION_ARROW_PREVIOUS)
	WebElement paginationLinkPrev;
	@FindBy(how = How.XPATH, using = Locators.PDP_OPTIONS_TAB)
	WebElement optionsTab;
	@FindBy(how = How.XPATH, using = Locators.PDP_MODELS_TAB)
	WebElement modelsTab;
	@FindBy(how = How.XPATH, using = Locators.PDP_GETQUOTEBTN1_CAROUSEL)
	WebElement confAndQuoteBtnCar;
	@FindBy(how = How.XPATH, using = Locators.PDP_CAROUSEL_PRICEVALUE)
	WebElement priceVal;
	@FindBy(how = How.XPATH, using = Locators.PDP_CAROUSEL_PRICEVALUE_CHILD)
	WebElement priceValChild;
	
	
	public void click_ServicesTab() {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(servTab));
			if(servTab.isDisplayed()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", servTab);
				Thread.sleep(3000);
				servTab.click();
			}
			else {
				System.out.println("The services link was not found");
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}
	
	public void open_FirstServiceProd() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(firstProd));
			if(firstProd.isDisplayed()) {
				firstProd.click();
				new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(prodHeader));
			}
			else {
				System.out.println("The product link was not found");
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}
	
	public boolean verify_LevelsOfCat() {
		try {
			int counter = 0;
			Iterator<WebElement> itr = breadcrumbList.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next().getText());
				counter++;
			}
			if(counter>=6) {
				System.out.println("Breadcrumb count is: " + counter);
				return true;
			}
			else {
				System.out.println("Breadcrumb count is: " + counter);
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean verify_QuickspecLink() {
		try {
			int counter = 0;
			Iterator<WebElement> itr = quickspecLink.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next().getAttribute("innerHTML"));
				counter++;
			}
			if(counter>=2) {
				System.out.println(counter);
				return true;
			}
			else {
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
	
	public void select20ArticlesPerPage() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(pageSizeselector));
			if (pageSize20.isEnabled()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pageSizeselector);
				Thread.sleep(1500);
				pageSizeselector.click();
				pageSize20.click();
				System.out.println("Clicked on page Size 20 items");
				Thread.sleep(3000);
			}
			else {
				System.out.println("Page size option not found");
				throw new TimeoutException();
			}
		}
		catch(Exception ex){
			System.out.println("Something went wrong: " + ex);
		}
	}
	
	public void click_ConfigAndQuote() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(confAndQuoteBtn));
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(confAndQuoteBtn));
			if (confAndQuoteBtn.isEnabled() && confAndQuoteBtn.isDisplayed()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confAndQuoteBtn);
				Thread.sleep(3000);
				confAndQuoteBtn.click();
				System.out.println("Config and Quote button clicked");
				Thread.sleep(1000);
			}
			else {
				System.out.println("Config and Quote button not found");
				throw new TimeoutException();
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}
	
	public boolean isDisplayed_ConfCarousel() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(confCarousel));
			if(confCarousel.isDisplayed()) {
				System.out.println("Configuration Carousel is displayed");
				return true;
			}
			else {
				System.out.println("Configuration Carousel is NOT displayed");
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Configuration Carousel is NOT displayed. Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean verify_ArticlesPerPage(String strArg1) {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(pageSizeselector));
			if (pageSizeselector.isEnabled()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pageSizeselector);
				Thread.sleep(2500);
				String isSelected = pageSize20.getAttribute("selected");
				if(!isSelected.equals("null") && pageSize20.getText().contains(strArg1)) {
					return true;
				}
				else {
					return false;
				}
				
			}
			else {
				System.out.println("Page size option not found");
				throw new TimeoutException();
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean isDisplayed_FirstFacet() {
		try {
			if(!firstFacetElem.getAttribute("checked").equals("null")) {
				System.out.println("Facet is still displayed");
				return true;
			}
			else {
				System.out.println("Facet is not displayed");
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public void click_NextPage() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(paginationLink));
			if (paginationLink.isEnabled()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", paginationLink);
				Thread.sleep(1500);
				paginationLink.click();
			}
			else {
				System.out.println("Pagination not found");
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}
	
	public void click_PrevPage() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(paginationLinkPrev));
			if (paginationLinkPrev.isEnabled()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", paginationLinkPrev);
				Thread.sleep(1500);
				paginationLinkPrev.click();
			}
			else {
				System.out.println("Pagination not found");
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}
	
	public boolean isDisplayed_ModelAndOptionsTabs() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(optionsTab));
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(modelsTab));
			if(optionsTab.isDisplayed() || modelsTab.isDisplayed()) {
				System.out.println("Tabs were found");
				return true;
			}
			else {
				System.out.println("Tabs were not found");
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Tabs were not found");
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean isLoaded_PDPPage() {
		try {
			new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(prodHeader));
			if(prodHeader.isDisplayed()) {
				System.out.println("Page loaded correctly");
				return true;
			}
			else {
				System.out.println("Page not loaded correctly");
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public void click_CarouselConfigAndQuoteBtn() {
		try {
			new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(confAndQuoteBtnCar));
			if(confAndQuoteBtnCar.isDisplayed()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confAndQuoteBtnCar);
				Thread.sleep(2000);
				confAndQuoteBtnCar.click();
			}
			else {
				System.out.println("Could not find Config and Quote button on carousel");
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}
	
	public boolean verify_PriceAndCurrencyInChannelCentralConf(String currency) {
		try {
			new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(priceVal));
			String price = priceVal.getText();
			String price_child = priceValChild.getText();
			price = price.replace(price_child, "");
			if(price.contains(currency)) {
				System.out.println("Currency displayed");
				price = price.replace(currency, "");
				price = price.replaceAll("\\s+", "");
				if(price != null) {
					System.out.println("Price displayed: " + price);
					return true;
				}
				else {
					System.out.println("Price not displayed");
					return false;
				}
			}
			else {
				System.out.println("Currency not displayed");
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}

}
