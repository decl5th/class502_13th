import { Fragment } from 'react';

const App = () => {
  const name = 'react';

    const style = {
        backgroundColor : "orange",
        color: "white",
        height: '100px',
    };

  return (
    <>
        {/* 주석 .... */}

    <div className="subject" style={style}>첫번째 컴폰넌트!</div> 
      <div style={{color: 'blue'}}>첫번째 컴포넌트!!</div>
      <div>신나는, {name && name} 공부</div>
      {name === 'react' && <h1>아! 재미있다!</h1>}
      <input
       // 주석...
       type="text" />
    </>
  );
};

export default App;
