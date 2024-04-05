package WebElements;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S4__DropDown {

	public static void main(String[] args)throws Exception {
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/?scenario=1.");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.findElement(By.xpath("//section[.=\"Dropdown\"]")).click();
			
			//1
			Thread.sleep(2000);
			WebElement drop1 = driver.findElement(By.xpath("(//Select)[1]"));
			drop1.click();
			drop1.sendKeys(Keys.DOWN);
			
			//2
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//Select)[2]")).click();
			
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			
			//3
			Thread.sleep(2000);
			WebElement drop2 = driver.findElement(By.xpath("//Select[@id=\"select3\"]"));
			drop2.click();
			Select se1 = new Select(drop2);
			se1.selectByVisibleText("India");
			
			//4
			Thread.sleep(2000);
			WebElement drop3 = driver.findElement(By.xpath("(//Select)[4]"));
			drop3.click();
			Select se2 = new Select(drop3);
			se2.selectByValue("Odisha");
			
			//5
			Thread.sleep(2000);
			WebElement drop4 = driver.findElement(By.xpath("(//Select)[5]"));
			drop3.click();
			Select se3 = new Select(drop4);
			se3.selectByIndex(8);
			
			//6
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("8249356074");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

}
