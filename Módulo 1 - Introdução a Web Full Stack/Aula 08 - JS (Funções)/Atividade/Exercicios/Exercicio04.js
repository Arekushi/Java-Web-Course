
const contagem = (callback) => new Promise((resolve, reject) => {
    for(let i = 10; i >= 1; i--) {
        console.log(i);
    }

    resolve(console.log("Feliz ano novo"))
});

contagem();
