Feature: validating login of adachin application

Scenario: validating with correct username and correct password
Given user is on adachin page on chrome browser 
When user enter username and password
And user should click login button
And user should select the location
And user should select the hotels
And user should choose the room type
And user sholud choose number of rooms
And user should choose checkindate
And user should choose checkoutdate
And user should mention adultsperroom
And user should mention childrensperroom
And user should submit the details
And user should give the persional details
And user should give credit card details
And user should booknow the room
And user print order Id to console
Then used should verify homepage is displayed or not