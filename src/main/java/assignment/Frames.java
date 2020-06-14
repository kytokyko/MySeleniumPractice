package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement nested_frames_link = driver.findElement(By.linkText("Nested Frames"));
		nested_frames_link.click();
		
		List<WebElement> total_frames = driver.findElements(By.tagName("frameset"));
		System.out.println("the total frames are : " + total_frames.size());
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);


		
		
		WebElement text_element = driver.findElement(By.xpath("//div[@id='content']"));
		System.out.println(text_element.getText());

	}

}
