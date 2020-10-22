package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.ActitimeCreateNewCustomerPage;
import pages.ActitimeHomePage;
import pages.ActitimeLoginPage;
import pages.ActitimeTasksPage;

public class ActitimeCreateCustomer
{
	@Test(groups="smoke")
	public void customer() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.tasksMethod();
		
		ActitimeTasksPage task=new ActitimeTasksPage(driver);
		task.addnewMethod();
		task.newcustomerMethod();
		
		ActitimeCreateNewCustomerPage customer=new ActitimeCreateNewCustomerPage(driver);
		customer.entercustomernameMethod();
		customer.entercustomerdescriptionMethod();
		customer.createcustomerMethod();
	}

}
