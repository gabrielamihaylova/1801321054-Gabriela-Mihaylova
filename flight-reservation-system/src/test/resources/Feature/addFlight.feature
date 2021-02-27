Feature: Добавяне на полет

  Scenario: Добавяне на нов полет с валидни данни
    Given Потребителя с административни права отваря екрана за създаване на нов полет
    When Въвежда потребителско име "admin"
    And Въвъжда парола "admin123"
    And Въвежда дестинация на заминаване "София"
    And Въвежда дестинация на пристигане "Мадрид"
    And Въвежда времетраене "3"
    And Въвежда дата и час "2021-05-21 10:30:55"
    And Въвежда цена на полета "180.50"
    And Въвежда тип на самолет "Боинг737"
    And Въвежда места в самолета "180"
    And Натиска бутона за създаване на нов полет
    Then Вижда съобщение за "Успешно добавен полет"

  Scenario: Добавяне на нов полет с грешен формат на дата
    Given Потребителя с административни права отваря екрана за създаване на нов полет
    When Въвежда потребителско име "admin"
    And Въвъжда парола "admin123"
    And Въвежда дестинация на заминаване "София"
    And Въвежда дестинация на пристигане "Мадрид"
    And Въвежда времетраене "3"
    And Въвежда дата и час "05/21/2021 10:30:55"
    And Въвежда цена на полета "180.50"
    And Въвежда тип на самолет "Боинг737"
    And Въвежда места в самолета "180"
    And Натиска бутона за създаване на нов полет
    Then Вижда съобщение за "Моля въведете коректен формат на дата и час"

  Scenario: Добавяне на нов полет без дестинация на пристигане
    Given Потребителя с административни права отваря екрана за създаване на нов полет
    When Въвежда потребителско име "admin"
    And Въвъжда парола "admin123"
    And Въвежда дестинация на заминаване "София"
    And Въвежда дестинация на пристигане ""
    And Въвежда времетраене "3"
    And Въвежда дата и час "2021-05-21 10:30:55"
    And Въвежда цена на полета "180.50"
    And Въвежда тип на самолет "Боинг737"
    And Въвежда места в самолета "180"
    And Натиска бутона за създаване на нов полет
    Then Вижда съобщение за "Моля въведете дестинация на пристигане"

  Scenario: Добавяне на нов полет тип на самолета
    Given Потребителя с административни права отваря екрана за създаване на нов полет
    When Въвежда потребителско име "admin"
    And Въвъжда парола "admin123"
    And Въвежда дестинация на заминаване "София"
    And Въвежда дестинация на пристигане "Мадрид"
    And Въвежда времетраене "3"
    And Въвежда дата и час "2021-05-21 10:30:55"
    And Въвежда цена на полета "180.50"
    And Въвежда места в самолета "180"
    And Натиска бутона за създаване на нов полет
    Then Вижда съобщение за "Моля въведете тип на самолета"

  Scenario: Добавяне на нов полет без данни
    Given Потребителя с административни права отваря екрана за създаване на нов полет
    And Натиска бутона за създаване на нов полет
    Then Вижда съобщение за "Моля въведете данни за полета"

  Scenario: Добавяне на нов полет от обикновен потребител
    Given Потребителя без административни права отваря екрана за създаване на нов полет
    When Въвежда потребителско име "ivan"
    And Въвъжда парола "123"
    And Натиска бутона за създаване на нов полет
    Then Вижда съобщение за "Само потребител с административни права може да добавя нови полети"