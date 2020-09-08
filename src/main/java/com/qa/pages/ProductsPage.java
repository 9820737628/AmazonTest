package com.qa.pages;

import com.qa.BaseTest;
import com.qa.MenuPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProductsPage extends MenuPage {
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='Search']") 
	private MobileElement SearcBox;
	
	@AndroidFindBy (xpath = "//android.widget.ListView/child::android.widget.LinearLayout/child::android.widget.LinearLayout[1]/child::android.widget.TextView[1]") 
	private MobileElement ClickItems;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Use my current location']")
	private MobileElement UseCurrenLocation;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Allow access']")
	private MobileElement Allowaccess;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='ALLOW ONLY WHILE USING THE APP']")
	private MobileElement ALLOWONLYWHILEUSINGTHEAPP;
	
	@AndroidFindBy (xpath = "//android.view.View/child::android.view.View[1]/following-sibling::android.view.View[1]/following-sibling::android.view.View[1]/child::android.view.View[1]")
	private MobileElement SelectProduct;
	
	

	
public ProductsPage SearchProduts(String Products) {
	sendKeys(SearcBox,Products);
    return this;
}


public ProductsPage ClickItem() {
	click(ClickItems, "click item");
	return this;
}

public ProductsPage AllowedappuseCurrentLocation() {
	click(UseCurrenLocation, "click UseCurrenLocation");
	click(Allowaccess,"click allow access");
	click(ALLOWONLYWHILEUSINGTHEAPP,"click ALLOW ONLY  WHILEUSING THEAPP");
	return this;
}

public String SelectProduct() {
	click(SelectProduct, "click SelectProduct");
	String productName = SelectProduct.getText();
	return productName;
}


}
