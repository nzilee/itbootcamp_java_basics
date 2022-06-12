package d_10_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "https://geodata.solutions/";
        driver.navigate().to(url);

        Select country = new Select(driver.findElement(By.id("countryId")));
        List<WebElement> listaCountry = country.getOptions();

        Random ran = new Random();
        int ranCountry = ran.nextInt(listaCountry.size());

        listaCountry.get(ranCountry).click();

        Thread.sleep(1000);

        Select state = new Select(driver.findElement(By.id("stateId")));
        List<WebElement> listaState = state.getOptions();

        int ranState = ran.nextInt(listaState.size());
        listaState.get(ranState).click();

        Thread.sleep(1000);

        Select city = new Select(driver.findElement(By.id("cityId")));
        List<WebElement> listaCity = city.getOptions();

        int ranCity = ran.nextInt(listaCity.size());
        listaCity.get(ranCity).click();

        Thread.sleep(5000);

        driver.quit();
    }
}
