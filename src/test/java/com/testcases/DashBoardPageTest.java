package com.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class DashBoardPageTest extends TestBase {
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;

	public DashBoardPageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test
	public void Verify_HomePage_TitleTest(){
		String dashBoardTitle = dashBoardPage.verifyHomePageTitle();
		Assert.assertEquals(dashBoardTitle, "AnalytiQs","Home page title not matched");
		Reporter.log("Title Verified - Test PASS", true);
	}
	
	@Test(dependsOnMethods="Verify_HomePage_TitleTest")
	public void Verify_DashBoardLink(){
		Assert.assertTrue(dashBoardPage.verifyDashboardLink(), "Dashboard Link Not Present - Test FAIL");
		Reporter.log("DashBoardLink Verified - Test PASS", true);
	}
	
	@Test(dependsOnMethods= {"Verify_HomePage_TitleTest","Verify_DashBoardLink"})
	public void Create_tab_functionality_Test(){
		dashBoardPage.verify_Create_tab_functionality();
		Reporter.log("Create Tab functionality is functional", true);
	}
	
	@Test(dependsOnMethods= {"Verify_HomePage_TitleTest","Verify_DashBoardLink","Create_tab_functionality_Test"})
	public void Add_Reports_Or_Graphics_to_Tab_Test() throws Exception {
		dashBoardPage.verify_Add_Reports_Or_Graphics_to_Tab();
		Reporter.log("All Selected Reports Added to the Tab Successfully",true);
	}
	
	@Test(dependsOnMethods= {"Verify_HomePage_TitleTest","Verify_DashBoardLink"})
	public void Delete_selective_report_from_Tab_Test() throws Exception {
		dashBoardPage.verify_Delete_selective_report_from_Tab();
		Reporter.log("Selected Report deleted from the Tab Successfully",true);
	}
	
	@Test(dependsOnMethods= {"Verify_HomePage_TitleTest","Verify_DashBoardLink"})
	public void Delete_Delete_selective_Tab_Test() throws Exception {
		dashBoardPage.verify_Delete_selective_Tab();
		Reporter.log("Tab Deleted Successfully",true);
	}
	
	@Test(dependsOnMethods= {"Verify_HomePage_TitleTest","Verify_DashBoardLink"})
	public void Play_Tabs_functionality_Test() throws Exception {
		dashBoardPage.verify_Play_Tabs_functionality();
		Reporter.log("Tabs Play and Pause option is functional",true);
	}
	
	@Test(dependsOnMethods= {"Verify_HomePage_TitleTest","Verify_DashBoardLink"})
	public void Preview_Option_Test() throws Exception {
		dashBoardPage.verify_Preview_Option();
		Reporter.log("Preview Option is functional",true);
	}
	
	@Test(dependsOnMethods= {"Verify_HomePage_TitleTest","Verify_DashBoardLink"})
	public void Share_Report_Option_Test() throws Exception {
		dashBoardPage.verify_Share_Report_Option("Vidya");
		Reporter.log("Share Option is functional",true);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
