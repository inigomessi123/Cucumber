Feature: validating login of facebook application

Scenario: validating with correct username and correct password
Given user is on facebook page on chrome browser 
When user enter username and password
And user should click login button
Then used should verify homepage is displayed or not