Feature: Move to cart without adding any item
Scenario: The one where user moves to cart without adding any item in it
Given Alex has registered into TestMeApp
When Alex search a particular product like headphone
And try to proceed to payment without adding any item in the cart
Then TestMeApp doesn't display the cart icon