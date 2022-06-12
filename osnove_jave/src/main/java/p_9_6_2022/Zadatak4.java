package p_9_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://s.bootsnipp.com/iframe/n8lOy";

        driver.navigate().to(url);

        List<WebElement> checkboxes = driver
                .findElements(By.xpath("//body/div[2]//label"));
        for (int i = 0; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
            Thread.sleep(10000);
        }

        driver.quit();
    }
}
