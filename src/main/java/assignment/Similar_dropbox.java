package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Similar_dropbox {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
		checkbox.click();
		WebElement checkbox_text = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]"));
		String text = checkbox_text.getText();
		System.out.println(text);
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropdown);
		s.selectByVisibleText(text);
		
		WebElement name_enter = driver.findElement(By.id("name"));
		name_enter.sendKeys(text);
		
		WebElement alert = driver.findElement(By.id("alertbtn"));
		alert.click();
		
		String alert_text = driver.switchTo().alert().getText();
		System.out.println(alert_text);
		
		if(alert_text.contains(text))
		{
			System.out.println(text + " is present");
		}else
		{
			System.out.println("no text present");
		}
		
	}

}
