
function send() {
    let id = $('#id').val();
    let name = $('#name').val();
    let location = $('#location').val();

    $.ajax({
        method: "POST",
        url: "http://localhost:3000/users",
        data: {
            "id": id,
            "name": name,
            "location": location
        },

        success: () => {
            alert("Cadastro feito com sucesso");
        }
    });
}

function search(id) {
    $.get("http://localhost:3000/users/"+id, (data) => {
        console.log(data);
    });
}