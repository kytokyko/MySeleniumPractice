package browser_invocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserinvocation {

	public static void main(String[] args) {

		// browser invocation using chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// browser invocation using firefox
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		// browser invocation using IE
		//System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	    //WebDriver driver=new InternetExplorerDriver();
		
		
		driver.get("https://www.rahulshettyacademy.com/#/practice-project");
		//driver.navigate().to("https://www.rahulshettyacademy.com/#/practice-project");
		driver.manage().window().maximize();
		System.out.println("the title is : " + driver.getTitle());
		System.out.println("the current url is : " + driver.getCurrentUrl());

	}

}
