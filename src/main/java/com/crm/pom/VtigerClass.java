package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerClass {

	
		
	public VtigerClass(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	private @FindBy(xpath=("(//a[text()='Organizations'])[1]"))
		 WebElement organization ;

		
	private @FindBy(xpath="//img[@alt='Create Organization...']")

	    WebElement CreateOrg;
	    
	    
	private   @FindBy(xpath="//input[@name='accountname']")
	   WebElement accountname;

	private @FindBy(xpath="(//input[@class='crmbutton small save'])[1]")
	   WebElement save;

	public void org() {
		organization.click();
	}

	public void createOrg() {
		CreateOrg.click();
	}

	public void accname(String name) {
		accountname.sendKeys(name);
	}

	public void save() {
		save.click();
	}
	}
	


