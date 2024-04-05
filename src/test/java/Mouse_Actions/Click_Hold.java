package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Hold {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/clickHold?scenario=1&sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ele = driver.findElement(By.xpath("//div[@id=\"circle\"]"));
		Actions act = new Actions(driver);
		act.clickAndHold(ele).perform();

	}

}
