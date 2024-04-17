import { useState, useRef, useCallback } from 'react';
import AddTodo from '../components/AddTodo';
import TodoList from '../components/TodoList';
import {produce} from 'immer';

const intialValue = [
  { id: 1, title: '할일1', done: true },
  { id: 2, title: '할일2', done: false },
  { id: 3, title: '할일3', done: false },
];


const TodoContainer = () => {
  // 업데이트 시, 매번 호출
  const [items, setItems] = useState(intialValue);
  const [todo, setTodo] = useState('');
  const [message, setMessage] = useState('');

  let id = useRef(4); // 할 일 id 증가시켜서 추가할 수 있게 만듬



  //할 일 등록 처리기능
  const onSubmit = useCallback(
    (e) => {
    e.preventDefault();

    if(!todo.trim()) {
        setMessage("할 일을 입력하세요");
        return; // 공백을 추가할 수 있도록 설정
    }

    /*
    setItems((prevItems) => {
      return prevItems.concat({
        id: id.current,
        title: todo.trim(),
        done: false,
      });
    });
    */

    setItems(
      produce((draft) => {
        draft.push({
          id: id.current,
          title: todo.trim(),
          done: false,
        });
      }),
    );

    id.current++;

    setTodo(''); // 입력 후 입력칸 초기화
    setMessage('');
  }, 
  [todo],
); // 대괄호 안에 입력된 todo값이 바뀔 때마다 새함수 생성

  

  // 할 일 입력시 todo 상태값 변경
  const onChange = useCallback((e) => setTodo(e.currentTarget.value), []); // 좌우 공백 제거

 // 할일 목록 완료 여부 토글(true - > false, false -> true)
 /*
  const onToggle = useCallback(
    (id) => {
      setItems((prevItems) => {
        return prevItems.map((item) => item.id === id ? {...item, done: !item.done} : item);
      });
    }, []); // 함수형 업데이트 setItems가 내부에서 현재값을 비교하여 prevItems를 넣어줌 state 특성이며 새로운 함수를 호출하지 않고 내부값만을 변경하기 위한
  
     const newItems = items.map(item => item.id === id ? {...item, done: !item.done} : item,
        );
        setItems(newItems);
    },[],
  ); */
  const onToggle = useCallback((id) => {
  setItems(
    produce((draft) => 
    draft.forEach((item) => item.id === id && (item.done = !item.done)),
    ),
  );
}, []);

// 할 일 목록 제거
const onRemove = useCallback((id) => {
  /*
    const newItems = items.filter((item) => item.id !== id);
    setItems(newItems);
    */
  setItems((prevItems) => {
    return prevItems.filter((item) => item.id !== id);
  });
}, []); 
/* usecallback을 이용해 새로운 함수 호출을 막고 대괄호에 지정한 변수값만 변경될 때만 새로운 함수 정의하도록 하며 결국엔 함수 정의가 되기 때문에 
   새로운 함수 자체를 정의하지 않고 변수는 변하되 함수는 고정되길 원할 때 함수형 업데이트를 통해 이를 실현
   어떻게 실현을 하냐? 함수에 함수를 전달하는 방식을 통해서...  */

  return (
    <>
      <AddTodo 
      onSubmit={onSubmit} 
      onChange={onChange} 
      todo={todo} 
      message={message} 
      />
      <TodoList items={items} onToggle={onToggle} onRemove={onRemove} />
    </>
  );
};

export default TodoContainer;
