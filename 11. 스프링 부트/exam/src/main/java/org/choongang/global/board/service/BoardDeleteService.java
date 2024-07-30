package org.choongang.global.board.service;

import lombok.RequiredArgsConstructor;
import org.choongang.global.board.repositories.BoardRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardDeleteService {

    private final BoardRepository boardRepository;

    public void delete(Long seq) {
        boardRepository.deleteById(seq);
    }
}
