package Vtiger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.pom.CreateConcWithSupportStrtEndDate;

import BaseClass.VtigerBaseClass;

public class CreateConWthSupportStartEndDate extends VtigerBaseClass
{
	@Test
	public void startEndDate()  {
		CreateConcWithSupportStrtEndDate ref = new CreateConcWithSupportStrtEndDate(driver);
		ref.contact();
		ref.createContact();
		ref.lastname();
		WebElement assign = ref.assigned();
		Select sel=new Select(assign);
		sel.selectByIndex(0);
		ref.startDate();
		ref.endDate();
		
	}

}
