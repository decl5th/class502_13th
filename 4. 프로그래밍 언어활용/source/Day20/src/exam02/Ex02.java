package exam02;

public class Ex02 {
    public static void main(String[] args) {
        //DecorateCal cal1 = new DecorateCal(new ImplCalculator());
        // 여기서 데코레이트 패턴을 감출 수 있는 방법이 다형성을 이용하는 것 즉,
        // DecorateCal 클래스에 Calculator 인터페이스를 구현
        Calculator cal1 = new DecorateCal(new ImplCalculator());

        long result1 = cal1.factorial(10L);
        System.out.println(result1);

        //DecorateCal cal2 = new DecorateCal(new RecCalculator());
        Calculator cal2 = new DecorateCal(new RecCalculator());
        long result2 = cal1.factorial(10L);
        System.out.println(result1);


    }
}
