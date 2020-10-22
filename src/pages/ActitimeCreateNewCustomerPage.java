package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateNewCustomerPage 
{
	public WebDriver driver;  //initialize WebDriver Globally to access the any whare in side class;
	
	@FindBy(xpath="//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']")
	private WebElement entercustomernameTextfield;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerdescriptionTextarea;
	
	@FindBy(xpath="//div[contains(text(),'Create Customer')]")
	private WebElement createcustomerButton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;
	
	@FindBy(xpath="//div[.='qspiders']/../..//div[@class='editButton']")
	private WebElement editlink;
	
	
	public ActitimeCreateNewCustomerPage(WebDriver driver)
	{
		//(always refaure to current driver);
		this.driver=driver; // Exception:-NullPointerException(some where initialize is not done Properly);  
		PageFactory.initElements(driver, this);
	}
	
	public void entercustomernameMethod()
	{
		entercustomernameTextfield.sendKeys("qspiders");
	}
	
	public void entercustomerdescriptionMethod()
	{
		entercustomerdescriptionTextarea.sendKeys("qspiders is a training institute");
	}
	
	public void createcustomerMethod()
	{
		createcustomerButton.click();
	}
	
	public void cancelMethod()
	{
		cancelButton.click();
	}
	
	public void okbuttonMethod()
	{
		Alert alt=driver.switchTo().alert();  //initialize WebDriver Globally to access the any whare in side class;
		alt.accept();
	}
	public void editMethod()
	{
		editlink.click();
	}
	
}