import React, { Suspense, useState} from 'react';

// 페이지 이동 a태그는 안됨 직접적 이동 기능이라서;;
import { Link, Navigate } from 'react-router-dom';
import styled from 'styled-components';
import loadable from '@loadable/component';

// const MessageBox = React.lazy(() => import("../components/commons/MessageBox")); // 내부에서 지연 로딩
const MessageBox = loadable(() => import('../components/commons/MessageBox'), {
    fallback: <div>로딩중...</div>,
});
// 직접 컴포넌트를 스타일링할 때는 함수()소괄호로 감싸 역따옴표료 스타일 지정
/*
const MessageBox2 = styled(MessageBox)`
  background: orange;
`;
*/

const Home = () => {
    const [visible, setVisible] = useState(false);
  /* const result = true;
    if (result) {
        return <Navigate to ="/about" replace={true} />;
    } 
    */
  return (
    <div>
      <h1>HOME</h1>
      <div>메인 페이지</div>
      <div>
        <Link to="/about">회사 소개</Link>
        {/*
        <Suspense fallback={<div>로딩중...</div>}>
          {visible && <MessageBox>메세지!</MessageBox>}
        </Suspense>
  */}

        {visible && <MessageBox>메세지!!</MessageBox>}
        <button type='button' onClick={() => setVisible(true)}>보이기</button> {/* 클릭하는 순간 로딩 시작*/}
      </div>
      {/* <MessageBox2>메세지!!!</MessageBox2> */}
    </div>
  );
};

// 렌더링을 필요할 때만 하기 위해서 컴포넌트는 항상 리액트 메모로 감싸주자
export default React.memo(Home);
