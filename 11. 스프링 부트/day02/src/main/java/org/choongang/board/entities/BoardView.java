package org.choongang.board.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class BoardView {
    @EmbeddedId
    private BoardViewId id;
}
/*
@IdClass(BoardViewId.class)
public class BoardView {
    // view 카운트를 정할 수 있는 Entity
    // 복합키를 생성할 클래스

    @Id
    private Long seq;
    @Id
    @Column(name = "_uid") // uid는 오라클 예약어 이미 있어서 컬럼 속성을 이용해서 이름을 바꿔줌
    private int uid;
    // 위 2개를 이용해서 복합키 생성

    //@Id들을 묶어주는 ID클래스 생성 필요
}
*/
