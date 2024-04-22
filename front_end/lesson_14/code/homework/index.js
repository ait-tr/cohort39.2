// Формула вычисления:
// Масса тела женщин = рост - (100 + (рост - 100) : 10)
// Масса тела мужчин = рост - (100 + (рост - 100) : 20)

const WEIGHT_FORM = document.querySelector(".weight-form");
const RESULT = document.querySelector(".result");

// const calcWeight = () => {};
// addEventListener(action, callback)
// action  === 'submit'
// callback === () => {}
// () => {} === calcWeight - не вызываются
// (() => {})() === calcWeight() - вызываются

WEIGHT_FORM.addEventListener("submit", (event) => {
  event.preventDefault();
  RESULT.style.color = "black";

  const height = Number(event.target.height.value);
  const gender = event.target.gender.value;

  if (height >= 150) {
    if (gender === "male") {
      RESULT.textContent = `Ваш идеальный вес: ${(
        height -
        (100 + (height - 100) / 20)
      ).toFixed(1)}`;
    } else {
      RESULT.textContent = `Ваш идеальный вес: ${(
        height -
        (100 + (height - 100) / 10)
      ).toFixed(1)}`;
    }
  } else {
    RESULT.textContent = "Минимальный рост для расчета: 150см";
    RESULT.style.color = "red";
  }
});

//////////////////////////////////////////////////////////////////////////////////////////
// const GOOGLE_LINK = document.querySelector('#google-link');

// GOOGLE_LINK.addEventListener('click', (event) => {
//     event.preventDefault();
// })
