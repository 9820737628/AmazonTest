package com.qa.tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qa.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductsPage;
import com.qa.reports.ExtentReport;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoginTests extends BaseTest{
	LoginPage loginPage;
	ProductsPage productsPage;
	JSONObject loginUsers;
	TestUtils utils = new TestUtils();
	
	  @BeforeClass
	  public void beforeClass() throws Exception {
			InputStream datais = null;
		  try {
			  String dataFileName = "data/loginUsers.json";
			  datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
			  JSONTokener tokener = new JSONTokener(datais);
			  loginUsers = new JSONObject(tokener);
		  } catch(Exception e) {
			  e.printStackTrace();
			  throw e;
		  } finally {
			  if(datais != null) {
				  datais.close();
			  }
		  }
		  closeApp();
		  launchApp();
	  }

	  @AfterClass
	  public void afterClass() {
	  }
	  
	  @BeforeMethod
	  public void beforeMethod(Method m) {
		  utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
		  loginPage = new LoginPage();
	  }

	  @AfterMethod
	  public void afterMethod() {		  
	  }
	 
	  @Test
	  public void successfulLogin() {
		  loginPage.enterUserName(loginUsers.getJSONObject("validUser").getString("username"));
		  loginPage.enterPassword(loginUsers.getJSONObject("validUser").getString("password"));
		  productsPage = loginPage.pressLoginBtn();
		  		  
		
	  }
}
