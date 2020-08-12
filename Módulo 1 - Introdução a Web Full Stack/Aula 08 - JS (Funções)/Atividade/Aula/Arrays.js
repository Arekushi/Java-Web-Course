// var names = "Alex Bia Gi Del"
// var array = names.split(" ");
// console.log(array[0]);
// console.log(array);
// console.log(array.join(", "));

// // Coloca no final
// array.push("Canaros");
// console.log(array);

// // Coloca no inicio
// array.unshift("Rafa");
// console.log(array);

// // Retirar o último
// array.pop();

// // Retirar o primeiro
// array.shift();

// console.log(array);

// // Substituir elemento
// array[0] = "Alexandre"
// console.log(array);

// // Slice
// console.log(array.slice(0, 2));

// // Splice
// var splice = array.splice(0, 1, "Eu mesmo");
// console.log(splice);
// console.log(array)

// ForEach
let array = [1, 5, 7];
// array.forEach((value, index) => {
//     console.log("Valor", value, "Indice", index);
// });

// Map
// Modifica valores de um array
// let arrayMap = array.map((number) => {
//     return number * 2;
// });

// console.log(arrayMap);

// Filter
// Filtrar os valores
// let filtrado = array.filter((number) => {
//     return number > 1;
// });

// console.log(filtrado);

// Reduce
// Reduzir os valores para um unico valor
let reduced = array.reduce((number, total) => {
    return number + total;
});

console.log(reduced);
