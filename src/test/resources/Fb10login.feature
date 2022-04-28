@sample3
Feature: validating login function
@sample
Scenario Outline: validating login with different conditions
Given user is on fb application on chrome browser
When user enter "<username>" and "<password>"
And user should click login button
Then user should verify home paga is present or not
Examples:
|username|password    |
|welcome |welcome@123 |


@sample1
Scenario Outline: validating login with different conditions
Given user is on fb application on chrome browser
When user enter "<username>" and "<password>"
And user should click login button
Then user should verify home paga is present or not
Examples:
|username|password    |
|welcome |welcome@123 |


@sample2
Scenario Outline: validating login with different conditions
Given user is on fb application on chrome browser
When user enter "<username>" and "<password>"
And user should click login button
Then user should verify home paga is present or not
Examples:
|username|password    |
|welcome |welcome@123 |

