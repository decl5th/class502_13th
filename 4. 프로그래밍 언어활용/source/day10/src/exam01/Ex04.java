package exam01;

public class Ex04 {
    public static void main(String[] args) {
        Transportation trans = Transportation.TAXI;
        String str = trans.name();
        System.out.println(str);

        int ordinal = trans.ordinal(); // 상수의 배열 위치 번호
        System.out.println(ordinal);
    }
}
