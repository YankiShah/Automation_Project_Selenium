package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by Iammasariya on 4/13/2016.
 */
public class NavigationCheck {
    public static void main(String[] args){
        WebDriver wd = new FirefoxDriver();
        wd.get("http://www.whythefuzz.com/");
        wd.findElement(By.cssSelector("span.ArevicoModal-close-icon ArevicoModal-close")).click();
        List<WebElement> linkElements = wd.findElements(By.xpath("//*[@href or @src]"));

        for(WebElement e:linkElements){
        String link = e.getAttribute("href");
                    if(null==link)
                        link=e.getAttribute("src");
            wd.navigate().to(link);
            System.out.println("Link: " + e.getText());
            wd.navigate().back();
        }

        wd.close();
    }
}
