package Project;







import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Zonaprop_AutomatedTest {

	private WebDriver driver;
	
	
	By AlquilarBtnLocator = By.cssSelector("li button[data-tracking='Alquilar']");
	By MenuLocator = By.cssSelector("div input[placeholder='Buscá por ubicación o palabra clave']");
	By ButtonLocator = By.cssSelector("div button[type='submit']");
						
	
		
	@Before
		public void setUp() throws Exception {
					System.setProperty("webdriver.chrome.driver", "./src/test/resources/chrome/chromedriver.exe");	
					// Caso 1 setear un usuario para que este no entre como "guest" en el paratametro \\user_name\\ iria la carpeta de usuario remota mia 
					//String userProfile= "C:\\Users\\user_name\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\";
					//ChromeOptions options = new ChromeOptions();
					//options.addArguments("user-data-dir="+userProfile);
					//options.addArguments("--start-maximized");
					//WebDriver driver = new ChromeDriver(options);
					//driver.get("http://www.google.com");
					driver = new ChromeDriver();		
					driver.manage().window().maximize();
					driver.get("http://www.zonaprop.com");
					//Caso 2  se intenta setear cookies faltantes 
					//Cookie ck = new Cookie("sessionId", "24084cb5-fd35-4f5d-9dd2-45c302dd8dc9");
					//driver.manage().addCookie(ck);
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					
			
	}
		
	
	@Test
		public void busquedaDepartamento() throws InterruptedException {
		 	driver.findElement(AlquilarBtnLocator).click();
		 		Thread.sleep(3000);
		 	driver.findElement(MenuLocator).sendKeys("Tigre");
		 		Thread.sleep(3000);
			driver.findElement(ButtonLocator).click();
				Thread.sleep(3000);
	}
}
	
	
	
	
	