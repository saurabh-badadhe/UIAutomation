Feature: To seach and order product

@orderProduct
Scenario Outline: To search product and increasing the quantity in landing page and validation in checkout page

Given user is on GreenCart Landing page
When user searched with shortname <product> and extracted actual name of product
And user added <quantity> quantity of product
And user added product to cart
Then goes to the checkout page
And check the product is present in the checkOut page
And Apply and Placeorder button are present

Examples:
|product |quantity|
|Tom	 |3		  |
|Beet	 |4		  |