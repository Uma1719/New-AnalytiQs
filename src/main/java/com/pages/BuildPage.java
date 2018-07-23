package com.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.base.TestBase;
import com.util.GenericLibrary;
import com.util.JavascriptLibrary;

public class BuildPage extends TestBase {

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

	// Create Report
	@FindBy(xpath="//*[@title='Create new report']")
	WebElement createNewReportBtn;

	@FindBy(xpath=".//*[@id='reportName']")
	WebElement reportNameTxtBox;

	@FindBy(xpath="//*[@title='Save Report']")
	WebElement saveReportBtn;

	@FindBy(xpath="//*[@title='Back']")
	WebElement backBtn;
	
	@FindBy(xpath=".//*[@id='searchReport']")
	WebElement searchReportTextBox;

	@FindBy(xpath="//*[@title='Search']") 
	WebElement searchReport; 

	@FindBy(xpath="//a[text()='Quotations/R1']")
	WebElement Quotations_R1;

	// Delete Report
	@FindBy(xpath="//*[@title='Delete']")
	WebElement deleteBtn;

	// Table report
	@FindBy(xpath="//span[text()='Table Design']//following::span[1]")
	WebElement column1;

	@FindBy(xpath="//span[contains(text(),'Table Design')]//following::span[3]")
	WebElement column2;

	@FindBy(xpath="//span[text()='Table Design']//following::i[2]")
	WebElement deleteColumnBtn;

	@FindBy(xpath="//button[text()='Yes']")
	WebElement confirmDeleteColumn;

	@FindBy(xpath="//button[text()='Remove all']")
	WebElement removeAllBtn;

	@FindBy(xpath="//button[text()='Yes']")
	WebElement yesBtn;

	@FindBy(xpath="//button[text()='Add all']")
	WebElement addAllBtn;

	@FindBy(xpath="//span[text()='Customer']")
	WebElement customerColumn;

	// Add Selected fields to Report
	@FindBy(xpath="//span[text()='Part No.']")
	WebElement partNo;

	@FindBy(xpath="//span[text()='Part Description']")
	WebElement partDescription;
	
	@FindBy(xpath="//span[text()='Description']")
	WebElement description;

	@FindBy(xpath="//span[text()='Quantity']")
	WebElement quantity;

	@FindBy(xpath="//span[text()='Unit Price']")
	WebElement unitPrice;

	@FindBy(xpath="//span[text()='Net Value']")
	WebElement netValue;

	@FindBy(xpath=".//*[@id='fieldDrop']")
	WebElement dropField;
	
	@FindBy(xpath="//span[text()='Table Design']//following::span[contains(text(),'Part No.')]")
	WebElement addedPartNo;
	
	@FindBy(xpath="//span[text()='Table Design']//following::span[contains(text(),'Part Description')]")
	WebElement addedPartDescription;
	
	@FindBy(xpath="//span[text()='Table Design']//following::span[contains(text(),'Description')]")
	WebElement addedDescription;
	
	@FindBy(xpath="//span[text()='Table Design']//following::span[contains(text(),'Quantity')]")
	WebElement addedQuantity;
	
	@FindBy(xpath="//span[text()='Table Design']//following::span[contains(text(),'Unit Price')]")
	WebElement addedUnitPrice;
	
	@FindBy(xpath="//span[text()='Table Design']//following::span[contains(text(),'Net Value')]")
	WebElement addedNetValue;

	// Sorting
	@FindBy(xpath="//span[text()='Quotations Fields']//following::span[1]")
	WebElement customer;
	
	@FindBy(xpath="//span[text()='Sales Fields']//following::span[1]")
	WebElement sales_Customer;

	@FindBy(xpath=".//*[@id='sortDrop']")
	WebElement sortDropField;

	@FindBy(xpath="//td[text()='Customer']")
	WebElement sortingItem_customer;

	@FindBy(xpath="//td[text()='Customer']//following::i[1]")
	WebElement descendingOrderBtn;

	@FindBy(xpath="//td[text()='Customer']//following::i[2]")
	WebElement closeSortingBtn;

	@FindBy(xpath=".//*[@id='groupDrop']")
	WebElement sortByGroupField;

	@FindBy(xpath=".//*[@id='totalDrop']")
	WebElement totalOftheSelectedField;

	// Filter
	@FindBy(xpath="//a[text()='filter']")
	WebElement filterOption;

	@FindBy(xpath=".//*[@id='filterDrop']")
	WebElement filterDropField;

	@FindBy(xpath="//button[@title='Nothing selected']")
	WebElement selectCustomerTxtBox;

	@FindBy(xpath="//input[@type='text']")
	WebElement searchCustomerfield;

	@FindBy(xpath="//span[text()='Airbus']")
	WebElement airbusOption;

	@FindBy(xpath="//span[text()='Enquiry Date']")
	WebElement enquiryDate;
	
	@FindBy(xpath="//span[text()='Order Date']")
	WebElement orderDate;

	@FindBy(xpath="//label[text()='Type']//following::button[1]")
	WebElement selectDateTxtBox;

	@FindBy(xpath="//span[text()='Last Six Months']")
	WebElement lastSixMonthsOption;

	@FindBy(xpath="//span[text()='Last Twelve Months']")
	WebElement lastTwelveMonthsOption;

	// Filter - single Entity
	@FindBy(xpath="//span[text()='Quote No.']")
	WebElement quoteNo;

	@FindBy(xpath="//span[text()='Quote No.']//following::input[1]")
	WebElement quoteNoTxtBox;

	// Filter - Start & Range
	@FindBy(xpath="//span[text()='Part No.']//following::label[text()='Start']//following::input[1]")
	WebElement partNoStartTxtBox;

	@FindBy(xpath="//span[text()='Part No.']//following::label[text()='Start']//following::input[2]")
	WebElement partNoEndTxtBox;

	// Filter - Dates Range
	@FindBy(xpath="//span[text()='Enquiry Date']//following::label[text()='Type']//following::button")
	WebElement dateType;

	@FindBy(xpath="//span[text()='Exact Period']")
	WebElement exactPeriodOption;

	@FindBy(xpath="//span[text()='Enquiry Date']//following::label[text()='Start']//following::input[1]")
	WebElement startDateField;

	@FindBy(xpath="//span[text()='Enquiry Date']//following::label[text()='Start']//following::input[2]")
	WebElement endDateField;

	@FindBy(xpath="//span[text()='Enquiry Date']")
	WebElement enquiryDateText;

	// Share
	@FindBy(xpath="//a[text()='share']")
	WebElement shareOption;

	@FindBy(xpath="//*[text()='ALLOCATED']//following::button[1]")
	WebElement shareSearchOption;

	@FindBy(xpath="//input[@id='sharefind']")
	WebElement shareSearchBox;

	@FindBy(xpath="//b[text()='Company']//following::button[1]")
	WebElement shareToCompany;

	@FindBy(xpath="//b[text()='User']//following::button[2]")
	WebElement shareToVidyaR;

	@FindBy(xpath="//b[text()='User']//following::button[2]")
	WebElement shareToMaheshR;

	// Summary Design
	@FindBy(xpath=".//*[@id='chartType1']")
	WebElement summaryDesign;

	@FindBy(xpath="//span[text()='Customer']")
	WebElement customerField;

	@FindBy(xpath=".//*[@id='xd']")
	WebElement xAxis;

	@FindBy(xpath=".//*[@id='yd']")
	WebElement yAxis;

	@FindBy(xpath=".//*[@id='x2d']")
	WebElement zAxis;

	// BarChart Design
	@FindBy(xpath=".//*[@id='chartType2']")
	WebElement barChartDesign;

	@FindBy(xpath=".//*[@id='fyd']/a")
	WebElement y1;

	@FindBy(xpath=".//*[@id='newY']/a")
	WebElement y2;

	@FindBy(xpath=".//*[@id='liXd']/a")
	WebElement x1;

	@FindBy(id="xColumn")
	WebElement xColumns;

	@FindBy(xpath=".//*[@id='liX2d']/a")
	WebElement x2;

	@FindBy(xpath="//select[@id='filterOn']")
	WebElement filter;

	@FindBy(xpath=".//*[@id='target']")
	WebElement targetTextBox;

	@FindBy(xpath="//label[text()='Label']//following::span[2]")
	WebElement labelON;

	@FindBy(xpath="//label[text()='Label']//following::span[3]")
	WebElement labelOFF;

	@FindBy(xpath="//label[text()='Report Total']//following::span[2]")
	WebElement reportTotalON;

	@FindBy(xpath="//label[text()='Report Total']//following::span[3]")
	WebElement reportTotalOFF;

	@FindBy(xpath="//label[text()='Column Total']//following::span[2]")
	WebElement columnTotalON;

	@FindBy(xpath="//label[text()='Column Total']//following::span[3]")
	WebElement columnTotalOFF;

	@FindBy(id="formattingType")
	WebElement FormatingType;

	@FindBy(id="formattingField")
	WebElement formatingField;

	@FindBy(xpath="//span[text()='Formatting']//following::a[@title='Add Condition'][1]")
	WebElement addCondtionBtn;

	@FindBy(xpath="//span[text()='Formatting']//following::a[@title='Add Condition'][1]//following::input[1]")
	WebElement colorField;

	@FindBy(id="layoutType")
	WebElement layoutType;

	@FindBy(id="layoutField")
	WebElement layoutField;

	@FindBy(xpath="//span[text()='Layout']//following::a[5]")
	WebElement addLayoutCondition;

	@FindBy(xpath="//span[text()='Layout']//following::select[contains(@id,'layoutItem')][1]")
	WebElement layoutSelectCustomer;

	@FindBy(xpath="//span[text()='Layout']//following::i[1]")
	WebElement negativeValueGraphBtn;

	// LineChart Design
	@FindBy(xpath=".//*[@id='chartType3']")
	WebElement lineChartDesign;

	@FindBy(xpath=".//*[@id='newyd']")
	WebElement y2Axis;

	@FindBy(xpath="//span[text()='Layout']//following::a[5]")
	WebElement addLayoutCondition2;
	
	// PieChart Design
	@FindBy(xpath=".//*[@id='chartType4']")
	WebElement pieChartDesign;
	
	// ScatterChart Design
	@FindBy(xpath=".//*[@id='chartType5']")
	WebElement scatterChartDesign;
	
	@FindBy(xpath=".//*[@id='newyd']")
	WebElement scatter_yAxis;
	
	@FindBy(xpath=".//*[@id='yd']")
	WebElement scatter_xAxis;
	
	// WaterFallChart Design
	@FindBy(xpath=".//*[@id='chartType6']")
	WebElement waterFallChartDesign;
	
	// BoxPlot Design
	@FindBy(xpath=".//*[@id='chartType8']")
	WebElement boxPlotChartDesign;
	
	// RoseChart Design
	@FindBy(xpath=".//*[@id='chartType9']")
	WebElement roseChartDesign;
	
	// SpiderChart Design
	@FindBy(xpath=".//*[@id='chartType10']")
	WebElement spiderChartDesign;
	
	// BubbleChart Design
	@FindBy(xpath=".//*[@id='chartType11']")
	WebElement bubbleChartDesign;
	
	@FindBy(xpath="//span[contains(text(),'x axis')]/..")
	WebElement bubbleChart_xAxis;
	
	@FindBy(xpath="//span[contains(text(),'z axis')]/..")
	WebElement bubbleChart_zAxis;
	
	// Sales DataSet 
	@FindBy(xpath="//a[text()='Sales/R1']")
	WebElement Sales_R1;
	
	@FindBy(xpath="//span[text()='Sales Fields']//following::span[text()='Order No.'][1]")
	WebElement SalesFields_orderNo;
	
	@FindBy(xpath="//span[text()='Order No.']//following::input[1]")
	WebElement orderNoTextBox;
	
	@FindBy(xpath="//span[text()='Quantity']//following::button[3]")
	WebElement quantityTypeOption;
	
	@FindBy(xpath="//span[text()='Range']")
	WebElement rangeOption;
	
	@FindBy(xpath="//span[text()='Quantity']//following::input[2]")
	WebElement quantityStartTextBox;
	
	@FindBy(xpath="//span[text()='Quantity']//following::input[3]")
	WebElement quantityEndTextBox;
	
	@FindBy(xpath="//span[text()='Order Date']//following::label[text()='Start']//following::input[1]")
	WebElement orderDate_startDateField;

	@FindBy(xpath="//span[text()='Order Date']//following::label[text()='Start']//following::input[2]")
	WebElement orderDate_endDateField;

	@FindBy(xpath="//span[text()='Order Date']")
	WebElement orderDateText;
	
	@FindBy(xpath="//span[text()='Order Date']//following::label[text()='Type']//following::button")
	WebElement orderDate_dateType;
	
	// Purchasing DataSet
	@FindBy(xpath="//a[text()='Purchasing/R1']")
	WebElement Purchasing_R1;
	
	@FindBy(xpath="//span[text()='Table Design']//following::span[text()='PO No.']")
	WebElement poNoColumn;
	
	// Purchasing - Add selected fields 
	@FindBy(xpath="//span[text()='PO No.']")
	WebElement PONo;

	@FindBy(xpath="//span[text()='Supplier']")
	WebElement Supplier;
	
	@FindBy(xpath="//span[text()='PO Date']")
	WebElement PODate;

	@FindBy(xpath="//span[text()='Unit Price']")
	WebElement UnitPrice;

	@FindBy(xpath="//span[text()='Net Price']")
	WebElement NetPrice;
	
	@FindBy(xpath="//span[text()='Table Design']//following::span[contains(text(),'PO No.')]")
	WebElement added_PONo;
	
	@FindBy(xpath="//span[text()='Table Design']//following::span[contains(text(),'Supplier')]")
	WebElement added_Supplier;
	
	@FindBy(xpath="//span[text()='Table Design']//following::span[contains(text(),'PO Date')]")
	WebElement added_PODate;
		
	@FindBy(xpath="//span[text()='Table Design']//following::span[contains(text(),'Unit Price')]")
	WebElement added_UnitPrice;
	
	@FindBy(xpath="//span[text()='Table Design']//following::span[contains(text(),'Unit Price')]")
	WebElement added_NetPrice;
	
	// Purchasing - Ascending & Descending 
	@FindBy(xpath="//td[text()='Supplier']//following::i[2]")
	WebElement Supplier_closeSortingBtn;
	
	@FindBy(xpath="//td[text()='Supplier']//following::i[1]")
	WebElement Supplier_descendingOrderBtn;
	
	// Filter
	@FindBy(xpath="//button[@title='Nothing selected']")
	WebElement selectSupplierTxtBox;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement searchSupplierfield;
	
	@FindBy(xpath="//span[text()='Apollo Aerospace Components']")
	WebElement ApolloAerospaceComponentsOption;
	
	// Filter - Single entity & Range
	@FindBy(xpath="//span[text()='PO No.']//following::input[1]")
	WebElement PONoTxtBox;
	
	@FindBy(xpath="//span[text()='Net Price']//following::button[3]")
	WebElement netPriceType;
	
	@FindBy(xpath="//span[text()='Net Price']//following::label[text()='Start']//following::input[1]")
	WebElement netPriceStartTxtBox;

	@FindBy(xpath="//span[text()='Net Price']//following::label[text()='Start']//following::input[2]")
	WebElement netPriceEndTxtBox;
	
	// Filter - Dates Range
	@FindBy(xpath="//span[text()='PO Date']//following::label[text()='Type']//following::button")
	WebElement PODateType;

	@FindBy(xpath="//span[text()='PO Date']//following::label[text()='Start']//following::input[1]")
	WebElement POStartDateField;

	@FindBy(xpath="//span[text()='PO Date']//following::label[text()='Start']//following::input[2]")
	WebElement POEndDateField;

	@FindBy(xpath="//span[text()='PO Date']")
	WebElement PODateText;
	
	// Production DataSet
	@FindBy(xpath="//h3[text()='Jobs ']")
	WebElement Jobs_DataSet;

	@FindBy(xpath="//h3[text()='Operations ']")
	WebElement Operations_Dataset;
	
	@FindBy(xpath="//h3[text()='Clockings ']")
	WebElement Clockings_Dataset;
	
	// Quality DataSet
	@FindBy(xpath="//h3[contains(text(),'Supplier Reject')]")
	WebElement SupplierReject_DataSet;

	@FindBy(xpath="//h3[contains(text(),'Internal Reject')]")
	WebElement InternalReject_DataSet;
	
	@FindBy(xpath="//h3[contains(text(),'Customer Reject')]")
	WebElement CustomerReject_DataSet;
	
	// Stores DataSet
	@FindBy(xpath="//h3[text()='Raw Material ']")
	WebElement RawMaterial_Dataset;
	
	@FindBy(xpath="//h3[text()='Finished Goods ']")
	WebElement FinishedGoods_Dataset;
	
	// Finance DataSet 
	@FindBy(xpath="//h3[text()='Sales Invoices ']")
	WebElement SalesInvoices_Dataset;
	
	@FindBy(xpath="//h3[contains(text(),'Purchase Invoic')]")
	WebElement PurchaseInvoice_Dataset;
	
	@FindBy(xpath="//h3[text()='WIP ']")
	WebElement WIP_Dataset;
	
	// Copy Report 
	@FindBy(xpath="//*[@title='More']")
	WebElement moreBtn;
	
	@FindBy(xpath="//*[@title='Copy']")
	WebElement CopyReportBtn;
	
	@FindBy(xpath="//a[text()='Report - Master']")
	WebElement masterReport;
	
	@FindBy(xpath="//a[text()='Report - Copy']")
	WebElement copyReport;


	// Initializing the Page Objects:................................................................
	public BuildPage() {
		PageFactory.initElements(driver, this);
	}


	// Actions:......................................................................................

	public void verify_BuildPage() {
		Assert.assertTrue(driver.getCurrentUrl().contains("Build"), "Unable to Navigate Build Page");
	}

	public void verify_DataSet() {
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

	public void verify_Quotations_DataSet_Create_Report(String reportName, String searchReportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		searchReportTextBox.sendKeys(searchReportName);
		JavascriptLibrary.javascriptClickElement(driver, searchReport);
		GenericLibrary.waitForElementVisibility(driver, Quotations_R1);
		Assert.assertTrue(Quotations_R1.isDisplayed(), "Report Not Created Successfully");
	}

	public void verify_Quotations_DataSet_Delete_Report(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, deleteBtn);
		Thread.sleep(1000);
		GenericLibrary.waitForAlertPresent(driver);
		driver.switchTo().alert().accept();
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
	}

	public void verify_Quotations_Dataset_Table_Design_Swaping_Columns(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(column1, column2).perform();
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_Table_Design_Column_Deletion(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, column2);
		JavascriptLibrary.javascriptClickElement(driver, column2);
		GenericLibrary.waitForElementToBeClickable(driver, deleteColumnBtn);
		JavascriptLibrary.javascriptClickElement(driver, deleteColumnBtn);
		GenericLibrary.waitForElementVisibility(driver, confirmDeleteColumn);
		JavascriptLibrary.javascriptClickElement(driver, confirmDeleteColumn);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_Table_Design_Remove_and_Add_all_columns(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, removeAllBtn);
		JavascriptLibrary.javascriptClickElement(driver, removeAllBtn);
		GenericLibrary.waitForElementToBeClickable(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Reporter.log("All Fields Removed Successfully",true);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, addAllBtn);
		JavascriptLibrary.javascriptClickElement(driver, addAllBtn);
		GenericLibrary.waitForElementToBeClickable(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		GenericLibrary.waitForElementVisibility(driver, customerColumn);
		Assert.assertTrue(customerColumn.isDisplayed(), "Fields Not Added");
		Reporter.log("All Fields Added Successfully",true);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_Add_selected_fields_to_Report(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, removeAllBtn);
		JavascriptLibrary.javascriptClickElement(driver, removeAllBtn);
		GenericLibrary.waitForElementToBeClickable(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(partNo, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, addedPartNo);
		act.dragAndDrop(partDescription, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, addedPartDescription);
		act.dragAndDrop(quantity, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, addedQuantity);
		act.dragAndDrop(unitPrice, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, addedUnitPrice);
		act.dragAndDrop(netValue, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, addedNetValue);
		Reporter.log("Selected Field: "+partNo.getText(),true);
		Reporter.log("Selected Field: "+partDescription.getText(),true);
		Reporter.log("Selected Field: "+quantity.getText(),true);
		Reporter.log("Selected Field: "+unitPrice.getText(),true);
		Reporter.log("Selected Field: "+netValue.getText(),true);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_Drop_sort_field_Ascending_and_Descending_Order(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String name = list.get(i).getText();
			Reporter.log("Customer Name Before Sorting "+i+":" +name ,true);
		}
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		Actions act=new Actions(driver);
		act.dragAndDrop(customer, sortDropField).build().perform();
		Thread.sleep(2000);
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[1]"));
		int count2 = list2.size();
		for (int i = 0; i < count2; i++) {
			String name = list2.get(i).getText();
			Reporter.log("Ascending Order - Customer "+i+":" +name ,true);
		}
		JavascriptLibrary.javascriptClickElement(driver, descendingOrderBtn);
		Thread.sleep(2000);
		List<WebElement> list3 = driver.findElements(By.xpath("//tr/td[1]"));
		int count3 = list3.size();
		for (int i = 0; i < count3; i++) {
			String name = list3.get(i).getText();
			Reporter.log("Descending Order - Customer "+i+":" +name ,true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, closeSortingBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeSortingBtn);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_Sort_by_Group_report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		Actions act=new Actions(driver);
		act.dragAndDrop(customer, sortByGroupField).build().perform();
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_Total_of_the_selected_field_report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, totalOftheSelectedField).build().perform();
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_filter_option(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, filterOption);
		JavascriptLibrary.javascriptClickElement(driver, filterOption);
		Thread.sleep(3000);
		// Customer Name
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		int count = list.size();
		for (int i = 20; i < count; i++) {
			String name = list.get(i).getText();
			Reporter.log("Customer Name Before Filter Action "+i+":" +name ,true);
		}
		Actions act=new Actions(driver);
		act.dragAndDrop(customer, filterDropField).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, selectCustomerTxtBox);
		JavascriptLibrary.javascriptClickElement(driver, selectCustomerTxtBox);
		JavascriptLibrary.javascriptType(driver, searchCustomerfield, "Airbus");
		JavascriptLibrary.javascriptClickElement(driver, airbusOption);
		Thread.sleep(2000);
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[1]"));
		int count2 = list2.size();
		for (int i = 20; i < count2; i++) {
			String name = list2.get(i).getText();
			Reporter.log("Customer Name After Filter Action "+i+":" +name ,true);
		}
		// Enquire Date
		List<WebElement> list3 = driver.findElements(By.xpath("//tr/td[3]"));
		int count3 = list3.size();
		for (int i = 20; i < count3; i++) {
			String name = list3.get(i).getText();
			Reporter.log("Enquiry Date Before Filter Action "+i+":" +name ,true);
		}
		act.dragAndDrop(enquiryDate, filterDropField).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, selectDateTxtBox);
		JavascriptLibrary.javascriptClickElement(driver, selectDateTxtBox);
		JavascriptLibrary.javascriptClickElement(driver, lastTwelveMonthsOption);
		Thread.sleep(2000);
		List<WebElement> list4 = driver.findElements(By.xpath("//tr/td[3]"));
		int count4 = list4.size();
		for (int i = 20; i < count4; i++) {
			String name = list4.get(i).getText();
			Reporter.log("Enquiry Date After Filter Action "+i+":" +name ,true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_filter_Single_Entity_and_Start_and_End_option(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, filterOption);
		JavascriptLibrary.javascriptClickElement(driver, filterOption);
		Thread.sleep(3000);
		// Single Entity - Quote No.
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[4]"));
		int count = list.size();
		for (int i = 20; i < count; i++) {
			String name = list.get(i).getText();
			Reporter.log("Quote No. Before Filter Action "+i+":" +name ,true);
		}
		Actions act=new Actions(driver);
		act.dragAndDrop(quoteNo, filterDropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, quoteNoTxtBox);
		quoteNoTxtBox.sendKeys("7083");
		quoteNoTxtBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[4]"));
		int count2 = list2.size();
		for (int i = 20; i < count2; i++) {
			String name = list2.get(i).getText();
			Reporter.log("Quote No. After Filter Action "+i+":" +name ,true);
		}
		// Start & End
		List<WebElement> list3 = driver.findElements(By.xpath("//tr/td[7]"));
		int count3 = list3.size();
		for (int i = 20; i < count3; i++) {
			String name = list3.get(i).getText();
			Reporter.log("PART No. Before Filter Action "+i+":" +name ,true);
		}
		act.dragAndDrop(partNo, filterDropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, partNoStartTxtBox);
		partNoStartTxtBox.sendKeys("PART15");
		partNoEndTxtBox.sendKeys("PART20");
		partNoEndTxtBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		List<WebElement> list4 = driver.findElements(By.xpath("//tr/td[7]"));
		int count4 = list4.size();
		for (int i = 20; i < count4; i++) {
			String name = list4.get(i).getText();
			Reporter.log("PART No's Between 15 and 20 are "+i+":" +name ,true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_filter_Date_wise_record_option(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, filterOption);
		JavascriptLibrary.javascriptClickElement(driver, filterOption);
		Thread.sleep(3000);
		// Range - Dates
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[3]"));
		int count = list.size();
		for (int i = 20; i < count; i++) {
			String name = list.get(i).getText();
			Reporter.log("Enquiry dates before filter action "+i+":" +name ,true);
		}
		Actions act=new Actions(driver);
		act.dragAndDrop(enquiryDate, filterDropField).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, dateType);
		JavascriptLibrary.javascriptClickElement(driver, dateType);
		JavascriptLibrary.javascriptClickElement(driver, exactPeriodOption);
		// start date
		startDateField.click();
		List<WebElement> switchToYear = driver.findElements(By.cssSelector(".switch"));
		for (WebElement ele : switchToYear) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear2 = driver.findElements(By.cssSelector(".switch"));
		for (WebElement ele : switchToYear2) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> yearsList = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsList) {
			String text = ele.getText();
			if(text.contains("2017")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsList = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsList) {
			String text = ele.getText();
			if(text.contains("Oct")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if(text.contains("1")) {
				ele.click();
				break;
			}
		}
		enquiryDateText.click(); // to come out of calendar field
		// end date
		endDateField.click();
		List<WebElement> switchToYear3 = driver.findElements(By.cssSelector(".switch"));
		for (WebElement ele : switchToYear3) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear4 = driver.findElements(By.cssSelector(".switch"));
		for (WebElement ele : switchToYear4) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> yearsList2 = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsList2) {
			String text = ele.getText();
			if(text.contains("2017")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsList2 = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsList2) {
			String text = ele.getText();
			if(text.contains("Oct")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayList2 = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList2) {
			String text = ele.getText();
			if(text.contains("31")) {
				ele.click();
				break;
			}
		}
		enquiryDateText.click(); // to come out of calendar field
		Thread.sleep(1000);
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[3]"));
		int count2 = list2.size();
		for (int i = 20; i < count2; i++) {
			String name = list2.get(i).getText();
			Reporter.log("Enquiry dates in October Range "+i+":" +name ,true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_Share_Report_option(String reportName, String companyName, String user1, String user2) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, shareOption);
		JavascriptLibrary.javascriptClickElement(driver, shareOption);
		JavascriptLibrary.javascriptClickElement(driver, shareSearchOption);
		shareSearchBox.sendKeys(companyName);
		GenericLibrary.waitForElementToBeClickable(driver, shareToCompany);
		JavascriptLibrary.javascriptClickElement(driver, shareToCompany);
		GenericLibrary.waitForElementVisibility(driver, shareSearchBox);
		shareSearchBox.clear();
		shareSearchBox.sendKeys(user1);
		GenericLibrary.waitForElementToBeClickable(driver, shareToMaheshR);
		JavascriptLibrary.javascriptClickElement(driver, shareToMaheshR);
		GenericLibrary.waitForElementVisibility(driver, shareSearchBox);
		shareSearchBox.clear();
		shareSearchBox.sendKeys(user2);
		GenericLibrary.waitForElementToBeClickable(driver, shareToVidyaR);
		JavascriptLibrary.javascriptClickElement(driver, shareToVidyaR);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_Summary_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, summaryDesign);
		JavascriptLibrary.javascriptClickElement(driver, summaryDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(partNo, xAxis).build().perform();
		act.dragAndDrop(customerField, yAxis).build().perform();
		act.dragAndDrop(quantity, zAxis).build().perform();
		Thread.sleep(1000);
		for(WebElement tdata : driver.findElements(By.tagName("tr"))){
			Reporter.log(tdata.getText()+ "\t",true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_BarChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, barChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, barChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(partNo, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(customerField, xAxis).build().perform();
		Thread.sleep(2000);
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		JavascriptLibrary.javascriptClickElement(driver, x2);
		act.dragAndDrop(enquiryDate, zAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		targetTextBox.sendKeys("50000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, columnTotalOFF);
		Select sel3=new Select(FormatingType);
		sel3.selectByVisibleText("Conditional");
		Select sel4=new Select(formatingField);
		sel4.selectByVisibleText("Customer");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		driver.findElement(By.xpath("//span[text()='Airbus']")).click();
		Select sel5=new Select(layoutType);
		sel5.selectByVisibleText("Custom");
		Select sel6=new Select(layoutField);
		sel6.selectByVisibleText("Customer");
		GenericLibrary.waitForElementToBeClickable(driver, addLayoutCondition);
		JavascriptLibrary.javascriptClickElement(driver, addLayoutCondition);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, negativeValueGraphBtn);
		driver.navigate().refresh();
		Select sel7=new Select(layoutSelectCustomer);
		sel7.selectByVisibleText("GE");
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_LineChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, lineChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, lineChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, y2);
		act.dragAndDrop(netValue, y2Axis).build().perform();
		act.dragAndDrop(customerField, xAxis).build().perform();
		// Handle stale element - xColumns
		for(int i=0; i<=2; i++){
			try{
				Select sel=new Select(xColumns);
				sel.selectByVisibleText("12");
				//Driver.findElement(By.id()).click();
				break;
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		GenericLibrary.waitForElementVisibility(driver, targetTextBox);
		targetTextBox.sendKeys("50000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, columnTotalOFF);
		Select sel3=new Select(FormatingType);
		sel3.selectByVisibleText("Conditional");
		Select sel4=new Select(formatingField);
		sel4.selectByVisibleText("Customer");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		driver.findElement(By.xpath("//span[text()='Hyde Aero Products']")).click();
		Select sel5=new Select(layoutType);
		sel5.selectByVisibleText("Custom");
		Select sel6=new Select(layoutField);
		sel6.selectByVisibleText("Customer");
		GenericLibrary.waitForElementToBeClickable(driver, addLayoutCondition2);
		JavascriptLibrary.javascriptClickElement(driver, addLayoutCondition2);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, negativeValueGraphBtn);
		driver.navigate().refresh();
		Select sel7=new Select(layoutSelectCustomer);
		sel7.selectByVisibleText("Hyde Aero Products");
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quotation_Dataset_PieChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, pieChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, pieChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(customerField, xAxis).build().perform();
		Thread.sleep(2000);
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		JavascriptLibrary.javascriptClickElement(driver, x2);
		act.dragAndDrop(enquiryDate, zAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		driver.navigate().refresh();
		Select sel3=new Select(FormatingType);
		sel3.selectByVisibleText("Conditional");
		Select sel4=new Select(formatingField);
		sel4.selectByVisibleText("Customer");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		driver.findElement(By.xpath("//span[text()='Airbus']")).click();
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Quotation_Dataset_ScatterChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, scatterChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, scatterChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, scatter_yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, scatter_xAxis);
		act.dragAndDrop(netValue, scatter_xAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
		
	public void verify_Quotation_Dataset_WaterFallChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, waterFallChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, waterFallChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(customerField, xAxis).build().perform();
		Thread.sleep(2000);
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		targetTextBox.sendKeys("50000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		Select sel3=new Select(FormatingType);
		sel3.selectByVisibleText("Conditional");
		Select sel4=new Select(formatingField);
		sel4.selectByVisibleText("Customer");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		driver.findElement(By.xpath("//span[text()='Airbus']")).click();
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Quotation_Dataset_BoxPlotChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, boxPlotChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, boxPlotChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(customerField, xAxis).build().perform();
		Thread.sleep(2000);
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		targetTextBox.sendKeys("50000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Quotation_Dataset_RoseChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, roseChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, roseChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(customerField, xAxis).build().perform();
		JavascriptLibrary.javascriptClickElement(driver, x2);
		act.dragAndDrop(enquiryDate, zAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Quotation_Dataset_SpiderChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, spiderChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, spiderChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(customerField, xAxis).build().perform();
		Thread.sleep(3000);		
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		JavascriptLibrary.javascriptClickElement(driver, x2);
		act.dragAndDrop(enquiryDate, zAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Quotation_Dataset_BubbleChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, bubbleChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, bubbleChartDesign);
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, bubbleChart_xAxis);
		act.dragAndDrop(netValue, bubbleChart_xAxis).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, bubbleChart_zAxis);
		act.dragAndDrop(unitPrice, bubbleChart_zAxis).build().perform();
		
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_DataSet_Create_Report(String reportName, String searchItem) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		searchReport.sendKeys(searchItem);
		GenericLibrary.waitForElementVisibility(driver, Sales_R1);
		Assert.assertTrue(Sales_R1.isDisplayed(), "Report Not Created Successfully");
	}
	
	public void verify_Sales_DataSet_Delete_Report(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, deleteBtn);
		Thread.sleep(1000);
		GenericLibrary.waitForAlertPresent(driver);
		driver.switchTo().alert().accept();
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
	}
	
	public void verify_Sales_Dataset_Table_Design_Swaping_Columns(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(column1, column2).perform();
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_Table_Design_Column_Deletion(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, column2);
		JavascriptLibrary.javascriptClickElement(driver, column2);
		GenericLibrary.waitForElementToBeClickable(driver, deleteColumnBtn);
		JavascriptLibrary.javascriptClickElement(driver, deleteColumnBtn);
		GenericLibrary.waitForElementVisibility(driver, confirmDeleteColumn);
		JavascriptLibrary.javascriptClickElement(driver, confirmDeleteColumn);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Sales_Dataset_Table_Design_Remove_and_add_all_columns(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, removeAllBtn);
		JavascriptLibrary.javascriptClickElement(driver, removeAllBtn);
		GenericLibrary.waitForElementToBeClickable(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Reporter.log("All Fields Removed Successfully",true);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, addAllBtn);
		JavascriptLibrary.javascriptClickElement(driver, addAllBtn);
		GenericLibrary.waitForElementToBeClickable(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		GenericLibrary.waitForElementVisibility(driver, customerColumn);
		Assert.assertTrue(customerColumn.isDisplayed(), "Fields Not Added");
		Reporter.log("All Fields Added Successfully",true);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_Add_selected_fields_to_Report(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, removeAllBtn);
		JavascriptLibrary.javascriptClickElement(driver, removeAllBtn);
		GenericLibrary.waitForElementToBeClickable(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(partNo, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, addedPartNo);
		act.dragAndDrop(description, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, addedDescription);
		act.dragAndDrop(quantity, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, addedQuantity);
		act.dragAndDrop(unitPrice, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, addedUnitPrice);
		act.dragAndDrop(netValue, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, addedNetValue);
		Reporter.log("Selected Field: "+partNo.getText(),true);
		Reporter.log("Selected Field: "+description.getText(),true);
		Reporter.log("Selected Field: "+quantity.getText(),true);
		Reporter.log("Selected Field: "+unitPrice.getText(),true);
		Reporter.log("Selected Field: "+netValue.getText(),true);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_Drop_sort_field_Ascending_and_Descending_Order(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String name = list.get(i).getText();
			Reporter.log("Customer Name Before Sorting "+i+":" +name ,true);
		}
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		Actions act=new Actions(driver);
		act.dragAndDrop(sales_Customer, sortDropField).build().perform();
		Thread.sleep(3000);
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[1]"));
		int count2 = list2.size();
		for (int i = 0; i < count2; i++) {
			String name = list2.get(i).getText();
			Reporter.log("Ascending Order - Customer "+i+":" +name ,true);
		}
		JavascriptLibrary.javascriptClickElement(driver, descendingOrderBtn);
		Thread.sleep(3000);
		List<WebElement> list3 = driver.findElements(By.xpath("//tr/td[1]"));
		int count3 = list3.size();
		for (int i = 0; i < count3; i++) {
			String name = list3.get(i).getText();
			Reporter.log("Descending Order - Customer "+i+":" +name ,true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, closeSortingBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeSortingBtn);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_Sort_by_Group_report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		Actions act=new Actions(driver);
		act.dragAndDrop(sales_Customer, sortByGroupField).build().perform();
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_Total_of_the_selected_field_report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, "Sales/TableDesign/FieldTotal/R");
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, totalOftheSelectedField).build().perform();
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_filter_option(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, filterOption);
		JavascriptLibrary.javascriptClickElement(driver, filterOption);
		Thread.sleep(5000);
		// Customer Name
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		int count = list.size();
		for (int i = 20; i < count; i++) {
			String name = list.get(i).getText();
			Reporter.log("Customer Name Before Filter Action "+i+":" +name ,true);
		}
		Actions act=new Actions(driver);
		act.dragAndDrop(sales_Customer, filterDropField).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, selectCustomerTxtBox);
		JavascriptLibrary.javascriptClickElement(driver, selectCustomerTxtBox);
		JavascriptLibrary.javascriptType(driver, searchCustomerfield, "Airbus");
		JavascriptLibrary.javascriptClickElement(driver, airbusOption);
		Thread.sleep(2000);
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[1]"));
		int count2 = list2.size();
		for (int i = 20; i < count2; i++) {
			String name = list2.get(i).getText();
			Reporter.log("Customer Name After Filter Action "+i+":" +name ,true);
		}
		
		// Enquire Date
		List<WebElement> list3 = driver.findElements(By.xpath("//tr/td[4]"));
		int count3 = list3.size();
		for (int i = 20; i < count3; i++) {
			String name = list3.get(i).getText();
			Reporter.log("Order Date Before Filter Action "+i+":" +name ,true);
		}
		act.dragAndDrop(orderDate, filterDropField).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, selectDateTxtBox);
		JavascriptLibrary.javascriptClickElement(driver, selectDateTxtBox);
		JavascriptLibrary.javascriptClickElement(driver, lastTwelveMonthsOption);
		Thread.sleep(2000);
		List<WebElement> list4 = driver.findElements(By.xpath("//tr/td[4]"));
		int count4 = list4.size();
		for (int i = 20; i < count4; i++) {
			String name = list4.get(i).getText();
			Reporter.log("Order Date After Filter Action "+i+":" +name ,true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_filter_Single_Entity_and_Start_and_End_option(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, filterOption);
		JavascriptLibrary.javascriptClickElement(driver, filterOption);
		Thread.sleep(5000);
		// Single Entity - Order No.
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[2]"));
		int count = list.size();
		for (int i = 20; i < count; i++) {
			String name = list.get(i).getText();
			Reporter.log("Order No. Before Filter Action "+i+":" +name ,true);
		}
		Actions act=new Actions(driver);
		act.dragAndDrop(SalesFields_orderNo, filterDropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, orderNoTextBox);
		orderNoTextBox.sendKeys("WJ294827482");
		orderNoTextBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[2]"));
		int count2 = list2.size();
		for (int i = 20; i < count2; i++) {
			String name = list2.get(i).getText();
			Reporter.log("Order No. After Filter Action "+i+":" +name ,true);
		}
		// Start & End
		List<WebElement> list3 = driver.findElements(By.xpath("//tr/td[8]"));
		int count3 = list3.size();
		for (int i = 20; i < count3; i++) {
			String name = list3.get(i).getText();
			Reporter.log("Quantity Before Filter Action "+i+":" +name ,true);
		}
		act.dragAndDrop(quantity, filterDropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, quantityTypeOption);
		JavascriptLibrary.javascriptClickElement(driver, quantityTypeOption);
		JavascriptLibrary.javascriptClickElement(driver, rangeOption);
		Thread.sleep(1000);
		quantityStartTextBox.sendKeys("50");
		quantityEndTextBox.sendKeys("100");
		quantityEndTextBox.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		List<WebElement> list4 = driver.findElements(By.xpath("//tr/td[8]"));
		int count4 = list4.size();
		for (int i = 20; i < count4; i++) {
			String name = list4.get(i).getText();
			Reporter.log("Quantity Between 50 and 100 are "+i+":" +name ,true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_filter_Date_wise_record_option(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, filterOption);
		JavascriptLibrary.javascriptClickElement(driver, filterOption);
		Thread.sleep(4000);
		// Range - Dates
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[4]"));
		int count = list.size();
		for (int i = 20; i < count; i++) {
			String name = list.get(i).getText();
			Reporter.log("Order dates before filter action "+i+":" +name ,true);
		}
		Actions act=new Actions(driver);
		act.dragAndDrop(orderDate, filterDropField).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, orderDate_dateType);
		JavascriptLibrary.javascriptClickElement(driver, orderDate_dateType);
		JavascriptLibrary.javascriptClickElement(driver, exactPeriodOption);
		// start date
		orderDate_startDateField.click();
		List<WebElement> switchToYear = driver.findElements(By.cssSelector(".switch"));
		for (WebElement ele : switchToYear) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear2 = driver.findElements(By.cssSelector(".switch"));
		for (WebElement ele : switchToYear2) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> yearsList = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsList) {
			String text = ele.getText();
			if(text.contains("2016")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsList = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsList) {
			String text = ele.getText();
			if(text.contains("Dec")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if(text.contains("1")) {
				ele.click();
				break;
			}
		}
		orderDateText.click(); // to come out of calendar field
		// end date
		orderDate_endDateField.click();
		List<WebElement> switchToYear3 = driver.findElements(By.cssSelector(".switch"));
		for (WebElement ele : switchToYear3) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear4 = driver.findElements(By.cssSelector(".switch"));
		for (WebElement ele : switchToYear4) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> yearsList2 = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsList2) {
			String text = ele.getText();
			if(text.contains("2016")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsList2 = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsList2) {
			String text = ele.getText();
			if(text.contains("Dec")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayList2 = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList2) {
			String text = ele.getText();
			if(text.contains("31")) {
				ele.click();
				break;
			}
		}
		orderDateText.click(); // to come out of calendar field
		Thread.sleep(1000);
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[4]"));
		int count2 = list2.size();
		for (int i = 20; i < count2; i++) {
			String name = list2.get(i).getText();
			Reporter.log("Order dates in 2016 December Range "+i+":" +name ,true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_Share_Report_option(String reportName, String companyName, String user1, String user2) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, shareOption);
		JavascriptLibrary.javascriptClickElement(driver, shareOption);
		JavascriptLibrary.javascriptClickElement(driver, shareSearchOption);
		shareSearchBox.sendKeys(companyName);
		GenericLibrary.waitForElementToBeClickable(driver, shareToCompany);
		JavascriptLibrary.javascriptClickElement(driver, shareToCompany);
		GenericLibrary.waitForElementVisibility(driver, shareSearchBox);
		shareSearchBox.clear();
		shareSearchBox.sendKeys(user1);
		GenericLibrary.waitForElementToBeClickable(driver, shareToMaheshR);
		JavascriptLibrary.javascriptClickElement(driver, shareToMaheshR);
		GenericLibrary.waitForElementVisibility(driver, shareSearchBox);
		shareSearchBox.clear();
		shareSearchBox.sendKeys(user2);
		GenericLibrary.waitForElementToBeClickable(driver, shareToVidyaR);
		JavascriptLibrary.javascriptClickElement(driver, shareToVidyaR);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_Summary_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, summaryDesign);
		JavascriptLibrary.javascriptClickElement(driver, summaryDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(partNo, xAxis).build().perform();
		act.dragAndDrop(customerField, yAxis).build().perform();
		act.dragAndDrop(quantity, zAxis).build().perform();
		Thread.sleep(1000);
		for(WebElement tdata : driver.findElements(By.tagName("tr"))){
			Reporter.log(tdata.getText()+ "\t",true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_BarChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, barChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, barChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(partNo, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(customerField, xAxis).build().perform();
		Thread.sleep(2000);
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		JavascriptLibrary.javascriptClickElement(driver, x2);
		act.dragAndDrop(quantity, zAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		targetTextBox.sendKeys("50000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, columnTotalOFF);
		Select sel3=new Select(FormatingType);
		sel3.selectByVisibleText("Conditional");
		
		Thread.sleep(5000);
		 
		Select sel4=new Select(formatingField);
		sel4.selectByVisibleText("Customer");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		driver.findElement(By.xpath("//span[text()='Airbus']")).click();
		Select sel5=new Select(layoutType);
		sel5.selectByVisibleText("Custom");
		
		Thread.sleep(5000);
			
		Select sel6=new Select(layoutField);
		sel6.selectByVisibleText("Customer");
		GenericLibrary.waitForElementToBeClickable(driver, addLayoutCondition);
		JavascriptLibrary.javascriptClickElement(driver, addLayoutCondition);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, negativeValueGraphBtn);
		driver.navigate().refresh();
		Select sel7=new Select(layoutSelectCustomer);
		sel7.selectByVisibleText("GE");
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_LineChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, lineChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, lineChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, y2);
		act.dragAndDrop(netValue, y2Axis).build().perform();
		act.dragAndDrop(customerField, xAxis).build().perform();
		// Handle stale element - xColumns
		for(int i=0; i<=2; i++){
			try{
				Select sel=new Select(xColumns);
				sel.selectByVisibleText("12");
				//Driver.findElement(By.id()).click();
				break;
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		GenericLibrary.waitForElementVisibility(driver, targetTextBox);
		targetTextBox.sendKeys("50000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, columnTotalOFF);
		Select sel3=new Select(FormatingType);
		sel3.selectByVisibleText("Conditional");
		Select sel4=new Select(formatingField);
		sel4.selectByVisibleText("Customer");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		driver.findElement(By.xpath("//span[text()='Hyde Aero Products']")).click();
		Select sel5=new Select(layoutType);
		sel5.selectByVisibleText("Custom");
		Select sel6=new Select(layoutField);
		sel6.selectByVisibleText("Customer");
		GenericLibrary.waitForElementToBeClickable(driver, addLayoutCondition2);
		JavascriptLibrary.javascriptClickElement(driver, addLayoutCondition2);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, negativeValueGraphBtn);
		driver.navigate().refresh();
		Select sel7=new Select(layoutSelectCustomer);
		sel7.selectByVisibleText("Hyde Aero Products");
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_PieChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, pieChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, pieChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(customerField, xAxis).build().perform();
		Thread.sleep(2000);
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		JavascriptLibrary.javascriptClickElement(driver, x2);
		act.dragAndDrop(orderDate, zAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		driver.navigate().refresh();
		Select sel3=new Select(FormatingType);
		sel3.selectByVisibleText("Conditional");
		Select sel4=new Select(formatingField);
		sel4.selectByVisibleText("Customer");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		driver.findElement(By.xpath("//span[text()='Airbus']")).click();
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_ScatterChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, scatterChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, scatterChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, scatter_yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, scatter_xAxis);
		act.dragAndDrop(netValue, scatter_xAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_WaterFallChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, waterFallChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, waterFallChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(customerField, xAxis).build().perform();
		Thread.sleep(2000);
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		targetTextBox.sendKeys("50000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		Select sel3=new Select(FormatingType);
		sel3.selectByVisibleText("Conditional");
		Select sel4=new Select(formatingField);
		sel4.selectByVisibleText("Customer");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		driver.findElement(By.xpath("//span[text()='Airbus']")).click();
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_BoxPlotChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, boxPlotChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, boxPlotChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(customerField, xAxis).build().perform();
		Thread.sleep(2000);
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		targetTextBox.sendKeys("50000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_RoseChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, roseChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, roseChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(customerField, xAxis).build().perform();
		JavascriptLibrary.javascriptClickElement(driver, x2);
		act.dragAndDrop(orderDate, zAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_SpiderChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, spiderChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, spiderChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(customerField, xAxis).build().perform();
		Thread.sleep(3000);		
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		JavascriptLibrary.javascriptClickElement(driver, x2);
		act.dragAndDrop(orderDate, zAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Sales_Dataset_BubbleChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Sales_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Sales_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, bubbleChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, bubbleChartDesign);
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		act.dragAndDrop(quantity, yAxis).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, bubbleChart_xAxis);
		act.dragAndDrop(netValue, bubbleChart_xAxis).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, bubbleChart_zAxis);
		act.dragAndDrop(unitPrice, bubbleChart_zAxis).build().perform();
		
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Customer");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_DataSet_Create_Report(String reportName, String searchOption) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		searchReport.sendKeys(searchOption);
		GenericLibrary.waitForElementVisibility(driver, Purchasing_R1);
		Assert.assertTrue(Purchasing_R1.isDisplayed(), "Report Not Created Successfully");
	}
	
	public void verify_Purchasing_DataSet_Delete_Report(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, deleteBtn);
		Thread.sleep(1000);
		GenericLibrary.waitForAlertPresent(driver);
		driver.switchTo().alert().accept();
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
	}
	
	public void verify_Purchasing_Dataset_Table_Design_Swaping_Columns(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(column1, column2).perform();
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Purchasing_Dataset_Table_Design_Column_Deletion(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, column2);
		JavascriptLibrary.javascriptClickElement(driver, column2);
		GenericLibrary.waitForElementToBeClickable(driver, deleteColumnBtn);
		JavascriptLibrary.javascriptClickElement(driver, deleteColumnBtn);
		GenericLibrary.waitForElementVisibility(driver, confirmDeleteColumn);
		JavascriptLibrary.javascriptClickElement(driver, confirmDeleteColumn);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_Table_Design_Remove_and_add_all_columns(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, removeAllBtn);
		JavascriptLibrary.javascriptClickElement(driver, removeAllBtn);
		GenericLibrary.waitForElementToBeClickable(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Reporter.log("All Fields Removed Successfully",true);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, addAllBtn);
		JavascriptLibrary.javascriptClickElement(driver, addAllBtn);
		GenericLibrary.waitForElementToBeClickable(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		GenericLibrary.waitForElementVisibility(driver, poNoColumn);
		Assert.assertTrue(poNoColumn.isDisplayed(), "Fields Not Added");
		Reporter.log("All Fields Added Successfully",true);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_Add_selected_fields_to_Report(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, removeAllBtn);
		JavascriptLibrary.javascriptClickElement(driver, removeAllBtn);
		GenericLibrary.waitForElementToBeClickable(driver, yesBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesBtn);
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(PONo, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, added_PONo);
		act.dragAndDrop(Supplier, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, added_Supplier);
		act.dragAndDrop(PODate, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, added_PODate);
		act.dragAndDrop(UnitPrice, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, added_UnitPrice);
		act.dragAndDrop(NetPrice, dropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, added_NetPrice);
		Reporter.log("Selected Field: "+PONo.getText(),true);
		Reporter.log("Selected Field: "+Supplier.getText(),true);
		Reporter.log("Selected Field: "+PODate.getText(),true);
		Reporter.log("Selected Field: "+UnitPrice.getText(),true);
		Reporter.log("Selected Field: "+NetPrice.getText(),true);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_Drop_sort_field_Ascending_and_Descending_Order(String reportName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[2]"));
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String name = list.get(i).getText();
			Reporter.log("Supplier Name Before Sorting "+i+":" +name ,true);
		}
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		Actions act=new Actions(driver);
		act.dragAndDrop(Supplier, sortDropField).build().perform();
		Thread.sleep(2000);
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[2]"));
		int count2 = list2.size();
		for (int i = 0; i < count2; i++) {
			String name = list2.get(i).getText();
			Reporter.log("Ascending Order - Supplier "+i+":" +name ,true);
		}
		JavascriptLibrary.javascriptClickElement(driver, Supplier_descendingOrderBtn);
		Thread.sleep(2000);
		List<WebElement> list3 = driver.findElements(By.xpath("//tr/td[2]"));
		int count3 = list3.size();
		for (int i = 0; i < count3; i++) {
			String name = list3.get(i).getText();
			Reporter.log("Descending Order - Supplier "+i+":" +name ,true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, Supplier_closeSortingBtn);
		JavascriptLibrary.javascriptClickElement(driver, Supplier_closeSortingBtn);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_Sort_by_Group_report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		Actions act=new Actions(driver);
		act.dragAndDrop(Supplier, sortByGroupField).build().perform();
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_Total_of_the_selected_field_report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		((JavascriptExecutor)driver).executeScript("scroll(0, 1000)");
		Actions act=new Actions(driver);
		act.dragAndDrop(NetPrice, totalOftheSelectedField).build().perform();
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_filter_option(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, filterOption);
		JavascriptLibrary.javascriptClickElement(driver, filterOption);
		Thread.sleep(3000);
		// Supplier Name
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[2]"));
		int count = list.size();
		for (int i = 20; i < count; i++) {
			String name = list.get(i).getText();
			Reporter.log("Supplier Name Before Filter Action "+i+":" +name ,true);
		}
		Actions act=new Actions(driver);
		act.dragAndDrop(Supplier, filterDropField).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, selectSupplierTxtBox);
		JavascriptLibrary.javascriptClickElement(driver, selectSupplierTxtBox);
		JavascriptLibrary.javascriptType(driver, searchSupplierfield, "Apollo");
		JavascriptLibrary.javascriptClickElement(driver, ApolloAerospaceComponentsOption);
		Thread.sleep(2000);
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[2]"));
		int count2 = list2.size();
		for (int i = 20; i < count2; i++) {
			String name = list2.get(i).getText();
			Reporter.log("Supplier Name After Filter Action "+i+":" +name ,true);
		}
		// PO Date
		List<WebElement> list3 = driver.findElements(By.xpath("//tr/td[3]"));
		int count3 = list3.size();
		for (int i = 20; i < count3; i++) {
			String name = list3.get(i).getText();
			Reporter.log("PO Date Before Filter Action "+i+":" +name ,true);
		}
		act.dragAndDrop(PODate, filterDropField).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, selectDateTxtBox);
		JavascriptLibrary.javascriptClickElement(driver, selectDateTxtBox);
		JavascriptLibrary.javascriptClickElement(driver, lastTwelveMonthsOption);
		Thread.sleep(2000);
		List<WebElement> list4 = driver.findElements(By.xpath("//tr/td[3]"));
		int count4 = list4.size();
		for (int i = 20; i < count4; i++) {
			String name = list4.get(i).getText();
			Reporter.log("PO Date After Filter Action "+i+":" +name ,true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_filter_Single_Entity_and_Start_and_End_option(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, filterOption);
		JavascriptLibrary.javascriptClickElement(driver, filterOption);
		Thread.sleep(3000);
		// Single Entity - PO No.
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		int count = list.size();
		for (int i = 20; i < count; i++) {
			String name = list.get(i).getText();
			Reporter.log("PO No. Before Filter Action "+i+":" +name ,true);
		}
		Actions act=new Actions(driver);
		act.dragAndDrop(PONo, filterDropField).build().perform();
		GenericLibrary.waitForElementVisibility(driver, PONoTxtBox);
		PONoTxtBox.sendKeys("202767");
		PONoTxtBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[1]"));
		int count2 = list2.size();
		for (int i = 20; i < count2; i++) {
			String name = list2.get(i).getText();
			Reporter.log("PO No. After Filter Action "+i+":" +name ,true);
		}
		// Range - Start & End
		List<WebElement> list3 = driver.findElements(By.xpath("//tr/td[8]"));
		int count3 = list3.size();
		for (int i = 20; i < count3; i++) {
			String name = list3.get(i).getText();
			Reporter.log("Net Price Before Filter Action "+i+":" +name ,true);
		}
		act.dragAndDrop(NetPrice, filterDropField).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, netPriceType);
		JavascriptLibrary.javascriptClickElement(driver, netPriceType);
		GenericLibrary.waitForElementVisibility(driver, rangeOption);
		JavascriptLibrary.javascriptClickElement(driver, rangeOption);
		GenericLibrary.waitForElementVisibility(driver, netPriceStartTxtBox);
		netPriceStartTxtBox.sendKeys("£100");
		netPriceEndTxtBox.sendKeys("£1000");
		netPriceEndTxtBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		List<WebElement> list4 = driver.findElements(By.xpath("//tr/td[8]"));
		int count4 = list4.size();
		for (int i = 20; i < count4; i++) {
			String name = list4.get(i).getText();
			Reporter.log("Net Price Between £100 and £1000 are "+i+":" +name ,true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_filter_Date_wise_record_option(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, filterOption);
		JavascriptLibrary.javascriptClickElement(driver, filterOption);
		Thread.sleep(3000);
		// Range - Dates
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[3]"));
		int count = list.size();
		for (int i = 20; i < count; i++) {
			String name = list.get(i).getText();
			Reporter.log("PO dates before filter action "+i+":" +name ,true);
		}
		Actions act=new Actions(driver);
		act.dragAndDrop(PODate, filterDropField).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, PODateType);
		JavascriptLibrary.javascriptClickElement(driver, PODateType);
		JavascriptLibrary.javascriptClickElement(driver, exactPeriodOption);
		// start date
		POStartDateField.click();
		List<WebElement> switchToYear = driver.findElements(By.cssSelector(".switch"));
		for (WebElement ele : switchToYear) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear2 = driver.findElements(By.cssSelector(".switch"));
		for (WebElement ele : switchToYear2) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> yearsList = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsList) {
			String text = ele.getText();
			if(text.contains("2017")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsList = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsList) {
			String text = ele.getText();
			if(text.contains("Mar")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if(text.contains("15")) {
				ele.click();
				break;
			}
		}
		PODateText.click(); // to come out of calendar field
		// end date
		POEndDateField.click();
		List<WebElement> switchToYear3 = driver.findElements(By.cssSelector(".switch"));
		for (WebElement ele : switchToYear3) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear4 = driver.findElements(By.cssSelector(".switch"));
		for (WebElement ele : switchToYear4) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> yearsList2 = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsList2) {
			String text = ele.getText();
			if(text.contains("2017")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsList2 = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsList2) {
			String text = ele.getText();
			if(text.contains("Apr")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayList2 = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList2) {
			String text = ele.getText();
			if(text.contains("20")) {
				ele.click();
				break;
			}
		}
		PODateText.click(); // to come out of calendar field
		Thread.sleep(3000);
		List<WebElement> list2 = driver.findElements(By.xpath("//tr/td[3]"));
		int count2 = list2.size();
		for (int i = 20; i < count2; i++) {
			String name = list2.get(i).getText();
			Reporter.log("PO dates in B/W Mar 15 & Apr 20 of 2017 Range "+i+":" +name ,true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_Share_Report_option(String reportName, String companyName, String user1, String user2) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, shareOption);
		JavascriptLibrary.javascriptClickElement(driver, shareOption);
		JavascriptLibrary.javascriptClickElement(driver, shareSearchOption);
		shareSearchBox.sendKeys(companyName);
		GenericLibrary.waitForElementToBeClickable(driver, shareToCompany);
		JavascriptLibrary.javascriptClickElement(driver, shareToCompany);
		GenericLibrary.waitForElementVisibility(driver, shareSearchBox);
		shareSearchBox.clear();
		shareSearchBox.sendKeys(user1);
		GenericLibrary.waitForElementToBeClickable(driver, shareToMaheshR);
		JavascriptLibrary.javascriptClickElement(driver, shareToMaheshR);
		GenericLibrary.waitForElementVisibility(driver, shareSearchBox);
		shareSearchBox.clear();
		shareSearchBox.sendKeys(user2);
		GenericLibrary.waitForElementToBeClickable(driver, shareToVidyaR);
		JavascriptLibrary.javascriptClickElement(driver, shareToVidyaR);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Purchasing_Dataset_Summary_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, summaryDesign);
		JavascriptLibrary.javascriptClickElement(driver, summaryDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(partNo, xAxis).build().perform();
		act.dragAndDrop(Supplier, yAxis).build().perform();
		act.dragAndDrop(NetPrice, zAxis).build().perform();
		Thread.sleep(1000);
		for(WebElement tdata : driver.findElements(By.tagName("tr"))){
			Reporter.log(tdata.getText()+ "\t",true);
		}
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_BarChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, barChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, barChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(partNo, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(Supplier, xAxis).build().perform();
		Thread.sleep(2000);
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		JavascriptLibrary.javascriptClickElement(driver, x2);
		act.dragAndDrop(NetPrice, zAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Supplier");
		targetTextBox.sendKeys("50000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, columnTotalOFF);
		Select sel3=new Select(FormatingType);
		sel3.selectByVisibleText("Conditional");
		Select sel4=new Select(formatingField);
		sel4.selectByVisibleText("Supplier");
		GenericLibrary.waitForElementVisibility(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		driver.findElement(By.xpath("//span[text()='Apollo Aerospace Components']")).click();
		Select sel5=new Select(layoutType);
		sel5.selectByVisibleText("Custom");
		Select sel6=new Select(layoutField);
		sel6.selectByVisibleText("Supplier");
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, addLayoutCondition);
		JavascriptLibrary.javascriptClickElement(driver, addLayoutCondition);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, negativeValueGraphBtn);
		driver.navigate().refresh();
		Thread.sleep(2000);
		Select sel7=new Select(layoutSelectCustomer);
		sel7.selectByVisibleText("Apollo Aerospace Components");
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_LineChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, lineChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, lineChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(UnitPrice, yAxis).build().perform();
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, y2);
		act.dragAndDrop(NetPrice, y2Axis).build().perform();
		act.dragAndDrop(Supplier, xAxis).build().perform();
		// Handle stale element - xColumns
		for(int i=0; i<=2; i++){
			try{
				Select sel=new Select(xColumns);
				sel.selectByVisibleText("12");
				//Driver.findElement(By.id()).click();
				break;
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Supplier");
		GenericLibrary.waitForElementVisibility(driver, targetTextBox);
		targetTextBox.sendKeys("50000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, columnTotalOFF);
		Select sel3=new Select(FormatingType);
		sel3.selectByVisibleText("Conditional");
		Select sel4=new Select(formatingField);
		sel4.selectByVisibleText("Supplier");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		driver.findElement(By.xpath("//span[text()='Apollo Aerospace Components']")).click();
		Select sel5=new Select(layoutType);
		sel5.selectByVisibleText("Custom");
		Select sel6=new Select(layoutField);
		sel6.selectByVisibleText("Supplier");
		GenericLibrary.waitForElementToBeClickable(driver, addLayoutCondition2);
		JavascriptLibrary.javascriptClickElement(driver, addLayoutCondition2);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, negativeValueGraphBtn);
		driver.navigate().refresh();
		Select sel7=new Select(layoutSelectCustomer);
		sel7.selectByVisibleText("Apollo Aerospace Components");
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_PieChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, pieChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, pieChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(UnitPrice, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(Supplier, xAxis).build().perform();
		Thread.sleep(2000);
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		JavascriptLibrary.javascriptClickElement(driver, x2);
		act.dragAndDrop(NetPrice, zAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Supplier");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		driver.navigate().refresh();
		Select sel3=new Select(FormatingType);
		sel3.selectByVisibleText("Conditional");
		Select sel4=new Select(formatingField);
		sel4.selectByVisibleText("Supplier");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		driver.findElement(By.xpath("//span[text()='Apollo Aerospace Components']")).click();
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_ScatterChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, scatterChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, scatterChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(NetPrice, scatter_yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, scatter_xAxis);
		act.dragAndDrop(UnitPrice, scatter_xAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Supplier");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_WaterFallChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, waterFallChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, waterFallChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(NetPrice, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(Supplier, xAxis).build().perform();
		Thread.sleep(2000);
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Supplier");
		targetTextBox.sendKeys("50000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		Select sel3=new Select(FormatingType);
		sel3.selectByVisibleText("Conditional");
		Select sel4=new Select(formatingField);
		sel4.selectByVisibleText("Supplier");
		GenericLibrary.waitForElementToBeClickable(driver, addCondtionBtn);
		JavascriptLibrary.javascriptClickElement(driver, addCondtionBtn);
		GenericLibrary.waitForElementToBeClickable(driver, colorField);
		colorField.click();
		List<WebElement> colorList = driver.findElements(By.xpath("//tr/td"));
		for (WebElement ele : colorList) {
			String text = ele.getAttribute("title");
			if(text.contains("#ffff00")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Formatting']//following::button[4]")).click();
		driver.findElement(By.xpath("//span[text()='Apollo Aerospace Components']")).click();
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_BoxPlotChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, boxPlotChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, boxPlotChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(NetPrice, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(Supplier, xAxis).build().perform();
		Thread.sleep(2000);
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Supplier");
		targetTextBox.sendKeys("50000");
		targetTextBox.sendKeys(Keys.TAB);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_RoseChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, roseChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, roseChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(NetPrice, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(Supplier, xAxis).build().perform();
		JavascriptLibrary.javascriptClickElement(driver, x2);
		act.dragAndDrop(PODate, zAxis).build().perform();
		Thread.sleep(2000);
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Supplier");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_SpiderChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, spiderChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, spiderChartDesign);
		Actions act=new Actions(driver);
		act.dragAndDrop(NetPrice, yAxis).build().perform();
		GenericLibrary.waitForElementVisibility(driver, xAxis);
		act.dragAndDrop(Supplier, xAxis).build().perform();
		Thread.sleep(3000);		
		Select sel=new Select(xColumns);
		sel.selectByVisibleText("12");
		JavascriptLibrary.javascriptClickElement(driver, x2);
		act.dragAndDrop(PODate, zAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Supplier");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, reportTotalOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Purchasing_Dataset_BubbleChart_Design_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Purchasing_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Purchasing_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		GenericLibrary.waitForElementToBeClickable(driver, bubbleChartDesign);
		JavascriptLibrary.javascriptClickElement(driver, bubbleChartDesign);
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.dragAndDrop(UnitPrice, yAxis).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, bubbleChart_xAxis);
		act.dragAndDrop(NetPrice, bubbleChart_xAxis).build().perform();
		GenericLibrary.waitForElementToBeClickable(driver, bubbleChart_zAxis);
		act.dragAndDrop(UnitPrice, bubbleChart_zAxis).build().perform();
		Select sel2=new Select(filter);
		sel2.selectByVisibleText("Supplier");
		driver.navigate().refresh();
		JavascriptLibrary.javascriptClickElement(driver, labelOFF);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Production_Jobs_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Production_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Production_DataSet);
		GenericLibrary.waitForElementVisibility(driver, Jobs_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Jobs_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Production_Operations_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Production_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Production_DataSet);
		GenericLibrary.waitForElementVisibility(driver, Jobs_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Jobs_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Production_Clocking_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Production_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Production_DataSet);
		GenericLibrary.waitForElementVisibility(driver, Clockings_Dataset);
		JavascriptLibrary.javascriptClickElement(driver, Clockings_Dataset);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}

	public void verify_Quality_SupplierReject_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quality_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quality_DataSet);
		GenericLibrary.waitForElementVisibility(driver, SupplierReject_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, SupplierReject_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Quality_InternalReject_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quality_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quality_DataSet);
		GenericLibrary.waitForElementVisibility(driver, InternalReject_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, InternalReject_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Quality_CustomerReject_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quality_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quality_DataSet);
		GenericLibrary.waitForElementVisibility(driver, CustomerReject_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, CustomerReject_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Despatch_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Despatch_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Despatch_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Stores_RawMaterials_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Stores_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Stores_DataSet);
		GenericLibrary.waitForElementVisibility(driver, RawMaterial_Dataset);
		JavascriptLibrary.javascriptClickElement(driver, RawMaterial_Dataset);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Stores_FinishedGoods_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Stores_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Stores_DataSet);
		GenericLibrary.waitForElementVisibility(driver, FinishedGoods_Dataset);
		JavascriptLibrary.javascriptClickElement(driver, FinishedGoods_Dataset);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Finance_SalesInvoice_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Finanace_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Finanace_DataSet);
		GenericLibrary.waitForElementVisibility(driver, SalesInvoices_Dataset);
		JavascriptLibrary.javascriptClickElement(driver, SalesInvoices_Dataset);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Finance_PurchaseInvoice_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Finanace_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Finanace_DataSet);
		GenericLibrary.waitForElementVisibility(driver, PurchaseInvoice_Dataset);
		JavascriptLibrary.javascriptClickElement(driver, PurchaseInvoice_Dataset);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Finance_WIP_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Finanace_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Finanace_DataSet);
		GenericLibrary.waitForElementVisibility(driver, WIP_Dataset);
		JavascriptLibrary.javascriptClickElement(driver, WIP_Dataset);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Finance_RawMaterials_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Finanace_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Finanace_DataSet);
		GenericLibrary.waitForElementVisibility(driver, RawMaterial_Dataset);
		JavascriptLibrary.javascriptClickElement(driver, RawMaterial_Dataset);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Finance_FinishedGoods_Dataset_Report(String reportName) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Finanace_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Finanace_DataSet);
		GenericLibrary.waitForElementVisibility(driver, FinishedGoods_Dataset);
		JavascriptLibrary.javascriptClickElement(driver, FinishedGoods_Dataset);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		GenericLibrary.waitForElementToBeClickable(driver, saveReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
	}
	
	public void verify_Copy_Report_Option(String reportName, String reportCopy, String searchReportMaster, String searchReportCopy) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		JavascriptLibrary.javascriptClickElement(driver, Quotations_DataSet);
		GenericLibrary.waitForElementToBeClickable(driver, createNewReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewReportBtn);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportName);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		GenericLibrary.waitForElementVisibility(driver, CopyReportBtn);
		JavascriptLibrary.javascriptClickElement(driver, CopyReportBtn);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptType(driver, reportNameTxtBox, reportCopy);
		JavascriptLibrary.javascriptClickElement(driver, saveReportBtn);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, Quotations_DataSet);
		searchReport.sendKeys(searchReportMaster);
		GenericLibrary.waitForElementVisibility(driver, masterReport);
		Assert.assertTrue(masterReport.isDisplayed(), "Report - Master Not Created");
		searchReport.clear();
		searchReport.sendKeys(searchReportCopy);
		GenericLibrary.waitForElementVisibility(driver, copyReport);
		Assert.assertTrue(copyReport.isDisplayed(), "Report - Copy Not Created");
		Reporter.log("Report and it's copy created Successfully",true);
	}
}















