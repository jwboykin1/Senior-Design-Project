// JavaScript File
var faq = document.getElementsByClassName("faq-page");
var i;
for (i = 0; i < faq.length; i++) {
    faq[i].addEventListener("click", function () {
        /* Toggle between adding and removing the "active" class,
        to highlight the button that controls the panel */
        this.classList.toggle("active");
        /* Toggle between hiding and showing the active panel */
        var body = this.nextElementSibling;
        if (body.style.display === "block") {
            body.style.display = "none";
        } else {
            body.style.display = "block";
        }
    });
}

function secDrop(){
    document.getElementById("myDropdownSec").classList.toggle("show");
}

window.onclick = function(event) {
    if (!event.target.matches("dropbtnSec")) {
        var dropdownSec = document.getElementsByClassName("dropdown-content-Sec");
        var x;
        for (x = 0; x < dropdownSec.length; x++){
            var openDropdownSec = dropdownSec[x];
            if (openDropdownSec.classList.contains("show")){
                openDropdownSec.classList.remove("show");
            }
        }
    }
}