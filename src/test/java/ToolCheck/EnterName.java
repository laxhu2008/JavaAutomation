package ToolCheck;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class EnterName {
     WebDriver driver;
    @Before
    public void openWebdriver1() throws IOException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
     @Test
     public void nameEnter() throws IOException{
     WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
     firstName .sendKeys("firstName");
     driver.findElement(By.id("lastname")).sendKeys("lastName");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElement(By.id("sex-1")).click();
         driver.findElement(By.xpath("//input[@name='exp']")).click();
    }




        //
    }





        //year of  exp should be 5 only



