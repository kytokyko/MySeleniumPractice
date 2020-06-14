package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement windows_link = driver.findElement(By.linkText("Multiple Windows"));
		windows_link.click();
		
		WebElement click_link = driver.findElement(By.linkText("Click Here"));
		click_link.click();
		
		WebElement current_text = driver.findElement(By.xpath("//div[@id='content']/div/h3"));
		String text_before_switching = current_text.getText();
		System.out.println("the current title is : " + driver.getTitle());
		System.out.println("the text before switching is : " + text_before_switching);
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>all_windows=new ArrayList<String>(windowHandles);
		String current_window = all_windows.get(0);
		String next_window = all_windows.get(1);
		
		System.out.println("switching to the next window.....");
		
		driver.switchTo().window(next_window);
		
		System.out.println("the current title is : " + driver.getTitle());
		
		WebElement new_window_text = driver.findElement(By.xpath("//div[@class='example']/h3"));
		String text_after_switching = new_window_text.getText();
		System.out.println("the text after switching is : " + text_after_switching);
		
		System.out.println("switching back to the home window.........");
		
		driver.switchTo().window(current_window);
		
		System.out.println("the current title is : " + driver.getTitle());
	}

}
