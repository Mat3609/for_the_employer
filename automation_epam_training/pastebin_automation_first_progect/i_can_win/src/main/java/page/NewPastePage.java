package page;

import model.Paste;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wait.Wait;

public class NewPastePage extends AbstractPage {
    @FindBy(xpath = "//div[@class='notice -success -post-view']")
    WebElement noticeSuccess;

    @FindBy(xpath = "//div[@class='info-top']/h1")
    WebElement pasteNameText;

    @FindBy(xpath = "//div[@class='expire']")
    WebElement pasteExpireText;

    @FindBy(xpath = "//div[@class='left']/a[@class='btn -small h_800']")
    WebElement  syntaxHighlightingText;

    public NewPastePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public NewPastePage openPage() {
        return null;
    }

    public boolean newPasteIsPosted() {
        return noticeSuccess.isDisplayed();
    }

    public boolean newPasteIsCreatedCorrect(Paste paste) {
        return  (nameCorrect(paste.getName()) && expireCorrect(paste.getExpiration()) && syntaxHighlightingCorrect(paste.getSyntaxHighlighting()));

    }

    public boolean nameCorrect(String inputPasteName) {
        Wait.presenceOfElementLocated(By.xpath("//div[@class='info-top']/h1"));
        return pasteNameText.getText().equals(inputPasteName);
    }

    public boolean expireCorrect(String inputPasteExpire) {
        return pasteExpireText.getText().equals(inputPasteExpire);
    }

    public boolean syntaxHighlightingCorrect(String syntaxHighlighting) {
        System.out.println(syntaxHighlightingText.getText());
        return syntaxHighlightingText.getText().equals(syntaxHighlighting);
    }
}
