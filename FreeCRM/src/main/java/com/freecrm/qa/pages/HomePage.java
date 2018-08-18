package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.Testbase;
import com.freecrm.qa.util.TestUtil;

public class HomePage extends Testbase {

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement Contacts;

	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement Contacts_NewContact;

	@FindBy(name = "mainpanel")
	WebElement mainiframe;

	@FindBy(xpath = "//a[contains(text(),'Calendar')]")
	WebElement Calender;

	@FindBy(xpath = "//a[contains(text(),'New Event')]")
	WebElement Calender_NewEvent;

	@FindBy(xpath = "//a[contains(text(),'View Today')]")
	WebElement Calender_ViewToday;

	@FindBy(xpath = "//a[contains(text(),'Week View')]")
	WebElement Calender_WeekView;

	@FindBy(xpath = "//a[contains(text(),'Month View')]")
	WebElement Calender_MonthView;

	@FindBy(xpath = "//a[contains(text(),'Companies')]")
	WebElement Companies;

	@FindBy(xpath = "//a[contains(text(),'New Company')]")
	WebElement Companies_NewCompany;

	@FindBy(xpath = "//a[contains(text(),'Combined Form')]")
	WebElement Companies_CombinedForm;

	@FindBy(xpath = "//*[@id='navmenu']/ul/li[3]/ul/li[3]/a")
	WebElement Companies_FullSearchForm;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement Deals;

	@FindBy(xpath = "//a[contains(text(),'New Deal')]")
	WebElement Deals_NewDeal;

	@FindBy(xpath = "//a[contains(text(),'Products')]")
	WebElement Deals_Products;

	@FindBy(xpath = "//*[@id='navmenu']/ul/li[5]/ul/li[3]/a")
	WebElement Deals_FullSearchForm;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement Tasks;

	@FindBy(xpath = "//a[contains(text(),'New Task')]")
	WebElement Tasks_NewTask;

	@FindBy(xpath = "//*[@id='navmenu']/ul/li[6]/ul/li[2]/a")
	WebElement Tasks_FullSearchForm;

	@FindBy(xpath = "//a[contains(text(),'Cases')]")
	WebElement Cases;

	@FindBy(xpath = "//a[contains(text(),'New Case')]")
	WebElement Cases_NewCase;

	@FindBy(xpath = "// *[@id='navmenu']/ul/li[7]/ul/li[2]/a")
	WebElement Cases_FullSearchForm;

	@FindBy(xpath = "//a[contains(text(),'Call')]")
	WebElement Call;

	@FindBy(xpath = "//a[contains(text(),'New Call')]")
	WebElement Call_NewCall;

	@FindBy(xpath = "//a[contains(text(),'Call List')]")
	WebElement Call_CallList;

	@FindBy(xpath = "//a[contains(text(),'Email')]")
	WebElement Email;

	@FindBy(xpath = "//a[contains(text(),'New Email Campaign')]")
	WebElement Email_NewEmailCampaign;

	@FindBy(xpath = "//a[contains(text(),'Email Templates')]")
	WebElement Email_EmailTemplates;

	@FindBy(xpath = "//a[contains(text(),'Mail Accounts')]")
	WebElement Email_MailAccounts;

	@FindBy(xpath = "//a[contains(text(),'Customize Email Content')]")
	WebElement Email_CustomizeEmailContent;

	@FindBy(xpath = "//a[contains(text(),'Email Signature')]")
	WebElement Email_EmailSignature;

	@FindBy(xpath = "//a[contains(text(),'Text/SMS')]")
	WebElement TextSMS;

	@FindBy(xpath = "//a[contains(text(),'New Text/SMS Campaign')]")
	WebElement TextSMS_NewTextSMSCampaign;

	@FindBy(xpath = "//a[contains(text(),'Text/SMS Templates')]")
	WebElement TextSMS_TextSMSTemplates;

	@FindBy(xpath = "//a[contains(text(),'Text/SMS Credits')]")
	WebElement TextSMS_TextSMSCredits;

	@FindBy(xpath = "//a[contains(text(),'Print')]")
	WebElement Print;

	@FindBy(xpath = "//a[contains(text(),'New Print Campaign')]")
	WebElement Print_NewPrintCampaign;

	@FindBy(xpath = "//a[contains(text(),'New Word Merge Template')]")
	WebElement Print_NewWordMergeTemplate;

	@FindBy(xpath = "//a[contains(text(),'Campaigns')]")
	WebElement Campaigns;

	@FindBy(xpath = "//a[contains(text(),'New Email Campaign')]")
	WebElement Campaigns_NewEmailCampaign;

	@FindBy(xpath = "//a[contains(text(),'Email Templates')]")
	WebElement Campaigns_EmailTemplates;

	@FindBy(xpath = "//a[contains(text(),'Mail Accounts')]")
	WebElement Campaigns_MailAccounts;

	@FindBy(xpath = "//a[contains(text(),'Text/SMS Campaigns')]")
	WebElement Campaigns_TextSMSCampaigns;

	@FindBy(xpath = "//a[contains(text(),'New Text/SMS Campaign')]")
	WebElement Campaigns_NewTextSMSCampaign;

	@FindBy(xpath = "//a[contains(text(),'Text/SMS Templates')]")
	WebElement Campaigns_TextSMSTemplates;

	@FindBy(xpath = "//a[contains(text(),'Text/SMS Credits')]")
	WebElement Campaigns_TextSMSCredits;

	@FindBy(xpath = "//a[contains(text(),'Print Campaigns')]")
	WebElement Campaigns_PrintCampaigns;

	@FindBy(xpath = "//a[contains(text(),'New Print Campaign')]")
	WebElement Campaigns_NewPrintCampaign;

	@FindBy(xpath = "//a[contains(text(),'New Word Merge Template')]")
	WebElement Campaigns_NewWordMergeTemplate;

	@FindBy(xpath = "//a[contains(text(),'Voice Campaigns')]")
	WebElement Campaigns_VoiceCampaigns;

	@FindBy(xpath = "//a[contains(text(),'Docs')]")
	WebElement Docs;

	@FindBy(xpath = "//a[contains(text(),'New Document')]")
	WebElement Docs_NewDocument;

	@FindBy(xpath = "//a[contains(text(),'New Directory')]")
	WebElement Docs_NewDirectory;

	@FindBy(xpath = "//a[contains(text(),'New Word Merge Template')]")
	WebElement Docs_NewWordMergeTemplate;

	@FindBy(xpath = "//a[contains(text(),'Multi Doc Upload')]")
	WebElement Docs_MultiDocUpload;

	@FindBy(xpath = "//a[contains(text(),'Forms')]")
	WebElement Forms;

	@FindBy(xpath = "//a[contains(text(),'New Form')]")
	WebElement Forms_NewForm;

	@FindBy(xpath = "//a[contains(text(),'Reports')]")
	WebElement Reports;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public ContactsPage clickOnNewContact() {
		TestUtil.switchToFrame(driver, mainiframe, Contacts);
		Contacts_NewContact.click();
		return new ContactsPage();
	}

	public void clickOnCalender_NewEvent() {
		TestUtil.switchToFrame(driver, mainiframe, Calender);
		Calender_NewEvent.click();
	}

	public void clickOnCalender_ViewToday() {
		TestUtil.switchToFrame(driver, mainiframe, Calender);
		Calender_ViewToday.click();
	}

	public void clickOnCalender_WeekView() {
		TestUtil.switchToFrame(driver, mainiframe, Calender);
		Calender_WeekView.click();
	}

	public void clickOnCalender_MonthView() {
		TestUtil.switchToFrame(driver, mainiframe, Calender);
		Calender_MonthView.click();
	}

	public void clickOnCompanies_NewCompany() {
		TestUtil.switchToFrame(driver, mainiframe, Companies);
		Companies_NewCompany.click();
	}

	public void clickOnCompanies_CombinedForm() {
		TestUtil.switchToFrame(driver, mainiframe, Companies);
		Companies_CombinedForm.click();
	}

	public void clickOnCompanies_FullSearchForm() {
		TestUtil.switchToFrame(driver, mainiframe, Companies);
		Companies_FullSearchForm.click();
	}

	public void clickOnDeals_NewDeal() {
		TestUtil.switchToFrame(driver, mainiframe, Deals);
		Deals_NewDeal.click();
	}

	public void clickOnDeals_Products() {
		TestUtil.switchToFrame(driver, mainiframe, Deals);
		Deals_Products.click();
	}

	public void clickOnDeals_FullSearchForm() {
		TestUtil.switchToFrame(driver, mainiframe, Deals);
		Deals_FullSearchForm.click();
	}

	public void clickOnTasks_NewTask() {
		TestUtil.switchToFrame(driver, mainiframe, Tasks);
		Tasks_NewTask.click();
	}

	public void clickOnTasks_FullSearchForm() {
		TestUtil.switchToFrame(driver, mainiframe, Tasks);
		Tasks_FullSearchForm.click();
	}

	public void clickOnCases_NewCase() {
		TestUtil.switchToFrame(driver, mainiframe, Cases);
		Cases_NewCase.click();
	}

	public void clickOnCases_FullSearchForm() {
		TestUtil.switchToFrame(driver, mainiframe, Cases);
		Cases_FullSearchForm.click();
	}

	public void clickOnCall_NewCall() {
		TestUtil.switchToFrame(driver, mainiframe, Call);
		Call_NewCall.click();
	}

	public void clickOnCall_CallList() {
		TestUtil.switchToFrame(driver, mainiframe, Call);
		Call_CallList.click();
	}

	public void clickOnEmail_NewEmailCampaign() {
		TestUtil.switchToFrame(driver, mainiframe, Email);
		Email_NewEmailCampaign.click();
	}

	public void clickOnEmail_EmailTemplates() {
		TestUtil.switchToFrame(driver, mainiframe, Email);
		Email_EmailTemplates.click();
	}

	public void clickOnEmail_MailAccounts() {
		TestUtil.switchToFrame(driver, mainiframe, Email);
		Email_MailAccounts.click();
	}

	public void clickOnEmail_CustomizeEmailContent() {
		TestUtil.switchToFrame(driver, mainiframe, Email);
		Email_CustomizeEmailContent.click();
	}

	public void clickOnEmail_EmailSignature() {
		TestUtil.switchToFrame(driver, mainiframe, Email);
		Email_EmailSignature.click();
	}

	public void clickOnTextSMS_NewTextSMSCampaign() {
		TestUtil.switchToFrame(driver, mainiframe, TextSMS);
		TextSMS_NewTextSMSCampaign.click();
	}

	public void clickOnTextSMS_TextSMSTemplates() {
		TestUtil.switchToFrame(driver, mainiframe, TextSMS);
		TextSMS_TextSMSTemplates.click();
	}

	public void clickOnTextSMS_TextSMSCredits() {
		TestUtil.switchToFrame(driver, mainiframe, TextSMS);
		TextSMS_TextSMSCredits.click();
	}

	public void clickOnPrint_NewPrintCampaign() {
		TestUtil.switchToFrame(driver, mainiframe, Print);
		Print_NewPrintCampaign.click();
	}

	public void clickOnPrint_NewWordMergeTemplate() {
		TestUtil.switchToFrame(driver, mainiframe, Print);
		Print_NewWordMergeTemplate.click();
	}

	public void clickOnCampaigns_NewEmailCampaign() {
		TestUtil.switchToFrame(driver, mainiframe, Campaigns);
		Campaigns_NewEmailCampaign.click();
	}

	public void clickOnCampaigns_EmailTemplates() {
		TestUtil.switchToFrame(driver, mainiframe, Campaigns);
		Campaigns_EmailTemplates.click();
	}

	public void clickOnCampaigns_MailAccounts() {
		TestUtil.switchToFrame(driver, mainiframe, Campaigns);
		Campaigns_MailAccounts.click();
	}

	public void clickOnCampaigns_TextSMSCampaigns() {
		TestUtil.switchToFrame(driver, mainiframe, Campaigns);
		Campaigns_TextSMSCampaigns.click();
	}

	public void clickOnCampaigns_NewTextSMSCampaign() {
		TestUtil.switchToFrame(driver, mainiframe, Campaigns);
		Campaigns_NewTextSMSCampaign.click();
	}

	public void clickOnCampaigns_TextSMSTemplates() {
		TestUtil.switchToFrame(driver, mainiframe, Campaigns);
		Campaigns_TextSMSTemplates.click();
	}

	public void clickOnCampaigns_TextSMSCredits() {
		TestUtil.switchToFrame(driver, mainiframe, Campaigns);
		Campaigns_TextSMSCredits.click();
	}

	public void clickOnCampaigns_PrintCampaigns() {
		TestUtil.switchToFrame(driver, mainiframe, Campaigns);
		Campaigns_PrintCampaigns.click();
	}

	public void clickOnCampaigns_NewPrintCampaign() {
		TestUtil.switchToFrame(driver, mainiframe, Campaigns);
		Campaigns_NewPrintCampaign.click();
	}

	public void clickOnCampaigns_NewWordMergeTemplate() {
		TestUtil.switchToFrame(driver, mainiframe, Campaigns);
		Campaigns_NewWordMergeTemplate.click();
	}

	public void clickOnCampaigns_VoiceCampaigns() {
		TestUtil.switchToFrame(driver, mainiframe, Campaigns);
		Campaigns_VoiceCampaigns.click();
	}

	public void clickOnDocs_NewDocument() {
		TestUtil.switchToFrame(driver, mainiframe, Docs);
		Docs_NewDocument.click();
	}

	public void clickOnDocs_NewDirectory() {
		TestUtil.switchToFrame(driver, mainiframe, Docs);
		Docs_NewDirectory.click();
	}

	public void clickOnDocs_NewWordMergeTemplate() {
		TestUtil.switchToFrame(driver, mainiframe, Docs);
		Docs_NewWordMergeTemplate.click();
	}

	public void clickOnDocs_MultiDocUpload() {
		TestUtil.switchToFrame(driver, mainiframe, Docs);
		Docs_MultiDocUpload.click();
	}

	public void clickOnForms_NewForm() {
		TestUtil.switchToFrame(driver, mainiframe, Forms);
		Forms_NewForm.click();
	}

	public void clickOnReports() {
		TestUtil.switchToFrame(driver, mainiframe, Reports);
		Reports.click();
	}

}
