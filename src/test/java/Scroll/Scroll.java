package Scroll;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/?scenario=1.");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//section[.=\"Web Elements\"]")).click();
		driver.findElement(By.xpath("(//section[.=\"Scroll\"])")).click();
		driver.findElement(By.xpath("(//section[.=\"Scroll\"])[2]")).click();
		
		driver.findElement(By.xpath("//section[.=\"Within The Frame\"]")).click();
		driver.findElement(By.xpath("//a[.=\"Vertical\"]")).click();
		
		Thread.sleep(1000);
		JavascriptExecutor je = (JavascriptExecutor)driver;
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//h1[contains(.,\"TERMS & CONDITIONS\")]"));		
		je.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[.=\"Horizontal\"]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		je.executeScript("window.scrollBy(5000,0)");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//section[.=\"In New Tab\"]")).click();
		driver.findElement(By.xpath("//a[.=\"Vertical\"]")).click();
		driver.findElement(By.xpath("//a[.=\"Open In New Tab\"]")).click();
		
		String main = driver.getWindowHandle();
		System.out.println(main);
		
		Set<String> windids = driver.getWindowHandles();
		for (String str : windids) {
			if(!main.equals(str)) {
				Thread.sleep(1000);
				driver.switchTo().window(str);
			}
			
		}
		
		je.executeScript("window.scrollBy(0,5000)");
		driver.switchTo().window(main);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.=\"Horizontal\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.=\"Open In New Tab\"]")).click();
		Set<String> windid = driver.getWindowHandles();
		for (String str : windid) {
			if(!main.equals(str)) {
				Thread.sleep(1000);
				driver.switchTo().window(str);
			}
			
		}
		je.executeScript("window.scrollBy(3000,0)");
		driver.switchTo().window(main);
		driver.findElement(By.xpath("//a[.=\"Infinite\"]")).click();

	}

}
