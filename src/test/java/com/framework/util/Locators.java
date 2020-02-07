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
	
	public static final String FIRST_PRODUCT_FOUND = "//*[contains(@class, \"product__listing\")]/section[1]/div[2]//a";
	
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
	
	//public static final String ALL_SERVERS_BUTTON = "//a[contains(@data-analytics-link-id, \"All servers\")]";
	
	public static final String ALL_SERVERS_BUTTON = "//*[@id=\"hpehf-shop-flyout-right-0\"]/div[1]/a[1]";
	
	public static final String SERVERS_PLP_PAGE_HEADER = "//div[contains(@class,\"hpe-page-header__content\")]/h1";
	
	public static final String SEARCH_PAGE_HEADER = "//div[contains(@class,\"hpe-page-header__content\")]/h1";
	
	public static final String EMAIL_CHECKBOX = "//*[@id=\"quoteemailcontact\"]/../..";
	
	public static final String BUSINESS_NEED_TEXT_FIELD = "//*[@id=\"bussines-need\"]";
	
	public static final String BUDGET_TEXT_FIELD = "//*[@id=\"budget\"]";
	
	public static final String TIMEFRAME_DROPDOWN_BOX = "//*[@id=\"select1\"]/option[2]";
	
	public static final String GET_QUOTE = "//*[@id=\"getQuote\"]";
	
	public static final String VERIFY_ADDRESS_QUOTE_WARNING = "//h3[@class=\"hpe-notification__title\"]";
	
	public static final String QUOTE_SUMMARY_CART_HEADER = "//section[contains(@class, \"hpe-cart-summary\")]";
	
	public static final String LOGIN_ERROR_MESSAGE = "//*[@id=\"loginError\"]";
	
	public static final String QUOTESUMM_START_DATE = "//section[@class=\"hpe-cart-summary\"]/div[1]/div";
	
	public static final String QUOTESUMM_QUOTE_NUM = "//section[@class=\"hpe-cart-summary\"]/div[2]/div";
	
	public static final String QUOTESUMM_CONTACT_NAME = "//h2[contains(@class,\"hpe-cart-summary\")]/../div/div/div[1]";
	
	public static final String QUOTESUMM_CONTACT_LASTNAME = "//h2[contains(@class,\"hpe-cart-summary\")]/../div/div/div[2]";
	
	public static final String QUOTESUMM_CONTACT_COMPANY = "//h2[contains(@class,\"hpe-cart-summary\")]/../div/div/div[3]";
	
	public static final String QUOTESUMM_CONTACT_PHONE = "//h2[contains(@class,\"hpe-cart-summary\")]/../div/div/div[4]";
	
	public static final String QUOTESUMM_CONTACT_EMAIL = "//h2[contains(@class,\"hpe-cart-summary\")]/../div/div/div[5]";
	
	public static final String QUOTESUMM_CONTACT_ADDRESS = "//h2[contains(@class,\"hpe-cart-summary\")]/../div/div[2]/div[1]";
	
	public static final String QUOTESUMM_CONTACT_CITY = "//h2[contains(@class,\"hpe-cart-summary\")]/../div/div[2]/div[2]";
	
	public static final String QUOTESUMM_CONTACT_POSTALCODE = "//h2[contains(@class,\"hpe-cart-summary\")]/../div/div[2]/div[3]";
	
	public static final String QUOTESUMM_CONTACT_COUNTRY = "//h2[contains(@class,\"hpe-cart-summary\")]/../div/div[2]/div[4]";
	
	public static final String LINK_TAG = "//link[@rel=\"canonical\"]";
	
	public static final String OG_URL = "//meta[contains(@property, \"og:url\")]";
	
	public static final String OG_TYPE = "//meta[contains(@property, \"og:type\")]";
	
	public static final String OG_TITLE = "//meta[contains(@property, \"og:title\")]";
	
	public static final String OG_DESCRIPTION = "//meta[contains(@property, \"og:desc\")]";
	
	public static final String OG_IMAGE = "//meta[contains(@property, \"og:image\")]";
	
	public static final String LOGO_LINK = "//*[@id=\"hpehf-site-branding\"]";
	
	public static final String LOGO_IMG = "//*[@id=\"hpehf-site-branding\"]/img";
	
	public static final String CREATE_ACCOUNT_BUTTON = "//a[contains(@href, \"register\")]";
	
	public static final String CREATE_ACCOUNT_TITLE = "//h1[contains(text(), \"\")]";
	
	public static final String REG_EMAIL_FIELD = "//input[@id=\"email-address\"]";
	
	public static final String REG_PASS_FIELD = "//input[@id=\"password\"]";
	
	public static final String REG_PASS2_FIELD = "//input[@id=\"repeat-password\"]";
	
	public static final String REG_COUNTRY_COMBOBOX = "//*[@id=\"select1\"]/option[2]";
	
	public static final String REG_TITLE_COMBOBOX = "//*[@id=\"select3\"]/option[5]";
	
	public static final String REG_FIRST_NAME_FIELD = "//*[@id=\"first-name\"]";
	
	public static final String REG_LAST_NAME_FIELD = "//*[@id=\"last-name\"]";
	
	public static final String REG_COMPANY_FIELD = "//*[@id=\"company\"]";
	
	public static final String REG_ADDRESS_FIELD = "//*[@id=\"address1\"]";
	
	public static final String REG_CITY_FIELD = "//*[@id=\"city\"]";
	
	public static final String REG_STATE_COMBOBOX = "//*[@id=\"select2\"]/option[10]";
	
	public static final String REG_PSCODE_FIELD = "//*[@id=\"zip\"]";
	
	public static final String REG_PHONENUM_FIELD = "//*[@id=\"phone\"]";
	
	public static final String REG_CREATE_ACCNT_BTN = "//*[@id=\"registerUserBtn\"]";
	
	public static final String SIGNIN_INDICATOR = "//*[@id=\"hpe-store-signed-in-indicator\"]";
	
	public static final String REGISTRATION_ERROR_MSG = "//*[@id=\"regError\"]";
	
	public static final String METATAG_COUNTRY_CODE = "//meta[@name=\"target_country\"]";
	
	public static final String METATAG_LANG_CODE = "//meta[@name=\"language\"]";
	
	public static final String PDP_SERVICES_TAB = "//a[contains(@id,\"servicesTab\")]";
	
	public static final String FIRST_SERVICE_PRODUCT = "//div[contains(@class,\"servicesSection\")]//section[contains(@class,\"product-list\")][1]//div[contains(@class,\"about\")]/a";
	
	public static final String PDP_PRODUCT_HEADER = "//h1";
	
	public static final String BREADCRUMB = "//ol[contains(@class,\"breadcrumb\")]/li";
	
	public static final String PDP_QUICKSPEC_OPTIONS = "//div[contains(@class,\"quickspecs-dropdown\")]/div";
	
	public static final String LOADING_SPINNER = "//div[@id=\"spinner\"]";
	
	public static final String DROPDOWN_PRICE_DESC = "//option[@value=\"leastPrice-desc\"]";
	
	public static final String PLP_LIST_PRICE = "//div[contains(@class, \"product__list\")]//div[contains(@class,\"about\")]//p[contains(@class,\"list__price\")]//span[contains(@class, \"font-weight\")]";
	
	public static final String MICRO_SERVERS_BUTTON = "//*[@id=\"hpehf-shop-flyout-right-0\"]/div[1]/a[4]";
	
	public static final String MICROSERVERS_PLP_PAGE_HEADER = "//div[contains(@class,\"hpe-page-header__content\")]/h1";
	
	public static final String PLP_VAT_MESSAGE = "//div[contains(@class, \"product__list\")]//div[contains(@class,\"about\")]//p[contains(@class,\"list__price\")]//span[contains(@class, \"vat-message\")]";
	
	public static final String PDP_VAT_MESSAGE = "//p[contains(@class, \"product-description\")]//span[contains(@class, \"vat-message\")]";
	
	public static final String PAGE_SIZE_20_ITEMS = "//*[@id=\"pageSize-selector\"]/option[2]";
	
	public static final String CONFIG_AND_QUOTE_BUTTON = "//div[contains(@class, \"product-list__button\")]//button[@onclick=\"configureandquote(this)\"]";
	
	public static final String CONFIGURATION_CAROUSEL = "//section[contains(@class, \"carousel\")]";
}
