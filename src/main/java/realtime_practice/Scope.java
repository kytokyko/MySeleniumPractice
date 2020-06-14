package realtime_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> all_tags = driver.findElements(By.tagName("a"));
		int size = all_tags.size();
		System.out.println("the count of the entire page : " + size);
		
		WebElement footer_driver = driver.findElement(By.id("gf-BIG"));
		List<WebElement> link_footer = footer_driver.findElements(By.tagName("a"));
		int size2 = link_footer.size();
		System.out.println("the footer link are : " + size2);
		
		WebElement table = footer_driver.findElement(By.xpath("//table[@class='gf-t']"));
		WebElement column = footer_driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int size3 = column.findElements(By.tagName("a")).size();
		
		
		for(int i=1;i<size3;i++)
		{
			String click_on_link_tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(click_on_link_tab);
		}
		
		Set<String> windowHandles = driver.getWindowHandles();
	
		Iterator<String> windows = windowHandles.iterator();
		
		while(windows.hasNext())
		{
			driver.switchTo().window(windows.next());
			System.out.println(driver.getTitle());
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
