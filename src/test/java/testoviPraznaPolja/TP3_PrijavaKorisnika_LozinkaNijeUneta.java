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
public class TP3_PrijavaKorisnika_LozinkaNijeUneta {
    
    public TP3_PrijavaKorisnika_LozinkaNijeUneta() {
    }

    public static String baseURL="http://localhost/projekat5/IP_projekat/";
    public static WebDriver driver;
    
    @Test
    public void test3(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        try{
            driver = new ChromeDriver();//driver = new FirefoxDriver();
            driver.get(baseURL);
            driver.manage().window().maximize();
            
            driver.findElement(By.linkText("Prijavi se")).click();
            
            String korisnickoIme="ana";
            String lozinka="";
            
            driver.findElement(By.name("k_ime")).sendKeys(korisnickoIme);
            driver.findElement(By.name("lozinka")).sendKeys(lozinka);
            
            
          
            driver.findElement(By.name("dugme_log")).click();
            
            String message = driver.findElement(By.name("lozinka")).getAttribute("validationMessage");
            System.out.println(message);
            String poruka="Please fill out this field.";
       
            
            Assert.assertTrue(message.contains(poruka));
        
            
        }catch(Exception e){
            //System.out.println(e.getMessage());
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
