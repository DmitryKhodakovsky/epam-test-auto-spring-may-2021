Feature: Add Product to Compare Yandex Market

  Scenario Outline: Add product to compare from <category> -> <subcategory>
    Given I open Yandex Market Home page
    And I open '<subcategory>' from '<category>' on Yandex Market Home page
    When I add '1, 2, 3' products to Compare List on Yandex Market Item page
    Then added titles should be visible on Compare page

    Examples:
      | category        | subcategory   |
      | Электроника     | Смартфоны     |
      | Бытовая техника | Холодильники  |
      | Дача            | Газонокосилки |
