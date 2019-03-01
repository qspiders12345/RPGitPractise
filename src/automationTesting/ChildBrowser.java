package automationTesting;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		ArrayList<String> listWindow=new ArrayList<>(windowHandles);
		System.out.println("Array list:"+listWindow.size());
		System.out.println("main window title:"+driver.getTitle());
		
		//Switching to child1 window
		driver.switchTo().window(listWindow.get(1));
		System.out.println("child1:"+driver.getTitle());
		driver.manage().window().maximize();
		
		//Clicking on link in child1 window and getting new window handles
		driver.findElement(By.xpath("//a[@href='http://w28.naukri.com/advertiser/bms_hits.php?banner=7301090']")).click();
		ArrayList<String> newListWindow=new ArrayList<>(driver.getWindowHandles());
		System.out.println("new arrayList :"+newListWindow.size());
		
		//switching to grandchild window and closing it
		driver.switchTo().window(newListWindow.get(3));
		System.out.println("Technosoft child window:"+driver.getTitle());
		driver.close();
		
		//switching back to child1 and closing it
		driver.switchTo().window(listWindow.get(1));
		System.out.println("child1:"+driver.getTitle());
		driver.close();
		
		//switching to child2 and closing it
		driver.switchTo().window(listWindow.get(2));
		Thread.sleep(3000);
		System.out.println("child2:"+driver.getTitle());
		driver.close();
		
	}

}
