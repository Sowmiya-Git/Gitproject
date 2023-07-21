@ExploreHotel
Feature: Explore the  Hotel features Login Automation

  Scenario Outline: Enter all field and Verify Select Hotel
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    When User select hotel enter  with values "<select state>","<select city>","<Select Room Type>","<Check-in>","<Check-out>","<No. of rooms>","<No. of adults>" and "<No. of children>"
    Then User Should Verify Sucess message after search hotel "Select Hotel" after clicking on search button

    Examples: 
      | userName                | password   | select state | select city | Select Room Type                    | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Standard/Deluxe/Suite/Luxury/Studio | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 |
  Scenario Outline: Enter only mandatory fields and verify select hotel
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    When User select hotels by entering mandatory values "<select state>","<select city>","<Select Room Type>","< Check-in >","<Check-out>","<No. of rooms>","<No. of adults>" and "<No. of children>"
    Then User Should Verify Sucess message after search hotel "Select Hotel" after clicking on search button

    Examples: 
      | userName                | password   | select state | select city | Select Room Type | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Deluxe           | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 |

  Scenario Outline: Without enter any field click search and verify all
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    When User search hotel without any details
    Then User Should Verify error message a "Please select state","Please select city","Please select Check-in-date"," Please select Check-out-date","select no. of rooms" and "select no. of adults"

    Examples: 
      | userName                | password   |
      | sowmiyaec2015@gmail.com | Sowmi@1999 |

  Scenario Outline: Enter all field and verify Filter room type and select Hotel
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    When User select hotel enter with values "<select state>","<select city>","<Select Room Type>","<Check-in >","<Check-out >","<No. of rooms>","<No. of adults>" and "<No. of children>"
    Then User Should Verify Sucess message after search hotel "Select Hotel" after clicking on search button
    And User Should select filter room type and Verify "<room type>" 

    Examples: 
      | userName                | password   | select state | select city | Select Room Type | Check-in date | Check-out date | No. of rooms | No. of adults | No. of children | room type |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Deluxe           | 2023-07-09    | 2023-07-09     | 1-One        | 2-Two         |               3 | Delux     |
