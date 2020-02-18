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

public class YourAccountPage {
	WebDriver driver;
	
	public YourAccountPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how = How.XPATH, using = Locators.YOUR_ACCOUNT_HEADLINE)
	WebElement accountHeadline;
	@FindBy(how = How.XPATH, using = Locators.LOGOUT_BUTTON)
	WebElement logoutButton;
	
	public boolean check_accountPage_isLoaded() {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(accountHeadline));
			if (accountHeadline.isDisplayed()) {
				System.out.println("Account Page is loaded");
				return true;
			}
			else {
				System.out.println("Account Page is not loaded");
				return false;
			}
		}
		catch(Exception ex){
			System.out.println(ex);
			return false;
		}
	}
	
	public void click_Logout() {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(logoutButton));
			new WebDriverWait(driver, 60).until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
			if(logoutButton.isDisplayed()) {
				System.out.println("Before click");
				logoutButton.click();
				System.out.println("After click");
			}
			else {
				System.out.println("Logout button was not found");
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}

}
