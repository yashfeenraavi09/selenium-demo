package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class FormAutomation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            WebElement firstName = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
            firstName.sendKeys("John");

            WebElement lastName = driver.findElement(By.name("lastname"));
            lastName.sendKeys("Doe");

            WebElement genderMale = driver.findElement(By.id("sex-0"));
            js.executeScript("arguments[0].click();", genderMale);

            WebElement exp = driver.findElement(By.id("exp-4"));
            js.executeScript("arguments[0].click();", exp);

            WebElement date = driver.findElement(By.id("datepicker"));
            date.sendKeys("17-09-2025");

            WebElement profession = driver.findElement(By.id("profession-1"));
            js.executeScript("arguments[0].scrollIntoView(true);", profession);
            js.executeScript("arguments[0].click();", profession);

            WebElement tool = driver.findElement(By.id("tool-2"));
            js.executeScript("arguments[0].click();", tool);

            System.out.println("Form filled successfully!");
        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
