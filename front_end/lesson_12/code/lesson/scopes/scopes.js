// Local and global scopes

//1. let, const
let userJob = "QA";
console.log("Global scope userJob in global: ", userJob);

function getUser1() {
  let firstname = "Alex";
  let userJob = "Frontend";
  console.log("User 1", userJob);
  console.log("User 1", firstname);

  //   if (!!firstname) {
  //     let status = "firstname is not undefined";
  //     console.log(status, firstname);
  //   } else {
  //     console.log("First name is undefined");
  //   }
}

function getUser2() {
  let firstname = "Brat";
  console.log("User 2", userJob);
  console.log("User 2", firstname);
}

getUser1();
getUser2();

// Так вызывать переменные нельзя, т.к у нас нету к ним доступа
// console.log(firstname);
// console.log(age);

// 2. var

function testVar() {
  let a = 3;
  var b = 4;

  // Вызываем в консоль внутри функции a и b
  console.log(a);
  console.log(b);
}

testVar();
// За пределами функции let и var не видны, а ограничены блоком функции
// console.log(a);
// console.log(b);

if (true) {
  let animals = ["Dog", "Cat", "Pig"];
  var cars = ["Audi", "Mercedes", "Opel"];
}

console.log(cars);

// Hoisting - поднятие
console.log(someValue1); // Выдаст ошибку
console.log(someValue2); // Выдаст undefined
let someValue1 = "value 1";
var someValue2 = "value 2";

console.log(someValue1); // value 1
console.log(someValue2); // value 2

sum(1, 2);
var sum = (a, b) => a + b;
