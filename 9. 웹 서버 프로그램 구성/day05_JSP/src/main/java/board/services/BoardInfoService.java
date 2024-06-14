package board.services;

import board.entities.BoardData;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

public class BoardInfoService {
    // 데이터를 가져올 건데 list를 가져오는 로직인데
    // 10개의 게시글을 db에서 만들었다 가정하고 가져오는 로직
    // 이런 데이터는 출력이 목적 뷰에서 출력하기 위해서
    // 속성으로 넘기면 출력
    public List<BoardData> getList() {
        // 게시글 목록 조회 로직 ....

        List<BoardData> items = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> BoardData.builder()
                        .seq(i)
                        .subject("제목" + i)
                        .content("내용" + i)
                        .poster("작성자" + i)
                        .regDt(LocalDateTime.now())
                        .build())
                .toList();
        return items;
    }
}
