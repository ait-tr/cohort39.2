const counter = document.querySelector(".counter");
const minus = document.querySelector("#minus-button");
const plus = document.querySelector("#plus-button");
const reset = document.querySelector(".reset-button");

let count = 0;

const changeCount = () => {
  counter.textContent = count;
};

const onMinus = () => {
  if (count > -10) {
    count -= 1;
    changeCount();
  }
};

const onPlus = () => {
  if (count < 10) {
    count += 1;
    changeCount();
  }
};

const onReset = () => {
  count = 0;
  changeCount();
};

minus.addEventListener("click", onMinus);
plus.addEventListener("click", onPlus);
reset.addEventListener("click", onReset);
