function switcher(buttonId) {
    document.getElementById("div1").setAttribute("hidden",true);
    document.getElementById("div2").setAttribute("hidden",true);
    document.getElementById("div3").setAttribute("hidden",true);
    document.getElementById("div" + buttonId).removeAttribute("hidden");
}

function init() {
    // formatTemplate("填充成功！", $('script[type="text/template-tr"]').html());
    var user = getCookie("user");
    console.log(user);
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