
import org.openqa.selenium.firefox.FirefoxDriver;
public class Searchgoogle {
    public static void main(String[] args) {
        FirefoxDriver driver;
        driver = new FirefoxDriver();
        driver.get("https://www.google.com/search?client=firefox-b-d&q=Google");
        driver.manage().window().maximize();
        java.lang.String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        driver.quit();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }
}
