package p_13_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        String url = "https://docs.katalon.com/";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        WebElement theme = driver.findElement(By.xpath("/html"));
        String themeValue = theme.getAttribute("data-theme");

        if (themeValue.equals("light")){
            System.out.println("Tema je postavljena na light mode");
        } else {
            System.out.println("Tema je postavljena na dark mode");
        }

        Thread.sleep(1000);

        driver
                .findElement(By.className("toggleButton_rCf9"))
                .click();

        Thread.sleep(1000);

        themeValue = theme.getAttribute("data-theme");

        if (themeValue.equals("dark")){
            System.out.println("Tema je postavljena na dark mode");
        } else {
            System.out.println("Tema je postavljena na light mode");
        }

        Thread.sleep(1000);

        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .sendKeys("k")
                .perform();

        Thread.sleep(1000);

        String searchValue = driver.findElement(By.id("autocomplete-0-input")).getAttribute("type");

        if (searchValue.equals("search")){
            System.out.println("Element za pretragu poseduje atribut type sa vrednoscu 'search'");
        } else {
            System.out.println("Element za pretragu ne poseduje atribut type sa vrednoscu 'search'");
        }

        Thread.sleep(1000);


        driver.quit();
    }
}
