#language:en

Feature: As a user I must have possibility to authorize to Otus.ru

  Scenario Outline: As a user I can authorize to Otus.ru
    Given I navigate to Otus main page by 'https://otus.ru/'
    When I press Login button
    And I enter 'sajare9105@mailsecv.com' and 'Ataman777' into loginField
    Then I should see h2 'Цифровые навыки от ведущих экспертов'
    When I select tab '<tabName>'
    Then I should see <numberOfCourses> courses
    Examples:
      | tabName                     | numberOfCourses |
      | Программирование            | 56              |
      | Инфраструктура              | 30              |
      | Информационная безопасность | 7               |
      | Data Science                | 10              |
      | Управление                  | 7               |