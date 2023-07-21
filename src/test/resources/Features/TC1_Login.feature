@LoginHotel
Feature: Verifying OMR Branch hotel Login Automation

  Scenario Outline: verifying login with valid credintals
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"

    Examples: 
      | userName                | password   |
      | sowmiyaec2015@gmail.com | Sowmi@1999 |

  Scenario Outline: Login with Robot_with help of keyboard actions
    Given User on the OMR Branch hotel page
    When User login using keyboard actions enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"

    Examples: 
      | userName                | password   |
      | sowmiyaec2015@gmail.com | Sowmi@1999 |

  Scenario Outline: verifying login with invalid credintals
    Given User on the OMR Branch hotel page
    When User login"<userName>" and "<password>"
    Then User Should verify error message after login "invalid Login details or your password might have"

    Examples: 
      | userName                | password    |
      | sowmiyaec2015@gmail.com | Sowmi@1999d |
