package exam02;

public class Ex01 { // 실제 클래스명 : exam02.Ex01
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        //s1.year = 2024;
        //s1.month = 2;
        //s1.day = 31;

        /*
        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31); // 멤버 변수의 값을 대입 - > 차이점: 제어가 가능해짐
        하지만 여전히 직접 대입이기 때문에 오류발생 존재 -> 좋은 접근은 아님
        */

        // s1.month(); -> 접근 안됨 why? month는 private으로 감싸놨으니
        int month = s1.getMonth();
        System.out.println(month);

        s1.showDate();
    }
}
