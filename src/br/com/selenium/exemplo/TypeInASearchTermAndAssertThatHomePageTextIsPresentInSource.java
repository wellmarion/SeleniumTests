package br.com.selenium.exemplo;

import org.junit.Test;

import br.com.selenium.utils.InitialiseSeleniumRCServer;

public class TypeInASearchTermAndAssertThatHomePageTextIsPresentInSource extends InitialiseSeleniumRCServer {

	@Test
	public void typeInASearchTermAndAssertThatHomePageTextIsPresentInSource() {
		selenium.open("http://www.compendiumdev.co.uk/selenium/search.php");
		selenium.type("xpath=//input[@name='q']", "Selenium-RC");
		selenium.click("xpath=//input[@name='btnG' and @type='submit']");
		selenium.waitForPageToLoad("10000");
		String pageSource = selenium.getHtmlSource().toLowerCase();
		assertTrue(pageSource.contains("Selenium Remote-Control Selenium RC comes in two parts." + " A server which automatically".toLowerCase()));
		pageSource.contains("launches and kills browsers, and acts as a HTTP proxy for web requests from them.".toLowerCase());
	}
}
