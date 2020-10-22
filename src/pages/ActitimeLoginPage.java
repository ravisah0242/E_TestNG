 package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage 
{
	//declaration
	
	/*@FindBy(id="username")
	private WebElement usernameTextfield;*/
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'Forgot')]")
	private WebElement forgotyourpassworLink;
	
	@FindBy(xpath="//a[contains(text(),'actiTIME')]")
	private WebElement actitimeincLink;
	
	/*@FindBy(id="logoContainer")
	private WebElement actitimelogoImage;*/
	
	//initialization
	
	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void loginMethod()
	{
		usernameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		keepmeloggedinCheckbox.click();
		loginButton.click();
	}
	
	public void forgotyourpasswordMethod()
	{
		forgotyourpassworLink.click();	
	}
	
	public void actitimeincMethod()
	{
		actitimeincLink.click();
	}
}