package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Iammasariya on 4/13/2016.
 */
public class Title {
    public static void main(String[] args){
        WebDriver wd = new FirefoxDriver();
        String url = "http://www.whythefuzz.com/";
        String actualTitle = "Why The Fuzz! - Your daily dose of satire and insanity";
        String title;

        wd.get(url);
        title = wd.getTitle();
        if(title.equals(actualTitle))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        wd.close();
    }
}
