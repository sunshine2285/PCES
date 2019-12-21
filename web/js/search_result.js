function searchCallBack(result) {
    console.log(result);

    for (let i = 0; i < result.length; ++i) {
        result[i].seq = i + 1;
        $("#tr-content").append(
            formatTemplate(result[i], $('script[type="text/template-tr"]').html()));
    }
}

function search() {
    var searchStr = getQueryVariable("search");
    var url = baseUrl + "search/" + searchStr;
    request(url, "GET", null, searchCallBack);
}

search();