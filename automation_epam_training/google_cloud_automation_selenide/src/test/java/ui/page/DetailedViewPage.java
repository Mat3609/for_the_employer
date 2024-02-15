package ui.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.util.HashMap;
import java.util.Map;
import static com.codeborne.selenide.Selenide.$x;

public class DetailedViewPage extends AbstractPage {
    private static final String URL = "https://cloud.google.com/products/calculator/estimate-preview/cec8acaa-99eb-40f2-8e55-e132c4e71edc";
    private final SelenideElement provisioningModel = $x("//span[text()='Provisioning Model']/following-sibling::*[1]");
    private final SelenideElement machineType = $x("//span[text()='Machine type']/following-sibling::*[1]");
    private final SelenideElement region = $x("//span[text()='Region']/following-sibling::*[1]");
    private final SelenideElement localSSD = $x("//span[text()='Local SSD']/following-sibling::*[1]");
    private final SelenideElement instanceType = $x("//span[text()='Instance-time']/following-sibling::*[1]");
    private final SelenideElement estimatedCost = $x("//h4[@class='n8xu5 Nh2Phe']");
    private final SelenideElement GPUModel = $x("//span[text()='GPU Model']/following-sibling::*[1]");

    public static final String PROVISION_MODEL = "Provisioning Model";
    public static final String MACHINE_TYPE = "Machine type";
    public static final String REGION = "Region";
    public static final String LOCAL_SSD = "Local SSD";
    public static final String INSTANCE_TYPE = "Instance-type";
    public static final String GPU_MODEL = "GPU Model";


    @Override
    public DetailedViewPage openPage() {
        Selenide.open(URL);
        return this;
    }


    public Map<String, String> getAttributes() {
        return new HashMap<String, String>(){{
            put(PROVISION_MODEL, getProvisioningModel());
            put(MACHINE_TYPE, getMachineType());
            put(REGION, getRegion());
            put(LOCAL_SSD, getSSD());
            put(INSTANCE_TYPE, getInstanceType());
            put(GPU_MODEL, getGPUModel());
        }};
    }



    public String getProvisioningModel() {return provisioningModel.getText();}
    public String getMachineType() {
        return machineType.getText();
    }
    public String getRegion() {
        return region.getText();
    }
    public String getSSD() {
        return localSSD.getText();
    }
    public String getInstanceType() {
        return instanceType.getText();
    }
    public String getGPUModel() {
        return GPUModel.getText();
    }



    public String getEstimatedCost() {
        return estimatedCost.getText().replaceAll("[^0-9.,]", "");
    }
}
