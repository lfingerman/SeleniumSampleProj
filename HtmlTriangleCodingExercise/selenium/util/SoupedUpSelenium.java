package util;

import static org.testng.Assert.fail;

import com.thoughtworks.selenium.DefaultSelenium;

public class SoupedUpSelenium extends DefaultSelenium {
	private static final int AJAX_MAX_TIMEOUT_SECONDS = 60;

	public SoupedUpSelenium(String seleniumServerHost, int seleniumServerPort,
			String browserForTesting, String url) {
		super(seleniumServerHost, seleniumServerPort,browserForTesting, url);
	}
	
	//Pattern for extending default SeleniumRC selenese API, which is partial. 
	public void waitForElementPresent(String elementLocator) throws Exception {
        for (int second = 0;; second++) {
            if (second >= AJAX_MAX_TIMEOUT_SECONDS) fail("Timeout waiting for Ajax response.");
            
            try { if (this.isElementPresent(elementLocator)) break; } 
            catch (Exception e) {
            	//swallow exceptions purposefully while awaiting response
            }
            Thread.sleep(1000);
         }
	}

}
