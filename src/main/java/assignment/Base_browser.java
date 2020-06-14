package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base_browser {
	WebDriver driver;
	
	@BeforeTest
	public void start_browser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println("the title is : " + driver.getTitle());
		System.out.println("the current url is : " + driver.getCurrentUrl());

	}

}
