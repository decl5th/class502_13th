package exam04;

public class Ex01 {
    public static void main(String[] args) {
        // Apple 타입으로 명시하여
        Box<Apple> appleBox = new Box<Apple>();
        appleBox.setItem(new Apple());
        // appleBox.setItem(new Grape()); // 오류 발생

        Apple apple = appleBox.getItem(); // 형변환의 번거로움 X
        System.out.println(apple.get());
    }
}
