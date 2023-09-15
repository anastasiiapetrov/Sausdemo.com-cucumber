package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class InventoryPage {
    public SelenideElement inventoryList = $(byClassName("inventory_list"));
    public ElementsCollection productCards = $$x("//div[@class='inventory_item']");
    public ElementsCollection imgOfProductCards = $$x("//img[@class='inventory_item_img']");
    public ElementsCollection pricesOfProductCards = $$(byClassName("inventory_item_price"));
    public SelenideElement addToCartForTShirt = $(byId("add-to-cart-sauce-labs-bolt-t-shirt"));
    public SelenideElement shopContainer = $(byClassName("shopping_cart_container"));
    public SelenideElement sortDropdown = $("[data-test='product_sort_container']");
    public SelenideElement optionAZ = $x("//option[@value='az']");
    public SelenideElement optionZA = $x("//option[@value='za']");
    public ElementsCollection itemNames = $$(byClassName("inventory_item_name"));
    public SelenideElement optionLowToHigh = $x("//option[@value='lohi']");
    public SelenideElement optionHighToLow = $x("//option[@value='hilo']");
    public ElementsCollection itemPrices = $$(byClassName("inventory_item_price"));



    public void openCard (String cardName){
        $x("//div[normalize-space()='"+cardName+"']").click();
    }


}
