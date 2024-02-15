package page;

import model.Paste;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wait.Wait;

public class HomePage extends AbstractPage {
    protected static final String HOMEPAGE_URL = "https://pastebin.com/";

    @FindBy(id = "postform-text")
    private WebElement textArea;

    @FindBy(id = "select2-postform-expiration-container")
    private WebElement expirationDropdown;

    @FindBy(xpath = "//li[text()='10 Minutes']")
    private WebElement expiration10MinutesBtn;

    @FindBy(id = "postform-name")
    private WebElement name;

    @FindBy(xpath = "//button[text()='Create New Paste']")
    private WebElement createPasteBtn;

    @FindBy(xpath = "//span[@id='select2-postform-format-container']")
    private WebElement syntaxHighlightingDropDown;

    @FindBy(xpath = "//li[text()='Bash']")
    private WebElement syntaxHighlightingBushBtn;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public HomePage fillInTheFields(Paste paste) {
        createContent(paste.getContent());
        fillInExpiration();
        fillInSyntaxHighlighting();
        fillInName(paste.getName());
        return this;
    }

    public HomePage createContent(String content) {
        textArea.sendKeys(content);
        return this;
    }

    public HomePage fillInExpiration() {
        Wait.elementToBeClickable(expirationDropdown);
        expirationDropdown.click();
        Wait.elementToBeClickable(expiration10MinutesBtn);
        expiration10MinutesBtn.click();
        return this;
    }

    public HomePage fillInName(String pasteName) {
        name.sendKeys(pasteName);
        return this;
    }

    public HomePage fillInSyntaxHighlighting() {
        Wait.elementToBeClickable(syntaxHighlightingDropDown).click();
        Wait.elementToBeClickable(syntaxHighlightingBushBtn);
        syntaxHighlightingBushBtn.click();
        return this;
    }

    public NewPastePage createPaste() {

        createPasteBtn.click();
        return new NewPastePage(driver);
    }




}
