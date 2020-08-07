
/* [Função] */
// function fun(number) {
//     console.log(number % 2 == 0? number + " Par" : number + " Impar");
// }

// for(let i = 10; i < 15; i++) {
//     fun(i);
// }

/* [Função Anonima] */
// var funcAnonima = function(name) {
//     return "Olá " +name;
// }

// console.log(funcAnonima("Alex"));

// function primo(number) {
//     let qtd = 0;

//     for(let i = 0; i <= number; i++) {
//         qtd += (number % i == 0)? 1 : 0;
//     }

//     return qtd == 2;
// }

/* [Função com construtor] */
// var dizerTchau = new Function("nome", "console.log('Tchau', nome);")
// dizerTchau("Alex");

/* [Função Aninhada] */
// function circurferencia(raio) {
//     function diametro() {
//         return raio * 2;
//     }

//     return Math.PI * diametro();
// }

// console.log(circurferencia(2));

/* [Callback] */
/* Função que vai chamar outra função, mas a segunda função só será executando quando
a primeira terminar */

// function functionA(callback) {
//     /*setTimeout(callback, 3000);
//     console.log("A vem primeiro");*/

//     /*setTimeout(function(){
//         console.log("A vem primeiro");
//         callback();
//     }, 3000);*/
// }

// function functionB() {
//     console.log("B vem depois");
// }

// functionA(functionB);

// function dizerOi(name) {
//     console.log(this);
//     console.log("Olá", name);
// }

// dizerOi("Alex");
// dizerOi.call({}, "Alexia"); // null
// dizerOi.apply({}, ["Maria"]);

// [Função Auto-invocada]
(function() {
    var a = 1;
    console.log(a);
})();
