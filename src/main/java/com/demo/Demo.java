package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
    public static void main(String[] args) {
        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Print the page title in console
        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}
