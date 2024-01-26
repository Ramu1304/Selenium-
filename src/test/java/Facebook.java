import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

    public static void main(String []args){

        ChromeDriver  Driver = new ChromeDriver();
        Driver.get("https://www.facebook.com/");
        Driver .manage().window().maximize();




    }
}
