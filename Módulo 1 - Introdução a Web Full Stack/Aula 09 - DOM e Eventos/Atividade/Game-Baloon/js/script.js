var timerId = null;

function startGame() {
    let url = window.location.search;
    let difficult = url.replace("?", "");
    let qtdBaloons = 20;
    let time = 0;

    if(difficult == 1) {
        time = 120;
    } else if (difficult == 2) {
        time = 60;
    } else {
        time = 5;
    }

    document.getElementById("baloon").innerHTML = qtdBaloons;
    document.getElementById("pow").innerHTML = 0;
    document.getElementById('time').innerHTML = time;

    createBaloon(20);
    contagem_tempo(time + 1);
}

function createBaloon(qtd) {
    for(let i = 0; i < qtd; i++) {
        let baloon = document.createElement('img');
        baloon.src = "../res/img/baloon.png";
        baloon.style.margin = "10px";
        baloon.style.width = "50px"
        baloon.id = "baloon" + i;
        baloon.onclick = function() {
            estourar(this);
        }

        document.getElementById('cenario').appendChild(baloon);
    }
}

function contagem_tempo(segundos) {
    segundos = segundos - 1;

    if(segundos == -1) {
        clearTimeout(timerId);
        gameOver();
        return false;
    }

    document.getElementById('time').innerHTML = segundos;
    timerId = setTimeout("contagem_tempo("+segundos+")", 1000)
}

function gameOver() {
    alert("Game-over");
}

function estourar(baloon) {
    var id = baloon.id;
    document.getElementById(id).src = "../res/img/baloon-pow.png";
    baloon.onclick = null;
    pontuacao(-1);
}

function pontuacao(acao) {
    let baloon = document.getElementById("baloon")
    let pows = document.getElementById("pow");

    let intBaloons = parseInt(baloon.innerHTML);
    let intPows = parseInt(pows.innerHTML);

    intBaloons--;
    intPows++

    document.getElementById("baloon").innerHTML = intBaloons;
    document.getElementById("pow").innerHTML = intPows;

    situacaoJogo(intBaloons);
}

function situacaoJogo(baloons) {
    if(baloons == 0) {
        parar();
        alert("Você ganhou");
    }
}

function parar() {
    clearTimeout(timerId);
}

function restart() {
    window.location.reload();
}
