package steps;

import cucumber.api.java.en.And;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class CardSteps extends BaseSteps{

    @And("^I open all cards and check for every card title, description, price$")
    public void openAndCheckCard(){
        List<String> cardNames = new ArrayList<>();
        cardNames.add("Sauce Labs Backpack");
        cardNames.add("Sauce Labs Bike Light");
        cardNames.add("Sauce Labs Bolt T-Shirt");
        cardNames.add("Sauce Labs Fleece Jacket");
        cardNames.add("Sauce Labs Onesie");
        cardNames.add("Test.allTheThings() T-Shirt (Red)");

        for (String cardName: cardNames
             ) {
            inventoryPage.openCard(cardName);
            String titleCard = cardPage.getTitleCard();
            Assert.assertEquals(titleCard, cardName);
            cardPage.checkVisibilityDesc();
            cardPage.checkVisibilityPrice();
            cardPage.closeCard();
        }
    }





}
