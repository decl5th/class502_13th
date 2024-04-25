package exam03;

public class Ex06 {
    public static void main(String[] args) {
        Integer num1 = 100; // 객체 형태의 자료형
        Integer num2 = 200;
        // == Integer.valueOf(200) 으로 자동추가 적용되어 있는거임 -> 오토박싱

        Integer num3 = num1 + num2;
        // => Integer.valueOf(num1.intValue() + num2.intValue()); 자동 추가 적용

        // num1.equals() 객체이기 때문에 메소드가 생성이 되는 거임

    }
}
