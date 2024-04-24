// Как работает let с примитивами и непримитивами
// c примитивами
let animal = "Tiger";
console.log(animal);

animal = "Lion";
console.log(animal);

// с обьектами
let cars = {
  carName: "Audi",
  model: "R8",
  color: "black",
};

console.log(cars);

cars = {
  carName: "Mercedes",
  model: "Benz",
  color: "Red",
  maxSpeed: "250 km/h",
};

console.log(cars);

// Задача

let user = {
  name: "John",
  age: 25,
};

let user2 = user;

user2.age = 30;

console.log(user);
console.log(user2);

// Как работает const
// - c примитавами
const isPrivat = true;
isPrivat = false;
console.log(isPrivat);

// - c объектами
const actor = {
  name: "Johny",
  lastName: "Depp",
  age: 60,
};

// actor = {
//     name: "Brat",
//     lastName: "Pitt",
//     age: 50,
// }

console.log(actor);

actor.age = 59;
console.log(actor);
