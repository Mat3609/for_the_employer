package ui.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


public class SearchingResultsPage extends AbstractPage {

    public static final String URL = "https://cloud.google.com/s/results?q=Google%20Cloud%20Platfor" +
            "m%20Pricing%20Calculator&text=Google%20Cloud%20Platform%20Pricing%20Calculator";

    private final ElementsCollection hrefs = $$x("//div[@class='gs-title']//a[@href]");
    private final SelenideElement searchingResultsText = $x("//h1");

    @Override
    public SearchingResultsPage openPage() {
        Selenide.open(URL);
        return this;
    }


    public List<String> getSearchResultsUrls() {
        List<String> listUrl = new ArrayList<>();
        hrefs.forEach(x -> listUrl.add(x.getAttribute("href")));
        return listUrl;
    }

    public ElementsCollection getSearchResultsElements() {
        return hrefs;
    }

    public SelenideElement getSearchingResultsText() {
        return searchingResultsText;
    }

}
