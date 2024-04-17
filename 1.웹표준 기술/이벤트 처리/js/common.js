window.addEventListener("DOMContentLoaded", function() {
    const box1 = document.querySelector(".box1");
    const box2 = document.querySelector(".box2");
    const box3 = document.querySelector(".box3");

    box1.addEventListener("click", function() { //이벤트 추가와 핸들러 함수
        console.log("BOX1");
    });

    box2.addEventListener("click", function() {
        console.log("BOX2");
    }, );

    box3.addEventListener("click", function(e) {
        e.stopPropagation(); // 이벤트 전파 취소
        console.log("BOX3");
    });
});