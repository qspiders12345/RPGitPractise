package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutosuggesstion {

	//Handling autosuggessions
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com");
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		
		List<WebElement> suggestions=driver.findElements(By.xpath("//div[@class='sa_tm']"));
		Thread.sleep(4000);
		suggestions.get(3).click();
		
		driver.quit();

	}

}
