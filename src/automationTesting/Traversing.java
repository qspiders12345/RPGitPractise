package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Traversing {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://irctc.com/displayServlet");
		
		//Getting the number related to Mumbai from IRCTC
		System.out.println(driver.findElement(By.xpath("//label[.='Mumbai']/../label[contains(text(),'22618067')]")).getText());

	}

}
