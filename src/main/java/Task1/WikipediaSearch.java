package Task1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaSearch {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("Web driver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Wikipedia website
        driver.get("https://www.wikipedia.org/");

        // Maximize the browser window
        driver.manage().window().maximize();



        // Find the search input field and enter the query
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("artificial intelligence");

        // Submit the search form
        searchInput.submit();



        // Click on the "History" section in the search results
        WebElement historySection = driver.findElement(By.linkText("History"));
        historySection.click();


        // Print the title of the history section
        String sectionTitle = driver.findElement(By.id("firstHeading")).getText();
        System.out.println("Title of the History section: " + sectionTitle);

        // Close the browser
        driver.quit();
    }
}
