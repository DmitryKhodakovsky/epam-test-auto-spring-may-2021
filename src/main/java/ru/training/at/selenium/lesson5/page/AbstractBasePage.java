package ru.training.at.selenium.lesson5.page;

import org.openqa.selenium.WebDriver;
import ru.training.at.selenium.lesson5.page.component.AbstractComponent;
import ru.training.at.selenium.lesson5.page.component.HeaderComponent;

public class AbstractBasePage extends AbstractComponent {

    private static final String BASE_URL = "https://market.yandex.ru";

    protected HeaderComponent header;

    protected AbstractBasePage(WebDriver driver) {
        super(driver);
        header = new HeaderComponent(driver);
    }

    public void selectCategory(String categoryName) {
        header.selectCategory(categoryName);
    }

    public void sendKeysToSearchInputField(String searchText) {
        header.sendKeysToSearchInputField(searchText);
    }

    public void clickToSearchButton() {
        header.clickToSearchButton();
    }

    protected void open(String url) {
        driver.navigate().to(BASE_URL + url);
    }
}
