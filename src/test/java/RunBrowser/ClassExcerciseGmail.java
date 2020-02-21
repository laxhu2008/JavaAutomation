package RunBrowser;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class ClassExcerciseGmail {
    WebDriver driver;

    @Before
    public void openWebdriver1() throws IOException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // open browser
        driver.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");

    }

    @Test
    public void sumCalc() throws IOException {
        double sum = 0.00; // sum 90.35
        double expectedSum = 90.35; //expected sum 91.35

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));
        for (WebElement row : rows) //rows: size =5
        {
            double num = Double.parseDouble(row.getText());
            sum = sum + num;
        }
        Assert.assertEquals(sum, expectedSum, 2);

    }

    @After
    public void exit() {
        driver.quit();
    }
}