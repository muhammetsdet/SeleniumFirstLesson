package my_first_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //    Chrome tarayıcısını başlat ve pencereyi tam ekran yap
        driver.manage().window().maximize();
//    https://clarusway.com/ adresine git
        driver.get("https://clarusway.com");

//    http://amazon.com/ adresine git
        driver.navigate().to("http://amazon.com/");
//    back() komutu kullanarak Clarusway'e geri dön
        Thread.sleep(2000);
        driver.navigate().back();
//    forward() komutu kullanarak tekrar amazon websitesine git
        Thread.sleep(2000);
        driver.navigate().forward();
//    Sayfayı yenile
        Thread.sleep(2000);
        driver.navigate().refresh();
//    Tarayıcıyı kapat
        Thread.sleep(2000);
        driver.quit();
    }
}
