package automationTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.monster.com/");
		
		driver.findElement(By.xpath("//a[.='Upload a Resume']")).click();
		driver.findElement(By.id("btnUploadFromMyComputer")).click();
		
		StringSelection filename=new StringSelection("/Users/RoopaPrabhagaran/Downloads/sample.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filename, null);
		
		Robot clip=new Robot();
		Thread.sleep(2000);
		
		//since it opens java app it looses control on browser, so using cmd+tab
		clip.keyPress(KeyEvent.VK_META);
		clip.keyPress(KeyEvent.VK_TAB);
		clip.keyRelease(KeyEvent.VK_META);
		clip.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		clip.keyPress(KeyEvent.VK_META);
		clip.keyPress(KeyEvent.VK_SHIFT);
		clip.keyPress(KeyEvent.VK_G);
		//Thread.sleep(2000);
		clip.keyRelease(KeyEvent.VK_META);
		clip.keyRelease(KeyEvent.VK_SHIFT);
		clip.keyRelease(KeyEvent.VK_G);
		Thread.sleep(1000);
		
		clip.keyPress(KeyEvent.VK_META);
		clip.keyPress(KeyEvent.VK_V);
		clip.keyRelease(KeyEvent.VK_META);
		clip.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		clip.keyPress(KeyEvent.VK_ENTER);
		clip.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		clip.keyPress(KeyEvent.VK_ENTER);
		clip.keyRelease(KeyEvent.VK_ENTER);
	}

}
