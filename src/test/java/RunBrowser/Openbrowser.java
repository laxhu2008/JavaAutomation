package RunBrowser;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Openbrowser {


    /*@Test
    public void openChromeBrowser() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // open browser
        driver.get("http://www.gmail.com");

        // maximize brower



        // wait for r sec
       // Thread.sleep(5000);

        driver.findElement(By.name("identifier")).sendKeys("laxhu2008@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        //driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();

        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("kathmandu");
     // driver.findElement(By.name("password")).sendKeys("204434kathmandu");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();
        }*/
        @Test
    public void validUserPassword() throws IOException {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            // open browser
            driver.get("http://www.gmail.com");

            WebElement emailElement = driver.findElement(By.name("identifier"));
            emailElement.sendKeys("qatesting00567@gmail.com");

            WebElement nextButtonElement = driver.findElement(By.id("identifierNext"));
            nextButtonElement.click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            WebElement txtPwd = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
            txtPwd.sendKeys("Test@123");

            WebElement btnNext = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span"));
            btnNext.click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.quit();
        }


            @Test

            public void invalidUserPassword () throws IOException {
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                // open browser
                driver.get("http://www.gmail.com");

                WebElement emailElement1 = driver.findElement(By.name("identifier"));
                emailElement1.sendKeys("qatesting00567@gmail.com");

                WebElement nextButtonElement1 = driver.findElement(By.id("identifierNext"));
                nextButtonElement1.click();

                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                WebElement txtPwd1 = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
                txtPwd1.sendKeys("Test123");

                WebElement btnNext1 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span"));
                btnNext1.click();

                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               WebElement txt = driver.findElement(By.xpath("//*[text()='Wrong password. Try again or click Forgot password to reset it.']"));
               // System.out.println(txt);

                String expectedTiltle ="Wrong password. Try again or click Forgot password to reset it.";

               Assert.assertEquals(expectedTiltle,txt.getText());





                }

            }























