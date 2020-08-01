
var Bolacha = {
    name: "Traquinas",
    valor: 1.50
}

var Leite = {
    name: "Elegê",
    valor: 5.00
}

var Macarrao = {
    name: "Adria",
    valor: 8.00
}

var listaItens = [Bolacha, Macarrao, Leite];

var total = listaItens.reduce(function(number, total) {
    return {valor: number.valor + total.valor}
});

console.log(total);