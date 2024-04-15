// Task 1

for (let index = 1; index <= 20; index++) {
  if (index % 2 === 0) {
    console.log(index);
  }
}

// Task 2

const numbersArray = [2, 4, 6, 8, 10];
const newNumbersArray = [];

for (let index = 0; index < numbersArray.length; index++) {
  newNumbersArray.push(numbersArray[index] * 2);
}

console.log(newNumbersArray);

// Task 3
const names = ["Семен", "Иван", "Петр", "Татьяна"];
const ages = [18, 27, 74, 34];
const namesAgesArray = [];

for (let index = 0; index < names.length; index++) {
  namesAgesArray.push(`${names[index]} ${ages[index]} лет/годов`);
}

console.log(namesAgesArray);

// Task 4
const reversedNamesAgesArray = [];

for (let index = 0; index < namesAgesArray.length; index++) {
  reversedNamesAgesArray.unshift(namesAgesArray[index]);
}

console.log(reversedNamesAgesArray);

console.log(typeof []);
