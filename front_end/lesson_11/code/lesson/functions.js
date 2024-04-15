// Функции

// 1. Function Declaration
// Функции бывают 2 видов:
// - что-то возвращают и могут что-то выполнять(но не обязательно)
// - что-то выполняют и ничего не возвращают

// Функиця, которая что-то выполняет и ничего не возвращает
// шаг 1 - создать функцию

sayHelloWorld();
function sayHelloWorld() {
  // тело функции
  console.log("Hello world!!!");
}

// шаг 2 Выполнение функции
// получаем undefined, если ничего не возвращает
// const a = sayHelloWorld();
// console.log(a);
sayHelloWorld();

// Функция, котрая возвращает данные

function getNames() {
  const names = ["John", "Jack", "Brat", "Angela"];

  return names;
}

const namesFromFunction = getNames();
console.log(namesFromFunction);
///////////////////////////////////////////////////////////////////////

// 1.1 Передача аргуметов в функцию

function sum(a, b, c) {
  console.log("First arg", a);
  console.log("Second arg", b);
  console.log("3 arg", c);

  return a + b;
  // Все что написанно после return не сработает, а просто проигнорируется
  //   console.log(a);
}

console.log(sum(5, 2));
console.log(sum(10, 10));

// Практика: написать функицю, которая будет принимать строку и возвращать строку наоборот

function reverseName(value) {
  let valueArray = value.split("");
  let reversedValueArray = [];
  for (let index = 0; index < valueArray.length; index++) {
    reversedValueArray.unshift(valueArray[index]);
  }
  return reversedValueArray.join("");
}

console.log(reverseName("Anastasia"));

// 2. Function Expression
sayHi("John");
const sayHi = function (firstName) {
  console.log(`Hello, ${firstName}`);
};

sayHi("John");

console.log(typeof sayHi); //  Вернет funciton, но такого типа данных нет, т.е это object

// 3. Arrow function
const getFullName = (firstName, lastName) => {
  return `${firstName} ${lastName}`;
};

console.log(getFullName("Brat", "Pitt"));

// 3.1 Сократим return
const getFullName1 = (firstName, lastName) => `${firstName} ${lastName}`;

// 3.2. Стрелочная ф-я с 1 аргументом

const showMessage = (message) => {
  console.log(message);
};

showMessage("Some message");

// Функция в качестве аргумента

const makeStringToArray = (someValue) => {
  return someValue.split("");
};

const getArrayLength = (message, callback) => {
  let valueArray = callback(message);

  return valueArray.length;
};

console.log(getArrayLength("Hello", makeStringToArray));

// Парраметры по умолчанию

const getUser = (name = "Alex", age = 30) => {
  return { name, age };
};

console.log(getUser("Johny", 28));
console.log(getUser())
