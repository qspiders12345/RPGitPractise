package automationTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//WebElement emailField=driver.findElement(By.id("email"));
		//emailField.sendKeys("abcd");
		
		//or this optimized  way ,instead of above two steps
		driver.findElement(By.id("email")).sendKeys("abcd");
		driver.findElement(By.name("email")).sendKeys("efgh");
		driver.findElement(By.className("inputtext")).sendKeys("ijkl");
		driver.findElement(By.linkText("Forgot account?")).click();
		System.out.println("executed link text");
		
		driver.findElement(By.partialLinkText("Forgo")).click();
		System.out.println("executed partial link text");
		
		//cssSelector syntax: tagname[attribute_name='attribute_value']

	}

}
