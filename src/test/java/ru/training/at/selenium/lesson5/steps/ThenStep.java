package ru.training.at.selenium.lesson5.steps;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Then;
import java.util.List;
import org.assertj.core.api.SoftAssertions;
import ru.training.at.selenium.lesson5.context.TestContext;

public class ThenStep extends AbstractStep {

    @Then("^product titles should contain '(.+)' on Yandex Market Search Result page$")
    public void productTitleShouldContainInYandexMarketSearchResultPage(String expectedProductTitle) {
        List<String> productNames = yandexMarketCatalogItemPage.getProductNames();

        SoftAssertions softAssertions = new SoftAssertions();
        productNames.forEach(productName ->
            softAssertions.assertThat(productName)
                          .as("Проверка что поисковый текст присутствует в заголовке продукта")
                          .contains(expectedProductTitle));
        softAssertions.assertAll();
    }

    @Then("added titles should be visible on Compare page")
    public void selectedProductsShouldBeAddedToTheCompareList() {
        List<String> expectedProducts = TestContext.getInstance().getTestObject("compare_products");
        List<String> actualProducts = yandexMarketCompareProductPage.getProductNames();

        assertThat(actualProducts)
            .as("Проверка что выбранные товары добавлены в список сравнения")
            .containsExactlyInAnyOrderElementsOf(expectedProducts);
    }
}
