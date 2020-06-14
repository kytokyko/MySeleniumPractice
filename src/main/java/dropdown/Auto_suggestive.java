package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_suggestive {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//driver=new ChromeDriver();
		driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println("the title is : " + driver.getTitle());
		System.out.println("the current url is : " + driver.getCurrentUrl());
		
		WebElement auto_complete = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		auto_complete.sendKeys("ind");
		List<WebElement> all_list = driver.findElements(By.cssSelector("By.cssSelector(\"li.ui-menu-item\")"));
		
		int count = all_list.size();
		
		for(int i=0;i<count;i++)
		{
			String text = all_list.get(i).getText();
			if(text.equalsIgnoreCase("india"))
			{
				all_list.get(i).click();
			}
		}
		
		

	}

}
