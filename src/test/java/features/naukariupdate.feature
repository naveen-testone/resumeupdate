Feature: Naukari Application login

Scenario: Naukari update resume with delete
Given Initilize the browser with chrome
And User is on Naukari landing page "https://www.naukri.com/"
When User login into application with "seleniumnaveen570@gmail.com" and "test@1234"
Then Home page is populated
And click on Update profile
And click on Delete resume
And click on logout

Scenario: Naukari update resume without delete home page 
Given Initilize the browser with chrome
And User is on Naukari landing page "https://www.naukri.com/"
When User login into application with "seleniumnaveen570@gmail.com" and "test@1234"
Then Home page is populated
And click on Update profile
And click on Upload resume
And Check for success message
And click on logout