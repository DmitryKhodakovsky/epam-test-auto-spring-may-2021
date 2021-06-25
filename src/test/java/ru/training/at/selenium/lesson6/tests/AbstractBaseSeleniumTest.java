package ru.training.at.selenium.lesson6.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.training.at.selenium.lesson6.driver.WebDriverSingleton;
import ru.training.at.selenium.lesson6.steps.ActionStep;
import ru.training.at.selenium.lesson6.steps.AssertionStep;

public class AbstractBaseSeleniumTest {

    protected WebDriver driver;

    ActionStep actionStep;
    AssertionStep assertionStep;

    @BeforeSuite
    public void setUpSuite() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp(ITestContext testContext) {
        driver = WebDriverSingleton.getDriver();

        actionStep = new ActionStep(driver);
        assertionStep = new AssertionStep(driver);
        testContext.setAttribute("driver", driver);
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSingleton.closeDriver();
    }
}
