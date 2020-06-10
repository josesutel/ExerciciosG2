package ApsG2;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SeleniumTest {
	  
    static WebDriver driver = null;
    
    private static String namePaginaPrincipal ;
  public SeleniumTest() {
  }
  
  @BeforeClass
  public static void setUp() {
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	        
      
       driver = new ChromeDriver();
                      
      driver.get("C:\\Users\\josee\\eclipse-workspace\\senai_2020_qts\\src\\test\\java\\APS_G2\\ Modelo.html");
  
      namePaginaPrincipal = driver.getWindowHandle();
  }
  
  
  
  @Test
  public void testTituloPagina(){
    driver.get("C:\\Users\\josee\\eclipse-workspace\\senai_2020_qts\\src\\test\\java\\APS_G2\\Modelo.html");
    String tituloExperado ="Exercicio Aps"; 
      
    Assert.assertEquals(tituloExperado,driver.getTitle());
  }
  
   @Test
  public void testValidaNomeBranco() {
      driver.get("C:\\Users\\josee\\eclipse-workspace\\senai_2020_qts\\src\\test\\java\\APS_G2\\Modelo.html");
      
      WebElement campoNome = driver.findElement(By.id("nome"));
      WebElement campoEndereco = driver.findElement(By.id("endereco"));
      WebElement campoSexo = driver.findElement(By.id("sexo"));
      WebElement campoIdade = driver.findElement(By.id("idade"));
      WebElement submit = driver.findElement(By.id("botao_somar"));
       campoNome.sendKeys(" ");
       campoEndereco.sendKeys("AV.Assis Brasil");
       campoSexo.sendKeys("m");
       campoIdade.sendKeys("20");
       submit.click();
       Alert alert = driver.switchTo().alert();
       Assert.assertTrue(alert.getText().equals("Preencha o campo nome"));
  }
  
   @Test
   public void testValidaEnderecoBranco() {
       driver.get("C:\\Users\\josee\\eclipse-workspace\\senai_2020_qts\\src\\test\\java\\APS_G2\\Modelo.html");
       
       WebElement campoNome = driver.findElement(By.id("nome"));
       WebElement campoEndereco = driver.findElement(By.id("endereco"));
       WebElement campoSexo = driver.findElement(By.id("sexo"));
       WebElement campoIdade = driver.findElement(By.id("idade"));
       WebElement submit = driver.findElement(By.id("botao_somar"));
        campoNome.sendKeys(" Pedro");
        campoEndereco.sendKeys("");
        campoSexo.sendKeys("m");
        campoIdade.sendKeys("20");
        submit.click();
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().equals("Preencha o campo endereco"));
   }
//  
//  @AfterClass
//  public static void tearDown() {
//  	
//      driver.quit();
//  }

}
