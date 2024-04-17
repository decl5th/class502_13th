import {useEffect } from 'react';
import { MdOutlineAdd } from 'react-icons/md';

const AddTodo = ({ onSubmit, onChange, todo, message }) => {
  
   useEffect(() => { // componentDidMount&Update 두가지 역할 다 함
    console.log("todo, message 값 변경 - 렌더링 후");

    return () => {
      console.log("뒷정리 함수.../ update"); // return이 들어가는 순간 먼저 출력이 시행됨
      
    }

  }, [todo, message]) // [...] todo, message값이 바뀔 때마다 호출되게 만든다는 의미; 변화 감지 기준 

  useEffect(() => { 
    console.log("마운트시 한번만 호출"); // componentDidMount() 역할만 수행
    // DOMContentLoaded 비슷 (동일하진 않다)
  }, []); // 대괄호를 비워드면 한 번만 호출되게 설정

  return (
    <form onSubmit={onSubmit} autoComplete="off">
      <input
        type="text"
        value={todo ?? ''}
        onChange={onChange} 
      />

      <button type="submit">
        <MdOutlineAdd />
      </button>

      {message && <div>{message}</div>} 
    </form>
  );
};

export default AddTodo;
