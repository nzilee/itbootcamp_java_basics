package p_9_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak5 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://s.bootsnipp.com/iframe/z80en";

        driver.navigate().to(url);

        List<WebElement> prviRed = driver
                .findElements(By.xpath("//div/div[2]/div/div[1]/table/tbody/tr[1]/td"));

        for (int i = 0; i < prviRed.size(); i++) {
            System.out.print(prviRed.get(i).getText() + ", ");
            Thread.sleep(1000);
        }

        System.out.println();

        List<WebElement> prvaKolona = driver
                .findElements(By.xpath("//div/div[2]/div/div[1]/table/tbody/tr/td[1]"));
        for (int i = 0; i < prvaKolona.size(); i++) {
            System.out.print(prvaKolona.get(i).getText() + ", ");
            Thread.sleep(1000);
        }

        driver.quit();
    }
}
