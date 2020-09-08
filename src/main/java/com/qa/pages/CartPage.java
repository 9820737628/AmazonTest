package com.qa.pages;

import com.qa.BaseTest;
import com.qa.MenuPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CartPage extends BaseTest {
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Add to Cart']")
	private MobileElement AddToCardButton;
	
	@AndroidFindBy (xpath = "//android.view.View/child::android.view.View[1]/following-sibling::android.view.View[1]/following-sibling::android.view.View[1]/child::android.view.View[1]")
	private MobileElement SelectProduct;
	

	


public CartPage SwipeTillAddToCartPage() {
swipeVerticallyUntill_found(driver,AddToCardButton,2000,4);	
return this;
}

public String ClickOnAddTCatdButton() {
	click(AddToCardButton, "click UseCurrenLocation");
	String productName = SelectProduct.getText();
		return productName;
}	


/*
	 * public String getSLBPrice() { String price = getText(SLBPrice);
	 * utils.log("price is - " + price); return price; }
	 */

}
