package ru.training.at.selenium.lesson6.steps;

import io.qameta.allure.Step;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;

public class ActionStep extends AbstractStep {
    public ActionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Открыть категорию '{categoryName}' и подкатегорию '{1}'")
    public void openCategoryAndSubCategoryYandexMarket(String categoryName, String subCategoryName) {
        yandexMarketIndexPage.selectCategory(categoryName);
        yandexMarketCategoryPage.selectCatalogItemPage(subCategoryName);
    }

    @Step("Сравнить товары")
    public List<String> addProductToCompareList(int... productIndexes) {
        List<String> products = new ArrayList<>();

        for (int productIndex : productIndexes) {
            products.add(yandexMarketCatalogItemPage.addProductToCompare(productIndex));
        }

        yandexMarketCatalogItemPage.clickCompareButton();

        return products;
    }

    @Step("Поиск '{productName}'")
    public void searchProduct(String productName) {
        yandexMarketIndexPage.sendKeysToSearchInputField(productName);
        yandexMarketIndexPage.clickToSearchButton();
    }
}
