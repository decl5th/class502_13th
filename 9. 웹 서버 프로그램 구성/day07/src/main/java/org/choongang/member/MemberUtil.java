package org.choongang.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.choongang.member.entities.Member;

public class MemberUtil {
    public static boolean isLogin(HttpServletRequest request) {
       // Member member = getMember(request);
        return getMember(request) != null; // null 아니면 login 상태
    }

    public static Member getMember(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Member member = (Member) session.getAttribute("member");
        return member;
    }
}
