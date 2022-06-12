package d_9_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
//  Maksimizirati prozor
//  Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//  Dohvatite dugmice za rejting kao listu. XPath za trazenje
//  treba da bude preko id atributa i za ovo trebace vam contains u xpath-u
//  Od korisnika ucitati broj (preko scannera) na koju zvezdicu je
//  potrebno kliknuti (u rasponu od 1 do 5)
//  I izvrsite akciju klik na odgovarajuci element preko indeksa
//  Na kraju programa ugasite pretrazivac.

        Scanner s = new Scanner(System.in);

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        String url = "https://s.bootsnipp.com/iframe/WaXlr";
        driver.navigate().to(url);

        List<WebElement> lista = driver
                .findElements(By.xpath("//button[contains(@id, 'rating-star')]"));

        System.out.print("Unesite ocenu od 1 do 5: ");
        int ocena = s.nextInt();

        Thread.sleep(3000);

        lista.get(ocena - 1).click();

        Thread.sleep(1000);


        driver.quit();
    }
}
