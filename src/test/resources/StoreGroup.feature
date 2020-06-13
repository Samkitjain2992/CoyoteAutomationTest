Feature: Store Group

  Background:Admin Should be on the dashboard page
    Given User enter emailID as "superadmin@coyote.com" and password as "Cdn@12345"
    When User click on login button

  Scenario:Navigation of Store Group
    Given Coyote application dashboard
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Store Group option
    Then Check the Store Group page

  Scenario:Verify content of Store group page
    Given Coyote application dashboard
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Store Group option
    Then Verify content of Store Group page

  Scenario:Navigation of Add Store Group
    Given Coyote application dashboard
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Store Group option
    And Click on add button
    Then Check the add Store Group page

  Scenario: Verify content availability on Add Store Group page
    Given Coyote application dashboard
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Store Group option
    And Click on add button
    Then Verify content of add Store Group page

  Scenario Outline: Verify Add functionality of Store Group
    Given Coyote application dashboard
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Store Group option
    And Click on add button
    And Enter the code field as "<Code>"
    And Enter the description field as "<Description>"
    And Select the status as "<Status>"
    And Admin click on ok button
    Then Check the successful message is "<successful Message>"
    Then Verify added new Store Group like "<Code>" "<Description>"
    Examples:
      | Code    | Description | Status | successful Message               |
      | Test001 | QATesting   | true   | Store group created successfully |

  Scenario Outline: Verify update functionality of Store Group
    Given Coyote application dashboard
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Store Group option
    And Click on new added Store Group edit button
    And Enter the description field as "<Description>"
    And Select the status as "<Status>"
    And Admin click on ok button
    Then Check the updated successful message is "<successful Message>"
    Examples:
      | Description  | Status | successful Message               |
      | QATesting001 | true   | Store group updated successfully |

  Scenario: Verify delete functionality of Store Group
    Given Coyote application dashboard
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Store Group option
    And Click on Delete button
    And Click on ok button
    Then Check the delete record on Store Group as "QATesting001"

   Scenario Outline:Verify that admin can recreate deleted Store Group
     Given Coyote application dashboard
     When Admin click on left navigation panel Entry setup '+' icon
     And Click on Store Group option
     And Click on add button
     And Enter the code field as "<Code>"
     And Enter the description field as "<Description>"
     And Select the status as "<Status>"
     And Admin click on ok button
     Then Check the successful message is "<successful Message>"
     Then Verify added new Store Group like "<Code>" "<Description>"
     Examples:
       | Code    | Description | Status | successful Message               |
       | Test001 | QATesting   | true   | Store group created successfully |

