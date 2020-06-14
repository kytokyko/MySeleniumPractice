import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End_To_End_Automation {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Thread.sleep(1500);
		WebElement source_box = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		source_box.click();
		
		Thread.sleep(1500);

		WebElement source = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']"));
		source.click();
		
		Thread.sleep(1500);

		WebElement destination = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='HYD']"));
		destination.click();
		
		Thread.sleep(1500);

		WebElement pick_date = driver.findElement(By.xpath("(//a[text()='27'])[1]"));
		pick_date.click();
		
		Thread.sleep(1500);

		WebElement elable_disable = driver.findElement(By.xpath("//div[@id='Div1']"));
		String text_style = elable_disable.getAttribute("style");
		System.out.println(text_style);
		
		Thread.sleep(1500);

		if(elable_disable.getAttribute("style").contains("0.5"))
		{
			System.out.println("disabled");
			Assert.assertTrue(true);
		}else
		{
			System.out.println("enabled");
			Assert.assertTrue(false);
		}
		
		Thread.sleep(1500);

		WebElement passanger = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		passanger.click();
		
		Thread.sleep(1500);
		WebElement adult = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		
		Select s=new Select(adult);
		s.selectByValue("4");
		
		Thread.sleep(1500);
		WebElement child = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		
		Select s2=new Select(child);
		s2.selectByVisibleText("3");
		
		
		WebElement infant = driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		
		Thread.sleep(1500);
		Select s3=new Select(infant);
		s3.selectByIndex(2);
		
		WebElement passenger_validation = driver.findElement(By.id("divpaxinfo"));
		String passenger_text = passenger_validation.getText();
		System.out.println(passenger_text);
		Assert.assertEquals(passenger_text, passenger_text);
		
		
		Thread.sleep(1500);

		WebElement family_checkbox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		family_checkbox.click();
		
		Thread.sleep(1500);

		WebElement seach_button = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		seach_button.click();
		
		
		
	}

}
