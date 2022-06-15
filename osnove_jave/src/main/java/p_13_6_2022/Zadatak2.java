package p_13_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        File slika = new File("src/main/resources/itbootcamp_logo.png");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "https://www.file.io/";
        driver.navigate().to(url);

        driver
                .findElement(By.id("upload-button"))
                .sendKeys(slika.getAbsolutePath());

        Thread.sleep(3000);

        driver.navigate().refresh();

        driver
                .findElement(By.id("upload-button"))
                .sendKeys("D:\\Downloads\\Downloads.rar");

        Thread.sleep(15000);


        driver.quit();
    }
}
