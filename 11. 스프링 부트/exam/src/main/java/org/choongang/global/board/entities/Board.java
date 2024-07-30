package org.choongang.global.board.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.choongang.global.entities.BaseEntity;

@Data
@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Board extends BaseEntity {
    @Id @GeneratedValue
    private Long seq;

    @Column(nullable = false)
    private String title;

    @Lob
    @Column(nullable = false)
    private String textContent;

    @Column(length = 40, nullable = false)
    private String writer;
}
