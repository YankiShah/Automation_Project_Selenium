package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Iammasariya on 4/13/2016.
 */
public class LoginSignupSwitching {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.whythefuzz.com/Register/signup.php   ");
        driver.manage().window().maximize();

        System.out.println("Before clicking");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]/form/p[5]/a")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"register\"]/form/p[16]/a")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"login\"]/form/p[5]/a")).click();

        System.out.println("After clicking");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]/form/p[5]/a")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"register\"]/form/p[16]/a")).isDisplayed());
        //driver.close();
    }
}
