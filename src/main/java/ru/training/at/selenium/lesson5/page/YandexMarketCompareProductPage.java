package ru.training.at.selenium.lesson5.page;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexMarketCompareProductPage extends AbstractBasePage {

    @FindBy(css = "[data-tid='412661c'] a.cia-cs")
    private List<WebElement> comparedProducts;

    public YandexMarketCompareProductPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getProductNames() {
        return comparedProducts
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}
