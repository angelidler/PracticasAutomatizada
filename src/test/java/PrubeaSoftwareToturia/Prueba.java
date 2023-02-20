package PrubeaSoftwareToturia;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Dimension ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Prueba {
private WebDriver driver;

public static void main(String[] args) {
	
	 
}
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		
		ChromeOptions opciones=new ChromeOptions();
		//opciones.addArguments("window-position=100,800");//chromeoptionse usa para dar posicion a la ventanad del navegador
		//opciones.addArguments("window-size=300,500");  // se usa para dar tamaño a el navegador
		//opciones.addArguments("headless"); // se usa para ejecutar pruebas sin necesidad e ejecutar el navegador
		driver=new ChromeDriver(opciones);
		
		//driver.manage().window().maximize();
		
		//driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
		
		/*Dimension tamano=new Dimension( 100, 100); 
		
		driver.manage().window().setSize(tamano);
		
		driver.manage().window().fullscreen();
		
		String titulo= driver.getTitle();
		System.out.println(titulo);*/
		
		//driver.close();
		
		WebElement elemento= driver.findElement(By.id("Artículo_destacado")); //WebElemen es un rastreador de elementos de paginas web
		
		String titulo = elemento.getText();
		
		//System.out.print(titulo);
		
		//List <WebElement> elementos= driver.findElements(By.className("main-box-section")); // se usa para optener el nombre de clase de cada parrafo o columnas de wedsite
		//List <WebElement> elementos= driver.findElements(By.tagName("a")); //se usa para busacar por etiquetas 
		//List <WebElement> elementos= driver.findElements(By.name("search")); se usa para capturas los nombre que se asigna a los elemntos
		
		List <WebElement> elementos= driver.findElements(By.xpath("//*[@id=\"main-tfa\"]/p[1]"));
		for(WebElement elemente : elementos ) {
			

			//System.out.println(elemente.getAttribute("id")); // muestra el nombre id del elemento
			System.out.println(elemente.getCssValue("font-family")); // Muestra los elementos css usados en la estructura de la pagina

		}
	}
	
	@Test
	public void testGooglePage() {
		
		
	}
}
