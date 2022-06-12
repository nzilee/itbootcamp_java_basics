package p_10_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {
//  Ucitava stranicu https://demoqa.com/login
//  Loginuje se sa usename itbootcamp i lozinkom ITBootcamp2021!
//  Zatim ceka 5sekundi da se korisnik uloguje
//  Proverava da li se korisnik ulogovao,
//  tako sto se proverava postojanje dugmeta Logout.
//  Ispisati odgovarajucu poruku u konzoli za rezultat loginovanja.
//  Klikce na dugme za logout
//  Gasi stranicu


        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://demoqa.com/login";
        String username = "itbootcamp";
        String password = "ITBootcamp2021!";

        driver.navigate().to(url);

        driver
                .findElement(By.id("userName"))
                .sendKeys(username);

        driver
                .findElement(By.id("password"))
                .sendKeys(password);

        driver
                .findElement(By.id("login"))
                .click();

        Thread.sleep(5000);

        if (elementExist(driver, By.id("submit"))){
            System.out.println("Korisnik je uspesno ulogovan");
        } else {
            System.out.println("Korisnik nije ulogovan");
        }


        driver.quit();
    }

    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return  elementExist;
    }

}
