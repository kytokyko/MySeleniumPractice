package General_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Regular_exp extends BaseClass{
	
	@Test
	public void method()
	{
		WebElement search_box = driver.findElement(By.xpath("//div[@class='SDkEP']/div/input"));
		search_box.sendKeys("hello world");
		/*
		 * WebElement sign_in_button=
		 * driver.findElement(By.cssSelector("a[title*='Sign in']"));
		 * sign_in_button.click(); WebElement username =
		 * driver.findElement(By.cssSelector("input#login1")); username.sendKeys("abc");
		 * 
		 * WebElement password = driver.findElement(By.cssSelector("input#password"));
		 * password.sendKeys("xyz");
		 */
	}

}
