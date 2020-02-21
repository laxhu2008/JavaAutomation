package RunBrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class OpenFirefox {
    @Test
    public void openFirefoxBrowser() throws InterruptedException {
        System.setProperty("webdriver.geckodrive.driver", "geckodrive.exe");// setting system properties of firefox
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.gmail.com");
       // System.out.println(driver.getTitle());
        driver.manage().window().maximize();

       driver.findElement(By.name("identifier")).sendKeys("Laxhu2008@gmail.com");

        driver.findElement(By.id("identifierNext")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.name("password")).sendKeys("kdfkjadskfjal");





    }
}
