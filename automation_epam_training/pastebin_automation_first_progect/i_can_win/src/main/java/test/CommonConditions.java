package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import wait.Wait;

import java.time.Duration;

public class CommonConditions {
    protected static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUpDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Wait.LOW_TIMEOUT);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(Wait.jQueryAJAXsCompleted());
    }

    @AfterMethod(alwaysRun = true)
    public void switchOfDriver() {
        driver.quit();
        driver = null;
    }
}
