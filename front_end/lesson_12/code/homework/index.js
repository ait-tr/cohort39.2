// Task 1

const getBiggestValue = (value1, value2) => {
  if (value1 > value2) {
    return value1;
  } else if (value2 > value1) {
    return value2;
  } else {
    return "Значения аргументов одинаковое";
  }
};

let biggestValue = getBiggestValue(20, 20);

console.log(biggestValue);

// Task 2

// const getElementInArrayByIndex = (array, index) => {
//     return array[index];
// }

const getElementInArrayByIndex = (array, index) => array[index];

console.log(getElementInArrayByIndex([1, 2, 3, 4, 5, 6, 7, 8], 6));

// Task 3

const decode = (weatherCode) => {
  switch (weatherCode) {
    case "SQ": {
      return "шквал";
    }
    case "PO": {
      return "пыльный вихрь";
    }
    case "FC": {
      return "торнадо";
    }
    case "BR": {
      return "дымка (видимость от 1 до 9 км)";
    }
    case "HZ": {
      return "мгла (видимость менее 10 км)";
    }
    case "FU": {
      return "дым (видимость менее 10 км)";
    }
    case "DS": {
      return "пыльная буря (видимость менее 10 км)";
    }
    case "SS": {
      return "песчаная буря (видимость менее 10 км)";
    }
    default: {
      return "Такого кода не существует";
    }
  }
};

const getWeatherInfoByCode = (decode, weatherCode) => {
  return decode(weatherCode);
};

console.log(getWeatherInfoByCode(decode, "asdasd"))
