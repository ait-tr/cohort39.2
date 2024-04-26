const user = {
  fullName: "John Jonson",
  age: 28,
};

const additionalUserProps = {
  isAdmin: true,
  hairColor: "black",
  height: 185,
  job: "Frontend Developer",
};

const concatOjects = (obj1, obj2) => {
  return { ...obj1, ...obj2 };
};

console.log(concatOjects(user, additionalUserProps));
