package p_10_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Uvod_u_ImplicitWait {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        String url = "file:///D:/Downloads/Zadatak6.html";
        driver.navigate().to(url);

        WebElement btn = driver.findElement(By.id("showInBtn"));
        btn.click();

        WebElement e = driver.findElement(By.id("id-0"));
        btn.click();

        WebElement f = driver.findElement(By.id("id-1"));
        btn.click();

        WebElement g = driver.findElement(By.id("id-2"));


        driver.quit();
    }
}
