package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    public SelenideElement firstNameField= $(byId("first-name"));
    public SelenideElement lastNameField= $(byId("last-name"));
    public SelenideElement zipField= $(byId("postal-code"));
    public SelenideElement continueButton = $(byId("continue"));
    public SelenideElement finishButton = $(byId("finish"));
    public SelenideElement checkoutComplete = $(byId("checkout_complete_container"));
    public SelenideElement header = $(byClassName("complete-header"));

}
