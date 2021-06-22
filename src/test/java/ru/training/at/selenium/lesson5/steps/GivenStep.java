package ru.training.at.selenium.lesson5.steps;

import io.cucumber.java.en.Given;

public class GivenStep extends AbstractStep {

    @Given("I open Yandex Market Home page")
    public void openYandexMarketHomePage() {
        yandexMarketIndexPage.open();
    }
}
