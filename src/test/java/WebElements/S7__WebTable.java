package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S7__WebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/?scenario=1.");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//section[.=\"Web Table\"]")).click();
		
		WebElement table = driver.findElement(By.xpath("//table"));
		List<WebElement> row = table.findElements(By.xpath("//table//tr"));
		int row_no=0;
		for (WebElement rw : row) {
			row_no++;
		}
		System.out.println("total no of row = "+row_no);
        List<WebElement> heading = driver.findElements(By.xpath("//table//tr/th"));
        int heading_no=0;
		for (WebElement hd : heading) {
			System.out.println(hd.getText());
			heading_no++;
		}
		System.out.println("total no of heading = "+heading_no);
	    List<WebElement> coloumns = driver.findElements(By.xpath("//table//tr/td"));
	    int cl=0;
	    for (WebElement col : coloumns) {
			System.out.println(col.getText());
			cl++;
		}
	    System.out.println("total no of coloumns = "+cl);
				
		
	}

}
