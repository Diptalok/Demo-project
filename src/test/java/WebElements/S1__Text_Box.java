package WebElements;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class S1__Text_Box {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/?scenario=1.");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//1. script with placeholder
		/*driver.findElement(By.xpath("//input[contains(@placeholder,\"Enter your n\")]"))
		.sendKeys("Diptalok Sahoo");
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Enter your e\")]"))
		.sendKeys("diptaloksahoo110@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Enter your p\")]"))
		.sendKeys("Mikumiku@1234");*/
		
		//2. script with no placeholder
		/*driver.findElement(By.xpath("//input[contains(@name,\"n\")]")).sendKeys("Diptalok Sahoo");
		driver.findElement(By.xpath("//input[contains(@name,\"em\")]")).sendKeys("diptaloksahoo110@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,\"p\")]")).sendKeys("Mikumiku@1234");*/
		
		//3. script with tool tip
		/*driver.findElement(By.xpath("//li[contains(text(),\"With ToolTip\")]")).click();
		driver.findElement(By.xpath("(//input[contains(@title,\"Enter your n\")])")).sendKeys("Diptalok Sahoo");
		driver.findElement(By.xpath("(//input[contains(@title,\"Enter your E\")])")).sendKeys("diptaloksahoo110@gmail.com");
		driver.findElement(By.xpath("//input[contains(@title,\"Enter P\")]")).sendKeys("Mikumiku@1234");*/
		
		//4. script with tool tip
		/*driver.findElement(By.xpath("//li[contains(text(),\"Multiline Text Area\")]")).click();
		driver.findElement(By.xpath("//textarea[contains(@name,\"n\")]"))
		.sendKeys("Diptalok Sahoo Diptalok SahooDiptalok SahooDiptalok SahooDiptalok SahooDiptalok SahooDiptalok Sahoo");
		driver.findElement(By.xpath("//textarea[contains(@type,\"em\")]"))
		.sendKeys(" diptaloksahoo110@gmail.com diptaloksahoo110@gmail.com diptaloksahoo110@gmail.com diptaloksahoo110@gmail.com "
				+ "diptaloksahoo110@gmail.com");
		driver.findElement(By.xpath("//textarea[contains(@type,\"p\")]")).sendKeys("Mikumiku@1234 Mikumiku@1234 Mikumiku@1234"
				+ " Mikumiku@1234 Mikumiku@1234 Mikumiku@1234");*/
		
		//5. script with same attribute value
		/*driver.findElement(By.xpath("(//input[contains(@type,\"\")])[1]"))
		.sendKeys("Diptalok Sahoo");
		driver.findElement(By.xpath("(//input[contains(@type,\"\")])[2]"))
		.sendKeys("diptaloksahoo110@gmail.com");
		driver.findElement(By.xpath("(//input[contains(@type,\"\")])[3]"))
		.sendKeys("Mikumiku@1234");*/
		
		//6. script to validate placeholder value
		//driver.findElement(By.xpath("(//li[contains(.,\"Without placeholder\")])")).click();
		/*List<WebElement> ele = driver.findElements(By.xpath("(//input[contains(@placeholder,\"\")])"));
		Thread.sleep(5000);
		for (WebElement e : ele) {
			
			System.out.println(e.getAttribute("placeholder"));
			String str = e.getAttribute("placeholder");
			if(str.contains("Search...")) {
				System.out.println("placeholder attribute is present");
			}*/
		
		//7. script to enter data inside disabled textbox
		/*driver.findElement(By.xpath("//li[.=\"Disabled\"]")).click();
		driver.findElement(By.xpath("(//input[@name=\"name\"])"))
		.sendKeys("Diptalok Sahoo");
		driver.findElement(By.xpath("(//input[@name=\"email\"])"))
		.sendKeys("diptaloksahoo110@gmail.com");
		driver.findElement(By.xpath("(//input[@name=\"password\"])"))
		.sendKeys("Mikumiku@1234");*/
		
		//8. script for hide password and show password button
		driver.findElement(By.xpath("(//*[name()=\"svg\" and @fill= \"currentColor\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()=\"svg\" and @fill= \"currentColor\"])[1]")).click();
			
				
	}

}
