package com.crm.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationWithIndustries {
	
	public CreateOrganizationWithIndustries(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
private @FindBy(xpath="(//a[text()='Organizations'])[1]")
WebElement  organization;

private @FindBy(xpath="//img[@alt='Create Organization...")
WebElement createOrganization;

private @FindBy(xpath="//input[@name='accountname']")
WebElement accountname;

private @FindBy(xpath="(//input[@class='crmbutton small save'])[1]")
WebElement save;


public void orgnization() {
	organization.click();
}

public void createOrg() {
	createOrganization.click();
}

public void accname() {
	accountname.sendKeys("shreeramlaptop");
}

public void save() {
	save.click();
}



}
 

