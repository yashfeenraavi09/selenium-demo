package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormAutomation {
    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open form page
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();

        // Fill first name
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Yashfeen");

        // Fill last name
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Raavi");

        // Select gender (Female)
        WebElement genderMale = driver.findElement(By.id("sex-1"));
        genderMale.click();

        // Select experience (5 years)
        WebElement exp = driver.findElement(By.id("exp-4"));
        exp.click();

        // Fill date
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("16-09-2025");

        // Select profession (Automation Tester)
        WebElement profession = driver.findElement(By.id("profession-1"));
        profession.click();

        // Select tool 
        WebElement tool = driver.findElement(By.id("tool-2"));
        tool.click();

        // Select continent (Europe)
        WebElement continent = driver.findElement(By.id("continents"));
        continent.sendKeys("Europe");

        // Click submit button
        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();

        // Wait a bit to see result
        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}
