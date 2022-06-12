package p_10_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {

//  Napisati program koji prijavljivanju na
//  stranicu http://cms.demo.katalon.com/my-account/,
//  cekira Remember me checkbox.

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "http://cms.demo.katalon.com/my-account/";

        driver.navigate().to(url);

        driver
                .findElement(By.name("rememberme"))
                .click();

        Thread.sleep(500);



        driver.quit();
    }
}
