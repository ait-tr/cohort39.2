const SPACESHIP_CARD = document.querySelector(".spaceship-card");

const spaceship = {
  name: "Millennium Falcon",
  manufacturer: "Corellian Engineering Corporation",
  crew: ["Han Solo", "Chewbacca"],
  maxSpeed: "Speed of light",
  img: "https://i.pinimg.com/736x/b0/6a/85/b06a85024145e0808746dcb3e192d16b.jpg",
};

// 1 способ
// const setSpaceshipDataToCard = () => {
//   // const { name, manufacturer, crew, maxSpeed, img } = spaceship;

//   // // Добавляем название корабля в карточку
//   // // шаг1: создаем необходимые элементы
//   // const nameContainer = document.createElement("div");
//   // const nameTitle = document.createElement("p");
//   // const nameDescription = document.createElement("p");

//   // // шаг2: Раздаем классы для созданных HTML элементов
//   // nameContainer.className = "spaceship-info-container";
//   // nameTitle.className = "spaceship-info-title";
//   // nameDescription.className = "spaceship-info-description";

//   // // шаг3: Передаем данные в необходимые элементы
//   // nameTitle.textContent = "Title";
//   // nameDescription.textContent = name;

//   // //шаг4: добавляем элементы в карточку
//   // nameContainer.append(nameTitle);
//   // nameContainer.append(nameDescription);
//   // SPACESHIP_CARD.append(nameContainer);

//   for (key in spaceship) {
//     console.log(key); // ключи объекта
//     console.log(spaceship[key]); // значения обьектов

//     // шаг1: создаем необходимые элементы
//     const infoContainer = document.createElement("div");
//     const title = document.createElement("p");
//     const description = document.createElement("p");

//     // шаг2: Раздаем классы для созданных HTML элементов
//     infoContainer.className = "spaceship-info-container";
//     title.className = "spaceship-info-title";
//     description.className = "spaceship-info-description";

//     if (key === "img") {
//       const img = document.createElement("img");
//       img.src = spaceship[key];
//       img.alt = "Spaceship image";
//       img.className = "spaceship-img ";

//       infoContainer.append(title);
//       infoContainer.append(img);
//       SPACESHIP_CARD.append(infoContainer);
//     } else {
//       // шаг3: Передаем данные в необходимые элементы
//       title.textContent = key;
//       description.textContent = spaceship[key].toString();

//       //шаг4: добавляем элементы в карточку
//       infoContainer.append(title);
//       infoContainer.append(description);
//       SPACESHIP_CARD.append(infoContainer);
//     }
//   }
// };

// setSpaceshipDataToCard();

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 2 способ

const setSpaceshipDataToCard = () => {
  let spacehipHTML = [];
  for (key in spaceship) {
    if (key === "img") {
      const spaceshipImg = `
  <div class="spaceship-info-container">
    <p class="spaceship-info-title">${key}</p>
    <img class="spaceship-img" src=${spaceship[key]}></p>
  </div>
    `;

      spacehipHTML.push(spaceshipImg);
    } else {
      const spaceshipInfo = `
  <div class="spaceship-info-container">
    <p class="spaceship-info-title">${key}</p>
    <p class="spaceship-info-description">${spaceship[key].toString()}</p>
  </div>
    `;

      // spacehipHTML.concat(spaceshipInfo);
      spacehipHTML.push(spaceshipInfo);
    }
  }

  console.log(spacehipHTML);
  // SPACESHIP_CARD.innerHTML = spacehipHTML.toString().replaceAll(",", " ");
  SPACESHIP_CARD.innerHTML = spacehipHTML.join(" ");
};

setSpaceshipDataToCard();

// const array = [1,2,3,4];
// console.log(array.toString());
console.log(["1", "2", "3"].join(" "));
