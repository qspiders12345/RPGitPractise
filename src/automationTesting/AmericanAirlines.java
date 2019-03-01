package automationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmericanAirlines {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.americanairlines.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement fromPlace=driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		fromPlace.sendKeys("BLR");
		Thread.sleep(2000);
		fromPlace.sendKeys(Keys.ARROW_DOWN);
		fromPlace.sendKeys(Keys.ENTER);
		
		WebElement toPlace=driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
		toPlace.sendKeys("mum");
		Thread.sleep(2000);
		toPlace.sendKeys(Keys.ARROW_DOWN);
		toPlace.sendKeys(Keys.ENTER);
		
		WebElement adults=driver.findElement(By.id("flightSearchForm.adultPassengerCount"));
		Select adultsCount=new Select(adults);
		adultsCount.selectByVisibleText("4"); 
		
		driver.findElement(By.id("aa-leavingOn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[.='20'])[1]")).click();
		
		driver.findElement(By.id("aa-returningFrom")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[.='26'])[2]")).click();
		
		WebElement child=driver.findElement(By.id("flightSearchForm.childPassengerCount"));
		Select childCount=new Select(child);
		childCount.selectByIndex(2);
		driver.findElement(By.id("bookingModule-submit")).click();
		
	}

}
