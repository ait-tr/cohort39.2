const car = {
  title: "Porsche",
  model: "911",
  color: "black",
  maxSpeed: "300 km/h",
};

const { title, model, color, maxSpeed, minSpeed } = car;
console.log(title, model, color, maxSpeed);
console.log(minSpeed?.speed);

///////////////////////////////////////////////////////////////////////////////////

const appliance = {
  id: 1,
  name: "Стиральная машина",
  brand: "Samsung",
  type: "автоматическая",
  capacity_kg: 8,
  features: {
    feature1: "Экономия воды",
    feture2: "Система самоочистки",
    feture3: "Инверторный двигатель",
  },
  price: 25000,
  availability: true,
};

// Поверхностная копия - только первый уровень вложенности
const applianceClone = { ...appliance };

console.log(appliance);
console.log(applianceClone);

applianceClone.id = 2;
console.log(appliance);
console.log(applianceClone);

applianceClone.features.feture2 = "Отсутствие системы самоочистки";
console.log(appliance);
console.log(applianceClone);

// Глубокая копия обьекта

// 1. Пример через цикл
// const applianceDeepCopy = {};
// for (key in appliance) {
//   if (typeof appliance[key] === "object") {
//     applianceDeepCopy[key] = {};
//     for (subkey in appliance[key]) {
//       applianceDeepCopy[key][subkey] = appliance[key][subkey];
//     }
//   } else {
//     applianceDeepCopy[key] = appliance[key];
//   }
// }
// applianceDeepCopy.features.feature1 = "Function not available";
// console.log(appliance);
// console.log(applianceDeepCopy);

// 2. Пример через spread, если мы знаем имя ключа
// const applianceDeepCopy = { ...appliance, features: { ...appliance.features } };

// 3. Пример через spread + цикл, если мы не знаем имя ключек
const applianceDeepCopy = {};
for (key in appliance) {
  if (typeof appliance[key] === "object") {
    applianceDeepCopy[key] = {...appliance[key]};
  } else {
    applianceDeepCopy[key] = appliance[key];
  }
}
applianceDeepCopy.features.feature1 = "Function not available";
console.log(appliance);
console.log(applianceDeepCopy);
