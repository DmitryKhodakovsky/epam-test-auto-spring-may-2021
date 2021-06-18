package ru.training.at.selenium.lesson4.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import ru.training.at.selenium.lesson4.page.YandexMarketCatalogItemPage;
import ru.training.at.selenium.lesson4.page.YandexMarketCategoryPage;
import ru.training.at.selenium.lesson4.page.YandexMarketCompareProductPage;
import ru.training.at.selenium.lesson4.page.YandexMarketIndexPage;

public abstract class AbstractStep {

    YandexMarketIndexPage yandexMarketIndexPage;
    YandexMarketCategoryPage yandexMarketCategoryPage;
    YandexMarketCatalogItemPage yandexMarketCatalogItemPage;
    YandexMarketCompareProductPage yandexMarketCompareProductPage;

    protected AbstractStep(WebDriver driver) {
        yandexMarketIndexPage = new YandexMarketIndexPage(driver);
        yandexMarketCategoryPage = new YandexMarketCategoryPage(driver);
        yandexMarketCatalogItemPage = new YandexMarketCatalogItemPage(driver);
        yandexMarketCompareProductPage = new YandexMarketCompareProductPage(driver);
    }

    @Step("Открыть домашнюю страницу Яндекс Маркета")
    public void openYandexMarketIndexPage() {
        yandexMarketIndexPage.open();
    }
}
