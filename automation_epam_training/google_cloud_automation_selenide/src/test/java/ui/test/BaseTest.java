package ui.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import ui.util.TestListener;


@Listeners({TestListener.class})
public class BaseTest {

    @BeforeTest(alwaysRun = true)
    public void configurationBrowser() {
        Configuration.browser = System.getProperty("browser", "firefox");
        Configuration.fastSetValue = true;
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        Configuration.headless = false;
    }

    @AfterTest(alwaysRun = true)
    public void browserClose() {
        Selenide.closeWebDriver();
    }
}
