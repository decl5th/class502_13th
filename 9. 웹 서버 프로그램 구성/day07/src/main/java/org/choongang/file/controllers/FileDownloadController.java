package org.choongang.file.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.nio.file.Files;

@WebServlet("/file/download")
public class FileDownloadController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File file = new File("D:/uploads/coding.png");
        String contentType = Files.probeContentType(file.toPath()); // image/png
        String fileName = new String(file.getName().getBytes(), "ISO8859_1"); // coding.png | 윈도우즈에서 한글 깨짐 문제 발생 , 인코딩 UTF-8 -> CPC949, EUC-KR, ISO8859_1
        // 파일명을 byte로 바꿔서 인식하도록 설정

        resp.setHeader("Content-Disposition", "attachment; filename=" + fileName);
        resp.setContentType(contentType);
        resp.setHeader("Cache-Control", "must-revalidate");
        resp.setIntHeader("Expires", 0);
        resp.setContentLengthLong(file.length());

        // byte 형태로 오기 때문에 outputStream
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))){
            OutputStream out = resp.getOutputStream();
            out.write(bis.readAllBytes());
        }
    }
}
