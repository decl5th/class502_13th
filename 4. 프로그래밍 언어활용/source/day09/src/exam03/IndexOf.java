package exam03;

public class IndexOf {
    public static void main(String[] args) {
        String fruits = "Apple, Orange, Mango, Melon, Apple";
        // 왼쪽 -> 오른쪽
        System.out.printf("indexOf Apple: %d%n", fruits.indexOf("Apple"));

        // 오른쪽 -> 왼쪽
        System.out.printf("lastIndexOf Apple: %d%n", fruits.lastIndexOf("Apple"));

        // 없으면? -1 출력
        System.out.printf("indexOf Banana: %d%n", fruits.indexOf("Banana"));

    }
}
