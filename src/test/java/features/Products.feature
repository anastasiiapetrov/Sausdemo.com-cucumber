Feature: Products

  Background:
    When I input "standard_user" to username field
    And I input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory


  @allCardsAreVisible
  Scenario: All cards are visible on the Inventory page
    And I see all product cards
    And All cards have photos
    And All cards have prices


    @openAllCardsAndCheck
  Scenario: All cards are visible on the Inventory page
     And I open all cards and check for every card title, description, price


      @buyAProduct
  Scenario: I buy a Sauce Labs Bolt T-Shirt on the website
      Then I push Add to cart button
      And I open a shopping cart
      When I push checkout button
      Then I enter "John" to first name
      Then I enter "Brick" to last name
      And I enter "539579384" as a zipcode
      And I push Continue button
      Then I push Finish button
      And I have ordered a product
      And header with text "Thank you for your order!" is displayed!
      And the url is https://www.saucedemo.com/checkout-complete.html
      Then url contains "checkout-complete"
