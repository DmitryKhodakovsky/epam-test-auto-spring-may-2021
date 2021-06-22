package ru.training.at.selenium.lesson5.steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import ru.training.at.selenium.lesson5.context.TestContext;

public class WhenStep extends AbstractStep {

    @When("I search {string} on Yandex Market")
    public void searchItemOnYandexMarket(String productName) {
        yandexMarketIndexPage.sendKeysToSearchInputField(productName);
        yandexMarketIndexPage.clickToSearchButton();
    }

    @When("I open {string} from {string} on Yandex Market Home page")
    public void openSubcategoryFromCategory(String subCategoryName, String categoryName) {
        yandexMarketIndexPage.selectCategory(categoryName);
        yandexMarketCategoryPage.selectCatalogItemPage(subCategoryName);
    }

    @ParameterType("'(.+)'")
    public List<Integer> productIndexes(String indexes) {
        return Arrays.stream(indexes.split(","))
            .map(index -> Integer.parseInt(index.trim()))
            .collect(Collectors.toList());
    }

    @When("I add {productIndexes} products to Compare List on Yandex Market Item page")
    public void  addProductsToCompareListOnItemPage(List<Integer> productIndexes) {
        List<String> products = new ArrayList<>();

        for (int productIndex : productIndexes) {
            products.add(yandexMarketCatalogItemPage.addProductToCompare(productIndex));
        }

        TestContext.getInstance().addTestObject("compare_products", products);

        yandexMarketCatalogItemPage.clickCompareButton();
    }
}
