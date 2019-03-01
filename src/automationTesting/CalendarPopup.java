package automationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*driver.get("https://www.yatra.com/");
		Thread.sleep(3000);
		WebElement fromText=driver.findElement(By.id("BE_flight_origin_city"));
		fromText.sendKeys("BLR");
		Thread.sleep(5000);
		fromText.sendKeys(Keys.RETURN); */
		
		driver.get("https://www.aa.com/homePage.do");
		WebElement from=driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		from.clear();
		from.sendKeys("CVG");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		System.out.println("From entered");
		Thread.sleep(3000); 
		
		WebElement to=driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
		to.sendKeys("chi");
		Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		
		WebElement noOfPassenger=driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
		Thread.sleep(3000);
		Select selectCount=new Select(noOfPassenger);
		selectCount.selectByValue("4");
		
		driver.findElement(By.id("aa-leavingOn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[.='20'])[1]")).click();
		
		driver.findElement(By.id("aa-returningFrom")).click();
		driver.findElement(By.xpath("(//a[.='26'])[2]")).click();
		driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
		
	}

}
