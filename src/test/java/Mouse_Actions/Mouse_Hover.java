package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/mouseHover?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//img[@class=\"w-5 h-5 mt-5 ml-3 cursor-pointer \"]"));
		act.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[.=\"Image\"]")).click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//img[@title=\"Order Placed Image\"]"));
		act.moveToElement(ele1).perform();
		
		driver.findElement(By.xpath("//a[.=\"Ratings\"]")).click();
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.xpath("//div[@class=\"flex justify-center pt-2\"]"));
		act.moveToElement(ele2).perform();
		
		driver.findElement(By.xpath("//a[.=\"Tab\"]")).click();
		WebElement ele3 = driver.findElement(By.xpath("//li[text()=\"Kids \"]"));
		act.moveToElement(ele3).perform();
		
		
	}

}
