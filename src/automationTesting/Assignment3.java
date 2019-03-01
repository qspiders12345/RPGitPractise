package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Login using xpath by Attribute
//Syntax : //<tagname>[@<attribute_name>='<attribute_value']

public class Assignment3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		
		//xpath by text - syntax : //<tagname>[.='<textvalue>'] or //<tagname>[text()='<textvalue>']
		System.out.println(driver.findElement(By.xpath("//a[.='Forgot your password?']")).getText());
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		System.out.println("Logged in successfully to actitime");
		//driver.close();
		
		System.out.println("Opening facebook page");
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("roopa.arjunan@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcdef");
		driver.quit();
		
	}

}
