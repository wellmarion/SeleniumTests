package br.com.selenium.exemplo.chapter11;

import org.junit.Test;

import br.com.selenium.utils.InitialiseSeleniumRCServer;

public class TypeInASearchTermAndCheckPageTitleHasSearchTermInIt extends InitialiseSeleniumRCServer {

	@Test
	public void typeInASearchTermAndCheckPageTitleHasSearchTermInIt() {
		selenium.open("http://www.compendiumdev.co.uk/selenium/search.php");
		selenium.type("xpath=//input[@name='q']", "Selenium-RC");
		selenium.click("xpath=//input[@name='btnG' and @type='submit']");
		selenium.waitForPageToLoad("30000");
		String pageTitle = selenium.getTitle();
		assertTrue("Page Title does not contain Selenium-RC search term: " + pageTitle, pageTitle.contains("Selenium-RC"));
	}

}
