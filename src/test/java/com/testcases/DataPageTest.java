package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.base.TestBase;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class DataPageTest extends TestBase {
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;

	public DataPageTest() {
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




	@AfterMethod
	public void tearDown(){
		driver.quit();
	}



}
