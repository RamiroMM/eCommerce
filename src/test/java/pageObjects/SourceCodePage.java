package pageObjects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	@FindBy(how = How.XPATH, using = Locators.LOGO_IMG)
	WebElement logoImg;
	@FindBy(how = How.XPATH, using = Locators.LOGO_LINK)
	WebElement logoLink;
	
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
	
	public boolean isDisplayed_StrongTags() {
		try {
			String source = driver.getPageSource();
	    	String html_code = StringUtils.substringBetween(source, "<html", "/html>");
	    	boolean isStrongTagPresent = html_code.contains("<strong");
	    	if(isStrongTagPresent) {
	    		System.out.println("Tag was found. Step failed");
	    		return true;
	    	}
	    	if(!isStrongTagPresent) {
	    		System.out.println("Tag is not found. Step passed");
	    		return false;
	    	}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
		return true;
	}
	
	public boolean isDisplayed_HPELogoAltTag (String alt) {
		try {
			String alttag = logoImg.getAttribute("alt");
			if(alttag.equals(alt)) {
				System.out.println("Actual tag: " + alttag);
				System.out.println("Expected tag: " + alt);
				return true;
			}
			else {
				System.out.println("Actual tag: " + alttag);
				System.out.println("Expected tag: " + alt);
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean verify_LogoLink(String canonical_link) {
		try {
			String link = logoLink.getAttribute("href");
			if(link.contains(canonical_link)) {
				System.out.println("Website link: " + canonical_link);
				System.out.println("Logo link: " + link);
				return true;
			}
			else {
				System.out.println("Website link: " + canonical_link);
				System.out.println("Logo link: " + link);
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean isContained_CanonicalURL(String link) {
		try {
			String canonical = linkTag.getAttribute("href");
			if(canonical.contains(link)) {
				System.out.println("Page link: " + canonical);
				System.out.println("Canonical link: " + link);
				return true;
			}
			else {
				System.out.println("Page link: " + canonical);
				System.out.println("Canonical link: " + link);
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean check_PLPURL(String link) {
		try {
			String url = driver.getCurrentUrl();
			String url2 = url.replace(link, "");
			Pattern p = Pattern.compile("/servers/c/[0-9]*");
			Matcher m = p.matcher(url2);
			if(m.find()) {
				System.out.println("URL matches the pattern: " + url2);
				return true;
			}
			else {
				System.out.println("URL does not match the pattern: " + url2);
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean isDisplayed_CountryAndLangCode(String code) {
		try {
			String url = driver.getCurrentUrl();
			if(url.contains(code)) {
				System.out.println("Country and Language code found");
				return true;
			}
			else {
				System.out.println("Country and Language code not found");
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean isDisplayed_CapitalLettersAndUnderscoreinURL() {
		try {
			String url = driver.getCurrentUrl();
			char ch;
			for(int i = 0; i < url.length(); i++) {
				ch = url.charAt(i);
				if(Character.isUpperCase(ch) || ch == '_') {
					return true;
				}
			}
			return false;
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}

}
