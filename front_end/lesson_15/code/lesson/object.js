// Objects

// 1. Создание простого обьекта

const person = {
  firstName: "John",
  "last name": "Johnson",
  age: 25,
  sayHi: () => {
    console.log("Hi!!!");
  },
  isActive: true,
  dog: {
    firstName: "Spyke",
    color: "black",
  },
};

// 2. Получение значений из обьекта
// - через точку(если имя ключа в одно слово)
console.log(person.firstName);
const personAge = person.age;
console.log(personAge);

// - через [](если имя ключа в несколько или в одно слово)
console.log(person["last name"]);
console.log(person["isActive"]);

// 3. Удаление свойств
delete person.sayHi;
console.log(person);
delete person.dog;
console.log(person);

// 4. Длина обьекта - Object.keys();
//  Object.keys() - принимает в качестве аргумента обьект и озвращает массиве его ключей
const personKeys = Object.keys(person);
console.log(personKeys);
console.log(personKeys.length);

// 5. Проверка на наличие св-в в обьекте
console.log("last name" in person); // true
console.log("job" in person); // false

//6. Object.values()
console.log(Object.values(person));

// 7. Перезапись значений в св-вах
person.isActive = false;
console.log(person);

// 8. Перебор ключей в обьекте
// const keys = Object.keys(person);
// for (let property of keys) {
//   console.log(property);
// }

for (let keys in person) {
  console.log(keys);
  console.log(person[keys]);
}

// 9. Spread operator
let admin = {
  name: "Alex",
  age: 30,
  isAdmin: true,
};

let user1 = { ...admin };
console.log(admin);
console.log(user1);

user1.isAdmin = false;
console.log(admin);
console.log(user1);

let user2 = { ...admin, lastName: "Alexandrov" };
console.log(user2);

// Задача:
let user3 = { ...admin, job: "QA", name: "Vitaly" };
console.log(user3);

// 10. Destructuring
// 1 способ создания контант из ключей обьекта
// const name = admin.name;
// const age = admin.age;
// const isAdmin = admin.isAdmin;

// 2 способ - через деструктуризацию
const { name, age, isAdmin } = admin;
console.log(name);
console.log(age);
console.log(isAdmin);
