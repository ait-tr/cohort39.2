// prompt()
// - если вы что-то ввели в диалоговое окное, то в age вернется то, что вы ввели
// - если вы ничего не ввели, но нажали на OK, то в age возвращается пустая строка ""
// - если вы нажали на Cancel, то в age возвращется null
// - первый аргумент prompt(обязательный)  - это строка, которая покажется как сообшение для пользователя в диалоговом окне
// - 2 аргумент(не обязательный) - это число - значение по умолчанию
// - prompt возвращает всегда строку
// let age = prompt("Сколько тебе лет?", 20);
// console.log(age);

// confirm()
// - confirm возвращает boolean в isFrontendDeveloper, елси вы нажмете на OK, то вернется true, елси Cancel, то false
// let isFrontendDeveloper = confirm("Ты Frontend Developer?");
// console.log(isFrontendDeveloper);
////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Выражения

// +
// Сложение строк
let message1 = "Hello";
let message2 = "World";
console.log(message1 + message2);

// Число + число
let number1 = 22;
let number2 = 23;
console.log(number1 + number2);

// Число + строка
let someString = "22";
let someString2 = "Some string";
let someNumber = 23;

console.log(someString + someNumber);
console.log(someString2 + someNumber);

// string + boolean
console.log("Message" + true);
// string + undefined
console.log("Message" + undefined);
// string + null
console.log("Message" + null);

// number + undefined
// в результате сложения получится NaN. NaN - это Not a Number
console.log(23 + undefined);

// number + null
console.log(23 + null); // результат 23

// number + boolean
console.log(23 + false); // будет 23 - потому что false при сложении с числом  - это 0
console.log(23 + true); // будет 24 - потому что екгу при сложении с числом  - это 1

// number + Symbol()
// console.log(23 + Symbol()); // будет ошибка

// деление /

// число / 0
console.log(23 / 0); // - будет Infinity

// строка разделить на любой примитив - получится NaN
console.log("Message1" / "Message2");
console.log("Message1" / 3);
console.log("Message1" / true);
console.log("Message1" / undefined);
console.log("Message1" / null);

// boolean
console.log(false / false);

// Несколько операций сразу
console.log((3 + 2) * 10);

// %
console.log(33 % 5); // 3
console.log(3 % 0); // NaN
console.log(1 % 5); // 1

// ** - возведение в степень
console.log(3 ** 3);

// =+
let expession = 3 + 1;
console.log(expession); // 4
let expession2 = 3;
let expession3 = +expession2;
console.log(expession3);
expession2 += 4;
console.log(expession2);
///////////////////////////////////////////////////////////////////////////////
// Практика
console.log(50 - undefined); // NaN
console.log("message" * 3); // NaN
console.log(true / null); // Infinity
console.log(0 / null); // NaN
console.log(2 + 2 + "1"); // 41

// ++/--
let i = 2;
console.log(i++); // 2
console.log(i); // 3 - потому, что вы уже выполнили i++ в предыдущей строчке
console.log(++i); // 4 - действие происходит сразу же
let a = i++;
console.log(a);
console.log(a + ++i);

////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Приведение типов
// Number()
let car = "Audi";
console.log(Number(car)); // NaN
console.log(Number("22")); // 22
console.log(Number(false)); // 0
console.log(Number(true)); // 1

// String()
console.log(String(22)); // "22"
console.log(String(false)); // "false"
console.log(String(null)); // "null"
console.log(String(-300)); // "-300"

// Boolean()
console.log(Boolean("")); // false
console.log(Boolean("John")); // true
console.log(Boolean(0)); // false
console.log(Boolean(1)); // true
console.log(Boolean(120)); // true
console.log(Boolean(null)); // false
console.log(Boolean(undefined)); // false

//////////////////////////////////////////////////////
// Операторы сравноения == и ===

// == - сравнивает значения, но не типы
console.log(1 == true); // true

// === - стравнивает и типы и значение - используем в дальнейшем именно ===
console.log(1 === true); // false

// Операторы сравнения != и !== - не равно
console.log(1 != true); // false
console.log(1 !== true); // true

console.log(3 != "3"); // false
console.log(3 !== "3"); // true
//////////////////////////////////////////////////////////////////

// Логические операторы && - И, || - ИЛИ, ! - НЕ
// && - если есть хотя бы 1 false, то будет false
console.log(true && 1); // 1
console.log(1 === "1" && true); // false
console.log(true && 3); // 3

// || - должен быть хотя бы 1 true, то будет true
console.log(3 === 3 || 1 === 1 || 1 === 100); // true

// ! - обратное буленовое значение от вашего выражение
console.log(!false); // true
console.log(!1); // false

// Выражение !! - проверка на соответствие
console.log(!!21); // true
console.log(!!""); // false
console.log(!!undefined); // false

///////////////////////////////////////////////////////////////////////////////////////////////////////
// if else
let someAnimal = "Cat2";

if (someAnimal === "Tiger") {
  // тут пишется логическое условие, если true, то выполняются действия в теле if, если false, то выполняется выражение в теле else
  console.log("Выражение верное");
} else if (someAnimal === "Lion") {
  console.log(`Выражение верное: ${someAnimal}`);
} else if (someAnimal === "Cat") {
  console.log(`Выражение верное: ${someAnimal}`);
} else if (someAnimal === "Dog") {
  console.log(`Выражение верное: ${someAnimal}`);
} else if (someAnimal === "Rat") {
  console.log(`Выражение верное: ${someAnimal}`);
} else {
  console.log("Выражение ложное");
}

// Тернарный оператор
const digit = 60;

digit <= 50
  ? console.log("Число входит в диапазон до 50 включая 50")
  : digit <= 100
  ? console.log("Число входит в диапазон до 100 включая 100")
  : console.log("Ошибка: Число не входит в диапазон");
