package global.exceptions;

public class ValidationException extends RuntimeException {
    // 생성자 매개변수로 메시지값을 넣어줌
    public ValidationException(String message) {
        super(message); // 이 메세지가 상위의 throwable 쪽에서 처리 하도록 셋업
    }
}
