package steps;

import cucumber.api.java.en.When;

public class CartSteps extends BaseSteps {
    @When("^I push checkout button$")
    public void iPushCheckoutButton() {
        cartPage.checkoutButton.click();
    }
}
