#language:en

Feature: As a user I must have possibility to browse Otus.ru header links

  Scenario Outline: As a user I can browse Otus.ru header links
    Given I navigate to Otus main page by 'https://otus.ru/'
    When I select header link '<linkName>'
    Then I should see '<titleName>' title on a page
    Examples:
      | linkName                     | titleName        |
      | Рекрутерам                   | IT-Recruiter     |
      | Отзывы                       | Отзывы           |
      | FAQ                          | Отвечаем на ваши |
      | Контакты                     | Контакты         |

