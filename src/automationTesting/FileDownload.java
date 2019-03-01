package automationTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/geckodriver");
		//System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/download/");
		
		driver.findElement(By.id("close")).click();
		driver.findElement(By.xpath("//a[.='Mozilla GeckoDriver']/../..//a[.='latest']")).click();
		driver.findElement(By.xpath("//strong[.='geckodriver-v0.24.0-macos.tar.gz']")).click();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
