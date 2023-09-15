Feature: Inventory page

  Background:
    When I input "standard_user" to username field
    And I input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory


@sorting-1
  Scenario: Sorting by name A-Z
    When I choose sorting option A-Z
    Then all items names are sorted alphabetically

  @sorting-2
  Scenario: Sorting by name Z-A
    When I choose sorting option Z-A
    Then all items names are sorted reverse alphabetically


  @sorting-3
  Scenario: Sorting by price low to high
    When I choose sorting option price low to high
    Then all item prices are in ascending order

  @sorting-4
  Scenario: Sorting by price high to low
    When I choose sorting option price high to low
    Then all item prices are in descending order


