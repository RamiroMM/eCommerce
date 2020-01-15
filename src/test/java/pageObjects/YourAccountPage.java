package pageObjects;

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
	
	public void check_accountPage_isLoaded() {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(accountHeadline));
			if (accountHeadline.isDisplayed()) {
				System.out.println("Account Page is loaded");
			}
			else {
				System.out.println("Account Page is not loaded");
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}

}
