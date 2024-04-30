package exam01;

import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(100, "책1", "저자1"));
        books.add(new Book(101, "책2", "저자2"));
        books.add(new Book(102, "책3", "저자3"));
        books.add(new Book(103, "책4", "저자4"));
        books.add(new Book(104, "책5", "저자5"));

        for (Book book : books) { // 향상된 for문
            System.out.println(book);
        }
        System.out.println();

        books.forEach(System.out::println); // 람다식에 있는 메서드 참조
    }
}
