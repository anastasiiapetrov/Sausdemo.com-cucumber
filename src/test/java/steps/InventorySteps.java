package steps;


import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static org.junit.Assert.assertEquals;



public class InventorySteps extends BaseSteps{


    @And("^I see all product cards$")
    public void iSeeAllProductCards() {
        for (SelenideElement card:
                inventoryPage.productCards) {
            card.shouldBe(visible);
        }
    }

    @And("^All cards have photos$")
    public void allCardsHavePhotos() {
        for (SelenideElement img:
                inventoryPage.imgOfProductCards) {
            img.shouldBe(visible).isImage();
        }
    }

    @And("^All cards have prices$")
    public void allCardsHavePrices() {
        for (SelenideElement price:
                inventoryPage.pricesOfProductCards) {
          //price.shouldHave(cssClass("inventory_item_price"));
          price.shouldNotBe(empty);
        }
    }


    @Then("^I push Add to cart button$")
    public void iPushAddToCartButton() {
        inventoryPage.addToCartForTShirt.click();
    }

    @And("^I open a shopping cart$")
    public void iOpenAShoppingCart() {
        inventoryPage.shopContainer.click();
    }

    @When("^I choose sorting option A-Z$")
    public void iChooseSortingOptionAZ() {
        inventoryPage.sortDropdown.click();
        inventoryPage.optionAZ.shouldBe(visible).click();

    }

    @Then("^all items names are sorted alphabetically$")
    public void allItemsNamesAreSortedAlphabetically() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement name : inventoryPage.itemNames) {
            actualNames.add(name.getText());
        }
        System.out.println(actualNames);
        List<String>expectedNames = new ArrayList<>(actualNames);
        Collections.sort(expectedNames);
        assertEquals(actualNames, expectedNames);
    }

    @When("^I choose sorting option Z-A$")
    public void iChooseSortingOptionZA() {
        inventoryPage.sortDropdown.click();
        inventoryPage.optionZA.shouldBe(visible).click();
    }

    @Then("^all items names are sorted reverse alphabetically$")
    public void allItemsNamesAreSortedReverseAlphabetically() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement name : inventoryPage.itemNames) {
            actualNames.add(name.getText());
        }
        System.out.println(actualNames);
        List<String>expectedNames = new ArrayList<>(actualNames);
        Collections.sort(expectedNames, Collections.reverseOrder());
        assertEquals(actualNames, expectedNames);
    }

    @When("^I choose sorting option price low to high$")
    public void iChooseSortingOptionPriceLowToHigh() {
        inventoryPage.sortDropdown.click();
        inventoryPage.optionLowToHigh.shouldBe(visible).click();
    }

    @Then("^all item prices are in ascending order$")
    public boolean allItemPricesAreInAscendingOrder() {
        List<Double> actualPrices = new ArrayList<>();
        for (SelenideElement price : inventoryPage.itemPrices) {
            actualPrices.add(Double.parseDouble(price.getText().replaceAll("[^0-9.]", "")));}

        System.out.println(actualPrices);
        List<Double>expectedPrices = new ArrayList<Double>(actualPrices);
        Collections.sort(expectedPrices);
        return actualPrices.equals(expectedPrices);
    }

    @When("^I choose sorting option price high to low$")
    public void iChooseSortingOptionPriceHighToLow() {
        inventoryPage.sortDropdown.click();
        inventoryPage.optionHighToLow.shouldBe(visible).click();
    }

    @Then("^all item prices are in descending order$")
    public boolean allItemPricesAreInDescendingOrder() {
        List<Double> actualPrices = new ArrayList<>();
        for (SelenideElement price : inventoryPage.itemPrices) {
            actualPrices.add(Double.parseDouble(price.getText().replaceAll("[^0-9.]", "")));}

        System.out.println(actualPrices);
        List<Double>expectedPrices = new ArrayList<Double>(actualPrices);
        expectedPrices.sort(Collections.reverseOrder());
        return actualPrices.equals(expectedPrices);
    }
}
