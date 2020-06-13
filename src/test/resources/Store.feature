Feature: Store

  Background: Admin Should be on the dashboard page
    Given User enter emailID as "superadmin@coyote.com" and password as "Cdn@12345"
    When User click on login button

  Scenario: Navigation of Store
    Given Coyote application dashboard
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Store option
    Then Check the Store Page URL as "http://m2.cdnsolutionsgroup.com/CoyoteConsoleApp/stores"

  Scenario: Verify content of Store
    Given Coyote application dashboard
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Store option
    Then Verify content of Store page

  Scenario:Navigation of Add Store
    Given Coyote application dashboard
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Store option
    And Click on Store add button
    Then Check the add Store page

  Scenario:Verify content availability on Add Store page
    Given Coyote application dashboard
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Store option
    And Click on Store add button
    Then Verify content of add Store page

# There is a bug for add store functionality()I will be impliment script once bug resolved
#  Scenario Outline:Verify Add functionality of Store
#    Given Coyote application dashboard
#    When Admin click on left navigation panel Entry setup '+' icon
#    And Click on Store option
#    And Click on Store add button
#    And Enter the Store code field as "<Code>"
#    And Enter the Store Description field as "<>"
#    And Select the Store Status as "<>"
#    And Enter the Name field as "<>"
#    And Enter the Store Address1 field as "<>"
#    And Enter the Store Post Code field as"<>"
#    And Select the Store Group as "<>"
#    And Enter The ABN field as "<>"
#    And Click on add Store add button
#    Then Check the add Store successful message is "<>"
#    Then Verify added new Store like
#
#    Examples:
#      | Code    | Description | Status | Name      | Address1     | Post Code | Store Group | ABN         | Message |
#      | 001Test | QA001Test   |        | QATesting | SurydevNagar | 1234      |             | 12345678910 |         |