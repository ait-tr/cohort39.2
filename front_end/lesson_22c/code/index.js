// for (var index = 0; index < 10; index++) {
//   setTimeout(() => {
//     console.log(index); // 10
//   }, index * 1000);
// }

//

let index = 0;

while (index < 10) {
  setTimeout(() => {
    console.log(index);
  }, index * 1000);

  index++;
}

const fun1 = async function () {};
const fun2 = async () => {};
