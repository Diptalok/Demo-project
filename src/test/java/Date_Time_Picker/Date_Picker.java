package Date_Time_Picker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Picker {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/datePick/datedropdown?scenario=1&sublist=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[.=\"Simple Date Picker\"]")).click();
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).click();
		driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
		WebElement date = driver.findElement(By.xpath("//div[@class=\"react-datepicker__month\"]"
				+ "/descendant::div[.=\"24\"]"));
		date.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.=\"DropDown DatePicker\"]")).click();
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).click();
		driver.findElement(By.xpath("//span[@class=\"react-datepicker__month-read-view--down-arrow\"]")).click();
		driver.findElement(By.xpath("//div[.=\"Apr\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"react-datepicker__year-read-view--down-arrow\"]")).click();
		driver.findElement(By.xpath("//div[.=\"2025\"]")).click();
		driver.findElement(By.xpath("//div[.=\"7\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.=\"Icon Trigger\"]")).click();
		driver.findElement(By.xpath("(//*[name()=\"svg\"and @stroke=\"currentColor\"])[1]")).click();
		driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
		int da=19;
		WebElement date1 = driver.findElement(By.xpath("//div[@class=\"react-datepicker__month\"]"
				+ "/descendant::div[.=\""+da+"\"]"));
		date1.click();
		
		
		
		
		
		
		
	}

}
