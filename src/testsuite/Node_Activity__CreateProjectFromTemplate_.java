package testsuite;
import org.testng.annotations.Test;
import PageObjects.*;
import utilities.PageObjectBase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import utilities.Configurations;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.util.HashMap;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import utilities.TestReport;
import java.io.IOException;
import org.testng.Reporter;
import utilities.DataUtil;


/** Conformiq generated test case
	Node_Activity__CreateProjectFromTemplate_
*/
public class Node_Activity__CreateProjectFromTemplate_ extends PageObjectBase
{

	public Node_Activity__CreateProjectFromTemplate_()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD, final String Step_3_UserId_textbox_TEXTBOX, final String Step_3_Password_textbox_TEXTBOX, final String Step_13_SourceTemplate_textbox_TEXTBOX, final String Step_13_ProjectName_textbox_TEXTBOX) throws Exception

	{

	VerifyMessage_Page verifymessage_page_init=PageFactory.initElements(driver, VerifyMessage_Page.class);

	LaunchURL_Page launchurl_page_init=PageFactory.initElements(driver, LaunchURL_Page.class);

	Msg__1__Page msg__1__page_init=PageFactory.initElements(driver, Msg__1__Page.class);

	SignInPage_Page signinpage_page_init=PageFactory.initElements(driver, SignInPage_Page.class);

	HomePage_Page homepage_page_init=PageFactory.initElements(driver, HomePage_Page.class);

	CostsTasks_Page coststasks_page_init=PageFactory.initElements(driver, CostsTasks_Page.class);

	ManageAccountingPeriods_Page manageaccountingperiods_page_init=PageFactory.initElements(driver, ManageAccountingPeriods_Page.class);

	Confirmation_Page confirmation_page_init=PageFactory.initElements(driver, Confirmation_Page.class);

	ImportCosts_Page importcosts_page_init=PageFactory.initElements(driver, ImportCosts_Page.class);

	CostsOverview_Page costsoverview_page_init=PageFactory.initElements(driver, CostsOverview_Page.class);

	ManageProjectCosts_Page manageprojectcosts_page_init=PageFactory.initElements(driver, ManageProjectCosts_Page.class);

	ExpenditureItem_Page expenditureitem_page_init=PageFactory.initElements(driver, ExpenditureItem_Page.class);

	TransferExpenditureItem_Page transferexpenditureitem_page_init=PageFactory.initElements(driver, TransferExpenditureItem_Page.class);

	CreateAccounting_Page createaccounting_page_init=PageFactory.initElements(driver, CreateAccounting_Page.class);

	ManageUnprocessedCosts_Page manageunprocessedcosts_page_init=PageFactory.initElements(driver, ManageUnprocessedCosts_Page.class);

	EditTransaction_Page edittransaction_page_init=PageFactory.initElements(driver, EditTransaction_Page.class);

	CaptureCosts_Page capturecosts_page_init=PageFactory.initElements(driver, CaptureCosts_Page.class);

	ManageProjectPlan_Page manageprojectplan_page_init=PageFactory.initElements(driver, ManageProjectPlan_Page.class);

	ManageProjectPlanTasks_Page manageprojectplantasks_page_init=PageFactory.initElements(driver, ManageProjectPlanTasks_Page.class);

	PFMMyProjects_Page pfmmyprojects_page_init=PageFactory.initElements(driver, PFMMyProjects_Page.class);

	PFMMyProjectsTasks_Page pfmmyprojectstasks_page_init=PageFactory.initElements(driver, PFMMyProjectsTasks_Page.class);

	CreateProjects_Page createprojects_page_init=PageFactory.initElements(driver, CreateProjects_Page.class);

	ProjectOverview_Page projectoverview_page_init=PageFactory.initElements(driver, ProjectOverview_Page.class);

	ProjectOverviewTasks_Page projectoverviewtasks_page_init=PageFactory.initElements(driver, ProjectOverviewTasks_Page.class);

	ManageFinProjectSettings_Page managefinprojectsettings_page_init=PageFactory.initElements(driver, ManageFinProjectSettings_Page.class);

	EditBasicInfo_Page editbasicinfo_page_init=PageFactory.initElements(driver, EditBasicInfo_Page.class);

	Attchments_Page attchments_page_init=PageFactory.initElements(driver, Attchments_Page.class);

	Open_Page open_page_init=PageFactory.initElements(driver, Open_Page.class);

	AddTeamMembers_Page addteammembers_page_init=PageFactory.initElements(driver, AddTeamMembers_Page.class);

	ChangeProjectStatus_Page changeprojectstatus_page_init=PageFactory.initElements(driver, ChangeProjectStatus_Page.class);

	EditProjectClassification_Page editprojectclassification_page_init=PageFactory.initElements(driver, EditProjectClassification_Page.class);

	ManageFinProjectPlan_Page managefinprojectplan_page_init=PageFactory.initElements(driver, ManageFinProjectPlan_Page.class);

	EditTaskDetails_Page edittaskdetails_page_init=PageFactory.initElements(driver, EditTaskDetails_Page.class);

	ManageResources_Page manageresources_page_init=PageFactory.initElements(driver, ManageResources_Page.class);

	AdditionalInformation_Page additionalinformation_page_init=PageFactory.initElements(driver, AdditionalInformation_Page.class);

	SetBaselineForProjectPlan_Page setbaselineforprojectplan_page_init=PageFactory.initElements(driver, SetBaselineForProjectPlan_Page.class);

	ManageBudgetVersions_Page managebudgetversions_page_init=PageFactory.initElements(driver, ManageBudgetVersions_Page.class);

	EditBudget_Page editbudget_page_init=PageFactory.initElements(driver, EditBudget_Page.class);

	OpenProject_Page openproject_page_init=PageFactory.initElements(driver, OpenProject_Page.class);

	PublishProgress_Page publishprogress_page_init=PageFactory.initElements(driver, PublishProgress_Page.class);

	CaptureProgress_Page captureprogress_page_init=PageFactory.initElements(driver, CaptureProgress_Page.class);
	testReport.createTesthtmlHeader(overallTestData);

	testReport.createHead(overallTestData);

	testReport.putLogo(overallTestData);

	float ne = (float) 0.0;

	testReport.generateGeneralInfo(overallTestData, "Node_Activity__CreateProjectFromTemplate_", "TC_Node_Activity__CreateProjectFromTemplate_", "",ne);

	testReport.createStepHeader();

	//External Circumstances


	Reporter.log("Step - 1- Perform LaunchURL Action");

	testReport.fillTableStep("Step 1", "Perform LaunchURL Action");

	launchurl_page_init.enter_URL_field(Step_1_URL_FIELD);


	Reporter.log("Step - 2- verify SignInPage screen");

	testReport.fillTableStep("Step 2", "verify SignInPage screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CreateProjectFromTemplate_","Step_2");

	Reporter.log("Step - 3- Fill SigninPage form SignInPage screen");

	testReport.fillTableStep("Step 3", "Fill SigninPage form SignInPage screen");

	signinpage_page_init.set_UserId_textbox(Step_3_UserId_textbox_TEXTBOX);
	signinpage_page_init.set_Password_textbox(Step_3_Password_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CreateProjectFromTemplate_","Step_3");

	Reporter.log("Step - 4- click SignIn button SignInPage screen");

	testReport.fillTableStep("Step 4", "click SignIn button SignInPage screen");

	signinpage_page_init.click_SignIn_button();
	
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CreateProjectFromTemplate_","Step_4");

	Reporter.log("Step - 5- verify HomePage screen");

	testReport.fillTableStep("Step 5", "verify HomePage screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CreateProjectFromTemplate_","Step_5");

	Reporter.log("Step - 6- click Navigator hyperlink HomePage screen");

	testReport.fillTableStep("Step 6", "click Navigator hyperlink HomePage screen");

	homepage_page_init.click_Navigator_hyperlink();
	Thread.sleep(5000);
	homepage_page_init.click_Show_More_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CreateProjectFromTemplate_","Step_6");

	Reporter.log("Step - 7- click ProjectFinancialManagement hyperlink HomePage screen");

	testReport.fillTableStep("Step 7", "click ProjectFinancialManagement hyperlink HomePage screen");
	Thread.sleep(5000);
	//driver.findElement(By.id("pt1:nv_itemNode_projects_projects")).click();
	homepage_page_init.click_ProjectFinancialManagement_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CreateProjectFromTemplate_","Step_7");

	Reporter.log("Step - 8- verify PFMMyProjects screen");

	testReport.fillTableStep("Step 8", "verify PFMMyProjects screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CreateProjectFromTemplate_","Step_8");

	Reporter.log("Step - 9- click Tasks button PFMMyProjects screen");

	testReport.fillTableStep("Step 9", "click Tasks button PFMMyProjects screen");
	Thread.sleep(5000);
	pfmmyprojects_page_init.click_Tasks_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CreateProjectFromTemplate_","Step_9");

	Reporter.log("Step - 10- verify PFMMyProjectsTasks popup");

	testReport.fillTableStep("Step 10", "verify PFMMyProjectsTasks popup");
	Thread.sleep(5000);
	//pfmmyprojectstasks_page_init.verify_Text("[Don't Care]");
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CreateProjectFromTemplate_","Step_10");

	Reporter.log("Step - 11- click CreateProject hyperlink PFMMyProjectsTasks popup");

	testReport.fillTableStep("Step 11", "click CreateProject hyperlink PFMMyProjectsTasks popup");
	Thread.sleep(5000);
	pfmmyprojectstasks_page_init.click_CreateProject_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CreateProjectFromTemplate_","Step_11");

	Reporter.log("Step - 12- verify CreateProjects popup");

	testReport.fillTableStep("Step 12", "verify CreateProjects popup");
	Thread.sleep(5000);
	//createprojects_page_init.verify_Text("[Don't Care]");
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CreateProjectFromTemplate_","Step_12");

	Reporter.log("Step - 13- Fill CreateProjects form CreateProjects popup");

	testReport.fillTableStep("Step 13", "Fill CreateProjects form CreateProjects popup");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[contains(@id,'_ATp:commandToolbarButton2')]")).click(); //Create From Template
	
	Thread.sleep(5000);
	//createprojects_page_init.set_SourceTemplate_textbox(Step_13_SourceTemplate_textbox_TEXTBOX);
	createprojects_page_init.set_ProjectName_textbox(Step_13_ProjectName_textbox_TEXTBOX); //ProjectName
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[contains(@id,'soc3::content')]")).sendKeys("1000"); //GEO
	driver.findElement(By.xpath("//*[contains(@id,'soc3::content')]")).sendKeys(Keys.TAB);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[contains(@id,'teamMember2NameId::content')]")).sendKeys("Selvaraj, Jimson"); //Project Manager
	driver.findElement(By.xpath("//*[contains(@id,'teamMember2NameId::content')]")).sendKeys(Keys.TAB);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[contains(@id,'teamMember3NameId::content')]")).sendKeys("Odnam, Ramu"); //Project Administrator
	driver.findElement(By.xpath("//*[contains(@id,'teamMember3NameId::content')]")).sendKeys(Keys.TAB);
	Thread.sleep(3000);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CreateProjectFromTemplate_","Step_13");

	Reporter.log("Step - 14- click SaveContinue button CreateProjects popup");

	testReport.fillTableStep("Step 14", "click SaveContinue button CreateProjects popup");

	createprojects_page_init.click_SaveContinue_button();
	Thread.sleep(10000);
	//driver.findElement(By.xpath("//*[contains(@id,'PrjFndProjectDefinitionPage:cb_done')]")).wait(5000);
	driver.findElement(By.xpath("//*[contains(@id,'PrjFndProjectDefinitionPage:cb_done')]")).click();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CreateProjectFromTemplate_","Step_14");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_1");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		//driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Node_Activity__CreateProjectFromTemplate_");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
