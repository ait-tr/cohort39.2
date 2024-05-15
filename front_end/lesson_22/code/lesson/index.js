const JOKES = document.querySelector(".jokes");
const GET_JOKE_BUTTON = document.querySelector(".get-joke");
const JOKE_FORM = document.querySelector(".joke-card");

const RANDOM_JOKE_URL = "https://official-joke-api.appspot.com/random_joke";

JOKE_FORM.addEventListener("submit", async (event) => {
  event.preventDefault();
  GET_JOKE_BUTTON.disabled = true;
  JOKES.textContent = "";
  // Метод fetch возвращает Promise
  // когда мы используем await мы получаем обьект Response - дает общую информацию об ответе, такую как: url, ok, status. А также предоставляет
  // вам методы, для получения данных из тела
  // Этот метод называется json()
  //   const response = await fetch(RANDOM_JOKE_URL, {
  //     method: "GET",
  //   });
  // По умолчанию fetch использует метод GET, соответственно его явно прописывать не нужно, Нужно только если вам ныжны остальные методы
  const response = await fetch(RANDOM_JOKE_URL);
  console.log(response);

  // Метод json() возвращает Promise и преобразует JSON в JS обьект, чтобы достать дынные из тела ответа используем await
  // В итоге в result в нашем случае у нас будет лежать ответ от сервера в виде JS обьекта
  const result = await response.json();
  console.log(result);

  if (response.ok) {
    // Отображаем данные в HTML
    JOKES.textContent = `${result.setup}: ${result.punchline} `;
    GET_JOKE_BUTTON.disabled = false;
  } else {
    // Отображаем ошибку
    JOKES.textContent = "JOKES NOT FOUND!!! PLEASE TRY AGAIN";
    GET_JOKE_BUTTON.disabled = false;
  }
});
