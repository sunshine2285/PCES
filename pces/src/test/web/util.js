let baseUrl = "http://sunshine-sun.cn:2285/";

function request (url, method, data, callback) {
    fetch(url, {
            headers: {
                'content-type': 'application/json'
            },
            mode: 'cors',
            method: method,
            body: data === null ? null : JSON.stringify(data)
        })
        .then(response => response.json())
        .then(result => {
            callback(result);
        }).catch(error => {
            console.error(error);
        });
}

function setCookie (key, value) {
    // document.cookie = key + "=" + value + ";path=/;SameSite=None;Secure=true;";
    document.cookie = key + "=" + JSON.stringify(value) + ";";
}

function getCookie (key) {
    let result = document.cookie.match("(^|[^;]+)\\s*" + key + "\\s*=\\s*([^;]+)");
    return result ? JSON.parse(result.pop()) : "";
}

function removeCookie(key) {
    document.cookie = key + "=;"; 
}

//回掉函数
// function loginCallBack (result) {
//     console.log('result :', result);
// }

//Get请求
// request("college", "GET", null, loginCallBack);

//Post请求
// var url = "login/student";
// let userData = {
//     userId: document.getElementById("userId").value,
//     password: document.getElementById("password").value
// }
// request(url, userData, loginCallBack);