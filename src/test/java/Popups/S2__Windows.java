package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2__Windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/browser?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//in different window
		/*driver.findElement(By.xpath("//a[.=\"Open in new window\"]")).click();
		
		String main = driver.getWindowHandle();
		System.out.println(main);
		
		Set<String> wind = driver.getWindowHandles();
		
		Thread.sleep(2000);
		for (String str : wind) 
		{
			Thread.sleep(2000);
			System.out.println(str);
			Thread.sleep(2000);
			if(!main.equals(str))
			{
				Thread.sleep(2000);
				driver.switchTo().window(str);
				break;
			}
			
		}
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Miku");
		
		//in different tab
		
		driver.findElement(By.xpath("//a[.=\"New Tab\"]")).click();
		driver.findElement(By.xpath("//button[.=\"Open window in new Tab\"]")).click();
		
		String main = driver.getWindowHandle();
		Set<String> wind = driver.getWindowHandles();
		
		for (String str : wind) {
			if(!main.equals(wind)) {
				driver.switchTo().window(str);
			}
		}
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Miku");
		
		//different windows
		
		driver.findElement(By.xpath("//a[.=\"Multiple Windows\"]")).click();
		driver.findElement(By.xpath("//button[.=\"Click to open multiple popup windows\"]")).click();
		
		driver.getWindowHandle();
		Set<String> wind = driver.getWindowHandles();
		for (String str : wind) {
			driver.switchTo().window(str);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Forgot Password"))
			{
				driver.switchTo().frame(0);
				//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Miku");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Miku");	
				break;
			}
			
		}*/
		
		//multiple tab 
		driver.findElement(By.xpath("//a[.=\"Multiple Tabs\"]")).click();
		driver.findElement(By.xpath("//button[.=\"Click to open multiple tabs\"]")).click();
		
		driver.getWindowHandle();
		Set<String> wind = driver.getWindowHandles();
		for (String str : wind) {
			driver.switchTo().window(str);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Login Page"))
			{
				//driver.switchTo().frame(0);
				driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Miku");
				//Thread.sleep(2000);
				//driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Miku");	
				break;
			}
					
		}
		
		
		
	}

}
