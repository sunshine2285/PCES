function loginCallBack(result) {
    console.log(result);
    if (result.code == 200) {
        console.log(window.location);
        console.log(result.data);
        setCookie("user", result.data);
        //页面跳转
        window.location.href = "http://localhost:63342/PCES/web/pages/index.html";
    }
}

function login() {
    var url = baseUrl + "login/student";
    let userData = {
        userId: document.getElementById("username").value,
        password: document.getElementById("password").value
    }
    console.log(userData);
    request(url, "POST", userData, loginCallBack);
}

function register() {
    var url = baseUrl + "register/student";
    let Data = {
        activate: 1,
        college: getQueryVariable("college"),
        grade: getQueryVariable("grade"),
        mail: getQueryVariable("email"),//替换%40为@
        major: getQueryVariable("major"),
        name: getQueryVariable("name"),
        password:getQueryVariable("password"),
        nickname: getQueryVariable("username"),
        studentId: getQueryVariable("studentId"),
        type: 1
    }
    console.log(Data);
}
function init(){
    if(getQueryVariable("username")!=false)
        register();
}
init();
