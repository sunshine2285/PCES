function initCallBack(result) {
    console.log(result);
    for (let i = 0; i < result.length; ++i) {
        result[i].seq = i + 1;
        $("#tr-content").append(
            formatTemplate(result[i], $('script[type="text/template-tr"]').html()));
    }
}

function init() {
    var type = getQueryVariable("type");
    var url = baseUrl + "course/" + type;
    request(url, "GET", null, initCallBack);
}

init();