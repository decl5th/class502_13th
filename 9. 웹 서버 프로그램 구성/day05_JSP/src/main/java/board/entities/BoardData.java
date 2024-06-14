package board.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
// 밑의 2개의 애너테이션을 추가해서 기본생성자를 편법으로 생성 가능
@NoArgsConstructor
@AllArgsConstructor
public class BoardData {
    private long seq;
    private String subject;
    private String content;
    private String poster;
    private LocalDateTime regDt;
}
