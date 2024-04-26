const CARDS_WRAPPER = document.querySelector("#cards-wrapper");

const users = [
  { id: 1, fullName: "John Doe", age: 30, job: "QA" },
  { id: 2, fullName: "Jane Smith", age: 25, job: "Frontend" },
  { id: 3, fullName: "Alex Johnson", age: 35, job: "Bakend" },
  { id: 4, fullName: "Emily Brown", age: 28, job: "UI/UX" },
  { id: 5, fullName: "Michael Wilson", age: 32, job: "QA" },
  { id: 6, fullName: "Sarah Davis", age: 27, job: "Frontend" },
  { id: 7, fullName: "Daniel Martinez", age: 33, job: "Bakend" },
  { id: 8, fullName: "Olivia Anderson", age: 29, job: "UI/UX" },
  { id: 9, fullName: "William Thomas", age: 31, job: "QA" },
];

const showAllUsers = () => {
  // ШАГ1: Проходимся циклом по массиву users используя forEach()
  users.forEach((value) => {
    // ШАГ2: Деструктуризируем даные обьекта
    const { fullName, age, job, id } = value;
    console.log(value);

    // ШАГ3: Создаем HTML элементы
    const CARD = document.createElement("div");
    const FULL_NAME = document.createElement("p");
    const AGE = document.createElement("p");
    const JOB = document.createElement("p");

    // ШАГ4: Раздаем классы
    CARD.className = "users-card";
    FULL_NAME.className = "user-info";
    AGE.className = "user-info";
    JOB.className = "user-info";

    // ШАГ5: Раздаем контент и атрибуты
    CARD.id = id;
    FULL_NAME.textContent = `Full Name: ${fullName}`;
    AGE.textContent = `Age: ${age}`;
    JOB.textContent = `Job: ${job}`;

    // ШАГ6: добавляем HTML элементы в DOM

    CARD.append(FULL_NAME);
    CARD.append(AGE);
    CARD.append(JOB);
    CARDS_WRAPPER.append(CARD);
  });
};

showAllUsers();
