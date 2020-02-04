package pageObjects;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.util.Locators;

public class RegistrationPage {
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how = How.XPATH, using = Locators.SHOP_BUTTON)
	WebElement shopButton;
	@FindBy(how = How.XPATH, using = Locators.CREATE_ACCOUNT_TITLE)
	WebElement registrationHeader;
	@FindBy(how = How.XPATH, using = Locators.REG_EMAIL_FIELD)
	WebElement mailField;
	@FindBy(how = How.XPATH, using = Locators.REG_PASS_FIELD)
	WebElement passField;
	@FindBy(how = How.XPATH, using = Locators.REG_PASS2_FIELD)
	WebElement passField2;
	@FindBy(how = How.XPATH, using = Locators.REG_COUNTRY_COMBOBOX)
	WebElement countryBox;
	@FindBy(how = How.XPATH, using = Locators.REG_TITLE_COMBOBOX)
	WebElement titleBox;
	@FindBy(how = How.XPATH, using = Locators.REG_FIRST_NAME_FIELD)
	WebElement nameField;
	@FindBy(how = How.XPATH, using = Locators.REG_LAST_NAME_FIELD)
	WebElement lastNameField;
	@FindBy(how = How.XPATH, using = Locators.REG_COMPANY_FIELD)
	WebElement companyField;
	@FindBy(how = How.XPATH, using = Locators.REG_ADDRESS_FIELD)
	WebElement address1;
	@FindBy(how = How.XPATH, using = Locators.REG_CITY_FIELD)
	WebElement cityField;
	@FindBy(how = How.XPATH, using = Locators.REG_STATE_COMBOBOX)
	WebElement stateBox;
	@FindBy(how = How.XPATH, using = Locators.REG_PSCODE_FIELD)
	WebElement zipField;
	@FindBy(how = How.XPATH, using = Locators.REG_PHONENUM_FIELD)
	WebElement phoneField;
	@FindBy(how = How.XPATH, using = Locators.REG_CREATE_ACCNT_BTN)
	WebElement createAccntBtn;
	@FindBy(how = How.XPATH, using = Locators.REGISTRATION_ERROR_MSG)
	WebElement regErrorMsg;
	
	public String generate_Email() throws IOException {
		String mail = RandomStringUtils.randomAlphanumeric(10);
		String email = mail+"@yopmail.com";
		System.out.println(email);
		try {
			PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\morara\\Documents\\04 FY20 Releases\\Automation\\eComm Automation\\notes.txt", true));
			out.append(email);
			out.write("\r\n");
			out.close();
			return email;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void default_Registration(String address, String city, String zip) {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(registrationHeader));
			String email = generate_Email();
			if(mailField.isDisplayed() && passField.isDisplayed() && passField2.isDisplayed() && countryBox.isDisplayed() &&
					titleBox.isDisplayed() && nameField.isDisplayed() && lastNameField.isDisplayed() && companyField.isDisplayed() &&
					address1.isDisplayed() && cityField.isDisplayed() && phoneField.isDisplayed()) {
				mailField.sendKeys(email);
				passField.sendKeys("securepass123");
				passField2.sendKeys("securepass123");
				countryBox.click();
				titleBox.click();
				nameField.sendKeys("Juanito");
				lastNameField.sendKeys("Bananas");
				companyField.sendKeys("Test Company");
				address1.sendKeys(address);
				cityField.sendKeys(city);
				phoneField.sendKeys("3334445566");
				try {
					if(stateBox.isDisplayed()) {
						stateBox.click();
					}
					try {
						if(zipField.isDisplayed()) {
							zipField.sendKeys(zip);
						}
					}
					catch(Exception ex) {
						System.out.println("No ZIP field found");
					}
				}
				catch(Exception ex) {
					System.out.println("No State combobox found found");
					try {
						if(zipField.isDisplayed()) {
							zipField.sendKeys(zip);
						}
					}
					catch(Exception ex1) {
						System.out.println("No ZIP field found");
					}
				}
			}
			if(createAccntBtn.isDisplayed()) {
				Thread.sleep(3000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createAccntBtn);
				Thread.sleep(1500);
				createAccntBtn.click();
				Thread.sleep(3000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createAccntBtn);
				Thread.sleep(1500);
				createAccntBtn.click();
				Thread.sleep(10000);
				new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(shopButton));
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}
	
	public void default_Registration_ExistingMailID(String address, String city, String zip) {
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(registrationHeader));
			if(mailField.isDisplayed() && passField.isDisplayed() && passField2.isDisplayed() && countryBox.isDisplayed() &&
					titleBox.isDisplayed() && nameField.isDisplayed() && lastNameField.isDisplayed() && companyField.isDisplayed() &&
					address1.isDisplayed() && cityField.isDisplayed() && phoneField.isDisplayed()) {
				mailField.sendKeys("JbPBNQj9Bh@yopmail.com");
				passField.sendKeys("securepass123");
				passField2.sendKeys("securepass123");
				countryBox.click();
				titleBox.click();
				nameField.sendKeys("Juanito");
				lastNameField.sendKeys("Bananas");
				companyField.sendKeys("Test Company");
				address1.sendKeys(address);
				cityField.sendKeys(city);
				phoneField.sendKeys("3334445566");
				try {
					if(stateBox.isDisplayed()) {
						stateBox.click();
					}
					try {
						if(zipField.isDisplayed()) {
							zipField.sendKeys(zip);
						}
					}
					catch(Exception ex) {
						System.out.println("No ZIP field found");
					}
				}
				catch(Exception ex) {
					System.out.println("No State combobox found found");
					try {
						if(zipField.isDisplayed()) {
							zipField.sendKeys(zip);
						}
					}
					catch(Exception ex1) {
						System.out.println("No ZIP field found");
					}
				}
			}
			if(createAccntBtn.isDisplayed()) {
				Thread.sleep(3000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createAccntBtn);
				Thread.sleep(1500);
				createAccntBtn.click();
				Thread.sleep(3000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createAccntBtn);
				Thread.sleep(1500);
				createAccntBtn.click();
				Thread.sleep(10000);
				new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(shopButton));
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}
	
	public boolean isDisplayed_RegistrationError() {
		try {
			new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(regErrorMsg));
			if(regErrorMsg.isDisplayed() && !regErrorMsg.getText().isEmpty()) {
				System.out.println("Error message: " + regErrorMsg.getText());
				return true;
			}
			else {
				System.out.println("No error message was displayed");
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}

}
