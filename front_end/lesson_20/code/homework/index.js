class Plant {
  constructor(height, age) {
    this.height = height;
    this.age = age;
  }

  grow() {
    this.height += 10;
  }
}

class Rose extends Plant {
  constructor(height, age, numberOfFlowers) {
    super(height, age);
    this.numberOfFlowers = numberOfFlowers;
  }
}

const rose = new Rose(20, 3, 10);
console.log(rose);
rose.grow();
console.log(rose);
rose.grow();
console.log(rose);
