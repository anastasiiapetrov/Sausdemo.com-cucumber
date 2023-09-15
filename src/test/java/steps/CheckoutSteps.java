package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static org.junit.Assert.assertTrue;

public class CheckoutSteps extends BaseSteps{
   /* @Then("^I fill all fields on checkout page$")
    public void iFillAllFieldsOnCheckoutPage() {
        checkoutPage.firstNameField.setValue("John");
        checkoutPage.lastNameField.setValue("Brick");
        checkoutPage.zipField.setValue("5353523");
    }*/

    @And("^I push Continue button$")
    public void iPushContinueButton() {
        checkoutPage.continueButton.click();
    }

    @Then("^I push Finish button$")
    public void iPushFinishButton() {
        checkoutPage.finishButton.click();
    }

    @And("^I have ordered a product$")
    public void iHaveOrderedAProduct() {
        checkoutPage.checkoutComplete.shouldBe(visible);
    }

    @Then("^I enter \"([^\"]*)\" to first name$")
        public void enterToFirstName(String firstNameValue){
            checkoutPage.firstNameField.setValue(firstNameValue);
        }

    @Then("^I enter \"([^\"]*)\" to last name$")
        public void enterToLastName(String lastNameValue)  {
            checkoutPage.lastNameField.setValue(lastNameValue);
        }


    @And("^I enter \"([^\"]*)\" as a zipcode$")
    public void iEnterAsAZipcode(String zipCodeValue) {
        checkoutPage.zipField.setValue(zipCodeValue);
        }

    @And("^header with text \"([^\"]*)\" is displayed!$")
    public void headerWithTextIsDisplayed(String  expectedText)  {
        checkoutPage.header.shouldBe(visible).shouldHave(text(expectedText));
    }


    @And("^the url is https://www\\.saucedemo\\.com/checkout-complete\\.html$")
    public void theUrlIs()  {
        webdriver().shouldHave(url("https://www.saucedemo.com/checkout-complete.html"));
    }

    @Then("^url contains \"([^\"]*)\"$")
    public void urlContains(String urlText)  {
        assertTrue(WebDriverRunner.getWebDriver().getCurrentUrl().contains(urlText));

    }
}


