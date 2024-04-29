import Todo from "../components/Todo";
import { useDispatch, useSelector } from "react-redux";
import {insert, remove} from "../modules/todo";
import { useState, useCallback } from "react";
import React from "react";


const TodoContainer = () => {
        const [todo, setTodo] = useState("");

            const todos = useSelector((state) => state.todo);
            const dispatch = useDispatch();
            const onInsert = useCallback((todo) => dispatch(insert(todo)), [dispatch]);
            const onRemove = useCallback((id) => dispatch(remove(id)), [dispatch]);

        const onSubmit = useCallback((e) => {
            e.preventDefault();
            onInsert(todo);
        }, 
        [todo, onInsert]); // todo, onInsert가 변화감지기준

        const onChange = useCallback((e) => {
            setTodo(  e.target.value);
        }, []);

    return <Todo 
    todos={todos} 
    todo={todo}
    onSubmit={onSubmit} 
    onChange={onChange} 
    onRemove={onRemove}/>;
};



export default React.memo(TodoContainer); // connect로 하면 React.memo로 자동 감싸짐