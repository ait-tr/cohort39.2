// Получаем доступ к HTML элементам
const GET_USER_FORM = document.querySelector(".get-user-form");
const USER_CONTAINER = document.querySelector(".user-container");
const SUCCESS_CONTAINER = document.querySelector(".user-success");
const ERROR = document.querySelector(".user-error");
const GET_USER_BUTTON = document.querySelector(".get-user-button");
const AVATAR = document.querySelector(".avatar");
const USER_NAME = document.querySelector("#user-name");
const USER_AGE = document.querySelector("#user-age");
const USER_EMAIL = document.querySelector("#user-email");
const USER_PHONE = document.querySelector("#user-phone");
const USER_ADDRESS = document.querySelector("#user-address");
const randomizeUserButtonName = "Randomize User";
const stopRandomizingButtonName = "Stop Randomizing";

// URL для отправки GET запроса
const RANDOM_USER_URL = "https://randomuser.me/api/";
let intervalID;

const getUserData = async () => {
  const response = await fetch(RANDOM_USER_URL);
  const result = await response.json();
  SUCCESS_CONTAINER.style.display = "none";
  ERROR.style.display = "none";

  const userObj = result.results[0];

  if (response.ok) {
    // Логика по отображению данных пользователя
    AVATAR.src = userObj?.picture?.large;
    USER_NAME.textContent = `${userObj.name.title} ${userObj.name.first} ${userObj.name.last}`;
    USER_AGE.textContent = `${userObj.dob.age}`;
    USER_EMAIL.textContent = `${userObj.email}`;
    USER_PHONE.textContent = `${userObj.phone}`;
    USER_ADDRESS.textContent = `${userObj.location.street.name} ${userObj.location.street.number}, ${userObj.location.postcode}, ${userObj.location.country}, ${userObj.location.city}`;
    SUCCESS_CONTAINER.style.display = "flex";
  } else {
    // Логика по отображению ошибки
    ERROR.style.display = "flex";
    clearInterval(intervalID);
  }
};

GET_USER_FORM.addEventListener("submit", (event) => {
  event.preventDefault();

  if (GET_USER_BUTTON.textContent === randomizeUserButtonName) {
    // Тут логика когда пользователь нажимает на "Randomize User"
    GET_USER_BUTTON.textContent = stopRandomizingButtonName;
    GET_USER_BUTTON.className = "stop-button";
    getUserData();
    intervalID = setInterval(getUserData, 15000);
  } else {
    // Тут логика когда пользователь нажимает на "Stop Randomizing"
    GET_USER_BUTTON.textContent = randomizeUserButtonName;
    GET_USER_BUTTON.className = "get-user-button";
    clearInterval(intervalID);
  }
});
