package org.choongang.global.board.repositories;

import org.choongang.global.board.entities.Board;
import org.choongang.global.board.entities.QBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>, QuerydslPredicateExecutor<Board> {

    Board findByTitle(String title);

    List<Board> findAllByWriter(String writer);

    Optional<Board> findByWriter(String writer);

    List<Board> findAllBySeq(Long seq);

    Board findBySeq(Long seq);
}
