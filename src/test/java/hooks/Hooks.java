package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void setUp(){
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        open("https://www.saucedemo.com/");
        clearBrowserCookies();
        clearBrowserLocalStorage();
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }
}
