package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Apple()); //Box에 사과를 담았다

        Apple apple = (Apple)appleBox.getItem(); // 명시적 형변환: 다운 캐스팅
        System.out.println(apple.get());

        Box grapeBox = new Box();
        grapeBox.setItem(new Grape()); //Box에 포도도 담아 넣었다

        if (grapeBox.getItem() instanceof Apple) { // 타입 안전성이 떨어지는 문제
            Apple grape = (Apple)grapeBox.getItem();
            System.out.println(grape.get());
        }

    }
}
