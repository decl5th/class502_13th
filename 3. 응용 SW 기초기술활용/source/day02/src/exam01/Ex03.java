package exam01;

public class Ex03 {
    public static void main(String[] args) {
        int num = 10;

        String str = num % 2 == 0 ? "짝수" : "홀수"; // 10을 2로 나눌 때 나머지가 0의 값이 참이면 짝수 출력 거짓이면 홀수 출력

        System.out.println(str);
    }
}
