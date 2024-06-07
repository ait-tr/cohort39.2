## Homework

### Задание 1

Создать страницу, на которой у вас будет квадрат с background-color: white
Под квадратом должны находиться 2 кнопки:

1. "Randomize square color" - при клике на нее каждые 3 секунды у вас должен меняться цвет квадрата на рандомный. Цвет должен меняться на случайный из массива ниже:

```
const colors = [
  "#FFFFFF",
  "#2196F3",
  "#4CAF50",
  "#FF9800",
  "#009688",
  "#795548",
  "rgb(42, 34, 82)",
  "rgb(61, 30, 214)",
  "blueviolet",
  "rgb(214, 30, 30)",
];
```

Для выборки случайного цвета используйте функцию Math.random(), [ссылка на принцип ее работы](https://developer.mozilla.org/ru/docs/Web/JavaScript/Reference/Global_Objects/Math/random)

2. "Stop Randomize square color" - при клике на нее, цвет квадрата перестает меняться

### Задание 2

Создание и обработка промисов

Создайте функцию showNumbers(seconds), которая принимает число секунд и возвращает промис. Промис должен выполняться через указанное количество секунд и возвращать сообщение "Прошло {seconds} секунд(ы)". Используйте setTimeout внутри промиса для создания задержки выполнения. Если колличестов секунд больше 10, то промис должен возвращать ошибку "Ошибка: максимальное количество секунд = 10".Создайте несколько экземпляров функции wait с разными значениями секунд и выведите результат выполнения каждого промиса.

## Важно: выполненное ДЗ нужно прислать мне в личку в слаке в виде index.js файла

### !!!Дедлайн: 13.05.2024: 15:00