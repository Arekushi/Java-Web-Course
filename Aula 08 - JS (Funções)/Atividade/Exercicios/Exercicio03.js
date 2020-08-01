function contagem(call) {
    setTimeout(() => {
        call()
    }), 10 * 1000;

    for(let i = 10; i >= 1; i--) {
        console.log(i);
    }
}

function felizAnoNovo() {
    console.log("Feliz ano novo");
}

contagem(felizAnoNovo);
