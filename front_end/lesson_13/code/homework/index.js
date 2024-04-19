// Пропишем все константы, в которые мы положим нужные нам элементы, с которыми мы собираемя работать
const INGREDIENTS_BUTTONS_CONTAINER =
  document.querySelector(".buttons-container");
const INGREDIENTS_WRAPPER = document.querySelector(".ingredients-control");
const REMOVE_ALL_INGREDIENTS = document.querySelector(".remove-ingredients");

const buttonNames = [
  "Cheese",
  "Onion",
  "Bacon",
  "Salad",
  "Cotlet",
  "Bun",
  "Ketchup",
];

const addIngredient = (ingredientName) => {
  // Создаем HTML элемент p
  const ingredient = document.createElement("p");
  // Дадим имя ингредиента
  ingredient.textContent = ingredientName;
  // Дадим класс
  ingredient.className = "ingredient";
  // Добавлем ингредиент на страницу
  INGREDIENTS_WRAPPER.prepend(ingredient);

  // Проверяем сколько элементов уже добавлнно
  if (!!INGREDIENTS_WRAPPER.innerHTML) {
    REMOVE_ALL_INGREDIENTS.style.display = "block";
  }
};

const deleteAllIngredients = () => {
  // 1 способ: через цикл
  //   console.log(allIngredients);

  //   for (let index = 0; index < allIngredients.length; index++) {
  //     allIngredients[index].remove();
  //   }
  // 2 способ: через innerHTML
  INGREDIENTS_WRAPPER.innerHTML = "";
  REMOVE_ALL_INGREDIENTS.style.display = "none";
};

REMOVE_ALL_INGREDIENTS.addEventListener("click", deleteAllIngredients);

for (let index = 0; index < buttonNames.length; index++) {
  // Создаем HTML элемент button
  const button = document.createElement("button");
  // Дадим имя кнопке
  button.textContent = buttonNames[index];
  // Дадим класс каждой кнопке
  button.className = "add-ingredient";
  // Дадим id для каждой кнопки
  button.id = buttonNames[index];
  //   <button id="Cheese" class="add-ingredient">Cheese</button>
  // Передадим функцию каждой конпке

  // 1 способ
  //   const ALL_INGREDIENTS = document.querySelectorAll(".ingredient");
  //   const addIngredientsWrapper = () => {addIngredient(buttonNames[index])}
  //   button.addEventListener('click', addIngredientsWrapper);

  // 2 способ
  button.addEventListener("click", () => addIngredient(buttonNames[index]));

  // Добавление button на страницу
  INGREDIENTS_BUTTONS_CONTAINER.append(button);
}

// Пример: innerHTML vs textContent
// const testInnerhtml = document.querySelector('.testInnerhtml');
// testInnerhtml.style.color = 'white';
// testInnerhtml.textContent = "Эта строчка добавленна через textContent"
// testInnerhtml.innerHTML = 'Эта строчка добалена через innerHTML'
// testInnerhtml.textContent = `<p>Эта строчка добавленна через textContent в теге p</p>`;
// testInnerhtml.innerHTML = `<p>Эта строчка добавленна через textContent в теге p</p>`
