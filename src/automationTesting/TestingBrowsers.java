package automationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingBrowsers {

	public static void main(String[] args) {
		//WebDriver driver=new FirefoxDriver();
		//Call the chromedriver ,so that it supports Chrome browser
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		//Opens Browser
		WebDriver driver=new ChromeDriver();
		//Enter URL
		driver.get("https://www.google.com/");
		//Get title
		System.out.println(driver.getTitle());
		//Get currentURL
		System.out.println(driver.getCurrentUrl());
		//Navigate to URL
		driver.navigate().to("https://www.facebook.com");
		//Goback , forward and refresh
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//to maximize the window
		//driver.manage().window().maximize();
		driver.quit();

	}

}
