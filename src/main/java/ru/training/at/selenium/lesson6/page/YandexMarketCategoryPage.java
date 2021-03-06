package ru.training.at.selenium.lesson6.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YandexMarketCategoryPage extends AbstractBasePage {

    public YandexMarketCategoryPage(WebDriver driver) {
        super(driver);
    }

    public void selectCatalogItemPage(String subCategory) {
        wait.until(ExpectedConditions
                .elementToBeClickable(By.linkText(subCategory)))
                .click();
    }
}
