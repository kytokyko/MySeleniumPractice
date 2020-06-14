package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {
	static WebDriver driver;


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		System.out.println("the title is : " + driver.getTitle());
		System.out.println("the current url is : " + driver.getCurrentUrl());
		
		WebElement table_1 = driver.findElement(By.xpath("//table[@id='table1']"));
		List<WebElement> total_rows = table_1.findElements(By.tagName("tr"));
		int size_rows = total_rows.size();
		System.out.println("total rows is : " + size_rows);
		
		List<WebElement> list_of_lastNames = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
		int lastNames = list_of_lastNames.size();
		System.out.println("total last names is : " + lastNames);
		
		WebElement element = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[1]"));
		String text = element.getText();
		System.out.println(text);
		
		
		/*
		 * for(int i=0;i<lastNames;i++) {
		 * 
		 * System.out.println(list_of_lastNames.get(i).getText()); }
		 */

	}

}
