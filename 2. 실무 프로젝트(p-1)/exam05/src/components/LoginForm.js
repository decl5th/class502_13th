import styled, { css } from 'styled-components';
import { BigButton } from './commons/ButtonStyle';

// 공통적인 스타일을  정의하기 위해 css 태그함수를 정의
const commonStyle = css`
    width: 100%;
`;

// ${태그명}을 통해 변수로서 스타일 지정을 효율적으로 관리
const OuterBox = styled.div`
    ${commonStyle}
    position: fixed;
    height: 100%;
    left: 0;
    top: 0;
    display: flex;
    align-items: center;
`;

// 역따옴표 안으로 들어간 입력값들이 매개변수로 들어간다
// scss 들여쓰기 형태로 h1의 스타일(가운데 정렬) 지정
const FormBox = styled.form`
  width: 420px;
  margin: 0 auto;

  h1 { 
    text-align: center;
  }
`;

/* styled.input이 함수가 되어 매개변수로 들어간다 */
// & + & = 첫번째 요소 제외하고 선택자와 인접형제 전부적용 (& = 현재요소)
const InputBox = styled.input`
  ${commonStyle}
  display: block;
  height: 45px;
  border: 1px solid #ccc;
  border-radius: 5px;
  padding: 0 10px;

  & + & {
    margin-top: 5px;
  }
`;


// selected를 통해 조건문을 이용하여 스타일 선별적 지정
const LoginForm = () => {
  return (
    <OuterBox>

      <FormBox autoComplete="off">
        <h1>로그인</h1>

        <InputBox type="text" placeholder="아이디" />
        <InputBox type="password" placeholder="비밀번호" />
        <BigButton type="submit" selected={true}>로그인</BigButton>
      </FormBox>
    </OuterBox>
  );
};

export default LoginForm;
