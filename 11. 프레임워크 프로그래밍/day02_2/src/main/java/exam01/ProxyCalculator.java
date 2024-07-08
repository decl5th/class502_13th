package exam01;

public class ProxyCalculator implements Calculator {

    // 프록시 계산기가 impl과 rec 대신 수행해 준다면? 다형성을 이용
    private Calculator calculator;
    //private Calculator calculator = new ImplCalculator(); // 좋은 방법 아님


    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator; //
    }

    @Override
    public long factorial(long num) {
        // 데코레이터 패턴
        long stime = System.nanoTime(); // 나노 타임을 통해 시간 측정, 공통 기능

        try {

            long result = calculator.factorial(num);
            // 다른 계산기의 factorial 연산 대신 수행 즉 핵심 기능 대신 수행 => 프록시

            return result;
        } finally {
            long etime = System.nanoTime(); // 공통 기능
            System.out.printf("cal1 걸린 시간: %d%n", etime - stime); // 시간 차이 계산
        }
    }
}
