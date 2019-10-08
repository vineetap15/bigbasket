Feature: Verify the payment success

User should be able to complete the payment successfully

@paymentSuccess
Scenario:
    Given User selects a category
    When User adds  the product in his basket 
    Then user should be able to complete the payment
