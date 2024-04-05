package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1__JavaScript {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//section[.=\"Web Elements\"]")).click();
		driver.findElement(By.xpath("//section[.=\"Popups\"]")).click();
		driver.findElement(By.xpath("//section[.=\"Javascript\"]")).click();
		
		//alert box
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.=\"Alert Box\"]")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		alt.accept();
		
		//confirm box
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.=\"Confirm\"]")).click();
		
		driver.findElement(By.xpath("//button[.=\"Confirm Box\"]")).click();
		Thread.sleep(2000);
		//alt.accept();
		//Thread.sleep(2000);
		System.out.println(alt.getText());
		alt.dismiss();
		
		//prompt box
		driver.findElement(By.xpath("//a[.=\"Prompt\"]")).click();
		driver.findElement(By.xpath("//button[.=\"Prompt Alert Box\"]")).click();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		alt.sendKeys("yes");
		alt.accept();

	}

}
