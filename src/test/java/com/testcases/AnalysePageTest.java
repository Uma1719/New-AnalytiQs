package com.testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.AnalysePage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class AnalysePageTest extends TestBase {
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	AnalysePage analysePage;

	public AnalysePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		analysePage= new AnalysePage();
	}

	@Test
	public void AnalysePage_Test() {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_AnalysePage();
		Reporter.log("Analyse Page Verified Successfully",true);
	}
	
	@Test(dependsOnMethods="AnalysePage_Test")
	public void DataSets_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_DataSets();
		Reporter.log("Alanyse Page Verified Successfully & All Datasets List Present",true);
	}
	
	@Test(dependsOnMethods= {"AnalysePage_Test","DataSets_Test"})
	public void DataSet_Selection_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_DataSet_Selection();
		Reporter.log("All DataSets are Clickable and Functional",true);
	}
	
	@Test(dependsOnMethods= {"AnalysePage_Test","DataSets_Test"})
	public void Sub_DataSet_Selection_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Sub_DataSet_Selection();
		Reporter.log("Sub DataSet is Functional",true);
	}
	
	@Test(dependsOnMethods= {"AnalysePage_Test","DataSets_Test"})
	public void Sub_DataSet_Back_Button_Functionality_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Sub_DataSet_Back_Button_Functionality();
		Reporter.log("Sub DataSet Back Button is Functional",true);
	}
	
	@Test(dependsOnMethods= {"AnalysePage_Test","DataSets_Test"})
	public void Validate_Selected_Report_Test() {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Selected_Report("Quotations/BarChart/R");
		Reporter.log("Selected report is Validated Successfully",true);
	}
	
	@Test(dependsOnMethods= {"AnalysePage_Test","DataSets_Test"})
	public void Sort_By_Group_with_Selected_Field_Test() {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Sort_By_Group_with_Selected_Field("Quotations/TableDesign/SortByGroup/R");
		Reporter.log("Sort By Group with selected field is Functional",true);
	}
	
	@Test(dependsOnMethods= {"AnalysePage_Test","DataSets_Test"})
	public void Verify_Selected_Field_Total_Test() throws Exception {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_Selected_Field_Total("Quotations/TableDesign/FieldTotal/R");
		Reporter.log("Total of Selected field is Functional",true);
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
