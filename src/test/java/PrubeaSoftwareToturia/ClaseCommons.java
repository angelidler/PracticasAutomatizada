package PrubeaSoftwareToturia;


import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClaseCommons {

	

		WebDriver driver;
		@Before
		public void setUp() {
			
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("https://demo.guru99.com/test/newtours/");
			driver.get("https://edutin.com/"); // solo para la prueba 5
			
			
		
	}
		
		@Test
		public void capturaPantalla() {
			
			File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			try {
				
			FileUtils.copyFile(src, new File("C:/Users/angel/OneDrive/Imágenes/prueba.png") );
			
			} catch (IOException e) {
				System.out.print("no se guardo");
			}
			
		}
}
