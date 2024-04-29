package exam03;

public class Matches {
    public static void main(String[] args) {
        String str = "I like java and javascript";
        boolean matched = str.matches(".*java.*");
        System.out.println(matched);
    }
}
