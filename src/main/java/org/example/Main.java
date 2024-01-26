package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/input.xhtml");
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    }
