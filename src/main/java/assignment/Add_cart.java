package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_cart {

	public static WebDriver driver;
	static int j=0;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		String[] itemsNeeded= {"Brocolli","Cauliflower","Cucumber"};
		
		List<WebElement> all_vegetables = driver.findElements(By.cssSelector("h4.product-name"));
		
		List<WebElement> add_cart = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		
		List itemsToBeAdded=Arrays.asList(itemsNeeded);
		
		for(int i=0;i<all_vegetables.size();i++)
		{
			String[] vegees = all_vegetables.get(i).getText().split("-");
			String formatted_name=vegees[0].trim();
			
			if(itemsToBeAdded.contains(formatted_name))
			{
				//Thread.sleep(3000);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ADD TO CART']")));

				add_cart.get(i).click();
				if(j==3) {
					break;
				}
			}
			
		}
		
		WebElement cart_button = driver.findElement(By.xpath("//img[@alt='Cart']"));
		cart_button.click();
		
		WebElement checkout_button = driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"));
		checkout_button.click();
		
		WebElement promocode = driver.findElement(By.cssSelector("input.promocode"));
		promocode.sendKeys("rahulshettyacademy");
		
		WebElement promo_button = driver.findElement(By.cssSelector("button.promoBtn"));
		promo_button.click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		WebElement code_info = driver.findElement(By.cssSelector("span.promoInfo"));
		String code_text = code_info.getText();
		System.out.println(code_text);
	
	}

}
