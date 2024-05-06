// 1. создание классов - class

class Animal {
  // Статические св-ва
  isAnimal = true;

  constructor(name, color, speed, isPredatory, isHasMane) {
    // Динамические св-ва
    this.name = name;
    this.color = color;
    this.speed = speed;
    this.isPredatory = isPredatory;
    this.isHasMane = isHasMane;
  }

  walk() {
    console.log(`I am ${this.name} and i can walk`);
  }

  run() {
    console.log(`I am ${this.name} and i run with ${this.speed}km/h`);
  }
}

// создание объекта lion(экземпляра класса Animal)
const lion = new Animal("Lion", "Yellow-broun", 74, true, true);

console.log(lion);
lion.walk();
lion.isAnimal = false;

console.log(lion);
console.log(Animal);

// создание объекта tiger(экземпляра класса Animal)
const tiger = new Animal("Tiger", "Orange striped", 65, true, false);

console.log(tiger);
tiger.run();

// Наследование классов

class FlyingAnimal extends Animal {
  isAnimalFlying = true;
  #privateLivingPlace = "On the rock";
  #distance;

  constructor(name, color, flyingSpeed, distance) {
    super(name, color);
    this.flyingSpeed = flyingSpeed;
    this.#distance = distance;
  }

  get distance() {
    return `Eagle distance today is: ${this.#distance}`;
  }

  set distance(multiplicator) {
    if (this.#distance > 300) {
      this.#distance = "That's all for today";
    } else {
      this.#distance += multiplicator;
    }
  }

  #privateSecret() {
    console.log(this.#privateLivingPlace);
  }

  fly() {
    console.log(`My name is ${this.name} and I can fly`);
    this.#privateSecret();
  }
}

const eagle = new FlyingAnimal("Eagle", "Gold", 320, 10);
console.log(eagle);
eagle.fly();

eagle.distance = 20; // set
eagle.distance = 20; // set
eagle.distance = 20; // set
eagle.distance = 110; // set
eagle.distance = 110; // set
eagle.distance = 20; // set
eagle.distance = 20; // set

console.log(eagle.distance); // get

// Example
class Wizard {
  #name;
  constructor(name, house) {
    this.#name = name; // Приватное поле
    this.house = house;
  }

  get name() {
    return this.#name;
  }

  set name(newName) {
    this.#name = newName;
  }
}

const ron = new Wizard("Ron Weasley", "Gryffindor");
console.log(ron.name); // "Ron Weasley" - get
ron.name = "Ronald Weasley"; // set
console.log(ron.name); // "Ronald Weasley" - get
console.log(ron);
