package ui.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;



public class GoogleCloudHomePage extends AbstractPage {
    private final String URL = "https://cloud.google.com";


    private SelenideElement searchBtn = $x("//div[@class='YSM5S']");
    private SelenideElement inputText = $x("//input[@type='text']");



    public GoogleCloudHomePage openPage() {
        Selenide.open(URL);
        return this;
    }

    public SearchingResultsPage search(String searchQuery)  {
        searchBtn.click();
        inputText.setValue(searchQuery).pressEnter();
        return new SearchingResultsPage();
    }
}
