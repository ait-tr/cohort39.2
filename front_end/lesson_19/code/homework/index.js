const character = {
  name: "Basic charaacter",
  health: 100,
  level: 1,
  introduce() {
    console.log(this);
    console.log(
      `Hello, my name is ${this.name}, I am at level ${this.level}, and I have ${this.health} health.`
    );
  },
};

const warrior = {
  __proto__: character,
  name: "Artes",
  health: 100,
  level: 100,
  weapon: "Frastmorne",
  attack() {
    console.log(`My weapon is ${this.weapon}`);
  },
};

const wizard = {
  __proto__: character,
  name: "Volandemort",
  health: 60,
  level: 100,
  spell: "Avada cedavra",
  castSpell() {
    console.log(`My spell is ${this.spell}`);
  },
};

character.introduce();
warrior.introduce();
wizard.introduce();

warrior.attack();
wizard.castSpell();

function getContext(param1, param2) {
  console.log(param1);
  console.log(param2);
  console.log(this);
}

getContext.call(character, "hello, it's character", "Second param");
getContext.apply(warrior, ["hello, it's warrior", "Second param"]);

const bindFunc = getContext.bind(wizard, "1 param", "2 param");
bindFunc();
