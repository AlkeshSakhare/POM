package com.freecrm.qa.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.freecrm.qa.base.Testbase;
import com.freecrm.qa.pages.IndexPage;

public class IndexPageTest extends Testbase {

	IndexPage indexPage;

	public IndexPageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		indexPage = new IndexPage();
	}

	@Test
	public void verifyLogin() {
		indexPage.loginToApp(properties.getProperty("userid"),
				properties.getProperty("password"));
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
