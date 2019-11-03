function switcher(buttonId) {
    document.getElementById("div1").setAttribute("hidden",true);
    document.getElementById("div2").setAttribute("hidden",true);
    document.getElementById("div3").setAttribute("hidden",true);
    document.getElementById("div" + buttonId).removeAttribute("hidden");
}