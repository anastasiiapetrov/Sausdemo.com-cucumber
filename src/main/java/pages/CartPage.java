package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    public SelenideElement checkoutButton = $(byId("checkout"));
}
