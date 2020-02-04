package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.util.Locators;

public class StoreFrontHomeHeaderMenu {
	WebDriver driver;
	
	public StoreFrontHomeHeaderMenu(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how = How.XPATH, using = Locators.MY_ACCOUNT_BUTTON)
	WebElement userIcon;
	@FindBy(how = How.XPATH, using = Locators.SEARCH_ICON)
	WebElement searchIcon;
	@FindBy(how = How.XPATH, using = Locators.SEARCH_FIELD)
	WebElement searchField;
	@FindBy(how = How.XPATH, using = Locators.SEARCH_ICON2)
	WebElement searchIcon2;
	@FindBy(how = How.XPATH, using = Locators.SHOP_BUTTON)
	WebElement shopButton;
	@FindBy(how = How.XPATH, using = Locators.ALL_SERVERS_BUTTON)
	WebElement allServersButton;
	@FindBy(how = How.XPATH, using = Locators.SERVERS_PLP_PAGE_HEADER)
	WebElement allServersHeader;
	@FindBy(how = How.XPATH, using = Locators.SEARCH_PAGE_HEADER)
	WebElement searchHeader;
	@FindBy(how = How.XPATH, using = Locators.SIGNIN_INDICATOR)
	WebElement signInIndicator;
	
	public void check_HomePage_isLoaded() {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(userIcon));
			new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(userIcon));
			if (userIcon.isEnabled() && userIcon.isDisplayed()) {
				System.out.println("Header Menu is loaded");
			}
			else {
				System.out.println("Header elements not loaded");
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public void goto_loginPage() throws InterruptedException {
		if (userIcon.isEnabled() && userIcon.isDisplayed()) {
			Thread.sleep(1000);
			userIcon.click();
		}
		else {
			System.out.println("My Account Icon is not present");
		}
	}
	
	public void search_product(String product) {
			try {
				new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(searchIcon));
				if (searchIcon.isDisplayed() && searchIcon.isEnabled()) {
					Thread.sleep(1500);
					searchIcon.click();
					new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(searchField));
					if (searchField.isDisplayed() && searchField.isEnabled()) {
						Thread.sleep(1000);
						searchField.sendKeys(product);
						//Thread.sleep(1000);
						//searchField.sendKeys(Keys.ENTER);
						Thread.sleep(1000);
						searchIcon2.click();
						new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(searchHeader));
						if(searchHeader.isDisplayed()) {
							System.out.println("SRP page loaded");
						}
					}
				}
			}
			catch(Exception ex) {
				System.out.println(ex);
			}
		}
	
	public void open_serverCatalog() {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(shopButton));
			new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(shopButton));
			if (shopButton.isDisplayed() && shopButton.isDisplayed()) {
				shopButton.click();
				Thread.sleep(1500);
				if(allServersButton.isDisplayed() && allServersButton.isEnabled()) {
					allServersButton.click();
					Thread.sleep(1000);
					new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(allServersHeader));
					System.out.println("PLP Page opened");
				}
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}

}
