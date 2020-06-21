package E2.com.E2G2_qts;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class UsuarioSeleniumtest {
	
	 static WebDriver driver = null;
	 private static String namePaginaPrincipal;
     
     public void SeleniumTest() {
   }
     
     
     
     @BeforeClass
     public static void setUp() {
          System.setProperty("webdriver.chrome.driver", 
 	                "C:\\chromedriver_win32\\chromedriver.exe");
 	        
         
          driver = new ChromeDriver();

         driver.get("C:\\Users\\josee\\eclipse-workspace1\\E2G2_qts\\src\\main\\LoginUsuario.jsp");
     
         String namePaginaPrincipal = driver.getWindowHandle();
     }
     
     
     @Test
     public void testTituloPaginaLogin(){
       driver.get("C:\\\\Users\\\\josee\\\\eclipse-workspace1\\\\E2G2_qts\\\\src\\main\\LoginUsuario.jsp");
       String tituloExperado ="Login Usuario"; 
         
       Assert.assertEquals(tituloExperado,driver.getTitle());
     }

}
