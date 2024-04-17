// 경로 변수 예시 소스코드 작성
import React from "react";
import { useParams, useLocation, useSearchParams } from 'react-router-dom';

const posts = {
    post1: {
        subject : '게시글1번',
        content : '게시글1 내용',
    },
    post2: {
        subject: '게시글2번',
        content: '게시글2번 내용',
    },
};


const Board = () => {
    const { id } = useParams();
    /* == 
    const params = useParams();
    const id = params.id; 
    */
    const data = posts[`post${id}`];
    
    /*
        const [searchParams, setSearchParams] = useSearchParams();
        console.log(searchParams.get('key1'));
        setSearchParams("k1=v1&k2=v2");
        console.log(searchParams.toString());
    */

    /*
        const location = useLocation();
        console.log(location);
    */

    // 값이 있을 때는 입력값을 쓰고 없을때는 다른 값을 출력하기위해서는 삼항조건식을 작성
    return (
        <>
        {data ? (
            <>
            <h1>{data.subject}</h1>
            <div>{data.content}</div>
            </>
        ) : (
            <div>게시글이 없습니다.</div>
        )}
        </>
    );
};

export default React.memo(Board);