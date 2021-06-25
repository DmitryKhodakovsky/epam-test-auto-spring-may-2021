package ru.training.at.selenium.demo.parallel.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.training.at.selenium.demo.parallel.steps.ActionStep;
import ru.training.at.selenium.demo.parallel.steps.AssertionStep;
import ru.training.at.selenium.lesson6.driver.WebDriverSingleton;

public class AbstractBaseSeleniumTest {

    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    ActionStep actionStep;
    AssertionStep assertionStep;

    @BeforeSuite
    public void setUpSuite() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp(ITestContext testContext) {
        driver.set(new ChromeDriver());

        actionStep = new ActionStep(driver.get());
        assertionStep = new AssertionStep(driver.get());
        testContext.setAttribute("driver", driver.get());
    }

    @AfterMethod
    public void tearDown() {
        driver.get().quit();
    }
}
