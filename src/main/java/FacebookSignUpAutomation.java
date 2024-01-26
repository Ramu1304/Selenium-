
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookSignUpAutomation {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("web driver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Step 1: Open the Chrome Browser
        // No explicit command needed for this step

        // Step 2: Navigate to the Facebook Website
        driver.get("https://www.facebook.com/");

        // Step 3: Verify redirection to the Facebook homepage
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Successfully redirected to the Facebook homepage.");
        } else {
            System.out.println("Redirection to Facebook homepage failed.");
            driver.quit();
            return;
        }

        // Step 4: Click on the "Create New Account" button
        WebElement createAccountButton = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
        createAccountButton.click();

        // Step 5-10: Fill in the registration form
        driver.findElement(By.name("firstname")).sendKeys("Test");
        driver.findElement(By.name("lastname")).sendKeys("User");
        driver.findElement(By.name("reg_email__")).sendKeys("testuser@test.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("StrongPassword");

        // Selecting date of birth
        Select dayDropdown = new Select(driver.findElement(By.id("day")));
        dayDropdown.selectByVisibleText("11");

        Select monthDropdown = new Select(driver.findElement(By.id("month")));
        monthDropdown.selectByVisibleText("May");

        Select yearDropdown = new Select(driver.findElement(By.id("year")));
        yearDropdown.selectByVisibleText("1985");

        // Selecting gender
        WebElement genderRadioButton = driver.findElement(By.xpath("//input[@name='sex' and @value='2']")); // 2 for Female, 1 for Male
        genderRadioButton.click();

        // Step 11: Click on the "Sign Up" button
        WebElement signUpButton = driver.findElement(By.name("web submit"));
        signUpButton.click();

        // Step 12: Verify successful registration
        String successTitle = "Welcome to Facebook";
        String actualSuccessTitle = driver.getTitle();

        if (actualSuccessTitle.equals(successTitle)) {
            System.out.println("Successfully registered on Facebook and redirected to the Facebook homepage.");
        } else {
            System.out.println("Registration failed.");
        }

        // Close the browser
        driver.quit();
    }
}
