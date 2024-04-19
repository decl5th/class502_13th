package exam03;

public abstract class Calculator {
    int num = 10;
    // Calculator 객체가 될 수 없는데 변수에 값을 입력하니 값이 나옴 왜?
    // 멤버 변수의 값을 할당 -> 힙에 메모리 할당 -> 객체 생성


    public abstract int add(int num1, int num2); // 함수의 정의만 존재
}
