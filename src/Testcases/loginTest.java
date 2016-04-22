package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Iammasariya on 4/13/2016.
 */
public class loginTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.whythefuzz.com/Register/signup.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//*[@id=\"login\"]/form/p[4]/input")).click();
        try {
            driver.findElement(By.xpath("//*[@id=\"login\"]/form[1]/p[3]/input"));
            System.out.println("Pass");
            driver.close();
        }
        catch (Exception ex)
        {
            System.out.println("Fail");
        }
    }
}
