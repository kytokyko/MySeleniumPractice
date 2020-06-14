package General_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			//driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			System.out.println("the title is : " + driver.getTitle());
			System.out.println("the current url is : " + driver.getCurrentUrl());

		}
	
	
	/*
	 * @AfterTest public void close() { driver.close(); driver.quit(); }
	 */

}
