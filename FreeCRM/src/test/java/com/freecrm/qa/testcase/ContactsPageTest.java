package com.freecrm.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.freecrm.qa.base.Testbase;
import com.freecrm.qa.pages.ContactsPage;
import com.freecrm.qa.pages.HomePage;
import com.freecrm.qa.pages.IndexPage;
import com.freecrm.qa.util.TestUtil;

public class ContactsPageTest extends Testbase {

	IndexPage indexPage;
	HomePage homePage;
	ContactsPage contactsPage;
	String sheetName = "contacts";

	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		indexPage = new IndexPage();
		homePage = indexPage.loginToApp(properties.getProperty("userid"),
				properties.getProperty("password"));
		// contactsPage = homePage.clickOnNewContact();
	}

	@DataProvider
	public Object[][] getAddContactData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		System.out.println(data);
		return data;
	}

	@Test(dataProvider = "getAddContactData")
	public void verifyAddContacts(String fName, String lName, String ph,
			String emailid) {
		contactsPage = homePage.clickOnNewContact();
		contactsPage.addContact(fName, lName, ph, emailid);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
