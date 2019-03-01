package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DependentIndependent {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='TASKS']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Budget']/../../..//div[@class='checkbox inactive']")).click();

	}

}
