package util;


public abstract class SeleniumSingletonFactory {
    private static SoupedUpSelenium selenium;
	public static final String STANDARD_PAGE_LOAD_WAIT_TIME = "90000";
	public static final String GOOGLE = "http://www.google.com/ig?hl=en";
    protected static String url;

    public static SoupedUpSelenium getInstance() throws Exception {
        SeleniumProxySingleton.makeSureWeHaveAJettyProxyRunning();
        if (selenium == null) launchSeleniumBrowser();

        return selenium;
    }

    private static void launchSeleniumBrowser() throws Exception {
        url = GOOGLE;
        selenium = new SoupedUpSelenium(SeleniumProxySingleton.SELENIUM_SERVER_HOST, 
        		SeleniumProxySingleton.SELENIUM_SERVER_PORT, getBrowserForTesting(), url);
        selenium.start();
        selenium.setSpeed("0");
        selenium.setTimeout(STANDARD_PAGE_LOAD_WAIT_TIME);
    }

    private static String getBrowserForTesting() {
    	//TODO Retrieve this value from a properties file, in production system. 
        return "*firefox";  // "*iexplore" or "*firefox"
    }

    public static void stopEverything() {
        selenium.close();
        selenium.stop();
       // SeleniumProxySingleton.stopJettyProxy();
    }

}

