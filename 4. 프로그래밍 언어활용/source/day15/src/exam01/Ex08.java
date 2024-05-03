package exam01;

import java.util.Optional;

public class Ex08 {
    public static void main(String[] args) {
        String str = null ;

        Optional<String> opt = Optional.ofNullable(str); // null 허용
        //System.out.println(opt.get()); // get메서드는 조회하는 값이 null 이면 NoSuchElementException 발생
        String value = opt.orElse("default value"); // null 출력을 허용하면서 대신 orElse로 설정해 놓은 값 출력
        System.out.println(value);
    }


}
