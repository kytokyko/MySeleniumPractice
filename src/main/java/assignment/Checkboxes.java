package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Checkboxes extends Base_browser{
	
	@Test
	public void checkbox() throws InterruptedException
	{
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count_of_checkboxes = checkboxes.size();
		System.out.println("the total checkboxes are : " + count_of_checkboxes);
		
		for(int i=0;i<2;i++)
		{
			Thread.sleep(2000);
			checkboxes.get(0).click();
			boolean selected = checkboxes.get(0).isSelected();
			System.out.println("the checkbox selected is : " + selected);
		}
		
	}

}
