package br.com.selenium.exemplo.chapter11;

import org.junit.Test;

import br.com.selenium.utils.InitialiseSeleniumRCServer;

public class TypeInAGoogleSearchTermAndCheckSearchInputHasSearchTermInIt extends InitialiseSeleniumRCServer {

	@Test
	public void typeInAGoogleSearchTermAndCheckSearchInputHasSearchTermInIt() {
		selenium.open("http://www.compendiumdev.co.uk/selenium/search.php");
		selenium.type("xpath=//input[@name='q']", "Selenium-RC");
		selenium.click("xpath=//input[@name='btnG' and @type='submit']");
		selenium.waitForPageToLoad("30000");
		String searchTerm = selenium.getValue("xpath=//input[@name='q' and @title='Search']");
		assertTrue("Search Input does not contain Selenium-RC : " + searchTerm, searchTerm.equals("Selenium-RC"));
	}

}
