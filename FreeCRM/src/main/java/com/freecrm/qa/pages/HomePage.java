package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class HomePage extends Testbase {

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactTab;

	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContact;

	@FindBy(name = "mainpanel")
	WebElement mainiframe;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public ContactsPage clickOnNewContact() {
		driver.switchTo().frame(mainiframe);
		Actions actions = new Actions(driver);
		actions.moveToElement(contactTab).build().perform();
		newContact.click();
		return new ContactsPage();
	}
}
