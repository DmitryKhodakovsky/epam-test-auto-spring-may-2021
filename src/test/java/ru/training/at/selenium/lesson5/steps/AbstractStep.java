package ru.training.at.selenium.lesson5.steps;

import ru.training.at.selenium.lesson5.driver.WebDriverSingleton;
import ru.training.at.selenium.lesson5.page.YandexMarketCatalogItemPage;
import ru.training.at.selenium.lesson5.page.YandexMarketCategoryPage;
import ru.training.at.selenium.lesson5.page.YandexMarketCompareProductPage;
import ru.training.at.selenium.lesson5.page.YandexMarketIndexPage;

public abstract class AbstractStep {

    protected YandexMarketIndexPage yandexMarketIndexPage;
    protected YandexMarketCategoryPage yandexMarketCategoryPage;
    protected YandexMarketCatalogItemPage yandexMarketCatalogItemPage;
    protected YandexMarketCompareProductPage yandexMarketCompareProductPage;

    protected AbstractStep() {
        yandexMarketIndexPage = new YandexMarketIndexPage(WebDriverSingleton.getDriver());
        yandexMarketCatalogItemPage = new YandexMarketCatalogItemPage(WebDriverSingleton.getDriver());
        yandexMarketCategoryPage = new YandexMarketCategoryPage(WebDriverSingleton.getDriver());
        yandexMarketCompareProductPage = new YandexMarketCompareProductPage(WebDriverSingleton.getDriver());
    }
}
