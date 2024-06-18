package board.controllers;

import board.entities.BoardData;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/board/view/*")
public class BoardViewController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //요청 헤더를 통해 넘어오면 요청 데이터를 처리할 때 쿠키에 접근 가능 즉 request 객체를 통해서
        HttpSession session = req.getSession();
        BoardData board = (BoardData)session.getAttribute("board"); // EL식 속성으로 접근 가능
        String title = (String)session.getAttribute("title");

        System.out.println(board);
        System.out.println(title);
    }
}
