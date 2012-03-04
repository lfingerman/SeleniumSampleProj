package triangleTestingApp;

import org.testng.annotations.Test;

import webPageContainers.TriangleTestHomePage;

//For instructions, please see the README file

public class HookupTest extends BaseWebPageTest {
	public HookupTest() throws Exception {
		super();
	}

	@Test
	public void shouldLaunchFireFoxAndBringUpTriangleTestingPage() throws Exception {
		TriangleTestHomePage homePage = new TriangleTestHomePage();
		homePage.verifyTitleIsCorrect("Triangle Exercise");
	}
}
