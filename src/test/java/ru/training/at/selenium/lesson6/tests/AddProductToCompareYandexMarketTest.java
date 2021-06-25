package ru.training.at.selenium.lesson6.tests;

import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * Test checks that all selected products was added to compare list correctly
 */
public class AddProductToCompareYandexMarketTest extends AbstractBaseSeleniumTest {

    @DataProvider
    public Object[][] categoriesSubCategoriesDataSet() {
        return new Object[][]{
                {"Электроника", "Смартфоны"},
                {"Бытовая техника", "Холодильники"},
                {"Дача", "Газонокосилки"}
        };
    }

    @Test(dataProvider = "categoriesSubCategoriesDataSet",
            description = "Проварка добавления товаров к сравнению")
    public void addProductToCompareTest(String categoryName, String subCategoryName) {
        // 1. Открыть Яндекс маркет
        actionStep.openYandexMarketIndexPage();

        // 2. Выбрать категорию "Компьютеры"
        // 3. Выбрать подкатегорию "Ноутбуки"
        actionStep.openCategoryAndSubCategoryYandexMarket(categoryName, subCategoryName);

        // 4. Добавить первый товар к сравнению
        // 5. добавить второй товар к сравнению
        // 6. Нажать на кнопку сравнить товары
        List<String> selectedProductNames = actionStep.addProductToCompareList(1, 2, 3);

        //7. Проверить, что выбранные товары были добавлены к сравнению
        assertionStep.selectedProductsShouldBeAddedToTheCompareList(selectedProductNames);
    }

}
