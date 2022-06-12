package p_10_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak5 {
    public static void main(String[] args) throws InterruptedException {
//  Ucitati stranicu https://demoqa.com/modal-dialogs
//  Kliknuti na dugme Large modal
//  Proverite da li se prikazao dijalog i ispisite u
//  konzoli odgovarajuce poruke


        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "https://demoqa.com/modal-dialogs";
        driver.navigate().to(url);

        driver
                .findElement(By.id("showLargeModal"))
                .click();

        if (elementExist(driver, By.className("modal-body"))){
            System.out.println("Dugme je uspesno kliknuto");
        } else {
            System.out.println("Dugme nije kliknuto");
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
