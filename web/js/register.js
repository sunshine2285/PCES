function changeMajorCallBack(result) {
    var sel=document.getElementById("major");
    for (let i = 0; i < result.length; ++i) {
        sel.add(new Option(result[i].name,result[i].id));
    }
}
function changeMajor() {
    var sel = document.getElementById("college");
    var major = document.getElementById("major");
    major.options.length = 0;
    var index = sel.selectedIndex;
    var collegeId = sel.options[index].value;
    var url = baseUrl + "/major/all/"+collegeId;
    request(url, "GET", null, changeMajorCallBack);
}

function getAllCollegeCallBack(result) {
    var sel=document.getElementById("college");
    for (let i = 0; i < result.length; ++i) {
        sel.add(new Option(result[i].name,result[i].id));
    }
}
function getAllCollege(){
    var url = baseUrl + "college"
    request(url, "GET", null, getAllCollegeCallBack);
}

function registerCallBack(result) {
    alert(result.msg);
    if(result.code === 200)
    {
        window.location.href = "login.html";
    }

}
function register(){
    var url = baseUrl + "register/student";
    var majorSel=document.getElementById("major");
    var collegeSel=document.getElementById("college");
    let Data = {
        college: collegeSel.options[collegeSel.selectedIndex].value,
        grade: document.getElementById("grade").value,
        mail: document.getElementById("mail").value,
        major: majorSel.options[majorSel.selectedIndex].value,
        name: document.getElementById("name").value,
        nickname: document.getElementById("nickname").value,
        password:document.getElementById("password").value,
        studentId: document.getElementById("studentId").value,
        type: 1
    }
    console.log(Data);
    setCookie("studentId", Data.studentId);
    request(url, "POST", Data, registerCallBack);
}
getAllCollege();