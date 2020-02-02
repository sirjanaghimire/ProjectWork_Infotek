package loginBin;

import Common.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Login extends Base {

   private static WebDriver driver= Base.getDriver();

    public  static void openBrowser(String url){

        //driver.get("http://newtours.demoaut.com/");
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

}
