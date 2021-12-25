Feature: a user should able to view flight bookings in the FlyAway application

Scenario: View Booked Flight
Given a user is on the home page of FlyAway application
When he login to the portal by providing UserId and Password
And he clicks on Your Bookings tab
Then he could able to see the flights that has been booked
