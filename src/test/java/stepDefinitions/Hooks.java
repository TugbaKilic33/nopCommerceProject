package stepDefinitions;

import io.cucumber.java.After;
import utilities.GWD;

public class Hooks {
    @After
    public void after() {
        GWD.quitDriver();
    }
}
