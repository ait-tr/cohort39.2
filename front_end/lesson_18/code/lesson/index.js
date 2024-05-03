// Prototypes

const animal = {
  isAnimal: true,
  walk() {
    console.log("I can walk");
  },
  run() {
    console.log("I can run");
  },
};

// 1. __proto__
const bird = {
  __proto__: animal,
  walk() {
    console.log("I am bird and i can walk");
  },
  fly() {
    console.log("I can fly");
  },
};

console.log(animal);
console.log(bird);

bird.fly();
bird.walk();
bird.run();
console.log(bird.isAnimal);

const eagle = {};

// Через __proto__ мы можем назначить прототип
eagle.__proto__ = bird;
eagle.run();

// Через __proto__ мы можем читать прототип
console.log(eagle.__proto__);

// 2. Чтение и запись
// Object.getPrototypeOf();
// Object.setPrototypeOf();

// чтение
console.log(Object.getPrototypeOf(bird));

const rabbit = {
  jump() {
    console.log("I can jump");
  },
};

// запись
// 1 аргумент - кому назначить прототип
// 2 аргумент - обьект, который будет прототипом
Object.setPrototypeOf(rabbit, animal);

// 3. Object.prototype
console.log(Object.getPrototypeOf(animal));
// const a = {} === const newObj = new Object();

const userName = ["John", "Jack", "Alice"];
console.log(Object.getPrototypeOf(userName));

// 4. this

const user = {
  name: "John",
  age: 28,
  job: "QA",
  greeting: function () {
    // В данном примере this === user,т.е работает в контексте текущего обьекта
    console.log(`Hello, my name is ${this.name} and my age is ${this.age}`);
    console.log(this);
  },
};

user.greeting();

const admin = {
  __proto__: user,
  name: "Jack",
  age: 40,
  job: "Fontend",
};

admin.greeting();

// call, apply, bind
function showJob(salary, company) {
  console.log(
    `My job is ${this.job}, I work at ${company} and my salary = ${salary}`
  );
}

showJob();

// call - привязывает ф-ю к другому контексту(обьекту) и вызвает функцию сразу же
// 1 аргумент - обьект к которому мы привязваем функцию
// 2 и последующие аргументы нужны чтобы передавать в функцию
showJob.call(user, 2000, "Google");

// apply работает так же как и call, разница в передаче аргументов функции
showJob.apply(admin, [5000, "Tesla"]);

// bind - привязывает ф-ю к другому контексту(обьекту) и вызвает функцию потом, т.к еще и вызвать

const showJobForUser = showJob.bind(user, 10000, "Microsoft");
showJobForUser();

showJob.bind(admin, 6000, "Saleceforce")();
