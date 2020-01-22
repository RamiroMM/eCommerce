package pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.util.Locators;

public class ResultsPage {
	WebDriver driver;
	Actions actions;
	
	public ResultsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how = How.XPATH, using = Locators.FIRST_PRODUCT_FOUND)
	WebElement productLink;
	@FindBy(how = How.XPATH, using = Locators.PRODUCT_GALLERY_HEADER)
	WebElement resultHeaderText;
	@FindBy(how = How.XPATH, using = Locators.GET_QUOTE_BUTTON)
	WebElement getQuoteButton;
	@FindBy(how = How.XPATH, using = Locators.PAGINATION_ARROW)
	WebElement paginationLink;
	@FindBy(how = How.XPATH, using = Locators.PAGE_SIZE_100_ITEMS)
	WebElement pageSize100;
	@FindBy(how = How.XPATH, using = Locators.PAGE_SIZE_SELECTOR)
	WebElement pageSizeselector;
	@FindBy(how = How.XPATH, using = Locators.DROP_DOWN_SORT_SELECTION)
	WebElement sortBySelection;
	@FindBy(how = How.XPATH, using = Locators.DROPDOWN_NAME_ASC)
	WebElement sortByNameAsc;
	@FindBy(how = How.XPATH, using = Locators.DROPDOWN_NAME_DESC)
	WebElement sortByNameDesc;
	@FindBy(how = How.XPATH, using = Locators.PRODUCTS_LIST_RESULT)
	List<WebElement> productListResult;
	
	public void open_firstResult() {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(productLink));
			if (productLink.isDisplayed()) {
				productLink.click();
				new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(resultHeaderText));
				if (resultHeaderText.isDisplayed()) {
					System.out.println("Product opened successfully");
				}
			}
			else {
				System.out.println("No product was found");
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public void click_GetQuote() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(getQuoteButton));
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(getQuoteButton));
			if (getQuoteButton.isEnabled() && getQuoteButton.isDisplayed()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getQuoteButton);
				Thread.sleep(3000);
				getQuoteButton.click();
			}
			else {
				System.out.println("Get quote button not found");
				throw new TimeoutException();
			}
		}
		catch(Exception ex) {
			try {
				new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(paginationLink));
				if (paginationLink.isEnabled()) {
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", paginationLink);
					Thread.sleep(1500);
					paginationLink.click();
					
					new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(getQuoteButton));
					new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(getQuoteButton));
					if (getQuoteButton.isEnabled() && getQuoteButton.isDisplayed()) {
						((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getQuoteButton);
						Thread.sleep(1500);
						getQuoteButton.click();
					}
					else {
						System.out.println("Get quote button not found");
						throw new TimeoutException();
					}
				}
				else {
					System.out.println("Get quote button not found");
					throw new TimeoutException();
				}
			}
			catch(Exception ex1) {
				System.out.println("Get quote button not found");
				throw new TimeoutException();
			}
		}
		
	}
	
	public String check_sortBy_Selection() {
		String sort_selection;
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(pageSizeselector));
			if (pageSize100.isEnabled()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pageSizeselector);
				Thread.sleep(1500);
				pageSizeselector.click();
				pageSize100.click();
				System.out.println("Clicked on page Size 100 items");
				Thread.sleep(3000);
			}
			else {
				System.out.println("Page size option not found");
				throw new TimeoutException();
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(sortBySelection));
			if (sortBySelection.isEnabled()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sortBySelection);
				Thread.sleep(1000);
				sort_selection = sortBySelection.getAttribute("value");
				return sort_selection;
			}
			else {
				System.out.println("Sort combo box was not found");
				throw new TimeoutException();
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		return null;
	}
	
	public void sortby_NameAsc() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(sortByNameAsc));
			if(sortByNameAsc.isEnabled()) {
				sortByNameAsc.click();
				Thread.sleep(1000);
			}
			else {
				System.out.println("Sort By Name Ascendent was not found");
				throw new TimeoutException();
			}
		}
		catch(Exception ex) {
			System.out.println("Sort By Name Ascendent was not found: " + ex);
		}
	}
	
	public void sortby_NameDesc() {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(sortByNameDesc));
			if(sortByNameDesc.isEnabled()) {
				sortByNameDesc.click();
				Thread.sleep(1000);
			}
			else {
				System.out.println("Sort By Name Descendent was not found");
				throw new TimeoutException();
			}
		}
		catch(Exception ex) {
			System.out.println("Sort By Name Descendent was not found: " + ex);
		}
	}
	
	public boolean isSortNameAsc() {
		try {
			Iterator<WebElement> itr = productListResult.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next().getText());
			}
			
			ArrayList<String> obtainedList = new ArrayList<>(); 
			for(WebElement we:productListResult){
				obtainedList.add(we.getText());
			}
			ArrayList<String> sortedList = new ArrayList<>();   
			for(String s:obtainedList){
				sortedList.add(s);
			}
			obtainedList.replaceAll(String::toUpperCase);
			sortedList.replaceAll(String::toUpperCase);
			Collections.sort(sortedList);
			if(sortedList.equals(obtainedList)) {
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
	
	public boolean isSortNameDesc() {
		try {
			Iterator<WebElement> itr = productListResult.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next().getText());
			}
			
			ArrayList<String> obtainedList = new ArrayList<>(); 
			for(WebElement we:productListResult){
				obtainedList.add(we.getText());
			}
			ArrayList<String> sortedList = new ArrayList<>();   
			for(String s:obtainedList){
				sortedList.add(s);
			}
			obtainedList.replaceAll(String::toUpperCase);
			sortedList.replaceAll(String::toUpperCase);
			Collections.sort(sortedList);
			Collections.reverse(sortedList);
			if(sortedList.equals(obtainedList)) {
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

}
