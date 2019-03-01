package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testingpool.com/wp-content/uploads/2015/08/DemoApplication.html");
		
		WebElement dropList=driver.findElement(By.xpath("//select[@name='Week']"));
		Select listItem=new Select(dropList);
		
		System.out.println(listItem.isMultiple());
		listItem.selectByIndex(1);
		listItem.selectByValue("Fri");
		listItem.selectByVisibleText("Sunday");
		listItem.deselectByVisibleText("Wednesday");
		System.out.println(listItem.getFirstSelectedOption().getText());
		
		List<WebElement> selectedList=listItem.getAllSelectedOptions();	
		for(int i=0;i<selectedList.size();i++){
			System.out.println(selectedList.get(i).getText());
		}
		Thread.sleep(2000);
		
		listItem.deselectAll();
		Thread.sleep(2000);
		driver.quit();
	}

}
