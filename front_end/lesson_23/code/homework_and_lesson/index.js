const CAT_FACTS_FORM = document.querySelector(".cat-facts-card");
const CAT_FACTS = document.querySelector(".cat-facts");
const GET_CAT_FACTS_BUTTON = document.querySelector(".get-cat-fact");

const CAT_FACTS_URL = "https://catfact.ninja/fact";

CAT_FACTS_FORM.addEventListener("submit", async (event) => {
  event.preventDefault();
  GET_CAT_FACTS_BUTTON.disabled = true;

  // Это схема работы fetch с try/catch/finally
  // Проблема fetch в том что он не пробрасывает ошибки в catch и соответственно не вызывает блок catch
  // Чтобы нам вызвать блок catch нужно все равно использовать response.ok
  // response.ok === true, если диапозон статусов 200-299, елси нет, тогда response.ok === false
  //   try {
  //     const response = await fetch(CAT_FACTS_URL);

  //     const result = await response.json();
  //     console.log("Result", result);

  //     if (!response.ok) {
  //       // Вызываем блок catch и прерываем выполнение try
  //       throw Object.assign(
  //         new Error("ERROR: Cat fact not found!!! Please, try again"),
  //         {
  //           response: result,
  //         }
  //       );
  //     } else {
  //       // Тут дальше будет работа с успеным ответом
  //       const FACT = document.createElement("li");
  //       FACT.textContent = `${result.fact}`;
  //       CAT_FACTS.append(FACT);
  //     }
  //   } catch (error) {
  //     // Тут дальше будет обработка ошибок
  //     console.log("BLOCK CATCH", error.response);

  //     if (error.response.code === 429) {
  //       alert(error.response.message);
  //     } else {
  //       alert("ERROR: Cat fact not found!!! Please, try again");
  //     }
  //   } finally {
  //     // То что мы хотим выполнить в любом случае
  //     GET_CAT_FACTS_BUTTON.disabled = false;
  //   }

  //////////////////////////////////////////////////////////////////////////////////////////////////////

  //   Обработка сценариев через response.ok
  const response = await fetch(CAT_FACTS_URL);

  const result = await response.json();

  if (response.ok) {
    // ШАГ1: Создаем элементы
    const FACT_CONTAINER = document.createElement("li");
    const FACT_CONTROL = document.createElement("div");
    const FACT = document.createElement("p");
    const DELETE_FACT_BUTTON = document.createElement("button");

    // ШАГ2 Наполняем элементы контентом, стилями и атрибутами
    FACT.textContent = `${result.fact}`;
    DELETE_FACT_BUTTON.textContent = "Delete fact";
    FACT_CONTROL.className = "fact-container";
    DELETE_FACT_BUTTON.className = "delete-button";
    DELETE_FACT_BUTTON.type = "button";

    // ШАГ3: Добавляем событие для кнопки
    DELETE_FACT_BUTTON.addEventListener("click", (event) => {
      event.preventDefault();
      // Тут пишем логику по удалению
      FACT_CONTAINER.remove();
    });

    // ШАГ4: Отображаение в DOM
    FACT_CONTROL.append(FACT);
    FACT_CONTROL.append(DELETE_FACT_BUTTON);
    FACT_CONTAINER.append(FACT_CONTROL);
    CAT_FACTS.append(FACT_CONTAINER);
    //
    GET_CAT_FACTS_BUTTON.disabled = false;
  } else {
    if (result.code === 429) {
      alert(result.message);
    } else {
      alert("ERROR: Cat fact not found!!! Please, try again");
    }

    GET_CAT_FACTS_BUTTON.disabled = false;
  }
});
