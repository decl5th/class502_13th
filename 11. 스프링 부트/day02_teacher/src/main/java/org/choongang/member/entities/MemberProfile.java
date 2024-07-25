package org.choongang.member.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

@Data
@Builder
@Entity
@NoArgsConstructor @AllArgsConstructor
public class MemberProfile {

    @Id @GeneratedValue
    private Long seq;
    private String profileImage;
    private String status;

    @ToString.Exclude // profile 쪽에 있는 멤버 참조를 끊어줌
    @OneToOne(mappedBy = "profile") // mappedBy : FK
    private Member member;
}
