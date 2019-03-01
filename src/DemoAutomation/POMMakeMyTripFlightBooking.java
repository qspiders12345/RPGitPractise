package DemoAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMMakeMyTripFlightBooking {

	public void oneWayTrip(){
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		WebElement fromText=driver.findElement(By.id("hp-widget__sfrom"));
		fromText.clear();
		fromText.sendKeys("BLR");
		fromText.sendKeys(Keys.ENTER);
		
		WebElement toText=driver.findElement(By.id("hp-widget__sTo"));
		toText.click();
		toText.sendKeys(Keys.ARROW_DOWN);
		toText.sendKeys(Keys.ARROW_DOWN);
		toText.sendKeys(Keys.ENTER);
		
		WebElement departDate=driver.findElement(By.id("hp-widget__depart"));
		departDate.click();
		
	}

}
