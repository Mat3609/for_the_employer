package ui.test;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.page.GoogleCloudHomePage;
import ui.page.SearchingResultsPage;


import java.util.List;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;


public class GoogleCloudSearchResultsTest extends BaseTest {

    @Description("Verify the transition from the main page to the search results page")
    @Test
    public void searchResultsPageOpenedSuccessfully() {
        String searchQuery = "Google Cloud Platform Pricing Calculator";
        String text = new GoogleCloudHomePage()
                .openPage()
                .search(searchQuery)
                .getSearchingResultsText().getText();
        System.out.println(text);

    }

    @Description("Verify that query results not empty")
    @Test
    public void searchResultsNotEmpty() {
        ElementsCollection searchResults = new SearchingResultsPage()
                .openPage()
                .getSearchResultsElements();

        System.out.println(searchResults.size());
        searchResults.shouldHave(sizeGreaterThan(0));
    }


    @Description("Verify that search results can be opened")
    @Test
    public void searchResultsCanBeOpened() {
        List<String> listUrls = new SearchingResultsPage()
                .openPage()
                .getSearchResultsUrls();

        for (String url : listUrls) {
            Selenide.open(url);
            String currentAddressBarUrl = WebDriverRunner.getWebDriver().getCurrentUrl()
                    .replaceAll("\\?.*$", "");

            Assert.assertEquals(currentAddressBarUrl, url);
        }
    }

    @Description("Verify that search results visible")
    @Test
    public void searchResultsVisible() {
        ElementsCollection elements = new SearchingResultsPage()
                .openPage()
                .getSearchResultsElements();
        elements.forEach(x -> x.should(visible));
    }

}
