package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.base.TestBase;
import com.util.GenericLibrary;
import com.util.JavascriptLibrary;

public class DashBoardPage extends TestBase {

	// Objects Repository(OR):........................................................................
	// Home Page Links
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	@CacheLookup
	WebElement dashBoardLink;

	@FindBy(xpath="//span[contains(text(),'Build')]")
	WebElement buildLink;

	@FindBy(xpath="//span[contains(text(),'Analyse')]")
	WebElement AnalyseLink;

	@FindBy(xpath="Data")
	WebElement dataLink;

	// Create Tab
	@FindBy(xpath="//button[@title='Edit Dashboard']")
	WebElement editDashBoardBtn;

	@FindBy(xpath=".//*[@id='TabMenu']/span[2]")
	WebElement dropDownBtn;

	@FindBy(xpath="//li[contains(text(),'Create new')]")
	WebElement createNewBtn;

	@FindBy(xpath=".//*[@id='tabname']")
	WebElement tabNameTextBox;

	@FindBy(xpath="//button[text()='OK']")
	WebElement okBtn;

	@FindBy(xpath="//span[text()='Test Tab']")
	WebElement createdTab;

	// Add Report to the Tab
	@FindBy(xpath="//li[text()='Test Tab']")
	WebElement testTab;

	@FindBy(xpath=".//*[@id='SelectedText']//following::button[4]")
	WebElement addReportButton_1;

	@FindBy(xpath=".//*[@id='SelectedText']//following::button[5]")
	WebElement addReportButton_2;

	@FindBy(xpath=".//*[@id='SelectedText']//following::button[6]")
	WebElement addReportButton_3;

	@FindBy(xpath=".//*[@id='SelectedText']//following::button[7]")
	WebElement addReportButton_4;

	@FindBy(xpath=".//*[@id='SelectedText']//following::button[8]")
	WebElement addReportButton_5;

	@FindBy(xpath=".//*[@id='SelectedText']//following::button[9]")
	WebElement addReportButton_6;

	@FindBy(xpath=".//*[@id='reportkey']")
	WebElement searchReportTextBox;

	@FindBy(xpath="//td[@title='Quotations/R1']//following::button[1]")
	WebElement selectButton_R1;

	@FindBy(xpath="//td[@title='Quotations/SummaryDesign/R']//following::button[1]")
	WebElement selectButton_R2;
	
	@FindBy(xpath="//td[@title='Quotations/BarChart/R']//following::button[1]")
	WebElement selectButton_R3;
	
	@FindBy(xpath="//td[@title='Quotations/LineChart/R']//following::button[1]")
	WebElement selectButton_R4;
	
	@FindBy(xpath="//td[@title='Quotations/PieChart/R']//following::button[1]")
	WebElement selectButton_R5;
	
	@FindBy(xpath="//td[@title='Quotations/WaterFallChart/R']//following::button[1]")
	WebElement selectButton_R6;

	@FindBy(xpath="//a[text()='Quotations/R1']")
	WebElement createdReport_1;

	@FindBy(xpath="//a[text()='Quotations/SummaryDesign/R']")
	WebElement createdReport_2;
	
	@FindBy(xpath="//b[text()='QUOTATIONS/BARCHART/R']")
	WebElement createdReport_3;
	
	@FindBy(xpath=".//*[text()='Test Tab']//following::iframe[1]")
	WebElement barChartFrame;

	@FindBy(xpath="//b[text()='QUOTATIONS/LINECHART/R']")
	WebElement createdReport_4;
	
	@FindBy(xpath=".//*[text()='Test Tab']//following::iframe[2]")
	WebElement lineChartFrame;
	
	@FindBy(xpath="//b[text()='QUOTATIONS/PIECHART/R']")
	WebElement createdReport_5;
	
	@FindBy(xpath=".//*[text()='Test Tab']//following::iframe[3]")
	WebElement pieChartFrame;

	@FindBy(xpath="//b[text()='QUOTATIONS/WATERFALLCHART/R']")
	WebElement createdReport_6;
	
	@FindBy(xpath=".//*[text()='Test Tab']//following::iframe[4]")
	WebElement waterFallChartFrame;

	// Delete Tab 
	@FindBy(xpath="//div[3]/div/button[1]")
	WebElement deleteButton;
	
	@FindBy(xpath="//span[text()='Delete me']")
	WebElement deleteMeTab;
	
	// Play Tabs
	@FindBy(xpath=".//*[@id='startplay']")
	WebElement startPlayTabs;
	
	@FindBy(xpath=".//*[@id='stopplay']")
	WebElement stopPlayTabs;
	
	// Share & Preview 
	@FindBy(xpath="//button[@title='Preview']")
	WebElement previewBtn;
	
	@FindBy(xpath="//button[@title='Share']")
	WebElement shareBtn;
	
	@FindBy(xpath="//button[@title='Query']")
	WebElement searchBtn;
	
	@FindBy(xpath=".//*[@id='sharefind']")
	WebElement searchBox;
	
	@FindBy(xpath="//b[text()='User']//following::button[1]")
	WebElement user_vidya;
	
	@FindBy(xpath=".//*[@id='d2']/ul/li")
	WebElement addedUser;



	// Initializing the Page Objects:................................................................
	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:......................................................................................
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}

	public boolean verifyDashboardLink(){
		return dashBoardLink.isDisplayed();
	}

	public BuildPage clickOnBuildLink() {
		buildLink.click();
		return new BuildPage();
	}

	public AnalysePage clickOnAnalyseLink() {
		AnalyseLink.click();
		return new AnalysePage();
	}

	public DataPage clickOnDataLink() {
		dataLink.click();
		return new DataPage();
	}

	public void verify_Create_tab_functionality() {
		GenericLibrary.waitForElementVisibility(driver, editDashBoardBtn);
		JavascriptLibrary.javascriptClickElement(driver, editDashBoardBtn);
		GenericLibrary.waitForElementVisibility(driver, dropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, dropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewBtn);
		GenericLibrary.waitForElementVisibility(driver, tabNameTextBox);
		JavascriptLibrary.javascriptType(driver, tabNameTextBox, "Test Tab");
		JavascriptLibrary.javascriptClickElement(driver, okBtn);
		GenericLibrary.waitForElementVisibility(driver, createdTab);
		Assert.assertTrue(createdTab.isDisplayed(), "New tab Not created");
		Reporter.log("New tab created successfully",true);
	}

	public void verify_Add_Reports_Or_Graphics_to_Tab() throws Exception {
		GenericLibrary.waitForElementVisibility(driver, dropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, dropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, testTab);
		GenericLibrary.waitForElementVisibility(driver, editDashBoardBtn);
		JavascriptLibrary.javascriptClickElement(driver, editDashBoardBtn);
		addReportButton_1.click();
		GenericLibrary.waitForElementVisibility(driver, searchReportTextBox);
		searchReportTextBox.sendKeys("R1");
		GenericLibrary.waitForElementVisibility(driver, selectButton_R1);
		JavascriptLibrary.javascriptClickElement(driver, selectButton_R1);
		GenericLibrary.waitForElementVisibility(driver, createdReport_1);
		Assert.assertTrue(createdReport_1.isDisplayed(), "Report not added to Tab");
		Reporter.log("Table Design Report added to the Tab Successfully",true);
		addReportButton_2.click();
		GenericLibrary.waitForElementVisibility(driver, searchReportTextBox);
		searchReportTextBox.sendKeys("Summary");
		GenericLibrary.waitForElementVisibility(driver, selectButton_R2);
		JavascriptLibrary.javascriptClickElement(driver, selectButton_R2);
		GenericLibrary.waitForElementVisibility(driver, createdReport_2);
		Assert.assertTrue(createdReport_2.isDisplayed(), "Report not added to Tab");
		Reporter.log("Summary Design Report added to the Tab Successfully",true);
		addReportButton_3.click();
		GenericLibrary.waitForElementVisibility(driver, searchReportTextBox);
		searchReportTextBox.sendKeys("BarChart");
		GenericLibrary.waitForElementVisibility(driver, selectButton_R3);
		JavascriptLibrary.javascriptClickElement(driver, selectButton_R3);
		GenericLibrary.waitForElementVisibility(driver, barChartFrame);
		driver.switchTo().frame(barChartFrame);
		GenericLibrary.waitForElementVisibility(driver, createdReport_3);
		Assert.assertTrue(createdReport_3.isDisplayed(), "Report not added to Tab");
		Reporter.log("BarcChart Design Report added to the Tab Successfully",true);
		driver.switchTo().defaultContent();
		addReportButton_4.click();
		GenericLibrary.waitForElementVisibility(driver, searchReportTextBox);
		searchReportTextBox.sendKeys("LineChart");
		GenericLibrary.waitForElementVisibility(driver, selectButton_R4);
		JavascriptLibrary.javascriptClickElement(driver, selectButton_R4);
		GenericLibrary.waitForElementVisibility(driver, lineChartFrame);
		driver.switchTo().frame(lineChartFrame);
		GenericLibrary.waitForElementVisibility(driver, createdReport_4);
		Assert.assertTrue(createdReport_4.isDisplayed(), "Report not added to Tab");
		Reporter.log("LineChart Design Report added to the Tab Successfully",true);
		driver.switchTo().defaultContent();
		addReportButton_5.click();
		GenericLibrary.waitForElementVisibility(driver, searchReportTextBox);
		searchReportTextBox.sendKeys("PieChart");
		GenericLibrary.waitForElementVisibility(driver, selectButton_R5);
		JavascriptLibrary.javascriptClickElement(driver, selectButton_R5);
		GenericLibrary.waitForElementVisibility(driver, pieChartFrame);
		driver.switchTo().frame(pieChartFrame);
		GenericLibrary.waitForElementVisibility(driver, createdReport_5);
		Assert.assertTrue(createdReport_5.isDisplayed(), "Report not added to Tab");
		Reporter.log("PieChart Design Report added to the Tab Successfully",true);
		driver.switchTo().defaultContent();
		addReportButton_6.click();
		GenericLibrary.waitForElementVisibility(driver, searchReportTextBox);
		searchReportTextBox.sendKeys("WaterFallChart");
		GenericLibrary.waitForElementVisibility(driver, selectButton_R6);
		JavascriptLibrary.javascriptClickElement(driver, selectButton_R6);
		GenericLibrary.waitForElementVisibility(driver, waterFallChartFrame);
		driver.switchTo().frame(waterFallChartFrame);
		GenericLibrary.waitForElementVisibility(driver, createdReport_6);
		Assert.assertTrue(createdReport_6.isDisplayed(), "Report not added to Tab");
		Reporter.log("WaterFallChart Design Report added to the Tab Successfully",true);
		driver.switchTo().defaultContent();
	}
	
	public void verify_Delete_selective_report_from_Tab() {
		GenericLibrary.waitForElementVisibility(driver, editDashBoardBtn);
		JavascriptLibrary.javascriptClickElement(driver, editDashBoardBtn);
		List<WebElement> deleteReportBtnList = driver.findElements(By.xpath("//button[@title='Preview']//following::button[@class='btn btn-default']"));
		deleteReportBtnList.get(0).click();
	}
	
	public void verify_Delete_selective_Tab() {
		GenericLibrary.waitForElementVisibility(driver, editDashBoardBtn);
		JavascriptLibrary.javascriptClickElement(driver, editDashBoardBtn);
		GenericLibrary.waitForElementVisibility(driver, dropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, dropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewBtn);
		GenericLibrary.waitForElementVisibility(driver, tabNameTextBox);
		JavascriptLibrary.javascriptType(driver, tabNameTextBox, "Delete me");
		JavascriptLibrary.javascriptClickElement(driver, okBtn);
		GenericLibrary.waitForElementVisibility(driver, deleteMeTab);
		GenericLibrary.waitForElementVisibility(driver, deleteButton);
		JavascriptLibrary.javascriptClickElement(driver, deleteButton);
	}
	
	public void verify_Play_Tabs_functionality() throws Exception {
		GenericLibrary.waitForElementVisibility(driver, startPlayTabs);
		JavascriptLibrary.javascriptClickElement(driver, startPlayTabs);
		Thread.sleep(5000);
		GenericLibrary.waitForElementToBeClickable(driver, stopPlayTabs);
		JavascriptLibrary.javascriptClickElement(driver, stopPlayTabs);
	}
	
	public void verify_Preview_Option() {
		GenericLibrary.waitForElementVisibility(driver, editDashBoardBtn);
		JavascriptLibrary.javascriptClickElement(driver, editDashBoardBtn);
		GenericLibrary.waitForElementVisibility(driver, previewBtn);
		Assert.assertTrue(previewBtn.isDisplayed(),"Preview Button not found");
		JavascriptLibrary.javascriptClickElement(driver, previewBtn);
		GenericLibrary.waitForElementVisibility(driver, editDashBoardBtn);
		Assert.assertTrue(editDashBoardBtn.isDisplayed(), "Preview Option is not Functional");
	}
	
	public void verify_Share_Report_Option(String user) {
		GenericLibrary.waitForElementVisibility(driver, editDashBoardBtn);
		JavascriptLibrary.javascriptClickElement(driver, editDashBoardBtn);
		GenericLibrary.waitForElementVisibility(driver, shareBtn);
		JavascriptLibrary.javascriptClickElement(driver, shareBtn);
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		searchBox.sendKeys(user);
		GenericLibrary.waitForElementVisibility(driver, user_vidya);
		JavascriptLibrary.javascriptClickElement(driver, user_vidya);
		GenericLibrary.waitForElementVisibility(driver, addedUser);
		Assert.assertTrue(addedUser.isDisplayed(), "User not Added");
		Reporter.log("User Added Successfully", true);
	}
}

