import { useState, useEffect, useRef } from "react";


const SignupForm = (props) => {
        console.log(props);
    const [form, setForm] = useState({});

    const onChange = (e) => {
        // form[e.currentTarget.name] = e.currentTarget.value;

        // setForm({...form, [e.currentTarget.name]: e.currentTarget.value});
        const name = e.currentTarget.name;
        const value = e.currentTarget.value;
       setForm((prevForm) => ({...prevForm, [name]:value,
        }));
        
    };
       
        const onSubmit = (e) => {
            e.preventDefault(); // 처리완료 
            
            // 양식 값을 비워주기 for what? ex) 아이디 및 비번 생성 및 가입하기 이후 초기화를 위해서
            setForm({});
        };

    let userIdEl = useRef();

    useEffect(() => {
        
        // userIdEl.focus();  ref를 가지고 값을 이력하면 document 객체를 대체하여 가져오는 것이 가능해진다
        userIdEl.current.focus();


    }, [userIdEl]);

    return (
        <form onSubmit={onSubmit}>
            <dl>
                <dt>아이디</dt>
                <dd>
                    <input type="text" name="userId" onChange={onChange} value={form.userId ?? ''} ref={userIdEl} /> 
                    
                </dd>
            </dl>
            <dl>
                <dt>비밀번호</dt>
                <dd>
                    <input type="password" name="userPw" onChange={onChange} value={form.userPw  ?? ''}/>
                </dd>
            </dl>
            <dl>
                <dt>비밀번호 확인</dt>
                <dd>
                    <input type="password" name="confirmPw" onChange={onChange} value={form.confirmPw  ?? ''} />
                </dd>
            </dl>
            <dl>
                <dt>회원명</dt>
                <dd>
                    <input type="text" name="userNm" onChange={onChange} value={form.userNm  ?? ''} />
                </dd>
            </dl>
            <button type="submit">가입하기</button>
        </form>
    );
};

export default SignupForm;