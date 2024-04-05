package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/frames?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("ab");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("ab");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//a[.=\"Nested iframe\"]")).click();
		driver.switchTo().frame("nestedFrameName");
		driver.switchTo().frame("newWindow");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Admin@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//input[@id=\"confirm-password\"]")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//button[.=\"Press Enter to Submit\"]")).click();
		
		driver.findElement(By.xpath("//a[.=\"Multiple iframe\"]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Admin@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//input[@id=\"confirm-password\"]")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//button[.=\"Sign Up\"]")).click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("SuperAdmin@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("SuperAdmin@1234");
		driver.findElement(By.xpath("//button[.=\"Sign In\"]")).click();
		
	}

}
