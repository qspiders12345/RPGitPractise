package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActitimeLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		
		POMActitimeLogin pomLogin=new POMActitimeLogin(driver);
		pomLogin.loginMethod();
		
		POMTypesOfWork typesOfWork=new POMTypesOfWork(driver);
		Thread.sleep(2000);
		typesOfWork.createTypeOfWork();
		
		POMTasks tasks=new POMTasks(driver);
		tasks.tasksLink();
	}
}
