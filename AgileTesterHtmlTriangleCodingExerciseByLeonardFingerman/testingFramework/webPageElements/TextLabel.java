package webPageElements;

import static org.testng.Assert.assertTrue;

public class TextLabel extends PageElementWithIdAttribute {

	public TextLabel(String id) throws Exception {
		super(id);
	}

	public boolean reads(String expected) {
		String actual = selenium.getText(id);
		assertTrue(expected.equals(actual));
		return true;
	}
	
	

}
