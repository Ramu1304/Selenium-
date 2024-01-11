import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SnapdealLoginVerification {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("Web driver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Snapdeal website
        driver.get("https://www.snapdeal.com/");

        // Maximize the browser window
        driver.manage().window().maximize();


        // Move the cursor to the Sign In button
        WebElement signInButton = driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(signInButton).build().perform();

        // Click on the Sign-In button
        WebElement signInLink = driver.findElement(By.xpath("//a[contains(text(),'login')]"));
        signInLink.click();

        // Enter a valid Email ID
        WebElement emailField = driver.findElement(By.id("userName"));
        emailField.sendKeys("your_valid_email@example.com");

        // Click on the Continue button
        WebElement continueButton = driver.findElement(By.id("checkUser"));
        continueButton.click();

        // Enter a valid password
        WebElement passwordField = driver.findElement(By.id("j_password_login_uc"));
        passwordField.sendKeys("your_valid_password");

        // Click on the Login button
        WebElement loginButton = driver.findElement(By.id("submitLoginUC"));
        loginButton.click();


        // Verify that the user is logged in successfully
        WebElement loggedInUser = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
        String userName = loggedInUser.getText();

        if (!userName.isEmpty()) {
            System.out.println("Login successful. User: " + userName);
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }

        // Close the browser
        driver.quit();
    }
}
