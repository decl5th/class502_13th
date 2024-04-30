package exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex01 {
    // 책을 추가하는 클래스
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(100,"책1", "저자1"));
        books.add(new Book(101,"책2", "저자2"));
        books.add(new Book(102,"책3", "저자3"));
        books.add(new Book(103,"책4", "저자4"));
        books.add(new Book(104,"책5", "저자5"));
        Iterator<Book> iter = books.iterator();

        while(iter.hasNext()) {
            Book book = iter.next();
            System.out.println(book);
        }

        System.out.println("----------------2nd repeat-----------------");

        // 두 번째 반복을 위해서 iterator 새로 생성
        iter = books.iterator();
        while(iter.hasNext()){
            Book book = iter.next();
            System.out.println(book);
        }



    }
}
