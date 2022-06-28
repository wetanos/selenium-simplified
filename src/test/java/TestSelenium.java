import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestSelenium {
    @Test
    public void startWebDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/kirillvasilenko/Documents/Programs/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("title should start differently",
                driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
        driver.quit();
    }
}

