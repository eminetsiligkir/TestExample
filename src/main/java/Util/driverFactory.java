package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class driverFactory{
    static WebDriver driver;

    public void initDriver(String browser){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        getDriver().get("https://demoqa.com/elements");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public static synchronized RemoteWebDriver getDriver() {
        return driverThreadLocal.get();
    }
    public static ThreadLocal<RemoteWebDriver>  driverThreadLocal =  new ThreadLocal<>();;

}
