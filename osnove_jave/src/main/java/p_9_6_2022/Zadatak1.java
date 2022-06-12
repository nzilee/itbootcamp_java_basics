package p_9_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {

//  Napisati program koji:
//  Maksimizuje prozor
//  Ucitava stranicu https://cms.demo.katalon.com/
//  U delu za pretragu unosi tekst Flying Ninja. Xpath za trazenje ovog elementa treba da bude preko name atributa
//  Klikce na dugme za pretragu. Dugme sa lupom. Kada trazite element dohvatite element koji je po tagu button a ne span. Xpath za trazenje ovog elementa treba da bude preko class atributa.
//  Ceka 5 sekuni
//  Zatvara pretrazivac

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://cms.demo.katalon.com/";
        String searchText = "Flying Ninja";

        driver.manage().window().maximize();
        driver.navigate().to(url);

        driver
//                .findElement(By.xpath("//*[@name='s']"))
                .findElement(By.name("s"))
                .sendKeys(searchText);


        driver
//                .findElement(By.xpath("//*[contains(@class, 'search-submit')]"))
                .findElement(By.className("search-submit"))
                .click();

        Thread.sleep(5000);

        driver.quit();

    }
}
