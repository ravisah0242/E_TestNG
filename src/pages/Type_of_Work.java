package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Type_of_Work 
{
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class='popup_menu_container'])[2]")
	private WebElement PopupMenuContainerlink;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typeofWorklink;
	
	@FindBy(xpath="//span[////.='Create Type of Work']")
	private WebElement  createtypeofworklink;
	
	@FindBy(id="name")
	private WebElement namecreatetypeofwork;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitlink;
	
	@FindBy(xpath="//a[.='HR Manager']/../..//a[contains(text(),'delete')]")
	private WebElement deleteHRmanager;
	
	public Type_of_Work(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void popupmenuMethod()
	{
		PopupMenuContainerlink.click();
	}
	public void typeofworkMethod()
	{
		typeofWorklink.click();
	}
	public void createtypeofworkMethod()
	{
		createtypeofworklink.click();
	}
	public void namecreatetypeofworkMethod()
	{
		namecreatetypeofwork.sendKeys("HR Manager");
	}
	public void submitMethod()
	{
		submitlink.click();
	}
	public void deleteHRManagerMethod()
	{
		deleteHRmanager.click();
	}
	public void okbuttonMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();  //initialize WebDriver Globally to access the any whare in side class;
		alt.accept();
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", addnewButton);*/
	}

}
