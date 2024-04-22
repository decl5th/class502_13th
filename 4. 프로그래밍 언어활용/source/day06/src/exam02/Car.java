package exam02;

public abstract class Car {
    public abstract void start();
    public abstract void press();
    public abstract void turnoff();

    public final void run() {
        // 템플릿 메서드 패턴; 순서대로 출력 순서를 임의대로 바꿀 수도 있지만 final를 통해 순서를 지키도록 만들 수도 있다
        start();
        press();
        turnoff();
    }
}
