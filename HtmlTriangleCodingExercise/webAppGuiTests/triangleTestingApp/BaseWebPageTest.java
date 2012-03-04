package triangleTestingApp;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import util.SeleniumSingletonFactory;
import webPageContainers.TriangleTestHomePage;

import com.thoughtworks.selenium.DefaultSelenium;

//For instructions, please see the README file

public class BaseWebPageTest {
	protected DefaultSelenium selenium;
	protected TriangleTestHomePage trianglePage;
	
	public BaseWebPageTest() throws Exception {
		trianglePage = new TriangleTestHomePage();
	}
	
	@BeforeSuite
	public void setUp() throws Exception {
		selenium = SeleniumSingletonFactory.getInstance();
	}
	
	
	@AfterSuite
	public void tearDown() throws Exception {
		SeleniumSingletonFactory.stopEverything();
	}
	
}
