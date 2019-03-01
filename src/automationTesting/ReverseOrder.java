package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReverseOrder {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/RoopaPrabhagaran/Documents/Selenium%20tutorial/Notes/MultipleWebElements.html");

		List<WebElement> checkboxes=driver.findElements(By.xpath("//input"));
		
		for(int i=checkboxes.size()-1;i>=0;i--){
			Thread.sleep(2000);
			checkboxes.get(i).click();
		}

	}

}
