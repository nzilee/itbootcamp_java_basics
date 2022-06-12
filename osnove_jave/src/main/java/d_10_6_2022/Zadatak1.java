package d_10_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "https://s.bootsnipp.com/iframe/Dq2X";
        driver.navigate().to(url);

        for (int i = 5; i > 0; i--) {
            driver
                    .findElement(By.xpath("//div[last()]/button"))
                    .click();

            if (!elementExist(driver, By.xpath("//div[" + i +"]/button"))){
                System.out.println("Alert je ugasen");
            } else {
                System.out.println("Alert nije ugasen");
            }
        }


        Thread.sleep(1000);


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
