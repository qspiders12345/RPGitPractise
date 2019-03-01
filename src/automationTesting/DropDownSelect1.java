package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		
		WebElement dropList=driver.findElement(By.xpath("//select[@name='country']"));
		Select selectItem=new Select(dropList);
		
		selectItem.selectByIndex(1);
		Thread.sleep(2000);
		selectItem.selectByVisibleText("BAHRAIN");
		Thread.sleep(2000);
		selectItem.selectByValue("CONGO");
		System.out.println(selectItem.isMultiple());

	}

}
