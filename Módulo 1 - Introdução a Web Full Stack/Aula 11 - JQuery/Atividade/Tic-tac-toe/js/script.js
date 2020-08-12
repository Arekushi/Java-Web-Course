var turn = 1;
var matrizGame = Array(3);

matrizGame['a'] = Array(3);
matrizGame['b'] = Array(3);
matrizGame['c'] = Array(3);

matrizGame['a'][1] = 0;
matrizGame['a'][2] = 0;
matrizGame['a'][3] = 0;

matrizGame['b'][1] = 0;
matrizGame['b'][2] = 0;
matrizGame['b'][3] = 0;

matrizGame['c'][1] = 0;
matrizGame['c'][2] = 0;
matrizGame['c'][3] = 0;

$(document).ready(() => {
    $('#play').click(() => {
        if($('#player-1-name').val() == "") {
            alert("Preencher o nome do jogador 1");
            return false;
        }
    
        if($('#player-2-name').val() == "") {
            alert("Preencher o nome do jogador 2");
            return false;
        }

        $('#player-1').html($('#player-1-name').val());
        $('#title').html($('#player-1-name').val());

        $('#player-2').html($('#player-2-name').val());

        $('#initial').hide();
        $('#game').show();
    })

    $('.block').click(() => {
        let id = event.target.id;
        $('#'+id).off();

        played(id);
    });

    function played(id) {
        let letter = null;
        let linha_coluna = null;
        let point = 0;

        if(turn % 2 == 0) {
            $('#title').html($('#player-1-name').val());
            letter = "O";
            point = -1;
        } else {
            $('#title').html($('#player-2-name').val());
            letter = "X"
            point = 1;
        }

        if(turn == 9) {
            $('#title').html("Empate");
        }

        linha_coluna = id.split("-");        
        matrizGame[linha_coluna[0]][linha_coluna[1]] = point;
        checkCombination();
        turn++;

        $('#'+id).html(letter);
    }

    function checkCombination() {
        // Linha A
        var pontos = 0;
        for(var i = 1; i <= 3; i++){
            pontos = pontos + matrizGame['a'][i];
        }
        winner(pontos);

        // Linha B
        pontos = 0;
        for(var i = 1; i <= 3; i++){
            pontos = pontos + matrizGame['b'][i];
        }

        winner(pontos);

        // Linha C
        pontos = 0;
        for(var i = 1; i <= 3; i++){
            pontos = pontos + matrizGame['c'][i];
        }

        winner(pontos);

        //verifica na vertical
        for(var l = 1; l <= 3; l++){
            pontos = 0;
            pontos = pontos + matrizGame['a'][l];
            pontos = pontos + matrizGame['b'][l];
            pontos = pontos + matrizGame['c'][l];
            winner(pontos);
        }

        //verificar na diagonal
        pontos = 0;
        pontos = matrizGame['a'][1] + matrizGame['b'][2] + matrizGame['c'][3];
        winner(pontos);
        pontos = 0;
        pontos = matrizGame['a'][3] + matrizGame['b'][2] + matrizGame['c'][1];
        winner(pontos);
    }

    function winner(points) {
        if(points == -3) {
            $('#title').html($('#player-1-name').val() + " ganhou");
            $('.block').off();
        } else if(points == 3) {
            $('#title').html($('#player-1-name').val() + " ganhou");
            $('.block').off();
        }
    }
})
