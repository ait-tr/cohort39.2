// ++ --
let i = 0; // i === 0
i++; // i === 0
console.log(i); // i===1

let value = i++; // i===1
console.log(value, i); // value === 1  i===2

console.log(value + ++i); // i === 3 Результат всего выражения:4;

// if else practise
// const AIRPORT_CODE = "WAW";

// if (AIRPORT_CODE === "WAW") {
//   console.log(`Аэропорт Варшава: ${AIRPORT_CODE}`);
// } else if (AIRPORT_CODE === "LIS") {
//   console.log(`Аэропорт Лиссабон: ${AIRPORT_CODE}`);
// } else if (AIRPORT_CODE === "LHR") {
//   console.log(`Аэропорт Хитроу: ${AIRPORT_CODE}`);
// } else if (AIRPORT_CODE === "MAN") {
//   console.log(`Аэропорт Манчестер: ${AIRPORT_CODE}`);
// } else if (AIRPORT_CODE === "PMI") {
//   console.log(`Аэропорт Майорка: ${AIRPORT_CODE}`);
// } else {
//   console.log(`Отсутствует аэропорт с таким кодом: ${AIRPORT_CODE}`);
// }

// swith case

const AIRPORT_CODE = "WAW";

switch (AIRPORT_CODE) {
  case "WAW": {
    console.log(`Аэропорт Варшава: ${AIRPORT_CODE}`);
    break;
  }
  case "LIS": {
    console.log(`Аэропорт Лиссабон: ${AIRPORT_CODE}`);
    break;
  }
  case "LHR": {
    console.log(`Аэропорт Хитроу: ${AIRPORT_CODE}`);
    break;
  }
  case  "MAN": {
    console.log(`Аэропорт Манчестер: ${AIRPORT_CODE}`);
    break;
  }
  case "PMI": {
    console.log(`Аэропорт Майорка: ${AIRPORT_CODE}`);
    break;
  }
  default: {
    console.log(`Отсутствует аэропорт с таким кодом: ${AIRPORT_CODE}`);
    break;
  }
}
