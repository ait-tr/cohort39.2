// async/await

// функция имитация запроса по сети
const getAnimalQuery = (sec) => {
  return new Promise((resolve, reject) => {
    if (sec > 5) {
      const error = {
        status: 400,
        message: "Some error on the client side",
      };

      setTimeout(() => {
        reject(error);
        // throw new Error("Some error");
      }, 6000);
    } else {
      const animal = {
        name: "Tiger",
        color: "orange",
        isWild: true,
        imgURL:
          "https://files.worldwildlife.org/wwfcmsprod/images/Tiger_resting_Bandhavgarh_National_Park_India/hero_small/6aofsvaglm_Medium_WW226365.jpg",
      };

      setTimeout(() => {
        resolve(animal);
      }, sec * 1000);
    }
  });
};

const getAnimal = async () => {
  try {
    const result = await getAnimalQuery(6);
    console.log(result);
  } catch (error) {
    console.log(error);
  } finally {
    console.log("Request has finished");
  }
};

getAnimal();

// event loop

// task 1
function main() {
  console.log(1);

  setTimeout(() => console.log(2), 0);

  console.log(3);
  console.log(4);
  console.log(5);
  console.log(6);
  console.log(7);
  console.log(8);
  console.log(9);
  console.log(10);
}

main();

// task 2

setTimeout(() =>console.log(1), 0);

const promise = new Promise((resolve, reject ) =>{
  resolve(2)
})

promise
.then((result) => console.log(result))
.finally((result) => console.log(3));

console.log(4);
