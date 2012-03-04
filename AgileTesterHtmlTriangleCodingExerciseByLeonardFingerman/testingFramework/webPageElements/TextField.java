package webPageElements;


public class TextField extends PageElementWithIdAttribute {

	public TextField(String id) throws Exception {
		super(id);
	}
	
	public boolean canEnterText(String entry) {
		selenium.type(id, entry);
		return true;
	}
}
