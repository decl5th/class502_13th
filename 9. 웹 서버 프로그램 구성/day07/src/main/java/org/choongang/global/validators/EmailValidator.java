package org.choongang.global.validators;

// 항상 필요하진 않지만 어느곳에서 필요할 수 있는 항목이라 따로 빼서 설정해서 필요한 곳에서 쓸수 있도록
public interface EmailValidator {
    default boolean checkEmail(String email) {
       // 계정명@도메인.com | co.kr | net ...
        // [] 들어가는 내용은 이메일 아이디에 들어갈 요소들 알파벳, 숫자, 특수문자
        String pattern = "[^@]+@[^.]+\\.[a-z]+";

        return email.matches(pattern);
    }
}
