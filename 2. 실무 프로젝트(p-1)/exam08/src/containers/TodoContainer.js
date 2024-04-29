import Todo from "../components/Todo";
import { connect } from "react-redux";
import {insert, remove} from "../modules/todo";
import { useState, useCallback } from "react";


const TodoContainer = ({ todos, insert, remove }) => {
        const [todo, setTodo] = useState("");
        const onSubmit = useCallback((e) => {
            e.preventDefault();
            insert(todo);
        }, 
        [todo, insert]); // todo, insert가 변화감지기준

        const onChange = useCallback((e) => {
            setTodo(  e.target.value);
        }, []);

    return <Todo 
    todos={todos} 
    todo={todo
    }onSubmit={onSubmit} 
    onChange={onChange} 
    onRemove={remove}/>;
};



export default connect(({ todo }) => ({
    todos: todo,
}),
   /* (dispatch) => ({
        insert: (todo) => dispatch(insert(todo)),
        remove: (id) => dispatch(remove(id)),
    })
    == 아래구문과 동일 */ 
   {
    insert,
    remove,
   }
)(TodoContainer) ; // connect ()안에 속성값과 액션값