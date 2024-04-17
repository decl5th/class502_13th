window.addEventListener("DOMContentLoaded", function(){
    const boxEl = document.querySelector(".box"); // 선택  
    boxEl.addEventListener("mouseenter", function(){
        this.classList.add("on");
    });

    boxEl.addEventListener("mouseleave", function(){
        this.classList.remove("on");;
    });

    const textEl = document.getElementById("text");
    textEl.addEventListener("keyup", function(e) {
        console.log(e);
        console.log("keyup", this.value);
    });
});