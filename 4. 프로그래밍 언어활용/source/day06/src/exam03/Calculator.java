package exam03;

public interface Calculator { // 틀을 제공하는 클래스 -> interface
    // 추상메소드만 우선적으로 올바르게 인식해버리는 interface -> public abstract 자동 추가 적용
    int add(int num1, int num2); // == public abstract int add(int num1, int num2);
    int NUM = 10; // public static final 자동 추가

}
