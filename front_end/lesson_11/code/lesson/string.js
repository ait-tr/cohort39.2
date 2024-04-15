// Методы строк

let fullName = "John Johnson";

// 1 length - длинна строки
console.log(fullName.length);

// 2. toUpperCase()- преобразует строку в верхний регистр
console.log(fullName.toUpperCase());
console.log(fullName);

// 3. toLowerCase() - преобразует строку в верхний регистр
console.log(fullName.toLowerCase());

// 4. substring() - возвращает нужную часть строки
console.log(fullName.substring(5, 12));

// 5. split()
console.log(fullName.split(' '));

const names = "Вася, Петя, Маш";

console.log(names.split("а"))