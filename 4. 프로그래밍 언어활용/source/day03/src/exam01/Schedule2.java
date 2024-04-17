package exam01;

public record Schedule2(int year, int month, int day) {
    public static void main(String[] args) {
        Schedule2 s1 = new Schedule2(2024, 4, 17);
        int year = s1.year();
        int month = s1.month();
        int day = s1.day();

        System.out.printf("%d-%d-%d%n", year, month, day);
        // record 클래스를 통해 set/get을 정의하지 않아도 됨

        System.out.println(s1); //s1.toString() 기능 포함되어 출력
    }
}
