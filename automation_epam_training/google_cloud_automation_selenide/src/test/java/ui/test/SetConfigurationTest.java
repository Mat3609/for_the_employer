package ui.test;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.page.DetailedViewPage;
import ui.page.CalculatorComputeEnginePage;
import java.util.HashMap;
import java.util.Map;


public class SetConfigurationTest extends BaseTest {

    @Description("Set configuration, open 'DetailedViewPage' compare entered data with actual data")
    @Test
    public void complianceOfTheFieldData() {
        Map<String, String> expectedAttributes = new HashMap<String, String>(){{
            put(DetailedViewPage.PROVISION_MODEL, "Regular");
            put(DetailedViewPage.MACHINE_TYPE, "n1-standard-8, vCPUs: 8, RAM: 30 GB");
            put(DetailedViewPage.REGION, "Netherlands (europe-west4)");
            put(DetailedViewPage.LOCAL_SSD, "2x375 GB");
            put(DetailedViewPage.INSTANCE_TYPE, "365 Days");
            put(DetailedViewPage.GPU_MODEL, "NVIDIA Tesla V100");
        }};

        Map<String, String> actualAttributes = new CalculatorComputeEnginePage()
                .openPage()
                .fillInTheFields()
                .openDetailedViewPage()
                .getAttributes();

        Assert.assertEquals(actualAttributes, expectedAttributes);
    }

    @Description("Set configuration, open 'DetailedViewPage' compare actual cost with cost given the test manually")
    @Test
    public void theMonthlyRentalAmountIsTheSameAsTheAmountReceivedWhenPassingTheTestManually() {
        String expectedCost = "26,805.18";
        String actualCost = new CalculatorComputeEnginePage()
                .openPage()
                .fillInTheFields()
                .openDetailedViewPage()
                .getEstimatedCost();

        Assert.assertEquals(actualCost, expectedCost);
    }


}
