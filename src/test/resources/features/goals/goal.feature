Feature: Automation Web Kompas
  As a user
  I want to login to kompas.com
  So that I am looking for news

Scenario: Create scenario login and looking for news
  Given I am on the login page
  When I enter my username and password
  Then I am success login
  And I am search for news
  And I am success looking for news


