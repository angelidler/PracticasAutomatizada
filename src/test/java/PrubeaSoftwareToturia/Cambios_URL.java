package PrubeaSoftwareToturia;





import java.util.ArrayList;

import javax.swing.JOptionPane;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cambios_URL {

	WebDriver driver;
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		//driver.get("https://edutin.com/"); // solo para la prueba 5
		
		
	}
	
	/*@Test
	public void PruebaURL() { // con esta prueba podemos comparar que la pagina web nos esta dirigiendo a las url correcta
		
		WebElement Registro= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	
		String rutaAntigua=driver.getCurrentUrl();
		
		Registro.click();
		
		String RutaNueva=driver.getCurrentUrl();
		
		if(RutaNueva.equals(rutaAntigua)) {
			
			JOptionPane.showMessageDialog(null, "Error de ruta");
		}else {
			JOptionPane.showMessageDialog(null, "Resultado esperado: " + RutaNueva);
		}
	}*/
	
	/*@Test
	public void PruebaURL2() { //con esta prueba vemos los cambios de titulos en una misma pagina web
		
		WebElement Registro= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	    System.out.println(driver.getTitle());
	
		Registro.click();
		
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}*/
	/*@Test
	public void PruebaURL3() { //Prueba de navegate en selenium" dejas las URL a visitar"
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		try {
			Thread.sleep(5);
			JOptionPane.showMessageDialog(null, driver.getCurrentUrl());
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "algo salio mal");
		}
		driver.navigate().to("https://demo.guru99.com/test/newtours/support.php");
		try {
			Thread.sleep(5);
			JOptionPane.showMessageDialog(null, driver.getCurrentUrl());
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "algo salio mal");
		}
		driver.navigate().back();
		
		driver.navigate().refresh();
		try {
			Thread.sleep(5);
			JOptionPane.showMessageDialog(null, driver.getCurrentUrl());
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "algo salio mal");
		}
		
		driver.close();
	}*/
	@Test
	public void PruebaURL4() { //como dirigirte a la nueva pestaña abierta
		
		String NuevaVentana= Keys.chord(Keys.CONTROL, Keys.RETURN);
		
		WebElement registro=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		
		registro.sendKeys(NuevaVentana);
		
		ArrayList tabs=new 	ArrayList(driver.getWindowHandles());// se almacenan la cantidad de pestañas abierta
		
		System.out.println(tabs.size());
		
		driver.switchTo().window(tabs.get(1).toString());// se usa para dirigirse a la pestaña selecionada
		
		System.out.println(driver.getCurrentUrl());
	}
	/*@Test
	public void PruebaURL5() { // dar foco a las ventanas emergentes
		// 
		
		WebElement Acceder=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/a"));
		
		Acceder.click();
		try {
			Thread.sleep(5);
			
		}catch (Exception e) {
			
		}
		ArrayList tabs=new 	ArrayList(driver.getWindowHandles());
		if(driver.getCurrentUrl().equals("https://app.edutin.com/user/login")) {
			
			WebElement inicio=driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-auth/div/div[2]/div/app-login/div/div/div/div[2]/a[2]"));

			
			inicio.click();
			driver.switchTo().window(tabs.get(1).toString());
		}
		
		
		
	}*/
	
	/*@Test
	public void PruebaURL6() {// ejecucion con javascript
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//js.executeScript("alert ('hola mundo')");
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}*/
} 
