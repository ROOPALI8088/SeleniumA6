package Vtiger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.pom.CreateVendor;

import BaseClass.VtigerBaseClass;

@Listeners(com.crm.Listeners.Vtiger.class)
public class CreateVendors extends VtigerBaseClass {

@Test
public void createVendor()  {
	
	CreateVendor ref = new CreateVendor(driver);
	WebElement more=ref.moreMenu();
	WebElement vendor = ref.vendors();
	more.click();
	Actions act = new Actions(driver);
	act.moveToElement(more);
	vendor.click();
	ref.plusimage();
	ref.vendorName();
	ref.submit();
	
	
}
}