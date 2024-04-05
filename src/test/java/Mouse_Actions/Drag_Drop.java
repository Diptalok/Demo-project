package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/dragDrop?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[.=\"Drag Position\"]")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class=\"drop-column  min-h-[200px] bg-slate-100\"]"));
		Point loc = ele.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		WebElement dp = driver.findElement(By.xpath("//div[.=\"Mobile Charger\"]"));
		WebElement dp1 = driver.findElement(By.xpath("//div[.=\"Laptop Charger\"]"));
		WebElement ele1 = driver.findElement(By.xpath("//div[@class=\"drop-column min-h-[200px] bg-slate-100\"]"));
		Actions act = new Actions(driver);
		
		Thread.sleep(1000);
		act.dragAndDrop(dp, ele).perform();
		Thread.sleep(2000);
		act.dragAndDrop(dp1, ele1).perform();
		
		WebElement dp2 = driver.findElement(By.xpath("//div[.=\"Mobile Cover\"]"));
		WebElement dp3 = driver.findElement(By.xpath("//div[.=\"Laptop Cover\"]"));
		
		/*Thread.sleep(1000);
		act.dragAndDrop(dp2, ele).perform();
		Thread.sleep(2000);
		act.dragAndDrop(dp3, ele1).perform();*/
		
		Thread.sleep(1000);
		act.clickAndHold(dp2).perform();
		Thread.sleep(1000);
		act.release(ele).perform();
		Thread.sleep(1000);
		act.clickAndHold(dp3).perform();
		Thread.sleep(1000);
		act.release(ele1).perform();

	}

}
