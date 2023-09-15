package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.When;



public class SideBarSteps extends BaseSteps {

    @When("^I follow the Logout link$")
    public void iFollowTheLogoutLink() {
        sideBar.logoutLink.shouldBe(Condition.visible);
        sideBar.logoutLink.click();
    }
    }
