package com.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.base.TestBase;
import com.util.GenericLibrary;
import com.util.JavascriptLibrary;

public class AnalysePage extends TestBase{
	// Objects Repository(OR):........................................................................
	@FindBy(xpath="//h3[contains(text(),'Quotations')]")
	WebElement Quotations_DataSet;

	@FindBy(xpath="//h3[contains(text(),'Sales')]")
	WebElement Sales_DataSet;

	@FindBy(xpath="//h3[contains(text(),'Purchasing')]")
	WebElement Purchasing_DataSet;

	@FindBy(xpath="//h3[contains(text(),'Production')]")
	WebElement Production_DataSet;

	@FindBy(xpath="//h3[contains(text(),'Quality')]")
	WebElement Quality_DataSet;

	@FindBy(xpath="//h3[contains(text(),'Despatch')]")
	WebElement Despatch_DataSet;

	@FindBy(xpath="//h3[contains(text(),'Stores')]")
	WebElement Stores_DataSet;

	@FindBy(xpath="//h3[contains(text(),'Finance')]")
	WebElement Finanace_DataSet;
	
	// DataSet Selection 
	@FindBy(xpath="//span[text()='Quotations']")
	WebElement Selected_Quotations;
	
	@FindBy(xpath="//span[text()='Sales']")
	WebElement Selected_Sales;
	
	@FindBy(xpath="//span[text()='Purchasing']")
	WebElement Selected_Purchasing;
	
	@FindBy(xpath="//span[text()='Despatch']")
	WebElement Selected_Despatch;
	
	// Sub-DataSet Selection
	@FindBy(xpath="//h3[text()='Jobs ']")
	WebElement Jobs_DataSet;
	
	@FindBy(xpath="//span[text()='Jobs']")
	WebElement Selected_JobsDataSet;
	
	@FindBy(xpath="//button[@title='Back']")
	WebElement SubDataSet_BatckBtn;
	
	// Validate Selected Report
	@FindBy(xpath=".//*[@id='backbtn']")
	WebElement backBtn;

	@FindBy(xpath=".//*[@id='searchReport']") 
	WebElement searchReport; 
	
	@FindBy(xpath="//a[text()='Quotations/BarChart/R']")
	WebElement Quotations_Barchart_Report;
	
	@FindBy(xpath="//a[contains(text(),'Analyse')]")
	WebElement Analyse_Title;
	
	@FindBy(xpath="//a[contains(text(),'Quotations')]")
	WebElement Quotations_Title;
	
	@FindBy(xpath="//b[text()='QUOTATIONS/BARCHART/R']")
	WebElement QUOTATIONS_BARCHART_R;
	
	// Sort By Group
	@FindBy(xpath="//a[text()='Quotations/TableDesign/SortByGroup/R']")
	WebElement Quotations_TableDesign_SortByGroup_R;
	
	@FindBy(xpath="//th[text()='Customer']")
	WebElement GroupBy_Customer;
	
	@FindBy(xpath="//td[text()='Airbus']")
	WebElement Group_Airbus;
	
	@FindBy(xpath="//td[text()='APPH']")
	WebElement Group_APPH;
	
	@FindBy(xpath="//td[text()='BAE Systems']")
	WebElement Group_BAEsystems;
	
	@FindBy(xpath="//td[text()='COMAC']")
	WebElement Group_COMAC;
	
	@FindBy(xpath="//td[text()='GE']")
	WebElement Group_GE;
	
	// Field Total
	@FindBy(xpath="//a[text()='Quotations/TableDesign/FieldTotal/R']")
	WebElement Quotations_TableDesign_FieldTotal_R;
	
	@FindBy(xpath="//a[@title='Go to last page']")
	WebElement GoToLastPage;
	
	@FindBy(xpath=".//*[@id='_table']/table/tbody/tr[15]/td[9]")
	WebElement TotalQuantity;
	
	

	// Initializing the Page Objects:................................................................
	public AnalysePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:......................................................................................
	
	public void verify_AnalysePage() {
		Assert.assertTrue(driver.getCurrentUrl().contains("Analyse"), "Unable to Navigate Analyse Page");
	}
	
	public void verify_DataSets() {
		Collection<String> act_List = Arrays.asList("Quotations","Sales","Purchasing","Production","Quality","Despatch","Stores","Finance");
		ArrayList<String> exp_List = new ArrayList<String>();
		exp_List.add(Quotations_DataSet.getText());
		exp_List.add(Sales_DataSet.getText());
		exp_List.add(Purchasing_DataSet.getText());
		exp_List.add(Production_DataSet.getText());
		exp_List.add(Quality_DataSet.getText());
		exp_List.add(Despatch_DataSet.getText());
		exp_List.add(Stores_DataSet.getText());
		exp_List.add(Finanace_DataSet.getText());
		Assert.assertEquals(act_List, exp_List, "DataSets Not Present");
	}
	
	public void verify_DataSet_Selection() throws Exception {
		GenericLibrary.waitForElementToBeClickable(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementVisibility(driver, Selected_Quotations);
		Assert.assertTrue(Selected_Quotations.getText().equalsIgnoreCase("Quotations"), "DataSet Not Selected");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementVisibility(driver, Selected_Sales);
		Assert.assertTrue(Selected_Sales.getText().equalsIgnoreCase("Sales"), "DataSet Not Selected");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementVisibility(driver, Selected_Purchasing);
		Assert.assertTrue(Selected_Purchasing.getText().equalsIgnoreCase("Purchasing"), "DataSet Not Selected");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, Despatch_DataSet);
		GenericLibrary.waitForElementVisibility(driver, Selected_Despatch);
		Assert.assertTrue(Selected_Despatch.getText().equalsIgnoreCase("Despatch"), "DataSet Not Selected");
	}
	
	public void verify_Sub_DataSet_Selection() throws Exception {
		GenericLibrary.waitForElementToBeClickable(driver, Production_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Production_DataSet);
		GenericLibrary.waitForElementVisibility(driver, Jobs_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Jobs_DataSet);
		GenericLibrary.waitForElementVisibility(driver, Selected_JobsDataSet);
		Assert.assertTrue(Selected_JobsDataSet.getText().equalsIgnoreCase("Jobs"), "Sub-DataSet Not Selected");
	}
	
	public void verify_Sub_DataSet_Back_Button_Functionality() throws Exception {
		GenericLibrary.waitForElementToBeClickable(driver, Production_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Production_DataSet);
		GenericLibrary.waitForElementVisibility(driver, Jobs_DataSet);
		Assert.assertTrue(Jobs_DataSet.isDisplayed(), "Sub DataSet Not present");
		JavascriptLibrary.javascriptClickElement(driver, SubDataSet_BatckBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementVisibility(driver, Production_DataSet);
		Assert.assertTrue(Production_DataSet.isDisplayed(), "Back Button Not working");
	}
	
	public void verify_Selected_Report(String reportName) {
		GenericLibrary.waitForElementToBeClickable(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		searchReport.sendKeys(reportName);
		GenericLibrary.waitForElementVisibility(driver, Quotations_Barchart_Report);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_Barchart_Report);
		GenericLibrary.waitForElementVisibility(driver, Analyse_Title);
		Assert.assertTrue(Analyse_Title.isDisplayed(), "Report Not present in Analyse");
		Reporter.log("Report Title verified successfully",true);
		Assert.assertTrue(Quotations_Title.isDisplayed(), "Report Not present in Selected DataSet");
		Reporter.log("Report DataSet verified successfully",true);
		Assert.assertTrue(QUOTATIONS_BARCHART_R.isDisplayed(), "No Report/Table/Chart found");
		Reporter.log("Report Chart/Table displayed successfully",true);
	}
	
	public void verify_Sort_By_Group_with_Selected_Field(String reportName) {
		GenericLibrary.waitForElementToBeClickable(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		searchReport.sendKeys(reportName);
		GenericLibrary.waitForElementVisibility(driver, Quotations_TableDesign_SortByGroup_R);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_TableDesign_SortByGroup_R);
		GenericLibrary.waitForElementVisibility(driver, GroupBy_Customer);
		Assert.assertTrue(GroupBy_Customer.isDisplayed(), "Report is not grouped by Customer");
		Reporter.log("This Report is grouped by Customer");
		Assert.assertTrue(Group_Airbus.isDisplayed(), "Airbus Customer not found");
		Reporter.log("Group 1 : "+Group_Airbus.getText(),true);
		Assert.assertTrue(Group_APPH.isDisplayed(), "APPH Customer not found");
		Reporter.log("Group 2 : "+Group_APPH.getText(),true);
		Assert.assertTrue(Group_BAEsystems.isDisplayed(), "BAE Systems Customer not found");
		Reporter.log("Group 3 : "+Group_BAEsystems.getText(),true);
		Assert.assertTrue(Group_COMAC.isDisplayed(), "COMAC Systems Customer not found");
		Reporter.log("Group 4 : "+Group_COMAC.getText(),true);
		Assert.assertTrue(Group_GE.isDisplayed(), "GE Customer not found");
		Reporter.log("Group 5 : "+Group_GE.getText(),true);
	}
	
	public void verify_Selected_Field_Total(String reportName) throws Exception {
		GenericLibrary.waitForElementToBeClickable(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		searchReport.sendKeys(reportName);
		GenericLibrary.waitForElementVisibility(driver, Quotations_TableDesign_FieldTotal_R);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_TableDesign_FieldTotal_R);
		GenericLibrary.waitForElementVisibility(driver, Quotations_TableDesign_FieldTotal_R);
		JavascriptLibrary.javascriptClickElement(driver, GoToLastPage);
		Thread.sleep(1000);
		Reporter.log("Selected field is: Quantity", true); 
		Reporter.log("Total of Selected Field is: "+TotalQuantity.getText(),true);
	}
}
