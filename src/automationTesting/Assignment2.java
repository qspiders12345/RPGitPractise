package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Login using cssSelector
public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		//cssSelector syntax: tagname[attribute_name='attribute_value']
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		System.out.println("Success");

	}

}
