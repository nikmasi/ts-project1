/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package testoviPraznaPolja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author TS
 */
public class TP85_RegAdmin_TelefonNijeUnet {
    
    public TP85_RegAdmin_TelefonNijeUnet() {
    }

    public static String baseURL="http://localhost/projekat5/IP_projekat/";
    public static WebDriver driver;
    
    @Test
    public void test85(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        try{
            driver = new ChromeDriver();//driver = new FirefoxDriver();
            driver.get(baseURL);
            driver.manage().window().maximize();
            
            driver.findElement(By.linkText("Postani korisnik")).click();
           
            
            driver.findElement(By.xpath("//input[@value='admin']")).click();
            driver.findElement(By.name("dugme_reg")).click();
            
            String korisnickoIme="anci5";
            String lozinka="Admin123.";
          
            String ime="Ana";
            String prezime="Maric";
            String telefon="";
            String ePosta="ana5@gmail.com";
            
            String slika="C:\\wamp64\\www\\projekat5\\IP_projekat\\slike\\slika4.jpg";
            
            driver.findElement(By.name("k_ime")).sendKeys(korisnickoIme);
            driver.findElement(By.name("lozinka")).sendKeys(lozinka);
            driver.findElement(By.name("lozinka_potvrdi")).sendKeys(lozinka);
            driver.findElement(By.name("ime")).sendKeys(ime);
            driver.findElement(By.name("prezime")).sendKeys(prezime);
            driver.findElement(By.name("telefon")).sendKeys(telefon);
            driver.findElement(By.name("eposta")).sendKeys(ePosta);
            driver.findElement(By.name("slika")).sendKeys(slika);
  
            

            driver.findElement(By.name("dugme_reg")).click();
            
            String message = driver.findElement(By.name("telefon")).getAttribute("validationMessage");
            System.out.println(message);
            String poruka="Please fill out this field.";
       
            
            Assert.assertTrue(message.contains(poruka));
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        if(driver!=null){
            driver.quit();
        }
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
