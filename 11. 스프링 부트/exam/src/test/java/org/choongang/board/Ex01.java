package org.choongang.board;

import org.choongang.global.board.entities.Board;
import org.choongang.global.board.repositories.BoardRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
@TestPropertySource(properties = "spring.profiles.active=test")
public class
Ex01 {

    @Autowired
    private BoardRepository boardRepository;

    @BeforeEach
    void init() {
        List<Board> boards = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> Board.builder()
                        .title("제목" + i)
                        .textContent("contentblahblah" + i)
                        .writer("아무개" + i)
                        .build())
                .toList();

        boardRepository.saveAllAndFlush(boards);
    }

    @Test
    void test1() {
        List<Board> boards = boardRepository.findAll();
        boards.forEach(System.out::println);
    }
}
