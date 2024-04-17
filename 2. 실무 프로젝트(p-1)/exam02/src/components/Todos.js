import{useState} from 'react';

import { MdOutlineCheckBox } from "react-icons/md";
import { MdOutlineCheckBoxOutlineBlank } from "react-icons/md";


const intialValue = [ 
    { id: 1, title: "할일1", done: false },
    { id: 2, title: "할일2", done: true },
    { id: 3, title: "할일3", done: false },
];

const Todos = () => {
    // const listItems = items.map((item) => <li>{item.title}</li>);  map을 통해 js배열 형태에서 jsx 배열 형태로 변환
    const [items, setItems] = useState(intialValue);
        const onToggle = (id) => {
        const newItems = items.map(item => item.id === id ? {...item, done: !item.done } : item,
            );

            setItems(newItems); 
    };

    return (
        <ul>
            {items.map(({id, title, done}) => ( // 삼항 조건식으로 체크박스 이미지 구현 if문을 못씀
                <li key={id} onClick={() => onToggle(id)}> 
                    {done ? <MdOutlineCheckBox /> : <MdOutlineCheckBoxOutlineBlank /> }
                    {title}
                </li>
            ))}
        
        </ul>
    );
    
};

export default Todos;