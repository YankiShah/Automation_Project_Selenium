package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Iammasariya on 4/13/2016.
 */
public class radioButtonCheck {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.whythefuzz.com/Register/signup.php#toregister");
        driver.manage().window().maximize();

        System.out.println(driver.findElement(By.xpath("//*[@id=\"Male\"]")).isSelected());
        driver.findElement(By.xpath("//*[@id=\"Male\"]")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"Male\"]")).isSelected());
    }
}

