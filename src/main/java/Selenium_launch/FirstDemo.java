package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/midul/IdeaProjects/FirstTimeInSelenium/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.findElement(By.id("search_query_top")).sendKeys("Jeans");
        driver.findElement(By.name("submit_search")).click();

        driver.close();
    }
}