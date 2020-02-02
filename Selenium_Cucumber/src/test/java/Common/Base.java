package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
    public static WebDriver getDriver(){
        System.setProperty("webdriver.gecko.driver","bin\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
       return driver;
    }
}
