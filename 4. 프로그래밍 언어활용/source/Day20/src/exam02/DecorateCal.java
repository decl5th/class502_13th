package exam02;

public class DecorateCal implements Calculator{ // 인터페이스 상속을 통해서 다형성 극대화

    //private ImplCalculator calculator = new ImplCalculator();// 이렇게 정의하면 ImplCalculator 밖에 못쓰니
    private Calculator calculator; // 다형성을 통해 좀 더 넓은 범위의 인터페이스를 작성 but, 또 정해져 버림

    public DecorateCal(Calculator calculator) {
        this.calculator = calculator;
    }

    public long factorial (long num) {
        long stime = System.nanoTime(); // 공통 추가 기능
        try {

            long result = calculator.factorial(num); // 핵심 기능을 대신 수행

            return result;
        } finally { // catch 대신 fianlly 써서 return 대신 다른 소스코드 작성 가능
            long etime = System.nanoTime();
            System.out.printf("걸린시간 : %d%n", etime - stime);
        }
    }
}
