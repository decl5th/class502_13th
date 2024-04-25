package examclass04;

public class Ex01 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        try {
            service.login("user02", "123456");
        } catch ( Exception e) { /* == UserIdException | UserPwException e  */
            System.out.println(e.getMessage()); // 예외 전가 호출한 외부접근인 Ex01에서 처리
        }
    }
}
