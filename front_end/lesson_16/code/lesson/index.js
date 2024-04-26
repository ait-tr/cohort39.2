// Array methods

const numbersArray = [1, 2, 3, 4, 5];

// 1. map()
// - не меняет исхожный массив
// - возвращает в переменную новый массив
// - колличество элементов в новом массиве будет столько же сколько и в исходном
// - если функция callback ниечго не вернет, то значения в новом массиве будут === undefined
const newNumbersArrayAfterMap = numbersArray.map((value, index, array) => {
  // console.log(value); // 1 или 2 или 3 или 4 или  5
  // console.log(index); // 0 или 1 или 2 или 3 или 4
  // console.log(array); // массив который мы перебираем т.е numbersArray

  return value * 2;
});

console.log(numbersArray);
console.log(newNumbersArrayAfterMap);

//2. forEach()
// - не меняет исходный массив
// - возвращает undefined
// - используется, чтобы сделать какие-ниудь операции с элентами массива, не обязательно со всеми

let newNumbersArrayAfterForEach = [];

numbersArray.forEach((value, index, array) => {
  if (value <= 3) {
    newNumbersArrayAfterForEach.push(value);
  }
});

console.log("newNumbersArrayAfterForEach", newNumbersArrayAfterForEach);

// 3. filter()
// -возвращает новый массив, но отфильтрованный
// - если функция callback возвращает true, то элемент возвращается в новый массив, если нет, то не возвращается
// - не меняет исходный массив

const employees = [
  { id: 1, fullName: "John Doe", age: 30, job: "QA" },
  { id: 2, fullName: "Jane Smith", age: 25, job: "Frontend" },
  { id: 3, fullName: "Alex Johnson", age: 35, job: "Bakend" },
  { id: 4, fullName: "Emily Brown", age: 28, job: "UI/UX" },
  { id: 5, fullName: "Michael Wilson", age: 32, job: "QA" },
  { id: 6, fullName: "Sarah Davis", age: 27, job: "Frontend" },
  { id: 7, fullName: "Daniel Martinez", age: 33, job: "Bakend" },
  { id: 8, fullName: "Olivia Anderson", age: 29, job: "UI/UX" },
  { id: 9, fullName: "William Thomas", age: 31, job: "QA" },
];

const filteredEmployees = employees.filter((value) => {
  if (value.age > 60) {
    return value;
  }
});

console.log(filteredEmployees);

// 4. reverse()
// - меняет элементы массива местами
// - менет исходный массив
const animals = ["Cat", "Dog", "Rat", "Pig"];
const newAnimals = animals.reverse();

console.log(animals);
console.log(newAnimals);

// 5. reduce()
// возвращает 1 итоговое значение
// не меняет исходный массив

const numbers2 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
const number = 100;

const result = numbers2.reduce((accumulator, nexValue, index, array) => {
  console.log("accumulator", accumulator);
  console.log("nextValue", nexValue);
  return accumulator + nexValue;
}, number);

console.log(result);
