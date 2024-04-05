package KeyBoard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KB {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/keyboard?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ele = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		ele.click();
		
		
		

	}

}
