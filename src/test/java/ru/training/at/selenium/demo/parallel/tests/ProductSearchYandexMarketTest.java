package ru.training.at.selenium.demo.parallel.tests;

import org.testng.annotations.Test;

public class ProductSearchYandexMarketTest extends AbstractBaseSeleniumTest {



    @Test(description = "Тестирование поиска товара")
    public void testProductSearch() {
        // 1. Открыть Яндекс маркет
        actionStep.openYandexMarketIndexPage();

        // 2. Найти заданный товар
        actionStep.searchProduct("iPhone");

        // 3. Проверить что текст присутствует в названии продукта
        assertionStep.searchTextShouldBeExistInResults("iPhone1");
    }
}
