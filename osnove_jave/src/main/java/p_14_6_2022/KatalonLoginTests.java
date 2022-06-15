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

public class KatalonLoginTests {

    String baseUrl = "https://cms.demo.katalon.com";
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(baseUrl);
    }

    @Test (priority = 10)
    public void visitLoginPageFromNavbar(){

        driver
                .findElement(By.className("page-item-10"))
                .click();

        Assert.assertEquals(driver.getTitle(),
                "My account – Katalon Shop",
                "[ERROR] Page title is not 'My account – Katalon Shop'");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("/my-account"),
                "Current URL does not contain '/my-account'");
    }

    @Test(priority = 20)
    public void checkInputTypes() {
        driver.navigate().to(baseUrl + "/my-account");

        Assert.assertEquals(
                driver.findElement(By.id("username"))
                        .getAttribute("type"),
                "text",
                "[ERROR] Email input does not have type that has 'text' value");

        Assert.assertEquals(
                driver.findElement(By.id("password"))
                        .getAttribute("type"),
                "password",
                "[ERROR] Password input does not have type that has 'password' value");

        Assert.assertEquals(
                driver.findElement(By.id("rememberme"))
                        .getAttribute("type"),
                "checkbox",
                "[ERROR] Checkbox 'Remember me' does not have type that has 'checkbox' value");

        Assert.assertFalse(driver.findElement(By.id("rememberme"))
                .isSelected(),
                "[ERROR] Checkbox 'Remember me' is checked");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("/my-account"),
                "Current URL does not contain '/my-account'");
    }

    @Test(priority = 30)
    public void displayErrorWhenCredentialsAreWrong(){
        driver.navigate().to(baseUrl + "/my-account");
        String email = "invalidemail@gmail.com";
        String password = "invalid123";

        driver.findElement(By.id("username"))
                .sendKeys(email);

        driver.findElement(By.id("password"))
                .sendKeys(password);

        driver
                .findElement(By.name("login"))
                .click();

        Assert.assertTrue(driver
                .findElement(By.className("woocommerce-error")).isDisplayed(),
                "[ERROR] There is no pop-up dialog error");

        Assert.assertTrue(driver
                .findElement(By.xpath( "//*[@class='woocommerce-error']/li")).getText()
                .contains("ERROR: Invalid email address"),
                "[ERROR] The message does not contain 'ERROR: Invalid email address' text");

    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
