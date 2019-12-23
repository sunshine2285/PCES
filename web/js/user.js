function switcher(buttonId) {
    document.getElementById("div1").setAttribute("hidden",true);
    document.getElementById("div2").setAttribute("hidden",true);
    document.getElementById("div3").setAttribute("hidden",true);
    document.getElementById("div" + buttonId).removeAttribute("hidden");
}
function changeEmailCallBack(result) {
    if(result.code===200)
    {
        var newEmail = document.getElementById("newEmail").value;
        var user = getCookie("user");
        user.mail = newEmail;
        setCookie("user", user);
        init();
        window.location.reload();
    }
    alert(result.msg);

}
function changeEmail() {
    var user = getCookie("user");
    var url = baseUrl + "student/mail";
    let updateDTO = {
        password: document.getElementById("password2").value,
        updateInfo: document.getElementById("newEmail").value,
        userId: user.studentId,
        verificationCode: document.getElementById("code2").value
    };
    console.log(updateDTO);
    request(url, "POST", updateDTO, changeEmailCallBack);
}

function changePasswordCallBack(result) {
    if(result.code===200){
        window.location.reload();
    }
    alert(result.msg);
}
function changePassword() {
    var user = getCookie("user");
    var url = baseUrl + "student/password";
    let updateDTO = {
        password: document.getElementById("oldpassword").value,
        updateInfo: document.getElementById("newpassword").value,
        userId: user.studentId,
        verificationCode: document.getElementById("code").value
    }
    if(updateDTO.updateInfo!==document.getElementById("newpassword2").value)
    {
        alert("两次密码不一致！请重试！");
        return;
    }
    console.log(updateDTO);
    request(url, "POST", updateDTO, changePasswordCallBack);
}
function collegeCallBack(result){
    document.getElementById("college").innerText = result.name;
}
function majorCallBack(result){
    document.getElementById("major").innerText = result.name;
}
function init() {
    // formatTemplate("填充成功！", $('script[type="text/template-tr"]').html());
    var user = getCookie("user");
    // div1
    var collegeurl = baseUrl + "/college/"+user.college;
    var majorurl = baseUrl + "/major/"+user.major;
    request(collegeurl, "GET", null, collegeCallBack);
    request(majorurl, "GET", null, majorCallBack);
    document.getElementById("nickname").innerText = user.nickname;
    document.getElementById("name").innerText = user.name;
    document.getElementById("studentId").innerText = user.studentId;
    document.getElementById("grade").innerText = user.grade;
    document.getElementById("mail").innerText = user.mail;
    // div2
    document.getElementById("oldEmail").innerText = user.mail;
    // div3
    document.getElementById("div3-email").innerText = user.mail;
}
init();