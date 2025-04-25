
  Feature: Get all product from the api

    Scenario: Verify the get api for the products
      Given I hit the url of get products api endpoints
      When I pass the url of products in the request
      Then I recive the responce code as 200