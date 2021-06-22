package ru.training.at.selenium.lesson5.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import ru.training.at.selenium.lesson5.context.TestContext;
import ru.training.at.selenium.lesson5.driver.WebDriverSingleton;

public class CucumberHook {

    @Before
    public void initDriver() {
        WebDriverSingleton.getDriver();
    }

    @After
    public void closeDriver() {
        WebDriverSingleton.closeDriver();
        TestContext.getInstance().clean();
    }
}
