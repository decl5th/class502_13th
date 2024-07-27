package org.choongang.board.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode  // 중복 제거 시, 동등성 기준을 가지고 기능하는 방식 - 복합키 지정의 전제 조건 애너테이션
@NoArgsConstructor // 값을 직접 설정할 수 있는 생성자, 기본생성자가 필요
@AllArgsConstructor
@Embeddable
public class BoardViewId {

    private long seq;
    @Column(name = "_uid")
    private int uid;
}
