/* 버튼은 기본적으로 공통적으로 스타일을 적용하기 때문에 따로 빼서 관리 */

import styled, {css} from 'styled-components';

// 버튼에 대한 템플릿 리터럴 정의
// ?? 을 이용하여 기본값 지정
// props 중복이기 때문에 비구조화로 단축
// selected 값에 따라서 실행되는 것이 다르게 구축
export const BigButton = styled.button`
    width: 100%;
    height: 45px;
    border: 0;
    font-size: 1.5rem;
    font-weight: bold;
    background: ${({bgcolor}) => bgcolor ?? 'orange'};

    ${({selected, bgcolor }) => selected && 
    css`
        border: 1px solid ${bgcolor ?? 'orange'};
        background: #fff;
    `}
`;