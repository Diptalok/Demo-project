package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3__Authentication {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@demoapps.qspiders.com/auth?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[@id=\"AuthLink\"]")).click();
		
		String main = driver.getWindowHandle();
		Set<String> id = driver.getWindowHandles();
		for (String str : id) {
			
			Thread.sleep(2000);
			//System.out.println(driver.getTitle());
            if(!main.equals(str)) {
            	Thread.sleep(2000);
            	driver.switchTo().window(str);
			}
			
		}
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		//alt.sendKeys("admin");
		
	}

}
