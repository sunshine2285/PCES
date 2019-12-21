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

function removeCookie(name)
{
    var exp = new Date();
    exp.setTime(exp.getTime() - 1);
    var cval=getCookie(name);
    if(cval!=null)
        document.cookie= name + "="+cval+";expires="+exp.toGMTString();
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


function formatTemplate(dta, tmpl, format) {
    return tmpl.replace(/{(\w+)}/g, function(m1, m2) {
        if (!m2)
            return "";
        return (format && format[m2])? format[m2](dta[m2]) : dta[m2];
    });
}

function getQueryVariable(variable) {
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i = 0; i < vars.length; i++) {
        var pair = vars[i].split("=");
        if (pair[0] == variable) {
            return pair[1];
        }
    }
    return (false);
}
// function formatTemplate(data, tmpl) {
//     return tmpl.replace(/{(\w+)}/g, function(m1, m2) {
//         if (!m2)
//             return "";
//         return data[m2];
//     });
// }

// var format = {
//         name: function(x) {
//             return x ;
//         }
//     };