package org.choongang.board.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.choongang.global.entities.BaseEntity;
import org.choongang.member.entities.Member;

@Data
@Builder
@Entity
@NoArgsConstructor @AllArgsConstructor
public class BoardData extends BaseEntity {

    @Id @GeneratedValue
    private Long seq;

    @ManyToOne // member_seq - entity명_기본키 속성명
    @JoinColumn(name = "mSeq")
    private Member member;

    @Column(nullable = false)
    private String subject;

    @Lob
    private String contents;
}
