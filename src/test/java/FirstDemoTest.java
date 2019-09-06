import com.google.common.annotations.VisibleForTesting;


import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemoTest {
    @Test
    public void firstdemotest(){
        System.setProperty("webdriver.chrome.driver", "/Users/midul/IdeaProjects/FirstTimeInSelenium/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.findElement(By.id("search_query_top")).sendKeys("Jeans");
        driver.findElement(By.name("submit_search")).click();
    String actualvaule=driver.findElement(By.className("row")).getText();
    String expected = "No results were found for your search";
        Assert.assertEquals(expected,actualvaule);

        driver.close();
    }
}


