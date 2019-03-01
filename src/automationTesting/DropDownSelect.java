package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement list=driver.findElement(By.id("selenium_commands"));
		Select selectList=new Select(list);
		selectList.selectByVisibleText("Wait Commands");
		selectList.selectByIndex(1);
		selectList.selectByIndex(0);
		Thread.sleep(2000);
		List<WebElement> selectedItems=selectList.getAllSelectedOptions();
		
		System.out.println(selectedItems.size());
		
		for(int i=0;i<selectedItems.size();i++){
			System.out.println("selected items are:"+selectedItems.get(i).getText());
		}
		
		System.out.println("First selected list item:"+selectList.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		selectList.deselectByIndex(1);
		selectList.deselectByVisibleText("Wait Commands");
		Thread.sleep(2000);
		driver.quit();

	}

}
