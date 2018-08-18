package com.freecrm.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.Testbase;
import com.freecrm.qa.pages.IndexPage;

public class IndexPageTest extends Testbase {

	IndexPage indexPage;

	public IndexPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		indexPage = new IndexPage();
	}

	@Test
	public void verifyLogin() {
		indexPage.loginToApp(properties.getProperty("userid"),
				properties.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
