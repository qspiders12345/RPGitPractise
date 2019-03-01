package DemoAutomation;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/RoopaPrabhagaran/Documents/Selenium downloads/chromedriver");
		WebDriver driverMain=new ChromeDriver();
		driverMain.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driverMain.get("https://www.seleniumeasy.com/test/");
		WebElement startPractise=driverMain.findElement(By.xpath("//a[.=' Start Practising ']"));
		WebElement inputFormLink=driverMain.findElement(By.xpath("//a[.='Input Forms']"));
		WebElement simpleFormLink=driverMain.findElement(By.xpath("//a[.='Input Forms']/../ul/li//a[.='Simple Form Demo']"));
		
		simpleForm(driverMain,startPractise);
		twoInputFields(driverMain,inputFormLink,simpleFormLink);
		singleCheckBox(driverMain, inputFormLink);
		radioButton(driverMain,inputFormLink);
		
	}
		public static void simpleForm(WebDriver driver,WebElement start){
		//Simple Form
		start.click();
		WebElement simple=driver.findElement(By.xpath("//div[@id='basic']/div/a[1]"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(simple));
		simple.click();
		
		WebElement simpleText=driver.findElement(By.id("user-message"));
		simpleText.sendKeys("Hello!! simple input form");
		driver.findElement(By.xpath("//button[.='Show Message']")).click();
		
		System.out.println(driver.findElement(By.xpath("//span[@id='display']")).getText());
		System.out.println("finished single input field");
		}
		
		//Two Input fields - Get total
		public static void twoInputFields(WebDriver driver,WebElement inputLink,WebElement link){
		System.out.println("Startng two input fields");
		inputLink.click();
		link.click();
		WebElement twoInputA=driver.findElement(By.id("sum1"));
		twoInputA.sendKeys("14");
		int valueA=Integer.parseInt(twoInputA.getAttribute("value"));
		
		WebElement twoInputB=driver.findElement(By.id("sum2"));
		twoInputB.sendKeys("6");
		int valueB=Integer.parseInt(twoInputB.getAttribute("value"));
		
		driver.findElement(By.xpath("//button[.='Get Total']")).click();
		int c=valueA+valueB;
		System.out.println(driver.findElement(By.xpath("//span[@id='displayvalue']")).getText());
		System.out.println("finished Get total");
		}
		
		//Single checkBox demo
		public static void singleCheckBox(WebDriver driver,WebElement inputLink){
		inputLink.click();
		driver.findElement(By.xpath("//a[.='Input Forms']/..//ul/li/a[.='Checkbox Demo']")).click();
		System.out.println("Starting Checkbox demo");
		driver.findElement(By.id("isAgeSelected")).click();
		WebElement chkBoxMsg=driver.findElement(By.id("txtAge"));
		String str=chkBoxMsg.getText();
		if(str.contentEquals("Success - Check box is checked")){
			System.out.println("msg printed");
		}
		}
		
		//Multiple CheckBox demo
		public static void multipleCheckBox(WebDriver driver,WebElement inputLink){
		inputLink.click();
		driver.findElement(By.xpath("//a[.='Input Forms']/..//ul/li/a[.='Checkbox Demo']")).click();
		List<WebElement> multipleCheck=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		for(int i=0;i<multipleCheck.size();i++){
			multipleCheck.get(i).click();
		}
		driver.findElement(By.id("check1")).click();
		}

		//Radio button demo
		public static void radioButton (WebDriver driver,WebElement inputLink){
		inputLink.click();
		driver.findElement(By.xpath("//a[.='Input Forms']/..//ul/li[3]/a[.='Radio Buttons Demo']")).click();
		WebElement radioMale=driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
		radioMale.click();
		System.out.println(radioMale.isSelected());
		WebElement buttonCheck=driver.findElement(By.id("buttoncheck"));
		buttonCheck.click();
		System.out.println(driver.findElement(By.xpath("//p[@class='radiobutton']")).getText());
		WebElement radioFemale=driver.findElement(By.xpath("(//input[@value='Female'])[1]"));
		radioFemale.click();
		buttonCheck.click();
		System.out.println(driver.findElement(By.xpath("//p[@class='radiobutton']")).getText());
		}
		
		

}
