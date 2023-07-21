@SelectHotel
Feature: Select the Hotel automation

  Scenario Outline: Select hotel and Verify navigate to book upon accepting the alert
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    And User select hotel enter with values "<select state>","<select city>","<Select Room Type>","<Check-in>","<Check-out>","<No. of rooms>","<No. of adults>" and "<No. of children>"
    Then User Should Verify Sucess message as "Select Hotel" after clicking on search button
    When User select the first hotel and save the hotelname,price
    Then User accept the popup alert and book hotel
    And User should verify the suceess message after booking "Book Hotel"

    Examples: 
      | userName                | password   | select state | select city | Select Room Type                    | Check-in   | Check-out  | no. of rooms | no. of adults | No. of children |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Standard/Deluxe/Suite/Luxury/Studio | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 |

  Scenario Outline: Select hotel and Verify navigating in the same page upon dismiss the alert
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    And User select hotel enter  "<select state>","<select city>","<Select Room Type>","<Check-in>","<Check-out>","<No. of rooms>","<No. of adults>" and "<No. of children>"
    Then User Should Verify Sucess message after search hotel "Select Hotel"
    When User select Hotel name,save hotel and price
    Then User dismiss the popup
    And User should verify the suceess message "Select Hotel"

    Examples: 
      | userName                | password   | select state | select city | Select Room Type                    | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Standard/Deluxe/Suite/Luxury/Studio | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 |

  Scenario Outline: Verify sorting functionality hotel price from low to high
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    And User select hotel enter "<select state>","<select city>","<Select Room Type>","<Check-in >","< Check-out >","<No. of rooms>","<No. of adults>" and "< No. of children>"
    Then User Should Verify Sucess message after search hotel "Select Hotel"
    When User click sort by as price low to high
    Then User should verify the price in ascending

    Examples: 
      | userName                | password   | select state | select city | Select Room Type                    | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Standard/Deluxe/Suite/Luxury/Studio | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 |

  Scenario Outline: Verify sorting functionality hotel name listed descending order
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    And User select hotel enter  "<select state>","<select city>","<Select Room Type>","<Check-in>","<Check-out>","<No. of rooms>","<No. of adults>" and "<No. of children>"
    Then User Should Verify Sucess message after search hotel "Select Hotel"
    When User click sort by as Name Descending
    And User should verify the hotles list in name descending order

    Examples: 
      | userName                | password   | select state | select city | Select Room Type                    | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Standard/Deluxe/Suite/Luxury/Studio | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 |

  Scenario Outline: Passing room type and Verify filter is listed(Verify Each hotel name is end with given roomtype)
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    And User select hotel enter  "<select state>","<select city>","<Select Room Type>","<Check-in>","<Check-out>","<No. of rooms>","<No. of adults>" and "<No. of children>"
    Then User Should Verify Sucess message after search hotel "Select Hotel"
    And User should verify the each hotel name ends with given "Select Room Type"

    Examples: 
      | userName                | password   | select state | select city | Select Room Type                    | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children | room type filter |  
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Standard/Deluxe/Suite/Luxury/Studio | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 | Deluxe           |  
