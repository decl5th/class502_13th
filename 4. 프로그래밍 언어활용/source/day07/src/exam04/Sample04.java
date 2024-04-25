package exam04;

public class Sample04 {
    public void shouldBeRun() {
        System.out.println("ok thanks");
    }

    public static void main(String[] args) {
        Sample04 sample = new Sample04();
        int c;
        try {
            c = 4 / 0;
        } catch (ArithmeticException e) {
            c = -1;
        } finally {
            sample.shouldBeRun();  // 예외에 상관없이 무조건 수행된다.
        }
    }
}
