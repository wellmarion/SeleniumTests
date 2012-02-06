package br.com.selenium.exemplo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;

public class MyFirstSeleniumTests extends SeleneseTestBase {

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("127.0.0.1", 4444, "*firefox", "https://www.google.com/");
		selenium.start();
	}

	@Test
	public void logarEmailTeste() throws Exception {
		selenium.open("/a/bluesoft.com.br/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/a/bluesoft.com.br/&ss=1&ltmpl=default&ltmplcache=2");
		selenium.type("id=Email", "nfe-teste");
		selenium.type("id=Passwd", "bluesoft8437");
		selenium.click("id=signIn");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}

}
