const bmw = { brand: "BMW", price: 20000, isDiesel: true };
const mercedes = { brand: "Mercedes", price: 22000, isDiesel: false };
const porshe = { brand: "Porshe", price: 50000, isDiesel: true };

const brands = {
  BMW: "BMW",
  MERCEDES: "Mercedes",
  PORSHE: "Porshe",
};

const getCarByNameQuery = (carBrand) => {
  return new Promise((resolve, reject) => {
    switch (carBrand) {
      case brands.BMW: {
        setTimeout(() => {
          resolve(bmw);
        }, 3000);

        break;
      }

      case brands.MERCEDES: {
        setTimeout(() => {
          resolve(mercedes);
        }, 5000);

        break;
      }

      case brands.PORSHE: {
        setTimeout(() => {
          resolve(porshe);
        }, 7000);

        break;
      }

      default: {
        setTimeout(() => {
          reject(new Error("Error: Bad request"));
        }, 10000);
      }
    }
  });
};

// Повторение: вывести обьект в консоль, через синтаксис then/catch/finally

// getCarByNameQuery("BMW")
//   .then((result) => {
//     console.log(result);
//   })
//   .catch((error) => {
//     console.log(error);
//   });

// машину, имя которой вы передадите в качестве аргумента
const getCarByName = async () => {
  const porshe = await getCarByNameQuery(brands.PORSHE);

  console.log(porshe);
  console.log("after await");
};

getCarByName();
// все машины сразу

const getAllCars = async () => {
  const allCars = await Promise.all([
    getCarByNameQuery(brands.BMW),
    getCarByNameQuery(brands.MERCEDES),
    getCarByNameQuery(brands.PORSHE),
  ]);

  console.log(allCars);
};

getAllCars();

// машину, которая первая вернется в переменную

const getFirstCar = async () => {
  const firstCar = await Promise.race([
    getCarByNameQuery(brands.BMW),
    getCarByNameQuery(brands.MERCEDES),
    getCarByNameQuery(brands.PORSHE),
  ]);

  console.log(firstCar);
};

getFirstCar();

// ошибку

const getError = async () => {
  try {
    const result = await getCarByNameQuery("Audi");
    console.log("Try block", result);
  } catch (error) {
    console.log("Catch block", error);
  }
};

getError();
