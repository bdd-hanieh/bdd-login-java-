Login Feature Test
Tests the login function using Cucumber (BDD) and JUnit.

Description:
Simulates opening the login page, entering valid or invalid credentials, and checking the result.

Valid login → shows welcome message

Invalid login → shows error message

Example:
✅ Valid Login

Given I open the login page  
When I enter valid username and password  
Then I should see the welcome message


Output → Welcome message displayed ✅

❌ Invalid Login

Given I open the login page  
When I enter invalid username or password  
Then I should see an error message


Output → Error message displayed ❌
