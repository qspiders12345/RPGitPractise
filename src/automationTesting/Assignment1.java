package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Logged in successfully");
		
		driver.get("https://demo.actitime.com");
		
		//driver.findElement(By.linkText("Logout")).click();
		//System.out.println("Going back");
		
		//driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		//driver.quit();
		

	}

}
