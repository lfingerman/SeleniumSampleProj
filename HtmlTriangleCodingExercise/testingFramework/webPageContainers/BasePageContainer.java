package webPageContainers;

import static org.testng.Assert.assertEquals;
import util.SeleniumSingletonFactory;
import util.SoupedUpSelenium;

public class BasePageContainer {
	protected static SoupedUpSelenium selenium;
	
	public BasePageContainer() throws Exception {
		init();
	}
	
	private void init() throws Exception {
		selenium = SeleniumSingletonFactory.getInstance();
	}

	protected void goToPage(String url) {
		selenium.open(url);
		selenium.waitForPageToLoad(SeleniumSingletonFactory.STANDARD_PAGE_LOAD_WAIT_TIME);
	}
	
	public boolean verifyTitleIsCorrect(String expectedTitle) throws Exception {
		assertEquals(selenium.getTitle(), expectedTitle);
		return (selenium.getTitle().equals(expectedTitle));
	}
	
	


}
