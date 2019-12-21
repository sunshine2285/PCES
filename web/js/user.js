function switcher(buttonId) {
    document.getElementById("div1").setAttribute("hidden",true);
    document.getElementById("div2").setAttribute("hidden",true);
    document.getElementById("div3").setAttribute("hidden",true);
    document.getElementById("div" + buttonId).removeAttribute("hidden");
}
function changeEmailCallBack(newEmail) {
    var user = getCookie("user");
    user.mail = newEmail;
    setCookie("user", user);
    init();
    alert("修改邮箱成功！");
}
function changeEmail() {
    var user = getCookie("user");
    var url = baseUrl + "student/mail";
    let updateDTO = {
        password: document.getElementById("password2").value,
        updateInfo: document.getElementById("newEmail").value,
        userId: user.id,
        verificationCode: document.getElementById("code2").value
    }
    console.log(updateDTO);
    request(url, "POST", updateDTO, changeEmailCallBack(document.getElementById("newEmail").value));
}

function changePasswordCallBack(result) {
    console.log(result);
    alert("修改密码成功！");
}
function changePassword() {
    var user = getCookie("user");
    var url = baseUrl + "student/password";
    let updateDTO = {
        password: document.getElementById("oldpassword").value,
        updateInfo: document.getElementById("newpassword").value,
        userId: user.id,
        verificationCode: document.getElementById("code").value
    }
    if(updateDTO.updateInfo!==document.getElementById("newpassword2").value)
    {
        alert("两次密码不一致！请重试！");
        return;
    }
    request(url, "POST", updateDTO, changePasswordCallBack);
}
function init() {
    // formatTemplate("填充成功！", $('script[type="text/template-tr"]').html());
    var user = getCookie("user");
   // console.log(user);
    // div1
    document.getElementById("nickname").innerText = user.nickname;
    document.getElementById("name").innerText = user.name;
    document.getElementById("studentId").innerText = user.studentId;
    document.getElementById("college").innerText = user.college;
    document.getElementById("major").innerText = user.major;
    document.getElementById("grade").innerText = user.grade;
    document.getElementById("mail").innerText = user.mail;
    // div2
    document.getElementById("oldEmail").innerText = user.mail;
    // div3
    document.getElementById("div3-email").innerText = user.mail;
}
init();