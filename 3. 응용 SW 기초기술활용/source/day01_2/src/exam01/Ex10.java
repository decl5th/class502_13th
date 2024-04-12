package exam01;

public class Ex10 {
    public static void main(String[] args) {
        int num1 = 10000000;
        // byte num2 = num1;  큰공간에 있는 숫자이면 작은 공간에 다 담을 수는 없기에 데이터가 변질 될 수 있다
        byte num2 = (byte)num1; // 변질이 되는 걸 알아도 시행하겠다는 형변환 -> 명시적 형변환
        System.out.println(num2);

        int num3 = 100;
        byte num4 = (byte)num3;

        System.out.println(num4);
    }
}
