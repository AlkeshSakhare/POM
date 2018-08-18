package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;

public class IndexPage extends Testbase {

	@FindBy(name = "username")
	WebElement usename;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//*[@value='Login']")
	WebElement loginBtn;

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage loginToApp(String uid, String pw) {
		usename.sendKeys(uid);
		password.sendKeys(pw);
		loginBtn.click();
		return new HomePage();
	}

}
