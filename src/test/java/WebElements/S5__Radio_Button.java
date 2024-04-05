package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5__Radio_Button {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/?scenario=1.");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//section[.=\"Radio Button\"]")).click();
		
		//1.
		/*WebElement ele = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
		ele.click();
		if(ele.isSelected()) 
		{
			System.out.println("radio button is selected");
		}
		
		WebElement ele1 = driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]"));
		if(ele1.isSelected()) 
		{
			System.out.println("radio button is selected");
		}
		else {
			System.out.println("radio button is not selected");
		}
		
		List<WebElement> rb = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		int i=0;
		for (WebElement radio : rb) {
			i++;
		}
		System.out.println("total radio button number is = "+i);*/
		
		driver.findElement(By.xpath("//a[.=\"Disabled\"]")).click();
		WebElement ele = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
		ele.click();

	}

}
