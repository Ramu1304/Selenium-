package Task1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoBlazeTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("Web driver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.demoblaze.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Verify if the title is "STORE"
        if (driver.getTitle().equals("STORE")) {
            System.out.println("Page landed on correct website");
        } else {
            System.out.println("Page not landed on correct website");
        }

        // Close the browser
        driver.quit();
    }


}
