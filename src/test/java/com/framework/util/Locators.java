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

}
