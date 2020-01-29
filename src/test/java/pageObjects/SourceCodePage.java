package pageObjects;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.util.Locators;

public class SourceCodePage {
	WebDriver driver;
	
	public SourceCodePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(how = How.XPATH, using = Locators.OG_URL)
	WebElement ogUrl;
	@FindBy(how = How.XPATH, using = Locators.OG_TYPE)
	WebElement ogType;
	@FindBy(how = How.XPATH, using = Locators.OG_TITLE)
	WebElement ogTitle;
	@FindBy(how = How.XPATH, using = Locators.OG_DESCRIPTION)
	WebElement ogDesc;
	@FindBy(how = How.XPATH, using = Locators.OG_IMAGE)
	WebElement ogImage;
	@FindBy(how = How.XPATH, using = Locators.LINK_TAG)
	WebElement linkTag;
	
	public boolean verifyHeadTagTitle(String title) {
		try {
			String source = driver.getPageSource();
	        String head_tag = StringUtils.substringBetween(source, "head", "/head");
	        String title_tag = StringUtils.substringBetween(head_tag, "<title>", "</title>");
	        boolean isTextPresent = title_tag.contains(title);
	        if (isTextPresent) {
	        	System.out.println("Actual Title: " + title_tag.trim());
	        	System.out.println("Expected Title: " + title);
	        	return true;
	        }
	        if (!isTextPresent) {
	        	System.out.println("Actual Title: " + title_tag.trim());
	        	System.out.println("Expected Title: " + title);
	        	return false;
	        }
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
		return false;
	}
	
	public boolean isDisplayed_CanonicalLink() {
		try {
			String canonical = linkTag.getAttribute("href");
	        if(!canonical.isEmpty()) {
	        	System.out.println("Canonical URL: " + canonical);
	        	return true;
	        }
	        else {
	        	System.out.println("Canonical URL is empty");
	        	return false;
	        }
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean isDisplayed_SocialMetaTags() {
		try {
			if(ogUrl.isEnabled()) {
				System.out.println("og:url = " + ogUrl.getAttribute("content"));
				if(ogType.isEnabled()) {
					System.out.println("og:type = " + ogType.getAttribute("content"));
					if(ogTitle.isEnabled()) {
						System.out.println("og:title = " + ogTitle.getAttribute("content"));
						if(ogDesc.isEnabled()) {
							System.out.println("og:description = " + ogDesc.getAttribute("content"));
							if(ogImage.isEnabled()) {
								System.out.println("og:image = " + ogImage.getAttribute("content"));
							}
							else {
								System.out.println("og:image = none");
								return false;
							}
						}
						else {
							System.out.println("og:description = none");
							return false;
						}
					}
					else {
						System.out.println("og:title = none");
						return false;
					}
				}
				else {
					System.out.println("og:type = none");
					return false;
				}
			}
			else {
				System.out.println("og:url = none");
				return false;
			}
			return true;
		}
		catch(Exception ex) {
			System.out.println("Something went wrong :" + ex);
			return false;
		}
	}

}
