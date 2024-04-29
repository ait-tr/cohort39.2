const cars = [
  { brand: "BMW", price: 20000, isDiesel: true },
  { brand: "Mercedes", price: 22000, isDiesel: false },
  { brand: "Porshe", price: 50000, isDiesel: true },
  { brand: "Nissan", price: 25000, isDiesel: false },
  { brand: "Audi", price: 40000, isDiesel: false },
  { brand: "Porsche", price: 80000, isDiesel: false },
];

// Task 1

const carsWithoutPrice = cars.map((carObj) => {
  // 1 способ
  //   const { brand, isDiesel } = carObj;
  //   return { brand, isDiesel };

  // 2 способ
  const { price, ...rest } = carObj;

  return rest;
});

// console.log(carsWithoutPrice);

// Task 2
const carsWithDiesel = cars.filter((carObj) => carObj.isDiesel);

// console.log(carsWithDiesel);

// Task 3

const carsWithoutDiesel = cars.filter((carObj) => !carObj.isDiesel);
console.log(carsWithoutDiesel);

// Task 4
const commonCarPriceWithoutDiesel = carsWithoutDiesel.reduce(
  (acc, nextValue, index) => {
    console.log(acc, index);
    console.log(nextValue, index);

    return nextValue.price + acc;
  },
  0
);

console.log(commonCarPriceWithoutDiesel);

// Task 5
cars.forEach((carObj) => {
  carObj.price *= 1.2;
});

console.log(cars);

// Task 6

const tesla = { brand: "Tesla", price: 25000, isDiesel: false };

const carsWithTesla = cars.map((carObj) => {
  // 1 способ
  //   if (carObj.isDiesel) {
  //     return tesla;
  //   } else {
  //     return carObj;
  //   }

  // 2 способ
  return carObj.isDiesel ? tesla : carObj;
});

console.log(carsWithTesla);
