package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMTypesOfWork {

	@FindBy(xpath="//div[@class='popup_menu_icon settings_icon']")
	private WebElement settingsMenu;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesOfWorkLink;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createNewTypeOfWorkButton;
	
	@FindBy(id="name")
	private WebElement workNameTextField;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement statusDropDown;
	
	@FindBy(id="billingType_setBillable")
	private WebElement categoryBillableRadio;
	
	@FindBy(id="billingRate_input")
	private WebElement billingRateTextField;
	
	@FindBy(xpath="//input[@value='   Create Type of Work   ']")
	private WebElement createWorkButton;
	
	public POMTypesOfWork(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createTypeOfWork() throws InterruptedException
	{
		settingsMenu.click();
		Thread.sleep(2000);
		typesOfWorkLink.click();
		createNewTypeOfWorkButton.click();
		
		Select statusValue=new Select(statusDropDown);
		workNameTextField.sendKeys("POMTest");
		statusValue.selectByIndex(1);
		categoryBillableRadio.click();
		billingRateTextField.sendKeys("45");
		createWorkButton.click();
		
	}
	}
