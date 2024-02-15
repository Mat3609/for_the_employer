package ui.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class CalculatorComputeEnginePage extends AbstractPage {
    private static final String URL = "https://cloud.google.com/products/calculator?hl=ru&dl=CiQ" +
            "4MDhlZGEzMy02MjJhLTQzN2ItODQ4Zi1kZjE2YTFjZWVmZmQQCBokNzJFMTgwNzctQ0FERS00MkIxLUI0OEYtQzVGQjMxQzkxM0U3";
    private final SelenideElement cookiesWindow = $x("//div[@class='FvX1Me']");
    private final SelenideElement instancesBtn = $x("//li[@data-708c49e2-dcf0-4d62-b457-88577bfe3081='Instances']");
    private final SelenideElement machineTypeDropdown = $x("//div[@jsname='kgDJk']");
    private final SelenideElement machineTypeBtn = $x("//li[@data-value='n1-standard-8']");
    private final SelenideElement adGPUsButton = $x("//button[@aria-label='Add GPUs']");
    private final SelenideElement numberOfGPUsDropDown = $x("//div[@data-field-type='174']");
    private final SelenideElement numberOfGPUBtn = $x("//li[@data-value='1']");
    private final SelenideElement gpuModelDropdown = $x("//div[@data-field-type='158']");
    private final SelenideElement gpuModelBtn = $x("//li[@data-value='nvidia-tesla-v100']");
    private final SelenideElement localSSDTypeDropdown = $x("//div[@data-field-type='180']");
    private final SelenideElement ssdTypeBtn = $x("//span[text()='2x375 GB']/../..");
    private final SelenideElement regionDropdown = $x("//div[@data-field-type='115']");
    private final SelenideElement regionEuropeWest4Btn = $x("//li[@data-value='europe-west4']");
    private final SelenideElement setTypeTimeDropdown = $x("//div[@aria-controls='i9']");
    private final SelenideElement setDaysBtn = $x("//li[@data-value='5']");
    private final SelenideElement setAmountDaysField = $x("//input[@aria-labelledby='ucj-7']");
    private final SelenideElement instancesArea = $x("//div[@class='LLIbVd']");
    private final SelenideElement openDetailedViewBtn = $x("//a[@aria-label='Open detailed view']");
    private final SelenideElement estimatedCost = $x("//label[@class='gt0C8e MyvX5d']");



    public CalculatorComputeEnginePage openPage() {
        Selenide.open(URL);
        return this;
    }

    public CalculatorComputeEnginePage fillInTheFields() {
        setCommitUsage("365")
                .machineType()
                .addGPUs()
                .setLocalSSD()
                .setDataCenterLocation();
        return this;
    }

    public CalculatorComputeEnginePage setInstances() {
        instancesArea.click();
        instancesBtn.click();
        return this;
    }

    public CalculatorComputeEnginePage machineType() {
        machineTypeDropdown.click();
        machineTypeBtn.click();
        return this;
    }

    public CalculatorComputeEnginePage addGPUs() {
        adGPUsButton.click();
        gpuModelDropdown.click();
        gpuModelBtn.click();
        numberOfGPUsDropDown.click();
        numberOfGPUBtn.click();
        return this;
    }

    public CalculatorComputeEnginePage setLocalSSD() {
        localSSDTypeDropdown.click();
        ssdTypeBtn.click();
        return this;
    }

    public CalculatorComputeEnginePage setDataCenterLocation() {
        regionDropdown.click();
        regionEuropeWest4Btn.click();
        return this;
    }

    public CalculatorComputeEnginePage setCommitUsage(String  days) {
        setTypeTimeDropdown.click();
        setDaysBtn.click();
        setAmountDaysField.clear();
        setAmountDaysField.setValue(days);
        return this;
    }

    public DetailedViewPage openDetailedViewPage() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        openDetailedViewBtn.click();
        Selenide.switchTo().window(1);
        return new DetailedViewPage();
    }

    public String getEstimatedCost() {
        return estimatedCost.getText().replaceAll("[^0-9.,]", "");
    }
}
