package br.com.selenium.exemplo;

import org.junit.Test;

import br.com.selenium.utils.InitialiseSeleniumRCServer;

public class MySecondTestAssertEquals extends InitialiseSeleniumRCServer {

	@Test
	public void assertEqualsTitle() {

		selenium.open("http://wellmarion.wordpress.com/");
		selenium.waitForPageToLoad("30000");
		assertEquals("Wellmarion's Blog | Well tested", selenium.getTitle());
	}

}
