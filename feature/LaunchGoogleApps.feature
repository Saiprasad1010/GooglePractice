Feature: Launch Google Apps

Scenario Outline: All Google Apps Launch successfully

Given User Launch Chrome Browser
When User open URL "https://www.google.com/"
Then Click on Google Apps Symbole
And Open My account & Verify tab title
And Open Search & Verify tab title
And Open Maps & Verify tab title
And Open YouTube & Verify tab title
And Open Play Store & Verify tab title
And Open News & Verify tab title
And Open Gmail & Verify tab title
And Open Drive & Verify tab title
And Open Calender & Verify tab title
And Open Google+ & Verify tab title
And Open Translate & Verify tab title
And Open Photos & Verify tab title