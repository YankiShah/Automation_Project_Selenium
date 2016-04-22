package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeoutException;

/**
 * Created by Iammasariya on 4/13/2016.
 */
public class JavascriptAlert {
    public static void main(String[] args) {
        WebDriver wd = new FirefoxDriver();
        wd.get("http://www.whythefuzz.com/");
        try {
            WebDriverWait wait = new WebDriverWait(wd, 10);
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
            System.out.println("PASS");
        }
        catch (org.openqa.selenium.TimeoutException ex)
        {
            System.out.println("FAIL");
            ex.printStackTrace();
        }
        finally {
            wd.close();
        }
    }
}
