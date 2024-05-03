package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int c = 10;
        /*
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
         */

        Calculator cal = (a, b) -> a + b + c; // 식의 길의가 2줄 이상이 되면 {}로 감싸줘야함

        int result = cal.add(10, 20);
        System.out.println(result);



    }
}
