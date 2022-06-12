package d_9_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
//  Napisati program koji matematicku formulu koju korisnik unese izvrsaav na stranici:
//  Ucitati stranicu https://www.calculatorsoup.com/calculators/math/basic.php
//  Korisnik unosi formulu, samo osnovne matematicke operacija, npr:
//  1243+329=
//  21912-4=
//  12913÷4=
//  U programu se formula unosi kao jedan string i potrebno je razbiti formulu
//  na karaktere. Za to imate metodu https://www.geeksforgeeks.org/convert-a-string-to-a-list-of-characters-in-java/
//  Zatim u odnosu na karakter uradite odredjenu logiku

        Scanner s = new Scanner(System.in);

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "https://www.calculatorsoup.com/calculators/math/basic.php";
        driver.navigate().to(url);

        System.out.print("Unesite formulu za izvrsenje: ");
        String formula = s.nextLine();

        List<Character> karakteri = stringToChar(formula);

        System.out.println(karakteri);
        for (int i = 0; i < karakteri.size(); i++) {
            driver
                    .findElement(By.id("display"))
                    .sendKeys("" + karakteri.get(i));
        }

        Thread.sleep(5000);


        driver.quit();
    }

    public static List<Character> stringToChar(String string){
        List<Character> karakteri = new ArrayList<>();

        for (char ch : string.toCharArray()) {
            karakteri.add(ch);
        }
        return karakteri;
    }
}
