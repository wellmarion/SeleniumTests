package br.com.selenium.exemplo;

import org.junit.Test;

import br.com.selenium.utils.InitialiseSeleniumRCServer;

public class TypeInASearchTermAndAssertThatHomePageURLExists extends InitialiseSeleniumRCServer {

	@Test
	public void typeInASearchTermAndAssertThatHomePageURLExists() {
		selenium.open("http://www.compendiumdev.co.uk/selenium/search.php");
		selenium.type("xpath=//input[@name='q']", "Selenium-RC");
		selenium.click("xpath=//input[@name='btnG' and @type='submit']");
		selenium.waitForPageToLoad("10000");
		/*
		 * create a new variable called matchingCountTotal to calculate the total number of times our xpath matches, initially setting it to 0
		 */
		int matchingCountTotal = 0;
		// call getXpathCount with our first xpath for the url and
		// add the intValue version to the total
		matchingCountTotal += selenium.getXpathCount("//a[@href='http://selenium-rc.seleniumhq.org']").intValue();
		matchingCountTotal += selenium.getXpathCount("//a[@href='http://selenium-rc.seleniumhq.org/']").intValue();
		// call the getXpathCount again with our next url and add
		// the returned intValue to the total
		matchingCountTotal += selenium.getXpathCount("//a[@href='http://seleniumhq.org/projects/remote-control']").intValue();
		// call the getXpathCount again with our next url and add
		// the returned intValue to the total
		matchingCountTotal += selenium.getXpathCount("//a[@href='http://seleniumhq.org/projects/remote-control/index.html']").intValue();
		// call getXpathCount with our last url xpath and add
		// the returned intValue to the total
		matchingCountTotal += selenium.getXpathCount("//a[@href='http://seleniumhq.org/projects/remote-control/']").intValue();
		assertTrue("No homepage URL found", matchingCountTotal > 0);
	}

}
