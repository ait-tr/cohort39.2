// Вывод сообщения в консоль - console.log()
console.log("Hello world");
console.log("Hello world 2");

// Выводит сообщение в браузере в встпывающем окне. Важно; Не запускать alert и ей подобные команды в Code runner, т.к будет ошибка.
// т.к alert - это браузерная команда, которая является частью WEB API и не является частью JS
// alert("This is my first alert message");

// Переменные

//1. let - изменяемая переменная
// 1.1 Объявление переменной message
let message;
// Присвоение строкового значения переменной message
message = "New message";
// Вывод переменной в консоль
console.log(message);

// Даем переменной message другое строковое значение
message = "New message 2";
console.log(message);

// Даем переменной message другое значние и другой тип данных
message = 3;
console.log(message);

// 1.2 Объявление переменной message2 и присвоения значения сразу же
let message2 = "New message 2";
console.log(message2);

// 2. const - неизменяемая переменная
const firstName = "John";
console.log(firstName);

// Попробуем поменять значение firstName
// Изменять const нельзя, т.к будет ошибка
// firstName = "Brat";
// console.log(firstName);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//ТИПЫ ДАННЫХ
// 1. string - строковые значения
// строковый тип включаем в двойные или одинарные кавычки
let paragraph = "Hello, my name is John";
// если вы хотите передать строке переменную, то используйте литеральные скобки ``
let someName = "Jack";
let paragraph2 = `Hello my name is ${someName}`;
console.log(paragraph2);
console.log(typeof paragraph2);

// 2. number - числовой тип
let number1 = 23;
let number2 = 23.123;
console.log(typeof number1);
console.log(typeof number2);

// 3. bitInt - очень большое число, большее чем 9007199254740991
const bigNumber = 9007199254740991234234234n;
console.log(typeof bigNumber);

// 4. boolean - логический тип данных - true или false
let isActive = true;
console.log(typeof isActive);

// 5. undefined - неопроделенное(неприсвоенное)
let animal = undefined;
console.log(typeof animal);

// 6. null - пустое значение
// Если ничего не передать переменное, то мы получим undefined
let value;
console.log(value);

// под копотом null - это обьект
let value2 = null;
console.log(typeof value2);

// 7. Объекты - непримитивный тип данных, в которых мы можем хранить пары ключ/значение

const person = {
  firstName: "John",
  lastName: "Jonson",
  age: 32,
  job: "QA",
  isHasDog: true,
};

// 8. Symbol - см в презентации
