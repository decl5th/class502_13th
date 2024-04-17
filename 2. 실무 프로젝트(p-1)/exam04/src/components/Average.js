// 배열의 형태를 받아서 평균을 구하는 식을 구현

import React, {useState, useCallback, useMemo } from 'react'; // Callback을 이용하여 필요할 때만 함수를 이용할 수 있게 // 두가지 hook을 사용 

function getAverage(nums) {
    console.log('getAverage함수 호출'); // 타이핑 할 때마다 호출 되면 문제 발생 가능성 존재
    // 합계 / 갯수 (평균을 구하는 방법)

    const total =  nums.reduce((acc, num) => { // reduce를 사용하여 합계를 구해보자
        acc += num;

        return acc;
    }, 0); // 초기값으로 0을 설정 이후 acc에 들어감 

    let avg = total / nums.length;
    avg = Math.round(avg * 10) / 10; // 소수점 첫째점 자리까지만 표기 (반올림)

    return avg; 
}

const Average = () => {
    const [nums, setNums] = useState([]); // 두가지 형태로 상태값을 정의 비어있는 배열 생성
    const [num, setNum] = useState('');

    const onChange = useCallback((e) => setNum(e.currentTarget.value !== NaN
        ? Number(e.currentTarget.value)
        : 0,
    ), 
    [],
); // 함수형 업데이트 적용


    const onSubmit = useCallback((e) => {
        e.preventDefault();
        setNums((nums) => nums.concat(num)); // concat을 이용해서 기존것을 추가
    }, 
    [num],
);
    
    //const avg = getAverage(nums);  // nums의 값이 변경될 때만 호출 필요, 다른 요소 호출 필요 X -> useMemo를 이용하면 되는 순간
    const avg = useMemo(() => getAverage(nums), [nums]); // useMemo를 사용해서 내부에서 초기값을 저장 후 반복 
    // 배열 구성 시작
    return (
        <>
            <form autoComplete='off' onSubmit={onSubmit}>
                <input type='number' value={num} onChange={onChange}/> 
                <button type='sumbit'>등록</button> 
            </form>
            <ul>
                {nums.map((num, i) => (<li key={i}>{num}</li>
                 ))}
            </ul>
            평균 : {avg} 
        </>
    );

};

export default React.memo(Average); 
// memo로 감싸서 전체가 리렌더링이 되는 것을 방지; 컴포넌트를 감싸야지 성능이 좋기 때문에 -> 변화가 없는 자식 컴포넌트는 내버려 두기 위해서