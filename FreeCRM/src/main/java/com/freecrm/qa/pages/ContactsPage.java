package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class ContactsPage extends Testbase {

	@FindBy(id = "first_name")
	WebElement firstName;

	@FindBy(id = "surname")
	WebElement surname;

	@FindBy(id = "phone")
	WebElement phoneTxt;

	@FindBy(id = "email")
	WebElement emailTxt;

	@FindBy(name = "addmore")
	WebElement saveAndCreateAnotherBtn;

	@FindBy(xpath = "//*[@id='contactForm']/table/tbody/tr[1]/td/input[2]")
	WebElement saveBtn;

	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}

	public void addContact(String fName, String sName, String phNo, String email) {
		firstName.clear();
		firstName.sendKeys(fName);
		surname.clear();
		surname.sendKeys(sName);
		phoneTxt.clear();
		phoneTxt.sendKeys(phNo);
		emailTxt.clear();
		emailTxt.sendKeys(email);
		saveBtn.click();
	}
}
