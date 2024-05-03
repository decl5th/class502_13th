package exam02;

@FunctionalInterface
public interface Calculator {
    int add(int num1, int num2);
    //int minus(int num1, int num2);
    // 메서드 2개를 정의하는 것은 인터페이스내에서는 문제가 없으나 람다식에서는 문제 존재
    // 따라서 람다식을 사용하는 인터페이스 즉, 함수형 인터페이스는 하나의 단일 메서드만 정의해야함
}
