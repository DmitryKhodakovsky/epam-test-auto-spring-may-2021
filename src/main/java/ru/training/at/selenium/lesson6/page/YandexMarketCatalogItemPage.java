package ru.training.at.selenium.lesson6.page;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.training.at.selenium.lesson6.page.component.ProductCardComponent;

public class YandexMarketCatalogItemPage extends AbstractBasePage {

    @FindBy(css = "[data-autotest-id='product-snippet']")
    private List<WebElement> products;

    @FindBy(xpath = ".//span[text()='Сравнить']")
    private WebElement compareButton;

    public YandexMarketCatalogItemPage(WebDriver driver) {
        super(driver);
    }

    public String addProductToCompare(int index) {
        return addProductToCompare(new ProductCardComponent(driver, products.get(index - 1)));
    }

    private String addProductToCompare(ProductCardComponent productCard) {
        productCard.clickToAddToCompareButton();
        return productCard.getProductName();
    }

    public void clickCompareButton() {
        wait.until(elementToBeClickable(compareButton)).click();
    }

    public List<String> getProductNames() {
        return products
                .stream()
                .map(product -> new ProductCardComponent(driver, product))
                .collect(Collectors.toList())
                .stream()
                .map(ProductCardComponent::getProductName)
                .collect(Collectors.toList());
    }
}
