Feature: a user should able to Book flight in the FlyAway application

Scenario: Booking a Flight
Given a user is on the home page of FlyAway ticket booking application
When he login to the portal by providing userid and password
And he clicks on home tab
And he select from and destination from those dropdowns
And he clicks on the Submit button
And he clicks on Book Flight link
And he reviews the details and clicks on the Click to complete booking
Then he could able to Book flight as user
