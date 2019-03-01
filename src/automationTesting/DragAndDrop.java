package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		String sourceList[]={"//div[@id='box6']",
				"//div[@id='box7']",
				"//div[@id='box1']",
				"//div[@id='box4']",
				"//div[@id='box5']",
				"//div[@id='box2']",
				"//div[@id='box3']"
				};
		
		List<WebElement> targetListWebElement=driver.findElements(By.xpath("//div[@id='countries']/div"));
		
		for (int i=0;i<sourceList.length;i++){
			WebElement source=driver.findElement(By.xpath(sourceList[i]));
			WebElement target=targetListWebElement.get(i);
			dragAndDrop(driver,source,target);
		}		
		
	}
		public static void dragAndDrop (WebDriver driver1 , WebElement  source,WebElement target){
			Actions actOnElement=new Actions(driver1);
			actOnElement.dragAndDrop(source, target).perform();	
		}

}
