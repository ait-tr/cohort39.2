let temperature = prompt("Введите температуру:");
console.log(temperature);

if (temperature === null) {
  alert("Вы нажали отмена! Перезагрузите страницу и попробуйте еще раз");
} else if (temperature === "") {
  alert(
    "Вы нажали OK и ничего не ввели! Перезагрузите страницу и попробуйте еще раз"
  );
} else {
  let normalizedTemperature = Number(temperature);

  if (normalizedTemperature < 0) {
    console.log("Холодно!");
  } else if (normalizedTemperature <= 20) {
    console.log("Прохладно!");
  } else if (normalizedTemperature > 20 && normalizedTemperature <= 30) {
    console.log("Тепло!");
  } else if (normalizedTemperature > 30) {
    console.log("Жарко!");
  }
}
