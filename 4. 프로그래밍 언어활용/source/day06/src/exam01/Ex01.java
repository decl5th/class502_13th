package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = new SimpleCalculator();
        ComplexCalculator cal2 = new ComplexCalculator();

        int result = cal.add(10, 20);
        System.out.println(result);
        System.out.println(cal.num);

        int result2 = cal2.add(10, 20);
        System.out.println(result2);

    }
}
