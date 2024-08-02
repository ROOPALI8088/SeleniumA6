package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVendor {
	
	
	public CreateVendor(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
private @FindBy(xpath="(//img[@style=\"padding-left:5px\"]/..)")
WebElement more;

private @FindBy(linkText="Vendors")
WebElement vendor;

private @FindBy(xpath="//img[@alt=\"Create Vendor...\"]")
WebElement pulssign;

private @FindBy(xpath="//input[@name='vendorname']")
WebElement vendorname;

private @FindBy(xpath="//input[@type='submit']")
WebElement submit;

public WebElement  moreMenu() {
	return more;
}
public void plusimage() {
	pulssign.click();
}

public void submit() {
	submit.click();
}

public WebElement  vendors() {
	return vendor;
}

public void vendorName() {
	vendorname.sendKeys("pallavi");
}
}
