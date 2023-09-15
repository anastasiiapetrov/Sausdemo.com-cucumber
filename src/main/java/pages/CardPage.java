package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byId;

public class CardPage {
    public SelenideElement backToInventory = $(byId("back-to-products"));
    public SelenideElement cardName = $(byClassName("inventory_details_name"));
    public SelenideElement priceName = $(byClassName("inventory_details_price"));
    public SelenideElement descCard = $(byClassName("inventory_details_desc"));

    public void closeCard(){
       backToInventory.click();
    }
    public String getTitleCard(){
        return cardName.getText();
    }

    public void checkVisibilityPrice(){
        priceName.shouldBe(Condition.visible);
    }
    public void checkVisibilityDesc(){
        descCard.shouldBe(Condition.visible);
    }
}
