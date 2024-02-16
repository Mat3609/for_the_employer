package page.google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.AbstractPage;

public class GoogleCloudHomePage extends AbstractPage {
    private final String URL = "https://cloud.google.com/";




    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchBtn;


    public GoogleCloudHomePage(WebDriver driver) {
        super(driver);
    }


    public GoogleCloudHomePage openPage() {
        driver.get(URL);
        return this;
    }

    public SearchingResultsPage search(String searchQuery) {
        searchBtn.sendKeys(searchQuery, Keys.ENTER);
        return new SearchingResultsPage(driver);
    }
}
