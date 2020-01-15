package com.framework.util;

public class Locators {
	
	public static final String CHROME_DRIVER_PATH = "C:/Selenium/drivers/chromedriver.exe";
	
	public static final String MY_ACCOUNT_BUTTON = "//*[@id=\"hpehf-myaccount-item\"]/a";
	
	public static final String SIGN_IN_BUTTON = "//*[@id=\"hpeLoginBtn\"]";
	
	public static final String LOGIN_EMAIL_FIELD = "//*[@id=\"j_username\"]";
	
	public static final String LOGIN_PASSWORD_FIELD = "//*[@id=\"j_password\"]";
	
	public static final String YOUR_ACCOUNT_HEADLINE = "//h1[contains(text(), \"YOUR ACCOUNT\")]";
	
	public static final String SEARCH_ICON = "//*[@id=\"hpehf-search-item\"]/a";
	
	public static final String SEARCH_FIELD = "//*[@id=\"hpehf-search-input\"]";
	
	public static final String SEARCH_ICON2 = "//*[@id=\"hpehf-search-bar\"]/form/button";
	
	public static final String FIRST_PRODUCT_FOUND = "//ul[contains(@class, \"product__listing\")]/section[1]/div[2]//a";
	
	public static final String PRODUCT_GALLERY_HEADER = "//div[contains(@class, \"hpe-product-gallery\")]/div//h1";
	
	public static final String GET_QUOTE_BUTTON = "//button[@onclick=\"getquote(this)\" and @type=\"submit\"]";
	
	public static final String GET_QUOTE_SIGN_IN_BUTTON = "//button[contains(@class, \"continue-checkout-button\")]";
	
	public static final String PAGINATION_ARROW = "//a[@class=\"hpe-pagination__link\"]";

}
