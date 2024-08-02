package Vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.javautility.RandomUtility;
import com.crm.pom.VtigerClass;


import BaseClass.VtigerBaseClass;

@Listeners(com.crm.Listeners.Vtiger.class)
public class CreateOrganization extends VtigerBaseClass {
	
	
@Test
	public void  createOrganization() {
		
	VtigerClass ref=new VtigerClass(driver);
	ref.org();
	ref.createOrg();
	ref.accname("shreeramlaptop"+RandomUtility.random());
	ref.save();
	
	
	
}
	
	
	
	

}