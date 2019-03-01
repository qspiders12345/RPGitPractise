package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebelementMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Forgot account')]")).getText());
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("abcde");
		
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys(username.getAttribute("value")); //returns the value present in username textfield
		System.out.println(pwd.getAttribute("value"));
		
		WebElement radio1=driver.findElement(By.id("u_0_9"));
		System.out.println("IsDisplayed"+ radio1.isDisplayed());
		System.out.println("IsEnabled:" + radio1.isEnabled());
		System.out.println("IsSelected:" + radio1.isSelected());

	}

}
