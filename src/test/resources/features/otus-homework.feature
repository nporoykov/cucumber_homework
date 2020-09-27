#language:en

Feature: As a user I must have possibility to authorize to Otus.ru

  Scenario: As a user I can authorize to Otus.ru and browse courses in development
    Given I navigate to Otus main page by 'https://otus.ru/'
    When I press Login button
    And I enter 'sajare9105@mailsecv.com' and 'Ataman777' into loginField
    Then I should see h2 'Цифровые навыки от ведущих экспертов'
