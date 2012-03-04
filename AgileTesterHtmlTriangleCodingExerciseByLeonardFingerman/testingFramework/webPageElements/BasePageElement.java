package webPageElements;

import util.SeleniumSingletonFactory;
import util.SoupedUpSelenium;

public class BasePageElement {
	protected SoupedUpSelenium selenium;

	public BasePageElement() throws Exception {
		selenium = SeleniumSingletonFactory.getInstance();
	}

}
