package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.util.Locators;

public class SignInPage {
	WebDriver driver;
	
	public SignInPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how = How.XPATH, using = Locators.SIGN_IN_BUTTON)
	WebElement signinButton;
	@FindBy(how = How.XPATH, using = Locators.LOGIN_EMAIL_FIELD)
	WebElement emailBox;
	@FindBy(how = How.XPATH, using = Locators.LOGIN_PASSWORD_FIELD)
	WebElement passwordBox;
	@FindBy(how = How.XPATH, using = Locators.LOGIN_ERROR_MESSAGE)
	WebElement loginErrorMSG;
	@FindBy(how = How.XPATH, using = Locators.CREATE_ACCOUNT_BUTTON)
	WebElement createAccntBtn;
	
	public void check_SignInPage_isLoaded() {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(signinButton));
			new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(signinButton));
			if (signinButton.isEnabled() && signinButton.isDisplayed()) {
				System.out.println("SignIn Page is loaded");
			}
			else {
				System.out.println("SignIn Page is not loaded");
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public void user_Login(String user, String password) {
		try {
			if (emailBox.isEnabled() && passwordBox.isEnabled()) {
				emailBox.clear();
				emailBox.sendKeys(user);
				passwordBox.clear();
				passwordBox.sendKeys(password);
				signinButton.click();
				try {
					driver.findElement(By.id("loginError"));
					System.out.println("SignIn Unsuccessfull. Please check credentials");
					throw new RuntimeException();
				}
				catch(NoSuchElementException ex) {
					System.out.println("Login Successfull");
				}
			}
			else {
				System.out.println("SignIn form not available");
			}
		}
		catch(Exception ex){
			throw new RuntimeException();			
		}
	}
	
	public void click_CreateAccount() {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(createAccntBtn));
			if(createAccntBtn.isDisplayed()) {
				createAccntBtn.click();
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}

}
