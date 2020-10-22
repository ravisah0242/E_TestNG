package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ActitimeLoginPage;
import pages.Type_of_Work;

public class ActitimeCreateWork 
{
	//@Test(enabled=false) //skip the Test Mathod;
	@Test(groups="Regration")
	public void work() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		
		Type_of_Work work=new Type_of_Work(driver);
		work.popupmenuMethod();
		work.typeofworkMethod();
		work.createtypeofworkMethod();
		work.namecreatetypeofworkMethod();
		work.submitMethod();
		work.deleteHRManagerMethod();
		work.okbuttonMethod();
	}

}
