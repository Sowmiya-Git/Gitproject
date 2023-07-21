@BookHotel
Feature: Book Hotel Automation

  Scenario Outline: Book hotel including with special request
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    And User select hotel enter with values "<select state>","<select city>","<Select Room Type>","<Check-in>","<Check-out>","<No. of rooms>","<No. of adults>" and "<No. of children>"
    Then User Should Verify Sucess message as "Select Hotel" after clicking on search button
    When User select the first hotel and save the hotelname,price
    Then User accept the popup alert and book hotel
    And User should verify the suceess message after booking "Book Hotel"
    When User add guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add GST details "<enterRegestratioNo>","<enterCompanyName>" and "<enterCompanyAdress>"
    And User add Special Request "<anyOtherRequest>"
    And User add Payment details with card Options "<cardOptions>"
      | cardType          | cardNo           | cardName | month    | year | CVV |
      | Debit VISA        | 5555555555552222 | Sowmiya  | January  | 2025 | 666 |
      | Debit Mastercard  | 5555555555552222 | Sowmiya  | March    | 2025 | 447 |
      | Debit Amex        | 5555555555552222 | Sowmiya  | April    | 2025 | 666 |
      | Debit Discover    | 5555555555552222 | Sowmiya  | January  | 2025 | 888 |
      | Credit VISA       | 5555555555552223 | Sowmiya  | December | 2025 | 548 |
      | Credit Mastercard | 5555555555552223 | Sowmiya  | Julu     | 2025 | 655 |
      | Credit Amex       | 5555555555552223 | Sowmiya  | January  | 2025 | 644 |
      | Credit Discover   | 5555555555552223 | Sowmiya  | April    | 2025 | 688 |
    Then User Should verify after booking hotel success message "Booking is Confirmed" and save OrderId
    Then User Should verify same selected hotel only booked

    Examples: 
      | userName                | password   | select state | select city | Select Room Type                    | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children | salutation | firstName | lastName | mobileNo   | email                   | enterRegestratioNo | enterCompanyName       | enterCompanyAdress | anyOtherRequest    | cardOptions |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Standard/Deluxe/Suite/Luxury/Studio | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 | Ms         | Sowmiya   | C        | 9597903361 | sowmiyaec2015@gmail.com |         9043592058 | Greens Tech OMR Branch | Thoraipakkam       | Floral arrangments | Debit Card  |

    Examples: 
      | userName                | password   | select state | select city | Select Room Type                    | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children | salutation | firstName | lastName | mobileNo   | email                   | enterRegestratioNo | enterCompanyName       | enterCompanyAdress | anyOtherRequest    | cardOptions |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Standard/Deluxe/Suite/Luxury/Studio | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 | Ms         | Sowmiya   | C        | 9597903361 | sowmiyaec2015@gmail.com |         9043592058 | Greens Tech OMR Branch | Thoraipakkam       | Floral arrangments | Credit Card |

  Scenario Outline: Book hotel including without special request
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    And User select hotel enter with values "<select state>","<select city>","<Select Room Type>","<Check-in>","<Check-out>","<No. of rooms>","<No. of adults>" and "<No. of children>"
    Then User Should Verify Sucess message as "Select Hotel" after clicking on search button
    When User select the first hotel and save the hotelname,price
    Then User accept the popup alert and book hotel
    And User should verify the suceess message after booking "Book Hotel"
    When User add guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add GST details "<enterRegestratioNo>","<enterCompanyName>" and "<enterCompanyAdress>"
    And User add Payment details with card Options "<cardOptions>"
      | cardType          | cardNo           | cardName | month    | year | CVV |
      | Debit VISA        | 5555555555552222 | Sowmiya  | January  | 2025 | 666 |
      | Debit Mastercard  | 5555555555552222 | Sowmiya  | March    | 2025 | 447 |
      | Debit Amex        | 5555555555552222 | Sowmiya  | April    | 2025 | 666 |
      | Debit Discover    | 5555555555552222 | Sowmiya  | January  | 2025 | 888 |
      | Credit VISA       | 5555555555552223 | Sowmiya  | December | 2025 | 548 |
      | Credit Mastercard | 5555555555552223 | Sowmiya  | Julu     | 2025 | 655 |
      | Credit Amex       | 5555555555552223 | Sowmiya  | January  | 2025 | 644 |
      | Credit Discover   | 5555555555552223 | Sowmiya  | April    | 2025 | 688 |
    Then User Should verify after booking hotel success message "Booking is Confirmed" and save OrderId
    Then User Should verify same selected hotel only booked

    Examples: 
      | userName                | password   | select state | select city | Select Room Type                    | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children | salutation | firstName | lastName | mobileNo   | email                   | enterRegestratioNo | enterCompanyName       | enterCompanyAdress | anyOtherRequest    | cardOptions |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Standard/Deluxe/Suite/Luxury/Studio | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 | Ms         | Sowmiya   | C        | 9597903361 | sowmiyaec2015@gmail.com |         9043592058 | Greens Tech OMR Branch | Thoraipakkam       | Floral arrangments | Debit Card  |

    Examples: 
      | userName                | password   | select state | select city | Select Room Type                    | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children | salutation | firstName | lastName | mobileNo   | email                   | enterRegestratioNo | enterCompanyName       | enterCompanyAdress | anyOtherRequest    | cardOptions |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Standard/Deluxe/Suite/Luxury/Studio | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 | Ms         | Sowmiya   | C        | 9597903361 | sowmiyaec2015@gmail.com |         9043592058 | Greens Tech OMR Branch | Thoraipakkam       | Floral arrangments | Credit Card |

  Scenario Outline: Book hotel including without GST-Card(Debit Card-VISA) with special request
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    And User select hotel enter with values "<select state>","<select city>","<Select Room Type>","<Check-in>","<Check-out>","<No. of rooms>","<No. of adults>" and "<No. of children>"
    Then User Should Verify Sucess message as "Select Hotel" after clicking on search button
    When User select the first hotel and save the hotelname,price
    Then User accept the popup alert and book hotel
    And User should verify the suceess message after booking "Book Hotel"
    When User add guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add Special Request "<anyOtherRequest>"
    And User add Payment details with card Options "<cardOptions>"
      | cardType         | cardNo           | cardName | month   | year | CVV |
      | Debit VISA       | 5555555555552222 | Sowmiya  | January | 2025 | 666 |
      | Debit Mastercard | 5555555555552222 | Sowmiya  | March   | 2025 | 447 |
      | Debit Amex       | 5555555555552222 | Sowmiya  | April   | 2025 | 666 |
      | Debit Discover   | 5555555555552222 | Sowmiya  | January | 2025 | 888 |
    Then User Should verify after booking hotel success message "Booking is Confirmed" and save OrderId
    Then User Should verify same selected hotel only booked

    Examples: 
      | userName                | password   | select state | select city | Select Room Type                    | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children | salutation | firstName | lastName | mobileNo   | email                   | enterRegestratioNo | enterCompanyName       | enterCompanyAdress | anyOtherRequest    | cardOptions |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Standard/Deluxe/Suite/Luxury/Studio | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 | Ms         | Sowmiya   | C        | 9597903361 | sowmiyaec2015@gmail.com |         9043592058 | Greens Tech OMR Branch | Thoraipakkam       | Floral arrangments | Debit Card  |

  Scenario Outline: Book hotel including without GST-Card(Credit Card-VISA) without special request
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    And User select hotel enter with values "<select state>","<select city>","<Select Room Type>","<Check-in>","<Check-out>","<No. of rooms>","<No. of adults>" and "<No. of children>"
    Then User Should Verify Sucess message as "Select Hotel" after clicking on search button
    When User select the first hotel and save the hotelname,price
    Then User accept the popup alert and book hotel
    And User should verify the suceess message after booking "Book Hotel"
    When User add guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add Payment details with card Options "<cardOptions>"
      | cardType          | cardNo           | cardName | month   | year | CVV |
      | Credit VISA       | 5555555555552223 | Sowmiya  | January | 2025 | 666 |
      | Credit Mastercard | 5555555555552223 | Sowmiya  | March   | 2025 | 447 |
      | Credit Amex       | 5555555555552223 | Sowmiya  | April   | 2025 | 666 |
      | Credit Discover   | 5555555555552223 | Sowmiya  | January | 2025 | 888 |
    Then User Should verify after booking hotel success message "Booking is Confirmed" and save OrderId
    Then User Should verify same selected hotel only booked

    Examples: 
      | userName                | password   | select state | select city | Select Room Type                    | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children | salutation | firstName | lastName | mobileNo   | email                   | enterRegestratioNo | enterCompanyName       | enterCompanyAdress | cardOptions |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Standard/Deluxe/Suite/Luxury/Studio | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 | Ms         | Sowmiya   | C        | 9597903361 | sowmiyaec2015@gmail.com |         9043592058 | Greens Tech OMR Branch | Thoraipakkam       | Credit Card |

  Scenario Outline: Book hotel without payment details verify error message
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    And User select hotel enter with values "<select state>","<select city>","<Select Room Type>","<Check-in>","<Check-out>","<No. of rooms>","<No. of adults>" and "<No. of children>"
    Then User Should Verify Sucess message as "Select Hotel" after clicking on search button
    When User select the first hotel and save the hotelname,price
    Then User accept the popup alert and book hotel
    And User should verify the suceess message after booking "Book Hotel"
    When User add guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add GST details "<enterRegestratioNo>","<enterCompanyName>" and "<enterCompanyAdress>"
    And User add Special Request "<anyOtherRequest>"
    When User  without entering payment details
    Then User Should verify a message "Please select your card type","Please select your card","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | userName                | password   | select state | select city | Select Room Type                    | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children | salutation | firstName | lastName | mobileNo   | email                   | enterRegestratioNo | enterCompanyName       | enterCompanyAdress |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Standard/Deluxe/Suite/Luxury/Studio | 2023-07-09 | 2023-07-09 | 1-One        | 2-Two         |               3 | Ms         | Sowmiya   | C        | 9597903361 | sowmiyaec2015@gmail.com |         9043592058 | Greens Tech OMR Branch | Thoraipakkam       |
