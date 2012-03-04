package webPageElements;

public class DrawButton extends BasePageElement {
	String xPath;

	public DrawButton(String xPath) throws Exception {
		super();
		this.xPath = xPath;
	}

	public void click() {
		selenium.click(xPath);
	}
}
