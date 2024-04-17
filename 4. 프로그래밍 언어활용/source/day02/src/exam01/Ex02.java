package exam01;

public class Ex02 { // 동일한 명칭의 n1이지만 속해있는 함수가 달라서 다른 변수이다
    public static void main(String[] args) {
        int n1 = 10;
        int n2= 20;
        int r = add(n1, n2);
        // System.out.println(r);
    }

    static int add(int n1, int n2) { // 함수 지역 == 지역 변수
        int result = n1 + n2;

        return result;
    }
}
