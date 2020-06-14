package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class cleartrip {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		WebElement date_picker = driver.findElement(By.id("DepartDate"));
		date_picker.click();
		
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//td[@data-month='4']//a[text()='21']"));
		date.click();
		
		/*
		 * String date_validate = date_picker.getText();
		 * System.out.println(date_validate);
		 * Assert.assertEquals(date_validate,date_validate);
		 */
		
		WebElement adults = driver.findElement(By.xpath("//select[@id='Adults']"));
		Select s1=new Select(adults);
		s1.selectByValue("6");
		
		WebElement childrens = driver.findElement(By.cssSelector("#Childrens"));
		Select s2=new Select(childrens);
		s2.selectByIndex(3);
		
		WebElement infants = driver.findElement(By.id("Infants"));
		Select s3=new Select(infants);
		s3.selectByVisibleText("1");
		
		WebElement link = driver.findElement(By.cssSelector("#MoreOptionsLink"));
		link.click();
		
		WebElement class_select = driver.findElement(By.xpath("//select[@id='Class']"));
		Select s4=new Select(class_select);
		s4.selectByVisibleText("Premium Economy");
		
		WebElement text_enter = driver.findElement(By.cssSelector("#AirlineAutocomplete"));
		text_enter.sendKeys("abcde");
		
		WebElement seacrh_flights = driver.findElement(By.id("SearchBtn"));
		seacrh_flights.click();
		
		WebElement error_message = driver.findElement(By.cssSelector("#homeErrorMessage"));
		String error = error_message.getText();
		System.out.println(error);
	}

}
