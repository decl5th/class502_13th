import Counter from "../components/Counter";
import { increase, decrease } from "../modules/counter";
import { connect } from "react-redux"
/**
 * connect(mapStateToProps, mapDispatchToProps)(연동할 컴포넌트)
mapStateToProps : 리덕스 스토어 안의 상태를 컴포넌트의 props로 넘겨주기 위해 설정하는 함수
mapDispatchToProps : 액션 생성 함수를 컴포넌트의 props로 넘겨주기 위해 사용하는 함수
connect 함수를 호출하고 나면 다른 함수를 반환합니다. 
반환된 함수에 컴포넌트를 파라미터로 넣어 주면 리덕스와 연동된 컴포넌트가 만들어집니다.
 * 
 */


const CounterContainer = ({number, increase, decrease}) => {
    return <Counter number={number} onIncrease={increase} onDecrease={decrease}/>;
};

const mapStateToProps = (state) => ({
    number: state.counter.number,
});

const mapDispatchToProps = (dispatch) => ({
    increase: () => {
        dispatch(increase());
    },
    decrease: () => {
        dispatch(decrease());
    },
}); // dispatch를 통해서 액션 생성 함수 호출 

export default connect(mapStateToProps, mapDispatchToProps)(CounterContainer);