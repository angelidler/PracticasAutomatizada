package PrubeaSoftwareToturia;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Formularios {
	WebDriver driver;
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://demo.guru99.com/test/newtours/");
		//driver.get("https://es-la.facebook.com/"); // solo para la prueba 5
		
		
	}
	
	/*@Test
	public void Prueba1() {
		
		WebElement boton=driver.findElement(By.name("login"));
		
		boton.click();
		
	}*/
	
	/*@Test
	public void InsertarTexto() { // Insertar texto en pagina automatizado
		
		WebElement boton=driver.findElement(By.name("login"));
		
		WebElement Usuario= driver.findElement(By.id("email"));
		WebElement Clave= driver.findElement(By.id("pass"));
		
		
		Usuario.sendKeys("angelgabriel_65@hotmail.com");
		
		Clave.sendKeys("MariaTm0");
		
		
		
		boton.click();
		
	}*/
	/*@Test
	public void RedioButton() {
		
		WebElement rYes=driver.findElement(By.id("yes"));
		WebElement rNo=driver.findElement(By.id("no"));
		
		rNo.click();
	}*/

	
	
	
	/*@Test
	public void ComboBoxSelect() { // select item
		
		
		Select item=new Select(driver.findElement(By.name("country")));
		
		item.selectByVisibleText("ARGENTINA");
	}*/
	
	
	
	
	/*@Test
	public void ChekButton() {
		WebElement Chekb= driver.findElement(By.id("vfb-6-0"));
		
		if( !Chekb.isSelected()) {
			
			Chekb.sendKeys(Keys.SPACE);
		}
		
		
	}*/
	@Test
	public void EnviodeDatos() {
		WebElement registro=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		
		registro.click();
		
		WebElement usuario=driver.findElement(By.id("email"));
		usuario.sendKeys("genesis");
		
		WebElement pass1=driver.findElement(By.name("password"));
		pass1.sendKeys("caro");
		
		WebElement pass2=driver.findElement(By.name("confirmPassword"));
		pass2.sendKeys("caro");
		
		WebElement envio= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
		
		envio.click();
		
		try {
			Thread.sleep(5);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
		
	}
}
