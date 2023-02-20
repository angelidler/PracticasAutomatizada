package PruebaTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PruebaPractica {
	
	WebDriver driver;
	@Test 
	public void prueba() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		String titulo = driver.getTitle();
		
		Assert.assertEquals(titulo, "Welcome: Mercury Tour");
	}
	
}
