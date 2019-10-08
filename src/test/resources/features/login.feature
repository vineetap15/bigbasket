Feature: Verify the login success

User should be able to login successfully

@loginSuccess
Scenario:
    Given User enter email "vineetapandey24194@gmail.com" and otp
    When user click the login button
    Then User should be redirected to home screen "https://www.bigbasket.com/"
