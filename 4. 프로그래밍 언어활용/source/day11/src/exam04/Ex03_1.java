package exam04;

import java.util.Vector;

public class Ex03_1 {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        System.out.println(names.capacity());
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        System.out.println(names.capacity());
    }
}