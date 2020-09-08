package com.qa.pages;

import org.openqa.selenium.Keys;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BaseTest {
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Continue in English\"]")
	private MobileElement ContinueInEnglish;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Already a customer? Sign in']")
	private MobileElement AlreadyAcustomerSignin;
	
	@AndroidFindBy (xpath = "//android.widget.EditText[@resource-id='ap_email_login']")
	private MobileElement usernameTxtFld;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@resource-id='continue']")
	private MobileElement ContinueButton;

	@AndroidFindBy (xpath = "//android.widget.EditText[@text='Amazon password']")
	private MobileElement passwordTxtFld;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Login']")
	private MobileElement loginBtn;
	
public LoginPage ContinueInEnglish() {
		click(ContinueInEnglish);
		return this;
	}	

public LoginPage ClicExistingCustomerLogin() {
	click(AlreadyAcustomerSignin);
	return this;
}

	
public LoginPage enterUserName(String username) {
	clear(usernameTxtFld);	
	sendKeys(usernameTxtFld, username, "login with " + username);
	click(ContinueButton);
	return this;
}



public LoginPage enterPassword(String password) {
	clear(passwordTxtFld);
	sendKeys(passwordTxtFld, password, "password is " + password);
	return this;
}


public ProductsPage pressLoginBtn() {
	click(loginBtn, "press login button");
	return new ProductsPage();
}

//public ProductsPage login(String username, String password) {
//	enterUserName(username);
//	enterPassword(password);
//	return pressLoginBtn();
//}


}
