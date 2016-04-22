package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Iammasariya on 4/13/2016.
 */
public class test {
    public static void main(String[] args) {
        WebDriver wd = new FirefoxDriver();
        String baseUrl = "http://www.whythefuzz.com/";
        String title = "";

        wd.get(baseUrl);
        title += wd.getTitle();
        System.out.println(title);
        wd.close();
    }
}
