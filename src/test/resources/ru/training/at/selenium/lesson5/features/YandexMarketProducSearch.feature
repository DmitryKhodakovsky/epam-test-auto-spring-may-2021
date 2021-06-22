Feature: Yandex Market Product search

  Scenario: Product search
    Given I open Yandex Market Home page
    When I search 'iPhone' on Yandex Market
    Then product titles should contain 'iPhone' on Yandex Market Search Result page
