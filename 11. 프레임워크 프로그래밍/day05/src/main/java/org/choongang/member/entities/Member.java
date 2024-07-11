package org.choongang.member.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Member {
    @Id // 쿼리 메서드 제공 ⭐
    private Long seq;
    private String email;
    private String password;
    private String userName;
    private LocalDateTime regDt;
}
