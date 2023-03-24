package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {

    private WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/");
    }
    @Test
    public void openBrowser(){
        String title = driver.getTitle();
        System.out.println("Page title is: " + driver.getTitle());
        Assert.assertEquals("title","Training Support");

        driver.findElement(By.id("about-link")).click();
        System.out.println("New page title is: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "About Training Support");

    }
    @AfterTest
    public void teardown(){
    driver.quit();
    }
}