const SQUARE = document.querySelector(".square");
const RANDOMIZE_BUTTON = document.querySelector("#randomize-button");
const STOP_BUTTON = document.querySelector("#stop_button");

const colors = [
  "#FFFFFF",
  "#2196F3",
  "#4CAF50",
  "#FF9800",
  "#009688",
  "#795548",
  "rgb(42, 34, 82)",
  "rgb(61, 30, 214)",
  "blueviolet",
  "rgb(214, 30, 30)",
];

let intervalId;

RANDOMIZE_BUTTON.addEventListener("click", () => {
  const getRandomNumber = () => {
    return Math.floor(Math.random() * colors.length);
  };

  intervalId = setInterval(() => {
    SQUARE.style.backgroundColor = colors[getRandomNumber()];
  }, 3000);

  RANDOMIZE_BUTTON.disabled = true;
});

STOP_BUTTON.addEventListener("click", () => {
  clearInterval(intervalId);
  RANDOMIZE_BUTTON.disabled = false;
});
