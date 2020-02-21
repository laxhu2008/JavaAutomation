package RunBrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

        @Test
        public void openFirefoxBrowser() throws InterruptedException {
            System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");// setting system properties of firefox
            WebDriver driver = new InternetExplorerDriver();
            driver.get("http://www.gmail.com");
            System.out.println(driver.getTitle());
            driver.manage().window().maximize();
            driver.findElement(By.name("identifier")).sendKeys("Laxhu2008@gmail.com");
            driver.findElement(By.name("identifierNext")).click();


        }
}


