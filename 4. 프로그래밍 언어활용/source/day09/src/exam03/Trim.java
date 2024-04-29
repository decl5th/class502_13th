package exam03;

public class Trim {
    public static void main(String[] args) {
        String str = "           ABC            ";
        String str3 = str.stripLeading();
        String str4 = str.stripTrailing();

        System.out.println(str3);
        System.out.println(str4);
    }
}
