const userEmail = [
  "alex@testemail.com",
  "pavel@testemail.com",
  "john@testemail.com",
];

// Получаем доступ к нужным нам html элементам
const LOGIN_BUTTON = document.querySelector(".login-button");
const LOGIN_FORM = document.querySelector(".login-form");

// 1 способ: Получаем доступ к значениям элементов формы через событие click и доступ к LOGIN_FORM
LOGIN_BUTTON.addEventListener("click", (event) => {
  //   Метод preventDefault отменяет стандарное поведение браузера при возникновении события
  event.preventDefault();

  const emailValue = LOGIN_FORM.email.value;
  const passwordValue = LOGIN_FORM.password.value;
  console.log(emailValue);
  console.log(passwordValue);

  for (let index = 0; index < userEmail.length; index++) {
    if (emailValue === userEmail[index]) {
      alert("Вы успешно вошли в систему!!!");
      break;
    } else {
      if (index === userEmail.length - 1) {
        alert("Пользователя с таким email не существует");
      }
    }
  }
});

// 2 способ: Получаем доступ к значениям элемнтов формы через событие submit используея event.target
// LOGIN_FORM.addEventListener("submit", (event) => {
//   event.preventDefault();

//   // Получаем доступ к данным из формы
//   const emailValue = event.target.email.value;
//   const passwordValue = event.target.password.value;

//   console.log(emailValue);
//   console.log(passwordValue);
// });
