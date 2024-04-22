package exam01;

public class SimpleCalculator extends Calculator {

    public SimpleCalculator(){
        super();
    }

    public int add(int num1, int num2) {
        return num1 + num2; // 상속을 통해서 메서드의 수행내용을 지정 시, 객체 생성 -> 정상 사용 가능
    }

    /*
    public final void commonMethod() {

    }

     */
}
