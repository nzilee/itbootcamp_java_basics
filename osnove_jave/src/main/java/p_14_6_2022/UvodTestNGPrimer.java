package p_14_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class UvodTestNGPrimer {

    private WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to("https://www.google.com");
    }

    @Test (priority = 20)
    public void googleTitleTest(){
/*        if (driver.getTitle().equals("Google")){
            System.out.println("Jeste");
        } else {
            System.out.println("Nije");
        }*/
        Assert.assertTrue(driver.getTitle().contains("Google"),
                "[ERROR] Page title does not contain 'Google'");

        Assert.assertEquals(driver.getTitle(), "Google");

        String actualSearchType = driver.findElement(By.name("q")).getAttribute("type");
        Assert.assertEquals(
                actualSearchType,
                "text",
                "[ERROR] Input search is not type text");
//        I NACIN = fail u proveri
    }

    @Test (priority = 10)
    public void googleUrlTest(){
        if (driver.getCurrentUrl().contains("google.com")){
            System.out.println("Jeste");
        } else {
            System.out.println("Nije");
        }
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
