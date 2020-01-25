package com.framework.util;

public class Locators {
	
	public static final String CHROME_DRIVER_PATH = "C:/Selenium/drivers/chromedriver.exe";
	
	public static final String MY_ACCOUNT_BUTTON = "//*[@id=\"hpehf-myaccount-item\"]/a";
	
	public static final String SIGN_IN_BUTTON = "//*[@id=\"hpeLoginBtn\"]";
	
	public static final String LOGIN_EMAIL_FIELD = "//*[@id=\"j_username\"]";
	
	public static final String LOGIN_PASSWORD_FIELD = "//*[@id=\"j_password\"]";
	
	public static final String YOUR_ACCOUNT_HEADLINE = "//h1";
	
	public static final String SEARCH_ICON = "//*[@id=\"hpehf-search-item\"]/a";
	
	public static final String SEARCH_FIELD = "//*[@id=\"hpehf-search-input\"]";
	
	public static final String SEARCH_ICON2 = "//*[@id=\"hpehf-search-bar\"]/form/button";
	
	public static final String FIRST_PRODUCT_FOUND = "//ul[contains(@class, \"product__listing\")]/section[1]/div[2]//a";
	
	public static final String PRODUCT_GALLERY_HEADER = "//div[contains(@class, \"hpe-product-gallery\")]/div//h1";
	
	public static final String GET_QUOTE_BUTTON = "//button[@onclick=\"getquote(this)\" and @type=\"submit\"]";
	
	public static final String GET_QUOTE_SIGN_IN_BUTTON = "//button[contains(@class, \"continue-checkout-button\")]";
	
	public static final String PAGINATION_ARROW = "//a[@class=\"hpe-pagination__link\"]";
	
	public static final String PAGE_SIZE_100_ITEMS = "//*[@id=\"pageSize-selector\"]/option[4]";
	
	public static final String PAGE_SIZE_SELECTOR = "//*[@id=\"pageSize-selector\"]";
	
	public static final String DROP_DOWN_SORT_SELECTION = "//*[@id=\"sortOptions1\"]//option[@selected=\"selected\"]";
	
	public static final String DROPDOWN_NAME_ASC = "//option[@value=\"name-asc\"]";
	
	public static final String DROPDOWN_NAME_DESC = "//option[@value=\"name-desc\"]";
	
	public static final String PRODUCTS_LIST_RESULT = "//ul[contains(@class, \"product__listing\")]//div[contains(@class, \"product-list__about\")]//h4//a[1]";
	
	public static final String SHOP_BUTTON = "//li//a[contains(@data-analytics-region-id, \"Shop\")]";
	
	public static final String ALL_SERVERS_BUTTON = "//a[contains(@data-analytics-link-id, \"All servers\")]";
	
	public static final String SERVERS_PLP_PAGE_HEADER = "//div[contains(@class,\"hpe-page-header__content\")]/h1";
	
	public static final String SEARCH_PAGE_HEADER = "//div[contains(@class,\"hpe-page-header__content\")]/h1";
	
	public static final String EMAIL_CHECKBOX = "//*[@id=\"quoteemailcontact\"]/../..";
	
	public static final String BUSINESS_NEED_TEXT_FIELD = "//*[@id=\"bussines-need\"]";
	
	public static final String BUDGET_TEXT_FIELD = "//*[@id=\"budget\"]";
	
	public static final String TIMEFRAME_DROPDOWN_BOX = "//*[@id=\"select1\"]/option[2]";
	
	public static final String GET_QUOTE = "//*[@id=\"getQuote\"]";
	
	public static final String VERIFY_ADDRESS_QUOTE_WARNING = "//h3[@class=\"hpe-notification__title\"]";
	
	public static final String QUOTE_SUMMARY_CART_HEADER = "//section[contains(@class, \"hpe-cart-summary\")]";

}
