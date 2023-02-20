package PrubeaSoftwareToturia;

import javax.swing.JOptionPane;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prueba_Mause {

	
	WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		
	}
	/*@Test
	public void testDemo()  {
		
		WebElement botoRegistro=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		try {
			Thread.sleep(5);
		} catch (Exception e) {
			// TODO: handle exception
		}
		botoRegistro.click();
		
		/*Alert alerta= driver.switchTo().alert(); //Optener informacion de la alerta
		
		System.out.println(alerta.getText());
	}*/
	/*@Test
	public void testDemo2()  {
		
		WebElement imagen=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/table/tbody/tr/td[2]/a[2]"));
		try {
			Thread.sleep(8);
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		Actions accion=new Actions(driver);
		
		accion.moveToElement(imagen).build().perform();
		
		imagen.click();
	}*/
	@Test 
public void testDemo2()  {
		
		WebElement tecla=driver.findElement(By.tagName("body"));
		 tecla.sendKeys(Keys.CONTROL);// Optiene la tecla precionada dentro de la pagina web
		
			//	 JOptionPane.showMessageDialog(null, "preciono enter");
		 
	}
}
