package exam03;

public class Format {
    public static void main(String[] args) {
        String fruit = String.join(",", "Apple", "orange", "Melon");
        System.out.println(fruit);

        String str = String.format("%d + %d = %d", 10, 20, 30);
        System.out.println(str);
    }
}