package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Iammasariya on 4/13/2016.
 */
public class pageMaximize {
    public static void main(String[] args)
    {
        WebDriver driver=new FirefoxDriver();

        driver.get("http://www.whythefuzz.com/category/abe-ja-yaar/");
        driver.manage().window().maximize();
    }
}
