var httpRequest;

function doRequest(url, destiny) {
    document.getElementById(destiny).innerHTML = 
        "<center><img src='../../res/img/loader.gif'></center>"

    if(window.XMLHttpRequest) {
        httpRequest = new XMLHttpRequest();

    } else if(window.ActiveXObject) {
        try {
            httpRequest = new ActiveXObject("Msxml2.XMLHTTP");
        } catch(e) {
            try {
                httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
            } catch(e) {
                alert("Não foi irmão >:(");
                return false;
            }
        }
    }

    httpRequest.onreadystatechange = () => {
        if(httpRequest.readyState == 4 && httpRequest.status == 200) {
            setTimeout(() => {
                document.getElementById(destiny).innerHTML = httpRequest.responseText;
            }, 2000);
        }
    }

    httpRequest.open("GET", url);
    httpRequest.send();
}
