@CancelBooking
Feature: Cancel the booking automation

  Scenario Outline: Cancelling order id
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
      | cardType         | cardNo           | cardName | month   | year | CVV |
      | Debit VISA       | 5555555555552222 | Sowmiya  | January | 2025 | 666 |
      | Debit Mastercard | 5555555555552222 | Sowmiya  | March   | 2025 | 447 |
      | Debit Amex       | 5555555555552222 | Sowmiya  | April   | 2025 | 666 |
      | Debit Discover   | 5555555555552222 | Sowmiya  | January | 2025 | 888 |
    Then User Should verify after booking hotel success message "Booking is Confirmed" and save OrderId
    Then User Should verify same selected hotel only booked
    When User navigates to my booking page
    Then User should verify after navigate my booking page success message "Bookings"
    When User enter order id
    Then User Should Verify same order is displayed
    And User should Verify same hotel name is present
    And User should Verify same hotel price is present
    When User cancel the order id
    Then User should Verify after cancel order id success message "Your bookings cancelled successfully"

    Examples: 
      | userName                | password   | select state | select city | Select Room Type | Check-in   | Check-out  | No. of rooms | No. of adults | No. of children | salutation | firstName | lastName | mobileNo   | email                   | enterRegestratioNo | enterCompanyName       | enterCompanyAdress | anyOtherRequest    | cardOptions | checkinDate |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | Tamilnadu    | Chennai     | Deluxe           | 2023-07-10 | 2023-07-11 | 1-One        | 2-Two         |               3 | Ms         | Sowmiya   | C        | 9597903361 | sowmiyaec2015@gmail.com |         9043592058 | Greens Tech OMR Branch | Thoraipakkam       | Floral arrangments | Debit Card  | 2023-07-11  |

  Scenario Outline: Cancel the  first order id in my bookings
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    When User navigates to my booking page
    Then User should verify after navigate my booking page success message "Bookings"
    When User select first order id
    And User click cancel button and accept the popup for cancelling
    And User should Verify after cancel order id success message "Your bookings cancelled successfully"

    Examples: 
      | userName                | password   |
      | sowmiyaec2015@gmail.com | Sowmi@1999 |

  Scenario Outline: Cancel the existing order id in my bookings
    Given User on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Sowmiya"
    When User navigates to my booking page
    Then User should verify after navigate my booking page success message "Bookings"
    When User enter existing order id  "<orderId>"
    And User click cancel button and accept the popup for cancelling
    And User should Verify after cancel order id success message "Your bookings cancelled successfully"

    Examples: 
      | userName                | password   | orderId     |
      | sowmiyaec2015@gmail.com | Sowmi@1999 | #JVVHH48094 |
