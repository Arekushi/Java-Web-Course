var texto = "Meu texto simples";

console.log(texto.length);
console.log(texto.indexOf("texto"));
console.log(texto.lastIndexOf("texto"));

console.log(texto.slice(0, 4));
console.log(texto.substr(0, 4));
console.log(texto.substring(0, 4));

var numbers = "0123456789";
console.log(numbers.slice(2,4));   // apresenta 23
console.log(numbers.slice(4,-8)); // apresenta 3456
