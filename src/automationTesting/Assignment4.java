package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//xpath by GroupIndex . Syntax : (xpath expression)[index]

public class Assignment4 {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		Thread.sleep(5000);//To delay Selenium since application works slower
		
		driver.findElement(By.xpath("(//div[@class='popup_menu_arrow'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_arrow'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_arrow'])[3]")).click();
		driver.quit();

	}

}
