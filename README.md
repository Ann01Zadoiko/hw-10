# hw-10

Завдання 1

Дано текстовий файл file.txt, в якому є список номерів телефонів (один рядок - один телефон).
Необхідно написати метод, який буде читати файл, і виводити в консоль всі валідні номери телефонів.
Телефон вважається валідним, якщо він відповідає одному з двох форматів (x - це одна цифра):

- (xxx) xxx-xxxx
- xxx-xxx-xxxx

Приклад:
Для файлу file.txt з наступним змістом:
- 987-123-4567
- 123 456 7890
- (123) 456-7890

Метод повинен вивести на екран:
- 987-123-4567
- (123) 456-7890

Завдання 2

Є текстовий файл file.txt. Необхідно прочитати файл, перетворити його в список об'єктів типу User, і записати їх у новий файл user.json.
Формат файлу:
- перший рядок - заголовок
- кожний наступний рядок - окремий об'єкт, кожна колонка розділена пробілом

Приклад:
Для файлу file.txt із вмістом:
- name age
- alice 21
- ryan 30
необхідно створити наступний файл user.json:
[
    {
        "name": "alice",
        "age":21
    },
    {
        "name": "ryan",
        "age":30
    }
]

Завдання 3

Напишіть метод, який буде рахувати частоту кожного слова у файлі words.txt.
Вважаємо що:
1. words.txt містить лише слова в нижньому регістрі, розділені пробілом
2. Кожне слово містить лише літери в нижньому регістрі
3. Слова розділені одним або декількома пробілами, або переносом рядка

Приклад:
Для файлу words.txt із вмістом:
- the day is sunny the the
- the sunny is is

Метод повинен повернути результат на кшталт:
    - the 4
    - is 3
    - sunny 2
    - day 1

УВАГА
Результат виводу в консоль повинен бути відсортований за частотою (спочатку йдуть слова, що зустрічаються найчастіше)
