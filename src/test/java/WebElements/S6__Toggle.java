package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S6__Toggle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/?scenario=1.");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//section[.=\"Toggle\"]")).click();
		
		WebElement ele = driver.findElement(By.xpath("(//span[@class=\"relative bg-gray-300"
				+ " rounded-full w-9 h-4 transition duration-300 ease-in-out\"])[1]"));
		
		ele.click();
		Thread.sleep(1000);
	    ele.click();
	    
	    List<WebElement> eles = driver.findElements(By.xpath("(//span[@class=\"relative bg-gray-300"
				+ " rounded-full w-9 h-4 transition duration-300 ease-in-out\"])"));
	    
	    for (WebElement el : eles) 
	    {
	    	Thread.sleep(1000);
	    	el.click();		
		}
	    
	    driver.findElement(By.xpath("//button[.=\"Place Order\"]")).click();

	}

}
