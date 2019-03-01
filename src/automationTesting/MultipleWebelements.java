package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com");
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		System.out.println("No of links: "+ links.size());
		
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getAttribute("href"));
			System.out.println(links.get(i).getText());
		}
		driver.quit();

	}

}
