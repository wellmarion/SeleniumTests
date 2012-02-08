package br.com.selenium.exemplo;

import org.junit.Test;

import br.com.selenium.utils.InitialiseSeleniumRCServer;

public class TypeInASearchTermAndAssertThatHomePageTextIsPresent extends InitialiseSeleniumRCServer {

	@Test
	public void typeInASearchTermAndAssertThatHomePageTextIsPresent() {
		selenium.open("http://www.compendiumdev.co.uk/selenium/search.php");
		selenium.type("xpath=//input[@name='q']", "Selenium-RC");
		selenium.click("xpath=//input[@name='btnG' and @type='submit']");
		selenium.waitForPageToLoad("30000");

		// selenium.isTextPresent("Selenium Remote-Control Selenium RC comes in two parts." + " A server which automatically");
		// selenium.isTextPresent("launches and kills browsers, and acts as" + " a HTTP proxy for web requests from them.");

		assertTrue(selenium.isTextPresent("Selenium Remote-Control Selenium RC comes in two parts." + " A server which automatically"));
		assertTrue(selenium.isTextPresent("launches and kills browsers, and acts as" + " a HTTP proxy for web requests from them."));

	}
}
