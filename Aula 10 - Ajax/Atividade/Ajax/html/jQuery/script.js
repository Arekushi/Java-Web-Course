$(document).ready(() => {
    $('.load-content').click(() => {
        let loadUrl = "../content/" + event.target.id + "-content.html";

        $.ajax({
            url: loadUrl,

            success: (data) => {
                setTimeout(() => {
                    $('#div-content').html(data);
                }, 2000)
            },

            error: (data) => {
                console.log(data);
            },

            beforeSend: () => {
                $('#div-content').html("<center><img src='../../res/img/loader.gif'></center>")
            }
        });
    });
});
