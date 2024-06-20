package org.choongang.global.validators;

public interface RequiredValidator {
    default void checkRequired(String str, RuntimeException e) {
        if (str == null || str.isBlank()) {
            throw e;
        }
    }

    // 체크된 상태(참)가 아니면 예외를 던지겠다
    default void checkTrue (boolean checked, RuntimeException e) {
        if(!checked) {
            throw e;
        }
    }
}
