Feature: Login Page Functionality


  Scenario Outline:Successful login
    Given User navigates to "<CoyoteApplication>"
    When User enter emailID as "<emailId>" and password as "<password>"
    And User click on login button
    Then login should be successful
    And User click on logout button
    Examples:
      | CoyoteApplication | emailId               | password  |
      | Coyote Software   | superadmin@coyote.com | Cdn@12345 |


  Scenario Outline: Verify mandatory field for login page
    Given User navigates to "<CoyoteApplication>"
    When User click on login button
    Then validate email field and password field for mandatory field
    Examples:
      | CoyoteApplication |
      | Coyote Software   |


  Scenario Outline:Verify error message for unregistered credential
    Given User navigates to "<CoyoteApplication>"
    When User enter emailID as "<emailId>" and password as "<Password>"
    And User click on login button
    Then Error message for unregistered credential is "<message>"
    Examples:
      | CoyoteApplication | emailId                  | password   | message                            |
      | Coyote Software   | samkitjain2992@gmail.com | samkitjain | Invalid email/password combination |


  Scenario Outline:Verify field validation for login
    Given User navigates to "<CoyoteApplication>"
    When User enter emailId as "<emailId>"
    And User click on login button
    Then validate email field for invalid email id is
    Examples:
      | CoyoteApplication | emailId        | icon    |
      | Coyote Software   | 12345abc       | #dc3545 |
      | Coyote Software   | 12345abc@      | #dc3545 |
      | Coyote Software   | 12345abc@.com  | #dc3545 |
      | Coyote Software   | abc123@@.com   | #dc3545 |
      | Coyote Software   | 12345abc@gmail | #dc3545 |

  Scenario Outline: Verify invalid password validation for login
    Given User navigates to "<CoyoteApplication>"
    When  User enter emailID as "<emailId>" and password as "<password>"
    And   User click on login button
    Then Validate password field for invalid password is "<message>"
    Examples:
      | CoyoteApplication | emailId               | password      | message                            |
      | Coyote Software   | superadmin@coyote.com | TestCoyote001 | Invalid email/password combination |
  @Smoke
  Scenario Outline:Verify the functionality of reset password with invalid email address
    Given User navigates to "<CoyoteApplication>"
    When User enter emailId as "<emailId>"
    And User click on forgot password link
    And User enter invalid email id as "<Invalid emailId>"
    And User click on Next button
    Then Verify error message for invalid email address "<message>"
    Examples:
      | CoyoteApplication | emailId               | Invalid emailId          | message                            |
      | Coyote Software   | superadmin@coyote.com | samkitjain2992@gmail.com | User not exists with given email id -  |

#    Scenario Outline:Verify functionality of forgot password link
#      Given User navigates to "<CoyoteApplication>"
#      When User enter emailId as "<emailId>"
#      And User click on forgot password link
#      And User enter emailId as "<emailId>"
#      And User click on Next button
#      Then Verify message is
#      Examples:
#        | CoyoteApplication | emailId               |
#        | Coyote Software   | superadmin@coyote.com |