package Testcases;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Iammasariya on 4/13/2016.
 */
public class coockiesCheck {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriver driver=new FirefoxDriver();
        Set<Cookie> cookies = new HashSet<Cookie>();
        String URL="http://www.whythefuzz.com/";
        driver.navigate().to(URL);
        cookies = driver.manage().getCookies();
        for(Cookie c:cookies)
        {
            System.out.println(c.getValue());
        }
        System.out.println("Pass");
        driver.close();
    }
}
