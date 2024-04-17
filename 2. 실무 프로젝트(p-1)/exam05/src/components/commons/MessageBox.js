import React from 'react';

// 태그 안쪽의 내용을 가져올때는 children을 사용
const MessageBox = ({className, children }) => {
    return (
    <div className={className}>
        {children}
        </div>
        );
};

export default React.memo(MessageBox);