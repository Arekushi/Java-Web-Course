var alunoA = {
    nome: "Jubileu",
    serie: 9
}

var alunoB = {
    nome: "Ricardo",
    serie: 8
}

var alunoC = {
    nome: "Roberto",
    serie: 9
}

var alunoD = {
    nome: "Isabela",
    serie: 9
}

var alunoE = {
    nome: "Gabriela",
    serie: 8
}

var listaAlunos = [alunoA, alunoB, alunoC, alunoD, alunoE];

console.log(listaAlunos.map((obj) => {
    return obj.serie == 8? "História" : "Física";
}));