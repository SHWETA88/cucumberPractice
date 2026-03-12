Feature:Login functionality
Scenario:Login with valid and invalid credentials

Given open browser
When enter valid "<username>" and "<password>"
And click on login button
Then user should navigate to dashboard page "<expectedText>"
And broswer should close

Examples:
| username | password |	expectedText |
| student | Password123 |Logged In Successfully|