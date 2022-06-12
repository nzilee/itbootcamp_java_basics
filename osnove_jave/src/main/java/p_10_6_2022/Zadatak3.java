package p_10_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
//  Napisati program koji:
//  Ucitava stranicu  https://www.ebay.com/
//  Zatim iz selekta za kategoriju povlaci sve opcije.
//  Zatim bira random element iz niza opcija koristeci Random.
//  Vodite racuna da random element bude u opsegu
//  broja elemenata niza.
//  Selektuje random kategoriju izabranu u koraku iznad
//  Zatvara pretrazivac


        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.ebay.com/";
        driver.navigate().to(url);

        Thread.sleep(1000);

        // Clicking on a category dropdown menu
        driver
                .findElement(By.id("gh-cat"))
                .click();

        Thread.sleep(1000);

        // Selecting all options from dropdown menu
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        List<WebElement> lista = s.getOptions();

        Random ran = new Random();
        int nxt = ran.nextInt(lista.size());

        // Clicking on a random option from dropdown menu
        lista.get(nxt).click();

//        s.selectByIndex(nxt);

//        String text = lista.get(nxt).getText();
//        s.selectByVisibleText(text);

        Thread.sleep(1000);

        // Clicking on a search button
        driver
                .findElement(By.id("gh-btn"))
                .click();

        Thread.sleep(1000);


        driver.quit();
    }
}
