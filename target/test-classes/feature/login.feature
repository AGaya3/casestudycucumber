Feature: Login process
Scenario Outline: Login using credentials
* open login page
* enter username in username field as"<username>"
* enter password in password field as "<password>"
* click login
Examples:
|username|password|
|lalitha|password123|
