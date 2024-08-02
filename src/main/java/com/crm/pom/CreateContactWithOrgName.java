package com.crm.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateContactWithOrgName {
	
public CreateContactWithOrgName(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	
private @FindBy(linkText="Contacts")
WebElement contact;

private @FindBy(xpath="//img[@alt='Create Contact...'")
WebElement createContact;

private @FindBy(xpath="//input[@name='lastname']")
WebElement lastname;

private @FindBy(xpath="(//input[@title='Clear'])[1]")
WebElement clear;

private @FindBy(xpath="(//img[@align='absmiddle'])[3]")
WebElement plusign;

private @FindBy (xpath="//select[@name='assigned_user_id']")
WebElement assigned;

public void contact() {
	contact.click();
}

public void createContact() {
	createContact.click();
}

public void lastname() {
	lastname.sendKeys("patil");
}

public void clear()
{
	clear.click();
}

public void plussign() {
	plusign.click();
}


}
