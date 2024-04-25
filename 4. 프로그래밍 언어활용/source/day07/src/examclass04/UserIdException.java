package examclass04;

public class UserIdException extends Exception {
    // Exception을 상속 받음으로서 예외를 발생시킬 수 있게 됨

    public UserIdException(String message) {
        // 상위클래스에 있는 생성자한테 동작 처리를 위임 -> super를 통해서
        super(message);
    }
}
