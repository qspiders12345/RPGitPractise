package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveMouse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//hidden division popup-- just inspect and add click
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement home=driver.findElement(By.xpath("//span[.='Sports, Books & More']"));
		Actions mouseAction=new Actions(driver);
		Thread.sleep(3000);
		mouseAction.moveToElement(home).click(home).perform(); //always use perform method in the end of Actions class
		//driver.quit();
	}

}
