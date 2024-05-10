// WEB API - браузерное окружение, в котором находятся методы и св-ва, которыми пользуется JS для выполнения задач в браузере
// setTimeout(callback, ms);
// - 1 аргумент - callback - функция, которая выполнится через переданное в качестве 2 аргумента ms
// - 2 аргумент - колл-во ms
// setTimeout возвращает timerID
console.log(1);
const timerID = setTimeout(() => {
  console.log("Прошло 2 сек", 2);
}, 2000);
console.log(timerID);
// clearTimeout - фунция, которая отменяет выполлнение setTimeout, передав ей в качестве аргумента timerId
clearTimeout(timerID);

console.log(3);

// Задача: написать функцию, чтобы она увеличивала счетчик до 10 каждую сек и выводила каждый новый результат в консоль

function countToTen() {
  let count = 1;

  const increment = () => {
    console.log(count);

    if (count < 10) {
      count++;
      setTimeout(increment, 1000);
    }
  };

  increment();
}

countToTen();

// 2. setInterval()
// let time = 1;

// const intervalID = setInterval(() => {
//   console.log(time);
//   time++;
// }, 1000);

// setTimeout(() => clearInterval(intervalID), 11000);


// Практика

const START_STOP_BUTTON = document.querySelector("#timerStartStop");
const COUNTER_CONTAINER = document.querySelector("#counter-container");
let time = 0;
let isStarted = false;
let intervalId;
START_STOP_BUTTON.addEventListener("click", () => {
  if (!isStarted) {
    isStarted = true;
    intervalId = setInterval(() => {
      time++;
      COUNTER_CONTAINER.innerHTML = `${time}`;
    }, 1000);
  } else {
    isStarted = false;
    clearInterval(intervalId);
  }
});