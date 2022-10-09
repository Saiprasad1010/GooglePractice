Feature: Google Apps

Scenario: Verify that google apps are available in dialog box
Given Given User Launch Chrome Browser
And User open URL "https://www.google.com/"
And Sign in into Google
When Click on Google apps symbole
Then Verify that all google apps are availabe in dialog box
