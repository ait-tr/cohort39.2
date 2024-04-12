// Array - коллекция данных

// 1. Создание массивов
// - Создание через new Array()
const newArray = new Array();
console.log(newArray);
// - Создание пустого массива
const emptyArray = [];
console.log(emptyArray);
// - Создание массива со значениями по умолчанию
const animals = ["Dog", "Cat", "Rat", "Tiger", "Lion"];
console.log(animals);

// 2. Доступ к элеентам массива
// Доступ к элементам мы получаем через их index. index элемента сичтается от 0. т.е 1-ый элемент массива будет с индексом 0
console.log(animals[3]); // Tiger
// - заменяем 3 элемент массива, значит используем индекс 2
animals[2] = "Pig";
console.log(animals);
// - Добавляем элемент в конец массива
animals[5] = "Rat";
console.log(animals);
// забираем 1 элемент массива в переменную
let dog = animals[0];
console.log(dog);

// 3. Получение длинны массива. length - св-во, в котором храниться кол-во элементов в массиве
console.log(animals.length);

// 4. Хранение разных типов данных в одном массиве
const mixedArray = [
  0,
  "Helo",
  true,
  { id: "1", name: "John", age: 20 },
  animals,
];

console.log(mixedArray);

// 5. pop/push, shift/unshift
// [ 'Dog', 'Cat', 'Pig', 'Tiger', 'Lion', 'Rat' ]
// - push() - добавляет элемент в конец массива
animals.push("Frog");
console.log(animals);

// - pop() - удаляет элемент c конца массива
let lastDeletedElement = animals.pop();
console.log(lastDeletedElement); // Выводит в консоль последний удаленный элемент
console.log(animals);

// - unshift() - добавляет элемент в начало массива
animals.unshift("Frog");
console.log(animals);

// - shift()
animals.shift(); // - удаляет элемент c начала массива
console.log(animals);

// Циклы

// 1. Цикл for

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9];
// console.log(numbers[0]);
// console.log(numbers[1]);
// console.log(numbers[2]);
// console.log(numbers[3]);
// console.log(numbers[4]);
// console.log(numbers[5]);
// console.log(numbers[6]);
// console.log(numbers[7]);
// console.log(numbers[8]);

for (let index = 0; index < numbers.length; index++) {
  // console.log("index =", index);
  // console.log("length = ", numbers.length);
  console.log(numbers[index]);
}

// Не выводить 2 элемент массива, а все отсальные вывести

// for (let index = 0; index < numbers.length; index++) {
//   if (index === 1) {
//     continue;
//   } else {
//     console.log(numbers[index]);
//   }
// }

// Вывести в консоль 3 элемента массива, а остальные игнорировать и прервать цикл
// for (let index = 0; index < numbers.length; index++) {
//   if (index === 3) {
//     break;
//   } else {
//     console.log(numbers[index]);
//   }
// }

// Практика

// let fruits = ["Apple", "Orange", "Cherry", "Strawberry", "Red Apple"];

// for (let index = 0; index < fruits.length; index++) {
//   if (fruits[index] === "Strawberry") {
//     console.log(fruits[index]);
//     break;
//   } else {
//     console.log(fruits[index]);
//   }
// }

// while

let index = 0;

while (index < numbers.length) {
  console.log(numbers[index]);
  index++;
}

// do while

let number = 6;
do {
  console.log("Выполненно хотя бы 1 раз");
} while (number < 6);
