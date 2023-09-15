package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byId;

public class SideBar {
    public SelenideElement logoutLink = $(byId("logout_sidebar_link"));

}
