package my_first_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BrowserCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        //driver.manage().window().minimize();;
        //driver.manage().window().fullscreen();
        driver.get("https://clarusway.com");
        String googleUrl="https://google.com";
        driver.get(googleUrl);

        driver.quit();


    }
}
