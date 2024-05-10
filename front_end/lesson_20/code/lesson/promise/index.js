// Создание промиса

const promise = new Promise((resolve, reject) => {
  // Имитируем отправку запроса на сервер
  const responseFromServer = {
    status: "success",
    data: {
      name: "John Smith",
      age: 30,
    },
  };

  // Имитируем задежку
  setTimeout(() => {
    if (responseFromServer.status === "success") {
      // Ответ пришел с успешными данными, значит вызывается resolve
      resolve(responseFromServer.data);
    } else {
      // Ответ пришел с ошибкой, значит вызывается reject
      reject(new Error("Sorry, we have error on server"));
    }
  }, 3000);
});

console.log(promise);

promise
  .then((data) => {
    alert(`Name: ${data.name}, age: ${data.age}`);
  })
  .catch((error) => {
    alert(error.message);
  })
  .finally(() => {
    console.log("Я выполнюсь в любом случаи придет ошибка или валидные данные");
  });

console.log("100");
