package org.choongang.global.board.service;

import lombok.RequiredArgsConstructor;
import org.choongang.global.board.controllers.RequestBoard;
import org.choongang.global.board.entities.Board;
import org.choongang.global.board.exception.BoardNotFoundException;
import org.choongang.global.board.repositories.BoardRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardInfoService  {
    private final BoardRepository boardRepository;

    public Board get(Long seq) {
        Board board = boardRepository.findById(seq).orElseThrow(BoardNotFoundException::new);
        return board;
    }

    public RequestBoard getInfo(Long seq) {
        Board board = get(seq);
        RequestBoard form = new ModelMapper().map(board, RequestBoard.class);

        // 2차 처리

        return form;
    }

    public List<Board> getAllBoards() {
        return boardRepository.findAll();
    }
}
