package p_9_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak4_1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://s.bootsnipp.com/iframe/oV91g";

        driver.navigate().to(url);

        List<WebElement> paginations = driver
                .findElements(By.xpath("//a[contains(@class, 'page_link')]"));
        for (int i = 0; i < paginations.size(); i++) {
            paginations.get(i).click();
            Thread.sleep(2000);
        }

        driver.quit();
    }
}
