package Vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.pom.CreateOrganizationWithIndustries;

import BaseClass.VtigerBaseClass;

@Listeners(com.crm.Listeners.Vtiger.class)
public class CreateOrgWithIndustry extends VtigerBaseClass {

@Test	
public void  createOrgWithIndu() throws InterruptedException {
	
	 CreateOrganizationWithIndustries ref = new CreateOrganizationWithIndustries(driver);
	 ref.orgnization();
	 ref.createOrg();
	 ref.accname();
	 ref.save();
	 
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	WebElement industry = driver.findElement(By.xpath("//select[@name='industry']"));
	Select ref2=new Select(industry);
	ref2.selectByIndex(4);

}
}