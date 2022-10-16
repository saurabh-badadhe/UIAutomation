Feature: Search for Products

@searchProduct
Scenario Outline: Search Experience for product search in both home and offers page

Given user is on GreenCart Landing page
When user searched with shortname <name> and extracted actual name of product
Then user searched for same shortname <name> in the offers page to check if product exist

Examples:
|name	|
|tom	|
|beet	|