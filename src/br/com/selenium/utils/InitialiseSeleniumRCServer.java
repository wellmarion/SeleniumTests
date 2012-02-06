package br.com.selenium.utils;

import org.junit.After;
import org.junit.Before;

import com.thoughtworks.selenium.SeleneseTestBase;

public class InitialiseSeleniumRCServer extends SeleneseTestBase {

	@Before
	public void setUp() throws Exception {
		setUp("http://www.google.com/", "*firefox");
	}

	@After
	public void tearDown() throws Exception {
		selenium.close();
		selenium.stop();
	}

}
