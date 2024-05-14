const showNumbers = (seconds) => {
  // Возвращаем промис из функции showNumbers()
  // Промис принимает в себя в качестве аргумента функцию callback
  // у функции callback 2 аргумнта
  // 1- функция resolve - при ее вызове проми переходит в состояние fullfiled
  // 2 - функция reject - при ее вызове, промис завется с ошибкой и переходит в состояние rejected
  return new Promise((resolve, reject) => {
    if (seconds > 10) {
      // Вызываем ф-ю reject, и таким образом промис завершиться с ошибкой
      // В круглые скобки reject мы прокидываем ошибку
      reject(new Error("Ошибка: максимальное количество секунд = 10"));
    } else {
     setTimeout(() => {
        // Вызываем ф-ю resolve, и таким образом промис завершиться успешно
        // В круглые скобки куышдму мы прокидываем валидные данные
        resolve(`Прошло ${seconds} секунд(ы)`);
      }, seconds * 1000);
    }
  });
};

// вызываем showNumbers и он нам возвращает Promise
// showNumbers(6)
//   .finally(() => {
//     console.log("Finally works1!!!");
//   })
//   //   .then((result) => {
//   //     // В result лежит то что мы передали в resolve
//   //     console.log(result);
//   //   })
//   //   .catch((error) => {
//   //     // В error лежит то что мы передали в reject
//   //     console.log(error);
//   //   })
//   .then(
//     (result) => {
//       console.log(result);
//     },
//     (error) => {
//       console.log("Then error", error);
//     }
//   );

// showNumbers(5)
//   .finally(() => {
//     console.log("Finally works1!!!");
//   })
//   .then((result) => {
//     // В result лежит то что мы передали в resolve
//     console.log(result);
//   })
//   .catch((error) => {
//     // В error лежит то что мы передали в reject
//     console.log(error);
//   });

// Методы промисов(Promise API)
// 1. Promise.race() - выполняет только тот промис, который выполнится первым

Promise.race([showNumbers(5), showNumbers(7)]).then((res) => {
  console.log(res);
});

// 2. Promise.all() - выполняет все промисы

Promise.all([showNumbers(5), showNumbers(11)]).then((res) => {
  console.log(res);
});

//Задача:
const promise = new Promise((resolve, reject) => {
  resolve("success");
  reject("Some error");
});

promise
  .then((res) => {
    console.log("block then", res);
  })
  .catch((error) => {
    console.log("block catch", error);
  });
