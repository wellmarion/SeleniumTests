package br.com.selenium.exemplo;

import org.junit.Test;

import br.com.selenium.utils.InitialiseSeleniumRCServer;

public class MySecondTestVerifyEquals extends InitialiseSeleniumRCServer {

	@Test
	public void verifyText() throws Exception {

		selenium.open("http://wellmarion.wordpress.com/");
		selenium.waitForPageToLoad("30000");
		verifyEquals("link=Wellmarion's Blog", selenium.getText("link=Wellmarion's Blog"));

	}
}
