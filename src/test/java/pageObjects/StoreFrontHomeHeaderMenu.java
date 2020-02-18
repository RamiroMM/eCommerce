package pageObjects;

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
	@FindBy(how = How.XPATH, using = Locators.MICRO_SERVERS_BUTTON)
	WebElement microServersButton;
	@FindBy(how = How.XPATH, using = Locators.MICROSERVERS_PLP_PAGE_HEADER)
	WebElement microServersHeader;
	@FindBy(how = How.XPATH, using = Locators.LOGOUT_NOTIFICATION)
	WebElement logoutMsg;
	
	public void check_HomePage_isLoaded() {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(userIcon));
			new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(userIcon));
			if (userIcon.isEnabled() && userIcon.isDisplayed()) {
				System.out.println("Home Page is loaded");
			}
			else {
				System.out.println("Home Page is not loaded");
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
	
	public void open_microServerCatalog() {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(shopButton));
			new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(shopButton));
			if (shopButton.isDisplayed() && shopButton.isDisplayed()) {
				shopButton.click();
				Thread.sleep(1500);
				if(microServersButton.isDisplayed() && microServersButton.isEnabled()) {
					microServersButton.click();
					Thread.sleep(1000);
					new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(microServersHeader));
					System.out.println("PLP Page opened");
				}
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}
	
	public boolean isDisplayed_SignInIndicator() {
		try {
			if(signInIndicator.getText()!=null && !signInIndicator.getText().isEmpty()) {
				System.out.println("SignIn Indicator is displayed");
				return true;
			}
			else {
				System.out.println("SignIn Indicator is NOT displayed");
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean verify_LogoutMessage() {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(logoutMsg));
			if(logoutMsg.isDisplayed()) {
				System.out.println("Logout Message: " + logoutMsg.getText());
				return true;
			}
			else {
				System.out.println("Logout Message: " + logoutMsg.getText());
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}

}
