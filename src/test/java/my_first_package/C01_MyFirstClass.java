package my_first_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_MyFirstClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.tr/");

        driver.quit(); //All of them

        //driver.close(); Just the last

    }
}
