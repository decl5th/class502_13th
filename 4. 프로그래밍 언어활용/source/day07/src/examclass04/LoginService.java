package examclass04;

public class LoginService {
    public void login(String userId, String userPw) throws UserIdException, UserPwException
    { // throws 예외 전가 -> 호출한 쪽에서 처리 -> 예외를 상황에 맞게 유연하게 처리 가능
        // userId - user01, userpw = 123456 검증 절차

            if (!userId.equals("user01")) {
                throw new UserIdException("confirm your id again.");
            }

            if (!userPw.equals("123456")) {
                throw new UserPwException("confirm your pw again.");
            }

            System.out.println("로그인 성공!");

    }
}
