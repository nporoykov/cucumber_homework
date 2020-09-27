#language:en

Feature: As a user I must have possibility to browse Otus cources in development

  Scenario Outline: As a user I can browse Otus cources in development
    Given I navigate to Otus main page by 'https://otus.ru/'
    When I select tab '<tabName>'
    Then I should see <numberOfCourses> courses in development
    Examples:
      | tabName                     | numberOfCourses |
      | Программирование            | 3               |
      | Инфраструктура              | 3               |
      | Информационная безопасность | 1               |
      | Data Science                | 2               |
      | Управление                  | 2               |