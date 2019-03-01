package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		driver.findElement(By.xpath("//a[.='View Pop-up']")).click();
		driver.findElement(By.xpath("//button[.='Alert']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[.='Close']")).click();

	}

}
