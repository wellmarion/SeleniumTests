package br.com.selenium.exemplo.chapter11;

import org.junit.Test;

import br.com.selenium.utils.InitialiseSeleniumRCServer;

public class TypeInSearchTerm extends InitialiseSeleniumRCServer {

	@Test
	public void typeInASearchTerm() {
		// Selenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.compendiumdev.co.uk");
		// selenium.start();
		selenium.open("http://www.compendiumdev.co.uk/selenium/search.php");
		selenium.type("xpath=//input[@name='q']", "Selenium-RC");
		selenium.click("xpath=//input[@name='btnG' and @type='submit']");
		selenium.waitForPageToLoad("30000");
		// selenium.close();
		// selenium.stop();

	}

}
