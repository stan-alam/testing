Feature: PurchaseTaco

    Scenario: Purchase a Taco 
        Given the price of a "taco" is 1.25 USD
        When I checkout 1 "taco"
        Then the total price should be 1.25 USD