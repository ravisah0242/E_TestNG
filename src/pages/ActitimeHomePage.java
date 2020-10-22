package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage 
{
	@FindBy(xpath="//div[@class='logoSwitcherText']")
	private WebElement switchtoactiplansLink;
	
	@FindBy(xpath="//a[@class='content selected tt']")
	private WebElement timetrackLink;
	
	@FindBy(xpath="//div[contains(text(),'Tasks')]")
	private WebElement taskLink;
	
	@FindBy(xpath="//div[@class='label'][contains(text(),'Reports')]")
	private WebElement reportsLink;
	
	@FindBy(xpath="//div[contains(text(),'Users')]")
	private WebElement usersLink;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_calendar']")
	private WebElement calenderLink;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings']")
	private WebElement settingsLink;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_addons']")
	private WebElement integrationsLink;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_support']")
	private WebElement helpandsupportLink;
	
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logoutLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void switchtoactiplansMethod()
	{
		switchtoactiplansLink.click();
	}
	
	public void timetrackMethod()
	{
		timetrackLink.click();
	}
	
	public void tasksMethod() throws InterruptedException
	{
		taskLink.click();
	}
	
	public void reportsMethod()
	{
		reportsLink.click();
	}
	
	public void usersMethod()
	{
		usersLink.click();
	}
	
	public void calendarMethod()
	{
		calenderLink.click();
	}
	
	public void settingsMethod()
	{
		settingsLink.click();
	}
	
	public void integrationsMethod()
	{
		integrationsLink.click();
	}
	
	public void helpandsupportMethod()
	{
		helpandsupportLink.click();
	}
	
	public void logoutMethod()
	{
		logoutLink.click();
	}
}