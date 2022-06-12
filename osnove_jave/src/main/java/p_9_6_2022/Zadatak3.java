package p_9_6_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

//  Napisati program koji ima:
//  Niz stranica (niz stringova) koje treba da ucita. Niz je:
//  https://google.com/
//  https://youtube.com/
//  https://www.ebay.com/
//  https://www.kupujemprodajem.com/
//  Program petljom prolazi kroz niz stranica i svaku
//  stranicu ucitava preko get ili navigate i od
//  svake stranice na ekranu ispisuje naslov stranice.

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        ArrayList<String> stranice = new ArrayList<>();

        stranice.add("https://google.com/");
        stranice.add("https://youtube.com/");
        stranice.add("https://www.ebay.com/");
        stranice.add("https://www.kupujemprodajem.com/");

        for (int i = 0; i < stranice.size(); i++) {
            driver.navigate().to(stranice.get(i));
            System.out.println("Naslov stranice je: " + driver.getTitle());
        }

        driver.quit();
    }
}
