package d_13_6_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        File front = new File("src/main/resources/images/front_nikola_zivkovic.png");
        File back = new File("src/main/resources/images/back_nikola_zivkovic.png");
        File left = new File("src/main/resources/images/left_nikola_zivkovic.png");
        File right = new File("src/main/resources/images/right_nikola_zivkovic.png");

        String url = "https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        Thread.sleep(5000);

        // Front image
        driver
                .findElement(By.className("fendym"))
                .click();

        // Clicking on "+ Add photo" button in left nav-bar
        driver
                .findElement(By.xpath("//div[text() ='+ Add photo']"))
                .click();

        // Uploading front photo file
        driver
                .findElement(By.xpath("//input[@type ='file']"))
                .sendKeys(front.getAbsolutePath());

        // Waiting for div under the upload input to have 1 item
        wait.until(ExpectedConditions
                .numberOfElementsToBe(By
                .className("kAzmBp"), 1));

        // Clicking on a last photo item in specific div
        driver
                .findElement(By
                .xpath("//div[contains(@class, 'gmXCBU')]/img[last()]"))
                .click();

        // Waiting for pop-up dialog to be visible
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By
                .xpath("//div[contains(@class, 'dxCajp')]")));

        // Clicking on a "Use One Side Only" button in pop-up dialog
        driver
                .findElement(By
                .xpath("//button[text() ='Use One Side Only']"))
                .click();

        // Left image
        driver
                .findElement(By.xpath("//img[@alt = 'image 2']"))
                .click();

        // Clicking on "+ Add photo" button in left nav-bar
        driver
                .findElement(By.xpath("//div[text() ='+ Add photo']"))
                .click();

        // Uploading left photo file
        driver
                .findElement(By.xpath("//input[@type ='file']"))
                .sendKeys(left.getAbsolutePath());

        // Waiting for div under the upload input to have 2 items
        wait.until(ExpectedConditions
                .numberOfElementsToBe(By
                .className("haLJiC"), 2));

        // Clicking on a last photo item in specific div
        driver
                .findElement(By
                .xpath("//*[@class='sc-ftvSup kAzmBp']/div[2]"))
                .click();

        // Waiting for pop-up dialog to be visible
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By
                .xpath("//div[contains(@class, 'dxCajp')]")));

        // Clicking on a "Use One Side Only" button in pop-up dialog
        driver
                .findElement(By
                .xpath("//button[text() ='Use One Side Only']"))
                .click();

        // Back image
        driver
                .findElement(By.xpath("//img[@alt = 'image 3']"))
                .click();

        // Clicking on "+ Add photo" button in left nav-bar
        driver
                .findElement(By.xpath("//div[text() ='+ Add photo']"))
                .click();

        // Uploading back photo file
        driver
                .findElement(By.xpath("//input[@type ='file']"))
                .sendKeys(back.getAbsolutePath());

        // Waiting for div under the upload input to have 3 items
        wait.until(ExpectedConditions
                .numberOfElementsToBe(By
                .className("haLJiC"), 3));

        // Clicking on a last photo item in specific div
        driver
                .findElement(By
                .xpath("//*[@class='sc-ftvSup kAzmBp']/div[3]"))
                .click();

        // Waiting for pop-up dialog to be visible
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By
                .xpath("//div[contains(@class, 'dxCajp')]")));

        // Clicking on a "Use One Side Only" button in pop-up dialog
        driver
                .findElement(By
                .xpath("//button[text() ='Use One Side Only']"))
                .click();

        // Right image
        driver
                .findElement(By.xpath("//img[@alt = 'image 4']"))
                .click();

        // Clicking on "+ Add photo" button in left nav-bar
        driver
                .findElement(By.xpath("//div[text() ='+ Add photo']"))
                .click();

        // Uploading right photo file
        driver
                .findElement(By.xpath("//input[@type ='file']"))
                .sendKeys(right.getAbsolutePath());

        // Waiting for div under the upload input to have 4 items
        wait.until(ExpectedConditions
                .numberOfElementsToBe(By
                .className("haLJiC"), 4));

        // Clicking on a last photo item in specific div
        driver
                .findElement(By
                .xpath("//*[@class='sc-ftvSup kAzmBp']/div[4]"))
                .click();

        // Waiting for pop-up dialog to be visible
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By
                .xpath("//div[contains(@class, 'dxCajp')]")));

        // Clicking on a "Use One Side Only" button in pop-up dialog
        driver
                .findElement(By
                .xpath("//button[text() ='Use One Side Only']"))
                .click();

        Thread.sleep(5000);

        // Fetching a list of confetti
        List<WebElement> konfete = driver
                .findElements(By
                .xpath("//*[contains(@class, 'fajlzv')]/div"));

        Random r = new Random();

        // Clicking on a random confetti
        int randomKonfeta = r.nextInt(5);
        konfete.get(randomKonfeta).click();

        // Clicking on a "Add to cart" button
        driver
                .findElement(By.xpath("//button[@type='submit']"))
                .click();

        Thread.sleep(3000);

        // Expecting pop-up dialog output depending on a if...else statement
        if (elementExist(driver, By.xpath("//*[@action='error']"))){
            System.out.println("Dijalog za gresku se pojavio");
        } else {
            System.out.println("Dijalog za gresku se nije pojavio");
        }

        Thread.sleep(3000);

        // Quitting the program
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
