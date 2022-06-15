package p_13_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UvodWaiters {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "file:///D:/Downloads/Zadatak4.html";
        driver.navigate().to(url);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.id("showInBtn")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id-0")));

//        wait.until(ExpectedConditions.elementToBeClickable(By.id("showInBtn")));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id-0")));
            wait.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 10));
            wait.until(ExpectedConditions.attributeToBe(By.id("id-0"), "class", "nikola"));


        Thread.sleep(1000);


        driver.quit();
    }
}
