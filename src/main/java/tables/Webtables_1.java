package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables_1 {
	static WebDriver driver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println("the title is : " + driver.getTitle());
		System.out.println("the current url is : " + driver.getCurrentUrl());
		
		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int total_rows = rows.size();
		System.out.println("the total rows is : " + total_rows);
		List<WebElement> columns = table.findElements(By.tagName("th"));
		int total_columns = columns.size();
		System.out.println("total columns is : " + total_columns );
		
		List<WebElement> sql = driver.findElements(By.xpath("//table[@id='product']//tr[3]/td"));
		int course = sql.size();
		
		for(int i=0;i<course;i++) {
			System.out.println(sql.get(i).getText());
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
