package member;

import lombok.*;

import java.time.LocalDateTime;
/*
@EqualsAndHashCode
@Getter @Setter @ToString
 */
@Data
@NoArgsConstructor //(access = AccessLevel.PRIVATE) // 접근 제어 설정
@AllArgsConstructor
@RequiredArgsConstructor

public class Member {
    @NonNull
    private String userId;
    @NonNull
    private String userNm;
    private String email;

    @ToString.Exclude
    private LocalDateTime curDt;
}
