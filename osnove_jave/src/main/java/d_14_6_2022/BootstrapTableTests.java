package d_14_6_2022;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;

public class BootstrapTableTests {

    private String baseURL = "https://s.bootsnipp.com";
    WebDriver driver;
    WebDriverWait wait;
    private String firstName = "Nikola";
    private String lastName = "Zivkovic";
    private String middleName = "Polu-Poljoprivrednik";


    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(baseURL);
    }

    @Test (priority = 10)
    public void editRow() throws InterruptedException {
        driver.navigate().to(baseURL + "/iframe/K5yrx");

        Assert.assertEquals(driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR] Page title is not 'Table with Edit and Update Data - Bootsnipp.com'!");

        driver
                .findElement(By.xpath("//tr[@id = 'd1']//button[contains(@class, 'update')]"))
                .click();

        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.id("edit")));

        driver
                .findElement(By.id("fn")).clear();
        driver
                .findElement(By.id("ln")).clear();
        driver
                .findElement(By.id("mn")).clear();
        driver
                .findElement(By.id("fn")).sendKeys(firstName);
        driver
                .findElement(By.id("ln")).sendKeys(lastName);
        driver
                .findElement(By.id("mn")).sendKeys(middleName);

        driver
                .findElement(By.id("up"))
                .click();

        wait.until(ExpectedConditions
                .invisibilityOfElementLocated(By.id("edit")));

        Assert.assertTrue(driver
                .findElement(By.id("f1"))
                .getText().equals(firstName),
                "[ERROR] First name is not " + firstName);
        Assert.assertTrue(driver
                .findElement(By.id("l1"))
                .getText().equals(lastName),
                "[ERROR] Last name is not " + lastName);
        Assert.assertTrue(driver
                .findElement(By.id("m1"))
                .getText().equals(middleName),
                "[ERROR] Middle name is not " + middleName);
    }

    @Test (priority = 20)
    public void deleteRow() throws InterruptedException {
        driver.navigate().to(baseURL + "/iframe/K5yrx");

        WebElement pre = driver.findElement(By.tagName("tbody"));

        Assert.assertEquals(driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR] Page title is not 'Table with Edit and Update Data - Bootsnipp.com'!");

        driver
                .findElement(By.xpath("//tr[@id = 'd1']//button[contains(@class, 'delete')]"))
                .click();

        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.id("delete")));

        driver
                .findElement(By.id("del"))
                .click();

        wait.until(ExpectedConditions
                .invisibilityOfElementLocated(By.id("delete")));

        WebElement posle = driver.findElement(By.tagName("tbody"));

        Assert.assertNotSame(pre.getSize(),
                posle.getSize(),
                "Tbody is the same as before");
    }

    @Test (priority = 30)
    public void takeAScreenshot() throws IOException {
        driver.navigate().to(baseURL + "/iframe/K5yrx");

        Assert.assertEquals(driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR] Page title is not 'Table with Edit and Update Data - Bootsnipp.com'!");

        TakesScreenshot screen = (TakesScreenshot) driver;
        File screenshot = screen.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot, new File("src/main/resources/WebPageScreenshot.png"));

    }


    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
