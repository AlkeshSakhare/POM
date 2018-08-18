package com.freecrm.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.Testbase;
import com.freecrm.qa.pages.HomePage;
import com.freecrm.qa.pages.IndexPage;

public class HomePageTest extends Testbase {

	IndexPage indexPage;
	HomePage homePage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		indexPage = new IndexPage();
		homePage = indexPage.loginToApp(properties.getProperty("userid"),
				properties.getProperty("password"));
	}

	@Test(priority = 0)
	public void clickOnCalender_NewEventTest() {
		homePage.clickOnCalender_NewEvent();
	}

	@Test(priority = 1)
	public void clickOnCalender_ViewTodayTest() {
		homePage.clickOnCalender_ViewToday();
	}

	@Test(priority = 2)
	public void clickOnCalender_WeekViewTest() {
		homePage.clickOnCalender_WeekView();
	}

	@Test(priority = 3)
	public void clickOnCalender_MonthViewTest() {
		homePage.clickOnCalender_MonthView();
	}

	@Test
	public void clickOnNewContactTest() {
		homePage.clickOnNewContact();
	}

	@Test
	public void clickOnCompanies_NewCompanyTest() {
		homePage.clickOnCompanies_NewCompany();
	}

	@Test
	public void clickOnCompanies_CombinedFormTest() {
		homePage.clickOnCompanies_CombinedForm();
	}

	@Test
	public void clickOnCompanies_FullSearchFormTest() {
		homePage.clickOnCompanies_FullSearchForm();
	}

	@Test
	public void clickOnDeals_NewDealTest() {
		homePage.clickOnDeals_NewDeal();
	}

	@Test
	public void clickOnDeals_ProductsTest() {
		homePage.clickOnDeals_Products();
	}

	@Test
	public void clickOnDeals_FullSearchFormTest() {
		homePage.clickOnDeals_FullSearchForm();
	}

	@Test
	public void clickOnTasks_NewTaskTest() {
		homePage.clickOnTasks_NewTask();
	}

	@Test
	public void clickOnTasks_FullSearchFormTest() {
		homePage.clickOnTasks_FullSearchForm();
	}

	@Test
	public void clickOnCases_NewCaseTest() {
		homePage.clickOnCases_NewCase();
	}

	@Test
	public void clickOnCases_FullSearchFormTest() {
		homePage.clickOnCases_FullSearchForm();
	}

	@Test
	public void clickOnCall_NewCallTest() {
		homePage.clickOnCall_NewCall();
	}

	@Test
	public void clickOnCall_CallListTest() {
		homePage.clickOnCall_CallList();
	}

	@Test
	public void clickOnEmail_NewEmailCampaignTest() {
		homePage.clickOnEmail_NewEmailCampaign();
	}

	@Test
	public void clickOnEmail_EmailTemplatesTest() {
		homePage.clickOnEmail_EmailTemplates();
	}

	@Test
	public void clickOnEmail_MailAccountsTest() {
		homePage.clickOnEmail_MailAccounts();
	}

	@Test
	public void clickOnEmail_CustomizeEmailContentTest() {
		homePage.clickOnEmail_CustomizeEmailContent();
	}

	@Test
	public void clickOnEmail_EmailSignatureTest() {
		homePage.clickOnEmail_EmailSignature();
	}

	@Test
	public void clickOnTextSMS_NewTextSMSCampaignTest() {
		homePage.clickOnTextSMS_NewTextSMSCampaign();
	}

	@Test
	public void clickOnTextSMS_TextSMSTemplatesTest() {
		homePage.clickOnTextSMS_TextSMSTemplates();
	}

	@Test
	public void clickOnTextSMS_TextSMSCreditsTest() {
		homePage.clickOnTextSMS_TextSMSCredits();
	}

	@Test
	public void clickOnPrint_NewPrintCampaignTest() {
		homePage.clickOnPrint_NewPrintCampaign();
	}

	@Test
	public void clickOnPrint_NewWordMergeTemplateTest() {
		homePage.clickOnPrint_NewWordMergeTemplate();
	}

	@Test
	public void clickOnCampaigns_NewEmailCampaignTest() {
		homePage.clickOnCampaigns_NewEmailCampaign();
	}

	@Test
	public void clickOnCampaigns_EmailTemplatesTest() {
		homePage.clickOnCampaigns_EmailTemplates();
	}

	@Test
	public void clickOnCampaigns_MailAccountsTest() {
		homePage.clickOnCampaigns_MailAccounts();
	}

	@Test
	public void clickOnCampaigns_TextSMSCampaignsTest() {
		homePage.clickOnCampaigns_TextSMSCampaigns();
	}

	@Test
	public void clickOnCampaigns_NewTextSMSCampaignTest() {
		homePage.clickOnCampaigns_NewTextSMSCampaign();
	}

	@Test
	public void clickOnCampaigns_TextSMSTemplatesTest() {
		homePage.clickOnCampaigns_TextSMSTemplates();
	}

	@Test
	public void clickOnCampaigns_TextSMSCreditsTest() {
		homePage.clickOnCampaigns_TextSMSCredits();
	}

	@Test
	public void clickOnCampaigns_PrintCampaignsTest() {
		homePage.clickOnCampaigns_PrintCampaigns();
	}

	@Test
	public void clickOnCampaigns_NewPrintCampaignTest() {
		homePage.clickOnCampaigns_NewPrintCampaign();
	}

	@Test
	public void clickOnCampaigns_NewWordMergeTemplateTest() {
		homePage.clickOnCampaigns_NewWordMergeTemplate();
	}

	@Test
	public void clickOnCampaigns_VoiceCampaignsTest() {
		homePage.clickOnCampaigns_VoiceCampaigns();
	}

	@Test
	public void clickOnDocs_NewDocumentTest() {
		homePage.clickOnDocs_NewDocument();
	}

	@Test
	public void clickOnDocs_NewDirectoryTest() {
		homePage.clickOnDocs_NewDirectory();
	}

	@Test
	public void clickOnDocs_NewWordMergeTemplateTest() {
		homePage.clickOnDocs_NewWordMergeTemplate();
	}

	@Test
	public void clickOnDocs_MultiDocUploadTest() {
		homePage.clickOnDocs_MultiDocUpload();
	}

	@Test
	public void clickOnForms_NewFormTest() {
		homePage.clickOnForms_NewForm();
	}

	@Test
	public void clickOnReportsTest() {
		homePage.clickOnReports();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
