let primo = (number) => {
    let qtd = 0;

    for(let i = 0; i <= number; i++) {
        qtd += number % i == 0? 1 : 0;
    }

    return qtd == 2;
}

console.log(primo(1));
