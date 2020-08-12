var pessoa = {
    name: "Alex",
    lastName: "Lima",
    age: 18,
    apresentar: apresentacao
};

var animal = {
    name: "Dog",
    age: 3,
}

function apresentacao() {
    console.log("Olá", this.name, this.lastName, "Que possui", this.age, "Anos");
}

pessoa.apresentar();
