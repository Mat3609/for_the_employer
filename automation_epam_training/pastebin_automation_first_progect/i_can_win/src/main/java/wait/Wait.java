package wait;

import org.openqa.selenium.By;
import test.CommonConditions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait extends CommonConditions {
    public static final Duration LOW_TIMEOUT = Duration.ofSeconds(20);

    public static ExpectedCondition<Boolean> jQueryAJAXsCompleted() {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return (Boolean) ((JavascriptExecutor) driver)
                        .executeScript("return document.readyState").equals("complete");
            }
        };
    }

    public static WebElement elementToBeClickable(WebElement webElement) {
        return new WebDriverWait(driver, LOW_TIMEOUT)
                .until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static WebElement presenceOfElementLocated(By by) {
        return new WebDriverWait(driver, LOW_TIMEOUT)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
