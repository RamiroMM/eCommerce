package pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
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

}
