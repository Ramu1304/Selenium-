package Task1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDropAutomation {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

       driver.get("https://jqueryui.com/droppable/");
       driver.manage().window().maximize();

       driver.switchTo().frame(0);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement sourceElement = driver.findElement(By.id("draggable"));
       WebElement targetElement = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).perform();

       // Verify the color property of the target element's CSS
        String targetElementColor = targetElement.getCssValue("color");
        if (targetElementColor.equals("rgba(0, 128, 0, 1)")) {
            System.out.println("Drag and drop operation successful. Target element color is green.");
        } else {
            System.out.println("Drag and drop operation failed. Target element color is not green.");
        }

        // Verify the text of the target element has changed to "Dropped!"
        String targetElementText = targetElement.getText();
        if (targetElementText.equals("Dropped!")) {
            System.out.println("Text of the target element changed to 'Dropped!' after the drop.");
        } else {
            System.out.println("Text of the target element did not change to 'Dropped!' after the drop.");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
