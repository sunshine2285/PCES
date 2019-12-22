function loginCallBack(result) {
    console.log(result);
    if(result.code === 403 || result.code === 404)
    {
        alert(result.msg);
        return;
    }
    if (result.code === 200) {
        console.log(window.location);
        console.log(result.data);
        setCookie("user", result.data);
        //页面跳转
        window.location.href = "index.html";
    }

}

function login() {
    var url = baseUrl + "login/student";
    let userData = {
        userId: document.getElementById("username").value,
        password: document.getElementById("password").value
    }
    if(document.getElementById("check").checked === true){
        setCookie("loginData",userData);
    }
    request(url, "POST", userData, loginCallBack);
}


function init(){
    if(getCookie("studentId")!==undefined && getCookie("studentId")!=="")
    {
        document.getElementById("username").value = getCookie("studentId");
        removeCookie("studentId");
    }
    else if(getCookie("loginData")!==undefined && getCookie("loginData")!==""){
        var userData = getCookie("loginData");
        document.getElementById("username").value = userData.userId;
        document.getElementById("password").value = userData.password;
    }
    removeCookie("user");
}
init();
