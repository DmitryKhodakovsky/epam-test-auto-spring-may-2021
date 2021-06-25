package ru.training.at.selenium.lesson6.page;

import org.openqa.selenium.WebDriver;

public class YandexMarketIndexPage extends AbstractBasePage {

    public YandexMarketIndexPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        open("");
    }
}
