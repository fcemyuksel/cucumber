package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /*
    Driver class'inin sadece getDriver() ile kullanilmasini saglamak,
    bu class'dan obje olusturulmasina engel olmak icin
    POM dizayninda Singleton Pattern kullanilir

    SINGLETON PATTERN bir class'dan obje olusturulmasini engellemek icin
    class icerisinde istenen sartlara sahip constructor olusturup
    erisimi kapatmamiza dayanir
     */

    private Driver(){

    }
    static WebDriver driver;

    public static WebDriver getDriver(){

        String browser=ConfigReader.getProperty("browser");
        WebDriverManager.chromedriver().setup();


        if (driver==null) {
            switch (browser){
                case "safari":
                    driver=new SafariDriver();
                    break;
                case "firefox":
                    driver=new FirefoxDriver();
                    break;
                case "edge":
                    driver=new EdgeDriver();
                    break;
                default:
                    driver=new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }    //driver null degilse hicbir sey yapma
            //var olan driver ile devam etme



        return driver;
    }

    public static void closeDriver(){
        if (driver !=null){
            driver.close();
            driver=null;
        }
    }

    public static void quitDriver(){
        if (driver !=null){
            driver.quit();
            driver=null;
        }
    }
}
