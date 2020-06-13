Feature: Roles

  Background:Admin Should be on the dashboard page
    Given User enter emailID as "superadmin@coyote.com" and password as "Cdn@12345"
    When User click on login button

  Scenario:Navigation of Roles
    Given Coyote application dashboard "http://m2.cdnsolutionsgroup.com/CoyoteConsoleApp/dashboard"
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Roles option
    Then Check the Roles page "http://m2.cdnsolutionsgroup.com/CoyoteConsoleApp/roles"


  Scenario:Verify content of Roles page
    Given Coyote application dashboard "http://m2.cdnsolutionsgroup.com/CoyoteConsoleApp/dashboard"
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Roles option
    Then Verify content of Roles page like"New Role""Status""Name""Type""Action"

  Scenario:Navigation of Add Role
    Given Coyote application dashboard "http://m2.cdnsolutionsgroup.com/CoyoteConsoleApp/dashboard"
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Roles option
    And Click on NewRole
    Then Check the add Role Page "http://m2.cdnsolutionsgroup.com/CoyoteConsoleApp/roles/add-role"

  Scenario: Verify content availability on Add Role page
    Given Coyote application dashboard "http://m2.cdnsolutionsgroup.com/CoyoteConsoleApp/dashboard"
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Roles option
    And Click on NewRole
    Then Verify content of add Role page

  Scenario Outline: Verify Add functionality of Role
    Given Coyote application dashboard "http://m2.cdnsolutionsgroup.com/CoyoteConsoleApp/dashboard"
    When Admin click on left navigation panel Entry setup '+' icon
    And Click on Roles option
    And Click on NewRole
    And Enter the RoleName field as "<RoleName>"
    And Enter the RoleCode field as "<RoleCode>"
    And Enter the RoleType field as "<RoleType>"
    And Select the RoleStatus as "<RoleStatus>"
    And Click on All Permission
    And Click on submit button
#    Then Check the Role Created successful message is "Role Created successfully"
    Then Verify added new Role like "<RoleName>" "<RoleType>"
    Examples:
      | RoleName  | RoleCode | RoleType   | RoleStatus |
      | QATesting | Test001  | SuperAdmin | Active     |