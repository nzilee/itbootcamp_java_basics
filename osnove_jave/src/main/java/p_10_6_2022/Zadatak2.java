package p_10_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
//  Napisati program koji ucitava
//  stranicu https://www.ebay.com/ i bira kategoriju “Crafts”

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.ebay.com/";
        driver.navigate().to(url);

        driver
                .findElement(By.id("gh-cat"))
                .click();

        Thread.sleep(1000);

        Select se = new Select(driver.findElement(By.id("gh-cat")));
        se.selectByValue("14339");

        Thread.sleep(1000);

        driver
                .findElement(By.id("gh-ac"))
                .sendKeys("Jewelry");

        Thread.sleep(1000);

        driver
                .findElement(By.id("gh-btn"))
                .click();

        Thread.sleep(1000);

        driver.quit();
    }
}
