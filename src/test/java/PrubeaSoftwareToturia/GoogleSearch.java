package PrubeaSoftwareToturia;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleSearch {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		
		/*System.setProperty("webdriver.edge.driver", "./src/test/resources/EdgeDriver/msedgedriver.exe");
		driver = new EdgeDriver();*/
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		
	}

	
	@Test
	public void testGooglePage() {
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("quality-stream Introduccíon a la Automatización de Pruebas de Software");
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		assertEquals("quality-stream Introduccíon a la Automatización de Pruebas de Software", driver.getTitle());
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}