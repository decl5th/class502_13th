package board.controllers;

import board.entities.BoardData;
import board.services.BoardInfoService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/board/list/*")
// *에 어떤 문자열이 오든 그게 게시판의 id가 된다
public class BoardListController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // model
        BoardInfoService service = new BoardInfoService();
        List<BoardData> items = service.getList();

        // 속성을 통해서 view로 넘겨주기 위해 속성을 set을 통해 설정
        // view에서 쓸 데이터 = 속성
        // request 객체를 통해서 setAttribute로 설정
        req.setAttribute("items", items);

        // 페이지마다 다른 스타일 존재 이렇게 속성은 레이아웃 쪽에서 접근 가능해짐 -> css, js 동적으로 추가
        req.setAttribute("addCss", new String[] {"board/style", "board/list"});
        req.setAttribute("addScript", List.of("board/common", "board/list"));

        // 속성 설정은 RequestDispatcher 상단에 정의 why? > 출력 완료 되면 속성은 반영 X
        // 버퍼를 교체할건데 forward를 통해서 어디서?
        // request객체에 있는 getRequestDispatcher가지고 가져와서 forwarding 버퍼를 치환하면 됨
        // jsp파일의 경로를 입력해주면 그 경로로 치환됨 == view를 보여줌
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/board/list.jsp");
        rd.forward(req, resp);
    }
}
