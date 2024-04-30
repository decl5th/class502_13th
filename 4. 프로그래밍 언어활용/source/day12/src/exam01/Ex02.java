package exam01;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(100,"책1", "저자1"));
        books.add(new Book(101,"책2", "저자2"));
        books.add(new Book(102,"책3", "저자3"));
        books.add(new Book(103,"책4", "저자4"));
        books.add(new Book(104,"책5", "저자5"));


        ListIterator<Book> iter = books.listIterator();
        System.out.println("------ 순방향 ------");
        while(iter.hasNext()) {
            Book book = iter.next();
            int index = iter.nextIndex(); // 위치 번호 알 수 있는 nextIndex
            System.out.println(book);
            System.out.println("index : " + index);
        }

        // 역방향조회는 순방향 조회이후 가능
        System.out.println("------ 역방향 ------");
        while(iter.hasPrevious()) {
            Book book = iter.previous();
            int index = iter.previousIndex();
            System.out.println(book);
            System.out.println("index : " + index);
        }
    }
}
