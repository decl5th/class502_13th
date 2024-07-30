package org.choongang.global.board.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.choongang.global.board.entities.Board;
import org.choongang.global.board.service.BoardDeleteService;
import org.choongang.global.board.service.BoardInfoService;
import org.choongang.global.board.service.BoardSaveService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardSaveService saveService;
    private final BoardInfoService infoService;
    private final BoardDeleteService deleteService;

    @GetMapping("/write")
    public String write(@ModelAttribute RequestBoard form) {

        return "front/board/write";
    }

    @PostMapping(path={"/write", "/update", "/view"})
    public String writePs(@Valid RequestBoard form, Errors errors) {
        String mode = form.getSeq() == null ? "update" : "writer";


        if (errors.hasErrors()) {
            return "front/board/" + mode;
        }

        Board board = saveService.save(form);

        return "redirect:/board/view/" + board.getSeq();
    }

    @GetMapping("/view/{seq}")
    public String view(@PathVariable("seq") Long seq, Model model) {

        Board data = infoService.get(seq);
        model.addAttribute("board", data);

        return "front/board/view";
    }

    @GetMapping("/update/{seq}")
    public String update(@PathVariable("seq") Long seq, Model model) {

        RequestBoard form = infoService.getInfo(seq);
        model.addAttribute("requestBoard", form);

        return "front/board/update";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("boards", infoService.getAllBoards());

        return "front/board/list";
    }

    @GetMapping("/delete/{seq}")
    public String delete(@PathVariable("seq") Long seq) {
        deleteService.delete(seq);
        return "redirect:/board/list";
    }
}
