// Доступ к HTML элементам

// 1. getElementById - метод поиска элемента по id. Возвращает 1 элемент по переданной id
const lessonTitle = document.getElementById("lesson-title");
console.log(lessonTitle);
lessonTitle.style.color = "red";

// 2. - getElementByTagName - поиск элемента по тегу. Возвращает массив тегов
const divs = document.getElementsByTagName("div");
console.log(divs);

// 3. - getElementByClassName - поиск элемента по классу. Возвращает массив тегов с определенным классом
const boxes = document.getElementsByClassName("box");
console.log(boxes);

// 4. querySelectorAll -находит по селектору. Всегда возвращает массив

// - по классу
const boxesBySelector = document.querySelectorAll(".box");
console.log(boxesBySelector);

// - по тегу
const divsBySelector = document.querySelectorAll("div");
console.log(divsBySelector);

// 5. qurySelector - возвращает лишь 1 элемент
const lessonTitleBySelector = document.querySelector("#lesson-title");
console.log(lessonTitleBySelector);

const box = document.querySelector(".box");
console.log(box);

console.log(typeof document);

///////////////////////////////////////////////////////////////////////////////////////////////////////
const getUserButton = document.querySelector(".get-user");
const userName = document.querySelector(".user-name");
const userAge = document.querySelector(".user-age");
// - addEventListener - это метод позволяющий добавлять событие для HTML элеиента
// он принимает 2 аргумента. 1 - событие, 2 - функция
const getUserData = () => {
  console.log("Button works");
  // Симулируем получение данных по сети
  const userInfo = {
    fullName: "Jonny Depp",
    age: 60,
  };

  // добавляем данные с полученного обьекта в userName и userAge
  userName.textContent = userInfo.fullName;
  userAge.textContent = userInfo.age;
};
getUserButton.addEventListener("click", getUserData);

//////////////////////////////////////
// Добавление аватра к карточке
const getUserAvatarButton = document.querySelector(".get-user-avatar");
const userCard = document.querySelector(".user-card");

const getUserAvatar = () => {
  const image = document.createElement("img");
  image.src =
    "https://bi.im-g.pl/im/81/63/1c/z29768321Q,76--Festiwal-Filmowy-w-Cannes--Johnny-Depp-.jpg";
  image.style.width = "200px";
  image.style.height = "200px";
  userCard.prepend(image);
};

getUserAvatarButton.addEventListener('click', getUserAvatar)

// Удаение карточки

const deleteUserCard = document.querySelector('.delete-user-card');

deleteUserCard.addEventListener('click', () => {
    userCard.remove();
})