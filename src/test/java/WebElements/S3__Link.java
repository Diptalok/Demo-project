package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3__Link {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/?scenario=1.");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//1. script to click on link text
		driver.findElement(By.xpath("//section[.=\"Link\"]")).click();
		
		//2. script to open a link in new tab
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.=\"Link in New Tab\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.=\"Contact Us\"]")).click();*/
		
		//3. script to get all the linktexts
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		for (WebElement link : alllink) 
		{
			System.out.println(link.getText());
		}
		
		//4. script to get all the links and count of total no of links
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int i =0;
		for (WebElement link : alllinks) 
		{
			System.out.println(link.getAttribute("href"));
			i++;
		}
		System.out.println("total number of links are = "+i);
		
		//click on all the links
		//get title

	}

}
