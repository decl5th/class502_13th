import { useState } from 'react';

const Profile = () => {
  const [data, setData] = useState({
    name: 'jon',
    age: 30,
  });

  const changeProfile = () => {
    // setData({ ...data, name: 'arik' });
    
    setData((prevstate) => {
        console.log("변경전 상태값 : ", prevstate);

        return {...data, name: 'arik'};
    });

  };

  const { name, age } = data;
  return (
    <>
      <h1>{name}</h1>
      <h2>{age}</h2>
      <button type="button" onClick={changeProfile}>
        변경
      </button>
    </>
  );
};

export default Profile;
