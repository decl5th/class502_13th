package org.choongang.global.board.service;

import lombok.RequiredArgsConstructor;
import org.choongang.global.board.controllers.RequestBoard;
import org.choongang.global.board.entities.Board;
import org.choongang.global.board.repositories.BoardRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardSaveService {
    // 수정과 추가를 같이
    private final BoardRepository boardRepository;

    public Board save(RequestBoard form) {
       Long seq = Objects.requireNonNullElse(form.getSeq(), 0L);
       Board board = boardRepository.findById(seq).orElseGet(Board::new);

       board.setTitle(form.getTitle());
       board.setTextContent(form.getTextContent());
       board.setWriter(form.getWriter());

       boardRepository.saveAndFlush(board);

       return board;
    }
}
