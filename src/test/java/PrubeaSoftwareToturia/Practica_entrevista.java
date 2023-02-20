package PrubeaSoftwareToturia;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class Practica_entrevista {

	private WebDriver driver;
	@Before
	public void Driver() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.edutin.com/");
		
	}
	@Test
	public void test() {
		
		WebElement Registro= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/a"));
		
		Registro.click();
		
		WebElement correo=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		correo.sendKeys("angel1990g@gmail.com");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(!correo.getText().equals("")) {
		js.executeScript("alert ('los datos han sido rellenados')");
		}
	WebElement botonRegistro=driver.findElement(By.id("signupSubmit"));
	try {
		Thread.sleep(4000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	botonRegistro.submit();
		
	}

	
}
