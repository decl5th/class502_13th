package exam03;

public class Box<T> {

    private T item;

    // Box가 객체가 될 때 T가 결정 ; 제네릭 클래스의 T
    public void method1(T str1, T str2) {

    }

    // 지네릭 메서드 - 호출시에 T의 자료형이 결정 됨; 제네릭 메서드의 T
    public <T> void method2(T str1, T str2) { // Box뒤에 붙어있는 T와 메서드 표시된 T는 같지 않다

    }
}
