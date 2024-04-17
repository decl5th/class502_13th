import {useState} from 'react';
import styles from './CSSModule.module.scss';
import classNames from 'classnames/bind'; // 함수이며 true false로 값이 나옴

const cx = classNames.bind(styles);

const CSSModule = () => {
    const [visible, setVisible] = useState(false);

  return (  // 조건문은 배열의 형태로 작성
    <>
    <div className={styles.wrapper}>
      <span className="commonColor">안녕하세요,</span>
      <span className={styles.highlight}>반갑습니다.</span>
    </div> 
    <div className={cx('menus', ['cls1', 'cls2'], {on:visible})}>메뉴</div> 
    <button type='button' onClick={() => setVisible(!visible)}>
        클릭
    </button>
    </>
  );
};

export default CSSModule;
