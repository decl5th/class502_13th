const todo = { // 객체 정의
  id: 1,
  data: [], // 스케줄 데이터
  init() { // 저장 값 조회 - > 스케줄 완성
    const jsonData = localStorage.getItem("todos"); // 저장한 값 가져오기
    const todos = jsonData ? JSON.parse(jsonData) : []; // == 삼항 조건문 json값이 없을 때는 비어있는 배열로 가져오기
    this.data = todos; // 로컬 스토리지에 가져와서 업데이트
    this.id = todos.length + 1; // 기존 데이터가 있으면 증가시켜서 추가


    const itemsEl = document.querySelector(".items"); // items 클래스에 선택 -> DOM tree 구조에 통합
    for (const item of todos) { // for ~ of 구문 쓰는 이유: 굳이 for의 조건 증가식을 쓰지 않아도 되는 거임 왜? 반복자 패턴이 탑재가 되어 있다; Symbol.iterator
      const liEl = this.getItem(item.title);
      liEl.dataset.id = item.id;
      itemsEl.appendChild(liEl);
    }
  },

  // 등록하고 삭제
  /**
   * 스케줄 추가
   */
  add() { // add 스케줄 추가 하는 메서드
    const subject = frmRegist.subject.value; // 속성명(name=subject)만 가지고 선택할 수 있음

    if (!subject.trim()) {
      // trim 좌우 공백 제거 -> 스페이스로 띄운 공백을 등록하지 않기 위한 사용
      alert("할 일을 입력하세요.");
      return; // 입력칸에서 아무것도 입력하지 않았을 때 등록되지 않기 위해서 return의 기능 응용
    }
    
  
    const itemsEl = document.querySelector(".items"); // 선택
    const liEl = this.getItem(subject);
    itemsEl.appendChild(liEl); // 뒤에 추가

    

    frmRegist.subject.value = ""; // 항목 등록 후 입력 칸 자동 초기화 작업
    frmRegist.subject.focus(); // 입력 칸에서 커서 깜빡거리기 동작

    // 비구조화 할당 적용 시켜 밑의 주석 구문을 더 간단하게 만들어보자
    const { data } = this; 
    let id = this.id++; // 기존 아이디 1에서 증가
    data.push({
      id,
      title: subject,
    });

    /*
    this.data.push({
      id: this.id++, // 기존 아이디 1에서 증가시키면서
      title: subject, // title, == title: title
    });
    */

    this.save(); // data을 가지고 로컬스토리지에 추가할 수 있게 구현
    liEl.dataset.id = id;
  },
  save() {
    localStorage.setItem('todos', JSON.stringify(this.data));
  },
  getItem(subject) { // subject -> 매개변수 subject 값을 입력하면 value(값)이 된다.
    /* 동적으로 추가 되는 요인들을 함수형태로 작성하면 더 편하게 구현 가능 */
    const liEl = document.createElement("li"); // li 태그 생성
    liEl.appendChild(document.createTextNode(subject)); // == const liEl = document.createTextNode(subject);

    const buttonEl = document.createElement("button"); // 삭제 버튼 생성
    buttonEl.appendChild(document.createTextNode("삭제")); // button 부모요소 appendChild -> 자식 요소 추가생성 ; 버튼안에 삭제 텍스트를 추가 생성 
    liEl.appendChild(buttonEl); 
    
    // 클릭시 스케줄(리스트) 삭제
    buttonEl.addEventListener("click", function () {
      const itemsEl = document.querySelector(".items"); // liEl의 부모 인자 선택을 위한 정의
      itemsEl.removeChild(liEl); 
      
      // localstorage에 저장된 데이터도 삭제 ; 실제 데이터 삭제
      const id = Number(liEl.dataset.id);
      const index = todo.data.findIndex((item) => item.id === id); // 데이터 발견 후 삭제 구문
      if (index !== -1) {
        todo.data.splice(index, 1); // splice를 이용하여 삭제
        todo.save(); // 삭제한 변동사항 저장
      }  
    });

    return liEl; // 동적으로 반환값 생성
  }
};

window.addEventListener("DOMContentLoaded", function () { // DOM 완성
  todo.init(); // 데이터 조회 및 완성

  frmRegist.addEventListener("submit", function (e) {  // e -> 이벤트 객체
    
    e.preventDefault(); // submit 이벤트 발생시 기본동작(페이지 이동) 차단하고 제출된 값을 그대로 페이지 밑으로 출력하기 위한 사전작업
      /*
        동적 추가
        const subject = frmRegist.subject.value;
        console.log(subject); 
        == todo.add();
      */
    todo.add(); // 스케줄 동적 추가
    // todo.remove();  스케줄 동적 삭제
  });
});
