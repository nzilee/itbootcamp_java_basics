package p_9_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Vezba_Zadatak_Sa_Slacka {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://editor.datatables.net/examples/styling/bootstrap4";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        List<WebElement> redovi = driver
                .findElements(By.xpath("//table[@id ='example']/tbody/tr"));

        for (int i = 0; i < 5; i++) {
            redovi.get(i).click();

            Thread.sleep(1000);

            driver
                    .findElement(By.xpath("//span[text() ='Delete']"))
                    .click();

            Thread.sleep(1000);

            driver
                    .findElement(By.xpath("//button[text() ='Delete']"))
                    .click();

            Thread.sleep(500);
        }

        String text = driver
                .findElement(By.className("dataTables_info"))
                .getText();

        if (text.equals("Showing 1 to 10 of 52 entries")){
            System.out.println("Table info sadrzi trazeni tekst");
        } else {
            System.out.println("Table info ne sadrzi trazeni tekst");
        }

        Thread.sleep(1000);


        driver.quit();
    }
}
