package exam03;

public class Ex01 {
    public static void main(String[] args) {
        try(Resources res = new Resources();
            Resource2 res2 = new Resource2()) {
            //res가 AutoClosable 인터페이스 구현 객체인지 체크 -> clsoe() 메서드 자동 호출
            // 내부에서 자동 형변환 AutoCloseable auto = res; -> 이게 안되면 오류 발생

            /*
            AutoCloseable auto = res;
            auto.close();
            */

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
