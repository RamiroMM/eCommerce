package pageObjects;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.JavascriptExecutor;
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
	@FindBy(how = How.XPATH, using = Locators.METATAG_COUNTRY_CODE)
	WebElement metaCountry;
	@FindBy(how = How.XPATH, using = Locators.METATAG_LANG_CODE)
	WebElement metaLang;
	@FindBy(how = How.XPATH, using = Locators.METATAG_ROBOTS)
	WebElement metaRobots;
	@FindBy(how = How.XPATH, using = Locators.PDP_SKU_ID)
	WebElement skuID;
	@FindBy(how = How.XPATH, using = Locators.PDP_SKU_ID_CHILD)
	WebElement skuIDChild;
	@FindBy(how = How.XPATH, using = Locators.PDP_PRODUCT_HEADER)
	WebElement prodHeader;
	
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
	
	public boolean verify_MetaTagCountry(String countrycode) {
		try {
			String site_country = metaCountry.getAttribute("content");
			if(site_country.equals(countrycode)) {
				System.out.println("Actual country: " + site_country);
				System.out.println("Expected country: " + countrycode);
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
	
	public boolean verify_MetaTagLang(String lang) {
		try {
			String site_lang = metaLang.getAttribute("content");
			if(site_lang.equals(lang)) {
				System.out.println("Actual lang: " + site_lang);
				System.out.println("Expected lang: " + lang);
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
	
	public boolean count_H1Tags() {
		try {
			String source = driver.getPageSource();
	    	String html_code = StringUtils.substringBetween(source, "<html", "/html>");
	    	int count = StringUtils.countMatches(html_code, "<h1");
	    	if(count==1) {
	    		System.out.println("H1 occurrences: " + count);
	    		return true;
	    	}
	    	else {
	    		System.out.println("H1 occurrences: " + count);
	    		return false;
	    	}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean verify_HyphensInURL() {
		try {
			String url = driver.getCurrentUrl();
			char ch;
			for(int i = 0; i < url.length(); i++) {
				ch = url.charAt(i);
				if(ch == '-') {
					System.out.println("Hyphens were found");
					return true;
				}
			}
			System.out.println("Hyphens were NOT found");
			return true;
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean verify_StopWordsInURL() {
		try {
			String url = driver.getCurrentUrl();
			if(!url.contains("and") || !url.contains("an") || !url.contains("or") || !url.contains("to") || !url.contains("of")) {
				System.out.println("Stop words were NOT found");
				return false;
			}
			else {
				System.out.println("Stop words were found");
				return true;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean verify_RobotMetatag(String strArg1) {
		try {
			String content = metaRobots.getAttribute("content");
			if(content.contentEquals(strArg1)) {
				System.out.println("Content of robot metatag is correct");
				System.out.println("Expected: " + strArg1);
				System.out.println("Actual: " + content);
				return true;
			}
			else {
				System.out.println("Content of robot metatag is not correct");
				System.out.println("Expected: " + strArg1);
				System.out.println("Actual: " + content);
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public boolean isDisplayed_SKUinURL() {
		try {
			String url = driver.getCurrentUrl();
			String txt = skuID.getText();
			String child_txt = skuIDChild.getText();
			String corr = txt.replace(child_txt, "");
			String corrected = corr.replaceAll("\\s+", "");
			System.out.println(corrected);
			if(url.contains(corrected)) {
				System.out.println("SKU found in URL");
				return true;
			}
			else {
				System.out.println("SKU found not in URL");
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
			return false;
		}
	}
	
	public void openCurrentURL_inNewTab() {
		try {
			String url = driver.getCurrentUrl();
			((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    driver.get(url);
		}
		catch(Exception ex) {
			System.out.println("Something went wrong: " + ex);
		}
	}

}
