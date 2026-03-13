Feature:Login functionality

@smoke
Scenario:Login with valid credentials
Given open browser
When enter username "student" and  password "Password123"
And click on login button
Then user should navigate to dashboard page "Logged In Successfully"
And broswer should close

Scenario:Login with invalid credentials 
Given open browser
When enter username "student" and  password "pass"
And click on login button
Then error message should be displayed "Your password is invalid!"
And broswer should close