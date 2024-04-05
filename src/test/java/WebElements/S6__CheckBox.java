package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S6__CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/?scenario=1.");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//section[.=\"Check Box\"]")).click();
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[4]")).click();
		
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[4]"));
		if(ele.isSelected()) {
			ele.click();
		}
		
		List<WebElement> eles = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		int i = 0;
		for (WebElement el : eles) {
			Thread.sleep(1000);
			i++;
			el.click();
		}
		System.out.println("total checkboxes = "+i);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type=\"submit\"])")).click();

	}

}
