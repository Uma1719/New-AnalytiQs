package com.testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.BuildPage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class BuildPageTest extends TestBase{
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	BuildPage buildPage;

	public BuildPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		buildPage= new BuildPage();
	}

	@Test
	public void BuildPage_Test() {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_BuildPage();
		Reporter.log("Bulid Page Verified Successfully",true);
	}

	@Test(dependsOnMethods="BuildPage_Test")
	public void DataSet_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_DataSet();
		Reporter.log("Bulid Page Verified Successfully & All Datasets List Present",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Create_Quotations_DataSet_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotations_DataSet_Create_Report("Quotations/R1", "R1");
		Reporter.log("Quotation Dataset Report Created successfully", true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Create_Quotations_DataSet_Delete_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotations_DataSet_Delete_Report("Quotations/Delete Report/R");
		Reporter.log("Quotation Dataset Report Deleted successfully", true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotations_Dataset_Table_Design_Swaping_Columns_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotations_Dataset_Table_Design_Swaping_Columns("Quotations/TableDesign/SwapColums/R1");
		Reporter.log("Quotations Dataset Table design report columns are swapped successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_Table_Design_Column_Deletion_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_Table_Design_Column_Deletion("Quotations/TableDesign/DeleteColumn/R");
		Reporter.log("Quotations Dataset Table design report columns deleted successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_Table_Design_Remove_and_add_all_columns_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_Table_Design_Remove_and_Add_all_columns("Quotations/TableDesign/Add & Remove all Columns/R");
		Reporter.log("Quotations Dataset Table design report Add and Remove All columns are successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_Add_Selected_fields_to_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_Add_selected_fields_to_Report("Quotations/TableDesign/Add Selected Fields/R");
		Reporter.log("Selected fields added to the report Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_Sort_fields_in_Ascending_and_Descending_Order_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_Drop_sort_field_Ascending_and_Descending_Order("Quotations/TableDesign/SortByOrder/R");
		Reporter.log("Dropped field sorted in order successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_Group_by_selected_field_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_Sort_by_Group_report("Quotations/TableDesign/SortByGroup/R");
		Reporter.log("Group by selected field is Functional",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_Total_of_Selected_field_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_Total_of_the_selected_field_report("Quotations/TableDesign/FieldTotal/R");
		Reporter.log("Total of the selected field option is Functional",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_filter_option_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_filter_option("Quotations/TableDesign/Filter1/R");
		Reporter.log("Filter Option is Functional",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_filter_Single_Entity_and_Start_and_End_Option_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_filter_Single_Entity_and_Start_and_End_option("Quotations/TableDesign/Filter2/R");
		Reporter.log("Filter Single entity and Range Option are Functional",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_filter_date_wise_Option_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_filter_Date_wise_record_option("Quotations/TableDesign/Filter3/R");
		Reporter.log("Filter Date wise record option is Functional",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_Share_Report_option_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_Share_Report_option("Quotations/ShareReport/Test", "Acres", "mahesh", "vidya r");
		Reporter.log("Share Report Option is Functional",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_Summary_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_Summary_Design_Report("Quotations/SummaryDesign/R");
		Reporter.log("Summary Design Report for the Quotation dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_BarChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_BarChart_Design_Report("Quotations/BarChart/R");
		Reporter.log("BarChart Design Report for the Quotation dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_LineChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_LineChart_Design_Report("Quotations/LineChart/R");
		Reporter.log("LineChart Design Report for the Quotation dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_PieChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_PieChart_Design_Report("Quotations/PieChart/R");
		Reporter.log("PieChart Design Report for the Quotation dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_ScatterChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_ScatterChart_Design_Report("Quotations/ScatterChart/R");
		Reporter.log("ScatterChart Design Report for the Quotation dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_WaterFallChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_WaterFallChart_Design_Report("Quotations/WaterFallChart/R");
		Reporter.log("WaterFallChart Design Report for the Quotation dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_BoxPlotChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_BoxPlotChart_Design_Report("Quotations/BoxPlotChart/R");
		Reporter.log("BoxPlotChart Design Report for the Quotation dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_RoseChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_RoseChart_Design_Report("Quotations/RoseChart/R");
		Reporter.log("RoseChart Design Report for the Quotation dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_SpiderChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_SpiderChart_Design_Report("Quotations/SpiderChart/R");
		Reporter.log("SpiderChart Design Report for the Quotation dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quotation_Dataset_BubbleChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quotation_Dataset_BubbleChart_Design_Report("Quotations/BubbleChart/R");
		Reporter.log("BubbleChart Design Report for the Quotation dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Create_Sales_DataSet_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_DataSet_Create_Report("Sales/R1", "R1");
		Reporter.log("Sales Dataset Report Created successfully", true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Create_Sales_DataSet_Delete_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_DataSet_Delete_Report("Sales/Delete Report/R");
		Reporter.log("Sales Dataset Report Deleted successfully", true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_Table_Design_Swaping_Columns_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_Table_Design_Swaping_Columns("Sales/TableDesign/SwapColums/R1");
		Reporter.log("Sales dataset Table design report columns are swapped successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_Table_Design_Column_Deletion_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_Table_Design_Column_Deletion("Sales/TableDesign/DeleteColumn/R");
		Reporter.log("Sales dataset Table design report columns deleted successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_Table_Design_Remove_and_add_all_columns_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_Table_Design_Remove_and_add_all_columns("Sales/TableDesign/Add & Remove all Columns/R");
		Reporter.log("Sales dataset Table design report Add and Remove All columns are successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_Add_Selected_fields_to_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_Add_selected_fields_to_Report("Sales/TableDesign/Add Selected Fields/R");
		Reporter.log("Sales dataset Selected fields added to the report Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_Sort_fields_in_Ascending_and_Descending_Order_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_Drop_sort_field_Ascending_and_Descending_Order("Sales/TableDesign/SortByOrder/R");
		Reporter.log("Sales dataset Dropped field sorted in order successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_Group_by_selected_field_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_Sort_by_Group_report("Sales/TableDesign/SortByGroup/R");
		Reporter.log("Sales dataset Group by selected field is Functional",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_Total_of_Selected_field_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_Total_of_the_selected_field_report("Sales/TableDesign/FieldTotal/R");
		Reporter.log("Sales dataset Total of the selected field is Functional",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_filter_option_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_filter_option("Sales/TableDesign/Filter1/R");
		Reporter.log("Sales dataset Filter Option is Functional",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_filter_Single_Entity_and_Start_and_End_Option_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_filter_Single_Entity_and_Start_and_End_option("Sales/TableDesign/Filter2/R");
		Reporter.log("Sales dataset Filter Single entity and Range Option are Functional",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_filter_date_wise_Option_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_filter_Date_wise_record_option("Sales/TableDesign/Filter3/R");
		Reporter.log("Sales dataset Filter Date wise record option is Functional",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_Share_Report_option_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_Share_Report_option("Sales/ShareReport/Test", "Acres", "mahesh", "vidya r");
		Reporter.log("Sales dataset Share Report Option is Functional",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_Summary_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_Summary_Design_Report("Sales/SummaryDesign/R");
		Reporter.log("Summary Design Report for the Sales dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_BarChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_BarChart_Design_Report("Sales/BarChart/R");
		Reporter.log("BarChart Design Report for the Sales dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_LineChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_LineChart_Design_Report("Sales/LineChart/R");
		Reporter.log("LineChart Design Report for the Sales dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_PieChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_PieChart_Design_Report("Sales/PieChart/R");
		Reporter.log("PieChart Design Report for the Sales dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_ScatterChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_ScatterChart_Design_Report("Sales/ScatterChart/R");
		Reporter.log("ScatterChart Design Report for the Sales dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_WaterFallChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_WaterFallChart_Design_Report("Sales/WaterFallChart/R");
		Reporter.log("WaterFallChart Design Report for the Sales dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_BoxPlotChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_BoxPlotChart_Design_Report("Sales/BoxPlotChart/R");
		Reporter.log("BoxPlotChart Design Report for the Sales dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_RoseChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_RoseChart_Design_Report("Sales/RoseChart/R");
		Reporter.log("RoseChart Design Report for the Sales dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_SpiderChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_SpiderChart_Design_Report("Sales/SpiderChart/R");
		Reporter.log("SpiderChart Design Report for the Sales dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Sales_Dataset_BubbleChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Sales_Dataset_BubbleChart_Design_Report("Sales/BubbleChart/R");
		Reporter.log("BubbleChart Design Report for the Sales dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Create_Purchasing_DataSet_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_DataSet_Create_Report("Purchasing/R1", "R1");
		Reporter.log("Purchasing Dataset Report Created successfully", true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Create_Purchasing_DataSet_Delete_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_DataSet_Delete_Report("Purchasing/Delete Report/R");
		Reporter.log("Purchasing Dataset Report Deleted successfully", true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_Table_Design_Swaping_Columns_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_Table_Design_Swaping_Columns("Purchasing/TableDesign/SwapColums/R1");
		Reporter.log("Purchasing Dataset Table design report columns are swapped successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_Table_Design_Column_Deletion_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_Table_Design_Column_Deletion("Purchasing/TableDesign/DeleteColumn/R");
		Reporter.log("Purchasing Dataset Table design report columns deleted successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_Table_Design_Remove_and_add_all_columns_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_Table_Design_Remove_and_add_all_columns("Purchasing/TableDesign/Add & Remove all Columns/R");
		Reporter.log("Purchasing Dataset Table design report Add and Remove All columns are successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_Add_Selected_fields_to_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_Add_selected_fields_to_Report("Purchasing/TableDesign/Add Selected Fields/R");
		Reporter.log("Purchasing Dataset Selected fields added to the report Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_Sort_fields_in_Ascending_and_Descending_Order_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_Drop_sort_field_Ascending_and_Descending_Order("Purchasing/TableDesign/SortByOrder/R");
		Reporter.log("Purchasing Dataset Dropped field sorted in order successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_Group_by_selected_field_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_Sort_by_Group_report("Purchasing/TableDesign/SortByGroup/R");
		Reporter.log("Purchasing Dataset Group by selected field is Functional",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_Total_of_Selected_field_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_Total_of_the_selected_field_report("Purchasing/TableDesign/FieldTotal/R");
		Reporter.log("Purchasing Dataset Total of the selected field is Functional",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_filter_option_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_filter_option("Purchasing/TableDesign/Filter1/R");
		Reporter.log("Purchasing Dataset Filter Option is Functional",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_filter_Single_Entity_and_Start_and_End_Option_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_filter_Single_Entity_and_Start_and_End_option("Purchasing/TableDesign/Filter2/R");
		Reporter.log("Purchasing Dataset Filter Single entity and Range Option are Functional",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_filter_date_wise_Option_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_filter_Date_wise_record_option("Purchasing/TableDesign/Filter3/R");
		Reporter.log("Purchasing Dataset Filter Date wise record option is Functional",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_Share_Report_option_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_Share_Report_option("Purchasing/ShareReport/Test", "Acres", "mahesh", "vidya r");
		Reporter.log("Purchasing Dataset Share Report Option is Functional",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_Summary_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_Summary_Design_Report("Purchasing/SummaryDesign/R");
		Reporter.log("Summary Design Report for the Purchasing dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_BarChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_BarChart_Design_Report("Purchasing/BarChart/R");
		Reporter.log("BarChart Design Report for the Purchasing dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_LineChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_LineChart_Design_Report("Purchasing/LineChart/R");
		Reporter.log("LineChart Design Report for the Purchasing dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_PieChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_PieChart_Design_Report("Purchasing/PieChart/R");
		Reporter.log("PieChart Design Report for the Purchasing dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_ScatterChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_ScatterChart_Design_Report("Purchasing/ScatterChart/R");
		Reporter.log("ScatterChart Design Report for the Purchasing dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_WaterFallChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_WaterFallChart_Design_Report("Purchasing/WaterFallChart/R");
		Reporter.log("WaterFallChart Design Report for the Purchasing dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_BoxPlotChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_BoxPlotChart_Design_Report("Purchasing/BoxPlotChart/R");
		Reporter.log("BoxPlotChart Design Report for the Purchasing dataset Created Successfully",true);
	}

	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_RoseChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_RoseChart_Design_Report("Purchasing/RoseChart/R");
		Reporter.log("RoseChart Design Report for the Purchasing dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_SpiderChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_SpiderChart_Design_Report("Purchasing/SpiderChart/R");
		Reporter.log("SpiderChart Design Report for the Purchasing dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Purchasing_Dataset_BubbleChart_Design_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Purchasing_Dataset_BubbleChart_Design_Report("Purchasing/BubbleChart/R");
		Reporter.log("BubbleChart Design Report for the Purchasing dataset Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Production_Jobs_Dataset_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Production_Jobs_Dataset_Report("Production/Jobs/Report");
		Reporter.log("Production/Jobs dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Production_Operations_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Production_Operations_Dataset_Report("Production/Operations/Report");
		Reporter.log("Production/Operations dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Production_Clocking_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Production_Clocking_Dataset_Report("Production/Clocking/Report");
		Reporter.log("Production/Clocking dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quality_SupplierReject_Dataset_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quality_SupplierReject_Dataset_Report("Quality/SupplierReject/Report");
		Reporter.log("Quality/SupplierReject dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quality_InternalReject_DataSet_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quality_InternalReject_Dataset_Report("Quality/InternalReject/Report");
		Reporter.log("Quality/InternalReject dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Quality_CustomerReject_DataSet_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Quality_CustomerReject_Dataset_Report("Production/Clocking/Report");
		Reporter.log("Quality/CustomerReject dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Despatch_DataSet_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Despatch_Dataset_Report("Despatch/Report");
		Reporter.log("Despatch dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Stores_RawMaterials_DataSet_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Stores_RawMaterials_Dataset_Report("Stores/Raw Materials/Report");
		Reporter.log("Stores/Raw Materials dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Stores_FinishedGoods_DataSet_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Stores_FinishedGoods_Dataset_Report("Stores/Finished Goods/Report");
		Reporter.log("Stores/Finished Goods dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Finance_Salesinvoice_DataSet_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Finance_SalesInvoice_Dataset_Report("Finance/Sales Invoice/Report");
		Reporter.log("Finance/Sales Invoice dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Finance_PurchaseInvoice_DataSet_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Finance_PurchaseInvoice_Dataset_Report("Finance/Purchase Invoice/Report");
		Reporter.log("Finance/Purchase Invoice dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Finance_WIP_DataSet_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Finance_WIP_Dataset_Report("Finance/WIP/Report");
		Reporter.log("Finance/WIP dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Finance_RawMaterials_DataSet_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Finance_RawMaterials_Dataset_Report("Finance/Raw Materials/Report");
		Reporter.log("Finance/Raw Materials dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Finance_FinishedGoods_DataSet_Report_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Finance_FinishedGoods_Dataset_Report("Finance/Finished Goods/Report");
		Reporter.log("Finance/Finished Goods dataset Report Created Successfully",true);
	}
	
	@Test(dependsOnMethods= {"BuildPage_Test","DataSet_Test"})
	public void Copy_Report_Option_Test() throws Exception {
		dashBoardPage.clickOnBuildLink();
		buildPage.verify_Copy_Report_Option("Report - Master", "Report - Copy", "Report - Master", "Report - Copy");
		Reporter.log("Copy report option is functional",true);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
