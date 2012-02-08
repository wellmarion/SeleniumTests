package br.com.selenium.exemplo.chapter11;

import org.junit.Test;

import br.com.selenium.utils.InitialiseSeleniumRCServer;

public class TypeInASearchTermAndCheckResultsPage extends InitialiseSeleniumRCServer {

	@Test
	public void typeInASearchTermAndCheckResultsPage() {
		selenium.open("http://www.compendiumdev.co.uk/selenium/search.php");
		selenium.type("xpath=//input[@name='q']", "Selenium-RC");
		selenium.click("xpath=//input[@name='btnG' and @type='submit']");
		selenium.waitForPageToLoad("30000");
		String searchTerm = selenium.getValue("xpath=//input[@name='q' and @title='Search']");
		assertTrue("Search Input does not contain Selenium-RC : " + searchTerm, searchTerm.equals("Selenium-RC"));
		String pageTitle = selenium.getTitle();
		assertTrue("Page Title does not contain Selenium-RC search term: " + pageTitle, pageTitle.contains("Selenium-RC"));
		int matchingCountTotal = selenium.getXpathCount("//a[starts-with(@href,'http://seleniumhq.org/projects/remote-control')]").intValue();
		matchingCountTotal += selenium.getXpathCount("//a[starts-with(@href,'http://selenium-rc.seleniumhq.org')]").intValue();
		assertTrue("No homepage URL found ", matchingCountTotal > 0);
	}
}
