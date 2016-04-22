package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Iammasariya on 4/21/2016.
 */
public class fileUpload {
    public static void main(String[] args)
    {
        WebDriver driver=new FirefoxDriver();

        driver.get("http://www.whythefuzz.com/Register/securedpage.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"file\"]")).sendKeys("C:/Users/Iammasariya/Downloads/Test_plan_IEEE.pdf");
        driver.findElement(By.xpath("//*[@id=\"login\"]/form[1]/p[3]/input")).submit();
        driver.close();
    }
}
