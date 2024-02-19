/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package edgeTestovi;

import static edgeTestovi.TP45Edge.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
public class TP46Edge {
    
    public TP46Edge() {
    }

    public static String baseURL="http://localhost/projekat5/IP_projekat/";
    public static WebDriver driver;
    
    @Test
    public void test46edge(){
        System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
        try{
            driver = new EdgeDriver();
            driver.get(baseURL);
            driver.manage().window().maximize();
            
            driver.findElement(By.linkText("Postani korisnik")).click();
           
            
            driver.findElement(By.xpath("//input[@value='kompanija']")).click();
            driver.findElement(By.name("dugme_reg")).click();
            
            String korisnickoIme="nordeus8edge";
            String lozinka="Sifraa123$";
            String naziv="Nordues";
            String grad="Novi Beograd";
            String adresa="Bulevar Milutina Milankovica bb";
            String direktor="Branko Milutinovic";
            String PIB="106525607";
            String brojZaposlenih="200";
            String ePosta="nordeus5@norde.us";
            String sajt="www.nordeus5.com";
            String delatnost="IT";
            String uzaSpec="Games";
            String slika="C:\\wamp64\\www\\projekat5\\IP_projekat\\logoi\\nordeus.png";
            
            driver.findElement(By.name("k_ime")).sendKeys(korisnickoIme);
            driver.findElement(By.name("lozinka")).sendKeys(lozinka);
            driver.findElement(By.name("lozinka_potvrdi")).sendKeys(lozinka);
            driver.findElement(By.name("naziv")).sendKeys(naziv);
            driver.findElement(By.name("grad")).sendKeys(grad);
            driver.findElement(By.name("adresa")).sendKeys(adresa);
            driver.findElement(By.name("direktor")).sendKeys(direktor);
            driver.findElement(By.name("pib")).sendKeys(PIB);
            driver.findElement(By.name("brzaposlenih")).sendKeys(brojZaposlenih);
            driver.findElement(By.name("eposta")).sendKeys(ePosta);
            driver.findElement(By.name("vebsajt")).sendKeys(sajt);
            driver.findElement(By.name("delatnost")).sendKeys(delatnost);
            
            driver.findElement(By.name("specijalnost")).sendKeys(uzaSpec);
            //driver.findElement(By.name("logo")).click();
            driver.findElement(By.name("logo")).sendKeys(slika);

            driver.findElement(By.name("dugme_reg")).click();
            
            String poruka="Uspesna registracija!";
           
            Assert.assertFalse(driver.getPageSource().contains(poruka));
            
            
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
