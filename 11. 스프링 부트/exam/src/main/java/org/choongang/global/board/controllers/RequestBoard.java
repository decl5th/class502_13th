package org.choongang.global.board.controllers;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestBoard {

    private Long seq;

    @NotBlank
    private String title;

    @NotBlank
    private String textContent;

    @NotBlank
    private String writer;
}
