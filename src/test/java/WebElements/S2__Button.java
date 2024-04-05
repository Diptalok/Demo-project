package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class S2__Button {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/?scenario=1.");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//section[.=\"Button\"]")).click();
		
		//1. script to click on button
		driver.findElement(By.xpath("(//button[.=\"No\"])[2]")).click();
		
		WebElement ele = driver.findElement(By.xpath("(//button[.=\"No\"])[1]"));
		ele.click();
		Thread.sleep(3000);
		
		//2. script to validate whether button is selected or not
		if(ele.isSelected()) {
			System.out.println("it is selected");
		}
		else {
			System.out.println("it is not selected");
		}
		
		//3. script to click right click
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.=\"Right Click\"])")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//button[.=\"Right Click\"])[1]"));
		Thread.sleep(2000);
		act.contextClick(ele).perform();
		
		//4. script to click double click
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.=\"Double Click\"]")).click();
		Thread.sleep(2000);
		WebElement elem = driver.findElement(By.xpath("(//button[.=\"Yes\"])[1]"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(elem).perform();
		
		//5. script to click on submit click
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.=\"Submit Click\"])")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
		ele.click();
		if(ele.isSelected()) {
			if(ele.isSelected()) {
				System.out.println("it is selected");
			}
		}
		else {
			System.out.println("it is not selected");
		}
		driver.findElement(By.xpath("(//button[.=\"Submit\"])[1]")).click();
		
		//6. script to click on disable button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.=\"Disabled\"]")).click();
		
		//6. script to validate enable and disable
		WebElement ele = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		Thread.sleep(2000);
		if(ele.isEnabled()){
			System.out.println("it is enabled");
		}
		else {
			System.out.println("it is disabled");
		}*/
		
	}

}
