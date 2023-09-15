package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class LoginSteps extends BaseSteps {

    @Given("^I open Login page$")
    public void iOpenLoginPage() {
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        open("https://www.saucedemo.com/");
    }


    @When("^I input \"([^\"]*)\" to username field$")
    public void iInputToUsernameField(String usernameValue) {
        loginPage.usernameInputField.setValue(usernameValue);

    }

    @And("^I input \"([^\"]*)\" to password field$")
    public void iInputToPasswordField(String passwordValue)  {
        loginPage.passwordInputField.setValue(passwordValue);
    }


    @When("^I push the Login button$")
    public void iPushTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("^I see errorMessage \"([^\"]*)\"$")
    public void iSeeErrorMessage(String errorMessage)  {
        loginPage.errorMessage.shouldHave(Condition.partialText(errorMessage));
    }


    @Then("^I am on the Login page$")
    public void iAmOnTheLoginPage() {
        loginPage.loginButton.shouldBe(visible);
    }
}
