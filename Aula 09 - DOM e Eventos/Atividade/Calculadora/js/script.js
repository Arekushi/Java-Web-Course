
function math() {
    let input = document.getElementById('input');
    let value = input.value;
    let array = value.split(" ")

    let number1 = array[0];
    let operation = array[1];
    let number2 = array[2];

    switch(operation) {
        case "+":
            input.value = Number(number1) + Number(number2);
            break;

        case "-":
            input.value = Number(number1) - Number(number2);
            break;

        case "*":
            input.value = Number(number1) * Number(number2);
            break;

        case "/":
            input.value = Number(number1) / Number(number2);
            break;
    }

}

function operationClick(operation) {
    let input = document.getElementById('input');

    if(input.value != "") {
        input.value = input.value + " " + operation;
    }
}

function numberClick(number) {
    let input = document.getElementById('input');

    if(input.value == "") {
        input.value = number;
    } else {
        input.value = input.value + " " + number
    }
}