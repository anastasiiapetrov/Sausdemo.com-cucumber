package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;

public class CommonSteps extends BaseSteps{
    @Then("^I am on the page Inventory$")
    public void iAmOnThePageInventory() {
       inventoryPage.inventoryList.shouldBe(Condition.visible);

    }
}
