// 숫자가 증가하고 감소하는 액션정의

// 1. 액션 
const INCREASE = "counter/INCREASE";
const DECREASE = "counter/DECREASE";

// 2. 액션 객체 생성 함수
export const increase = () => ({type: INCREASE});
export const decrease = () => ({type: DECREASE});

// 3. 리듀서 함수 정의(상태 변화를 일이크는 함수 - 렌더링이 다시 된다)
const initialValue = { number: 0}; 

function counter(state = initialValue, action) {
    switch(action.type) {
        case INCREASE: 
            return {number: state.number +1}; // 새로운 객체 생성
           // return state.number++ 이건 안됨 
        case DECREASE:
            return {number: state.number -1 };
        default:
            return state;
    }
}

export default counter;