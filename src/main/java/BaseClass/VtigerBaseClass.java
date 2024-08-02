package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.javautility.JavaUtility;

public class VtigerBaseClass {
	
public static WebDriver driver;

@BeforeClass
public void preCondition() throws IOException
{
		  String browser = JavaUtility.loginData("browser");
		   String url = JavaUtility.loginData("url");
		   if(browser.equalsIgnoreCase("chrome"))
		  {
			  driver=new ChromeDriver();
		  }
		
		
		  else if(browser.equalsIgnoreCase("FireFox"))
		  {
			driver=new FirefoxDriver();
		  }
		
		  else
		  {
			driver=new EdgeDriver();
		  }
			
	 driver.manage().window().maximize();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get(url);
		   
}

 @BeforeMethod
    public void login() throws IOException {
	 
	 String admin = JavaUtility.loginData("admin");
	 String root = JavaUtility.loginData("root");
	 
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(admin);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(root);
	driver.findElement(By.id("submitButton")).click();

 }
	

}
